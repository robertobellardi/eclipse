package com.maboglia.magazzinospring.utilities;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maboglia.magazzinospring.entities.Prodotto;
import com.maboglia.magazzinospring.services.ProdottiService;

@Component
public class ReportMagazzinoImpl implements ReportMagazzino {

	@Autowired
	private ProdottiService service;
	
	@Override
	public void generaGrafico(String path, List<Object[]> pezzi) {

		DefaultPieDataset dataset= new DefaultPieDataset();
		
		for (Object[] objects : pezzi) {
			
			Prodotto prodotto = service.trovaUno((int)objects[0]);
			dataset.setValue(prodotto.getDescrizione(), Double.parseDouble(objects[1].toString()));
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
