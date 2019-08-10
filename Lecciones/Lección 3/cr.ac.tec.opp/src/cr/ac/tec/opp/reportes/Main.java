package cr.ac.tec.opp.reportes;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Main {
	
	public static void main(String[]args) {
		
		// Creo la lista de Items, puedo usar las utilidades de ArrayList porque la clase Lista es la
		//clase padre, entonces puedo usar los métodos y atributos de ésta.
		  
		List<Item> items = new ArrayList<>();		
		
		for(int i = 0; i < 100; i++) {		// LLeno la lista
			items.add(new Item("Name" , "Description", (float) 500.00));
		}
		
		Date fechaActual = new Date();// Fecha del reporte
		ReporteBase reporte= new ReporteBase("Reporte ", fechaActual, items);
		
		reporte.generar();//Creo el reporte con la lista generada
		
		ReporteFinanzas finanzas = new ReporteFinanzas("Reporte",fechaActual, items);
		finanzas.generar();
	}
	
	
}
