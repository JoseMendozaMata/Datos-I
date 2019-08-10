package cr.ac.tec.opp.reportes;

import java.util.Date;
import java.util.List;

public class ReporteFinanzas extends ReporteBase{

	public ReporteFinanzas(String nombre, Date fecha, List<Item> items) {
		super(nombre, fecha, items);		// Llama al constructor de la clase padre
	}
	@Override
	public void generar(){	// Override del método de la clase padre
	
		super.generar();	// Generar de la clase padre, suoer hace referencia a la clase padre
		System.out.println("El total de items es: " + this.items.size());
	
	}
}
