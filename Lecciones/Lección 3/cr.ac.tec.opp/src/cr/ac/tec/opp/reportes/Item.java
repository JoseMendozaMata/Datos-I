package cr.ac.tec.opp.reportes;

public class Item {
	

	private static int consecutivo = 0;	// Para llevar la cuenta de la id de los items
	private String nombre;		// Nombre del item
	private String descripcion;	// Descripcion de este
	private float precio;	// Precio
	private String id;
	
	
	public Item(String nombre, String descripcion, float precio) {	//Constructor de la clase item 
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.setId();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public void setId() {
		this.id = "Item-" + ++consecutivo;	// El ++ antes de la variable aumenta la variable y luego la asigna
	}
	public String getId() {
		return this.id;
	}
}
