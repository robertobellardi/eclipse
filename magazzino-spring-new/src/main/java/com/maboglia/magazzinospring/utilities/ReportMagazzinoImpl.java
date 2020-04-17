package com.maboglia.magazzinospring.utilities;

import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maboglia.magazzinospring.entities.Prodotto;
import com.maboglia.magazzinospring.repositories.MagazzinoRepository;
import com.maboglia.magazzinospring.services.ProdottiService;

@Component
public class ReportMagazzinoImpl implements ReportMagazzino {

	@Autowired
	private MagazzinoRepository repo;
	
	@Autowired
	private ProdottiService service;
	
	@Override
	public void generaGrafico(String path, List<Object[]> pezzi) {

		DefaultPieDataset dataset= new DefaultPieDataset();
		
		Long totPezzi = (Long) repo.statoMagazzinoSomma();
		
		for (Object[] objects : pezzi) {
			System.out.println((int)objects[0]);
			Prodotto prodotto = service.trovaUno((int)objects[0]);
			
			double perc = Double.parseDouble(objects[1].toString())/ totPezzi;
			NumberFormat nf = NumberFormat.getPercentInstance(new Locale("it", "IT"));
			dataset.setValue(prodotto.getDescrizione() + " "+ nf.format(perc) , Double.parseDouble(objects[1].toString()));
		}
		
		JFreeChart grafico = ChartFactory.createPieChart("Stato del magazzino", dataset);
		
		try {
			ChartUtils.saveChartAsJPEG(new File(path+"/grafico.jpg"), grafico, 500, 500);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
