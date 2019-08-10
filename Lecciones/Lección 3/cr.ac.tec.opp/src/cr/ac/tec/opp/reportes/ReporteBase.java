package cr.ac.tec.opp.reportes;

import java.util.List;
import java.util.Date;

public class ReporteBase {
	
	private String nombre;
	private Date fecha;
	protected List<Item> items;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public ReporteBase(String nombre, Date fecha, List<Item> items) { // Constructor
		this.nombre = nombre;
		this.fecha = fecha;
		this.items = items;
		
	}

	public void generar() {		// Genera el informe en consola
		
		// Genero el nombre y fecha
		System.out.println(String.format("Nombre: %s - Fecha: %s", this.getNombre(), this.getFecha()));
		
		for(Item item: this.items) {		// Muestro la lista de items
			System.out.println(String.format("%s/%s/%s",item.getId(),item.getDescripcion(), item.getPrecio()));
		}
	}
	
}
