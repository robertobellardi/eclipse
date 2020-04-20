package com.bellardi.agenaSpring.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bellardi.agenaSpring.entities.Appuntamenti;
import com.bellardi.agenaSpring.entities.Utente;
import com.bellardi.agenaSpring.services.AppuntamentiService;
import com.bellardi.agenaSpring.services.LoginService;

@Controller
public class AgendaController {

	@Autowired
	private LoginService logService;
	
	@Autowired
	private AppuntamentiService appService;
	
	private Utente utLoggato;
		
	@RequestMapping(value= {"/","home"})
	public String mostraHome() {
		return "index";	
	}
	
	@RequestMapping("/checkLogin")
	public String checkLog(@ModelAttribute("utente") Utente u, ModelMap map) {
		List<Utente> utenti=logService.trovaTutti();
		
		for (Utente utente : utenti) {
			if(utente.getNome().equals(u.getNome()) && utente.getCognome().equals(u.getCognome())) {
				if(utente.getPassword().equals(u.getPassword())) {
					this.utLoggato = utente;
					return getformAppuntamenti(map);
				}else
					map.addAttribute("messaggio", "Password errata");
			}
		}		
		map.addAttribute("messaggio", "Campi Nome e Cognome errati");		
		return "index";	
	}
	
	public String getformAppuntamenti(ModelMap map) {
		LocalDate dataOdierna = LocalDate.now(); 
		
		List<Appuntamenti> appi=appService.trovaTutti();
		List<Appuntamenti> appiOdierni=new ArrayList<>();

		for (int i = 0; i< appi.size();i++) {
			if(appi.get(i).getData().equals(dataOdierna.toString())) {
				appiOdierni.add(appi.get(i));
			}
		}
		
		for (int i = 0; i< appiOdierni.size();i++) {
			System.out.println(appiOdierni.get(i).getArgomento());
		}
		
		Appuntamenti tmp=null;
		
		for (int j = 0; j< appiOdierni.size();j++) {
			for (int i = 0; i< appiOdierni.size()-1;i++) {
				if(appiOdierni.get(i).getOraInizio().compareToIgnoreCase(appiOdierni.get(i+1).getOraInizio()) > 0) {
					tmp=appiOdierni.get(i+1);
					appiOdierni.set(i+1, appiOdierni.get(i));
					appiOdierni.set(i, tmp);					
				}
			}
		}
		
		map.addAttribute("appuntamenti", appiOdierni);	
		map.addAttribute("utente", this.utLoggato);		
		return "listaAppuntamenti";	
	}
	
	@RequestMapping("/inserisciAppuntamento")
	public String inserisciAppuntamento(@ModelAttribute("appuntamento") Appuntamenti a, ModelMap map) {
		
		LocalDate dataOdierna = LocalDate.now(); 
		boolean sovrapposizione=false;
		
		if(a.getData().compareToIgnoreCase(dataOdierna.toString()) >= 0) {		
							
			List<Appuntamenti> appi=appService.trovaTutti();
			
			for (int i=0; i < appi.size() && !sovrapposizione;i++) {
				if(appi.get(i).getData().compareToIgnoreCase(a.getData()) == 0) {
					if(appi.get(i).getOraInizio().compareToIgnoreCase(a.getOraInizio()) > 0 && (appi.get(i).getOraInizio().compareToIgnoreCase(a.getOraFine()) < 0))
						sovrapposizione=true;
					else {
						if(a.getOraInizio().compareToIgnoreCase(appi.get(i).getOraInizio()) > 0 && a.getOraInizio().compareToIgnoreCase(appi.get(i).getOraFine()) < 0 )
							sovrapposizione=true;
						}
				}
			}				
			
			if(!sovrapposizione) {
				appService.salvaAppuntamento(a);
				map.addAttribute("messaggio", "Appuntamento salvato");
				map.addAttribute("alert", "alert-success");
			}
			else {
				map.addAttribute("messaggio", "Errore appuntamento in sovrapposizione");
				map.addAttribute("alert", "alert-danger");
			}
		}
		else {
			map.addAttribute("messaggio", "Errore appuntamento non salvato");
			map.addAttribute("alert", "alert-danger");
		}			
		return getformAppuntamenti(map);	
	}
	
	@RequestMapping("/logout")
	public String logout() {
			
		utLoggato=null;
		
		return "index";	
	}
}