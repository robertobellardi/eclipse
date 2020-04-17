package com.maboglia.magazzinospring.utilities;

import java.util.List;

public interface ReportMagazzino {

	void generaGrafico(String path, List<Object[]> pezzi);
	
}
