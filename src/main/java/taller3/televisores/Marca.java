package taller3.televisores;

public class Marca {
	private String nombre;
	public Marca (String nombre) {
		//Forma diferente de crear un constructor usando el metodo set
		//Sigue siendo un constructor porque inicializa los atributos
		this.setNombre(nombre);
	}
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		//¿Quién esta llamando al atributo de instancia? Yo, el objeto
		return this.nombre;
	}
	

}
