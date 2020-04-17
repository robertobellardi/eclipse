package com.maboglia.magazzinospring.controllers;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maboglia.magazzinospring.entities.Magazzino2;
import com.maboglia.magazzinospring.entities.Prodotto;
import com.maboglia.magazzinospring.repositories.MagazzinoRepository;
import com.maboglia.magazzinospring.services.MagazzinoService;
import com.maboglia.magazzinospring.services.ProdottiService;
import com.maboglia.magazzinospring.utilities.ReportMagazzinoImpl;

@Controller
public class MagazzinoController {

	@Autowired
	private MagazzinoService service;
	
	@Autowired
	private ProdottiService prodottiService;
	
	@Autowired
	private ReportMagazzinoImpl rmi;
	
	@Autowired
	private MagazzinoRepository repo;
	
	@Autowired
	private ServletContext sc;
	
	@RequestMapping("/report")
	public String mostraReportMagazzino(ModelMap map) {
		return "report";	
		}
	
	
	@RequestMapping("/magazzino")
	public String mostraMagazzino(ModelMap map) {
		List<Magazzino2> movimenti = service.trovaTutti();
		//Functional Java Programming -> collezione.sort()
		// ->uso Comparator: uso di espressione lambda, 
		//(m, n)-> n.get() - m.getId(); 
		movimenti.sort((m,n)->n.getId()-m.getId());
		map.addAttribute("movimenti", movimenti);
		
		return "magazzino";
	}
	
	@RequestMapping("/addMagazzino")
	public String vistaAggiungiMagazzino(ModelMap modelMap) {
		
		List<Prodotto> trovaTutti = prodottiService.trovaTutti();
		modelMap.addAttribute("prodotti", trovaTutti);
		return "addMagazzino";
	}
	
	@RequestMapping("/aggiungiMagazzino")
	public String aggiungiMagazzino(@ModelAttribute("magazzino") Magazzino2 m, ModelMap modelMap) {
		service.salvaMagazzino(m);
		modelMap.addAttribute("messaggio", "magazzino modificato");
		List<Prodotto> trovaTutti = prodottiService.trovaTutti();
		modelMap.addAttribute("prodotti", trovaTutti);
		return "addMagazzino";
	}
	
	
	@RequestMapping("/acquistoWEB")
	public void acquistoWEB(@ModelAttribute("magazzino") Magazzino2 m, HttpServletResponse http) {
		service.salvaMagazzino(m);
	    http.setHeader("Location", "http://localhost/negozioinformatica.it/?pagina=prodotti");
	    http.setStatus(302);
		//return "tuttoOK";
	}
	
	@RequestMapping("/deleteMagazzino")
	public String deleteMagazzino(@RequestParam("id") int id, ModelMap map) {
		
		Magazzino2 temp = service.trovaUno(id);
		service.deleteMagazzino(temp);
		map.addAttribute("messaggio", "Movimento eliminato");
		List<Magazzino2> movimenti = service.trovaTutti();
		map.addAttribute("movimenti", movimenti);
		return "magazzino";
	}
	
	@RequestMapping("/updateMagazzino")
	public String aggiungiMagazzino(@RequestParam("id") int id, ModelMap map) {
		
		Magazzino2 temp = service.trovaUno(id);
		map.addAttribute("magazzino", temp);
		return "updMagazzino";
	}	
	
	@RequestMapping("/modificaMagazzino")
	public String modificaMagazzino(@ModelAttribute("magazzino") Magazzino2 m, ModelMap modelMap) {
		service.updateMagazzino(m);
		modelMap.addAttribute("messaggio", "movimento modificato con successo");
		List<Magazzino2> movimenti = service.trovaTutti();
		modelMap.addAttribute("movimenti", movimenti);
		
		return "magazzino";
	}
	
	@RequestMapping("/reportMagazzino")
	public String reportMagazzino() {
		String path = sc.getRealPath("/");
		List<Object[]> dataSet = repo.statoMagazzino();
		System.out.println("PATH --->"+path);
		rmi.generaGrafico(path, dataSet);
		return "reportMagazzino";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
