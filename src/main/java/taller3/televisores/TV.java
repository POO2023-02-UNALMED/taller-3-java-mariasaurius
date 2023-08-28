package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	//Se debe iniciar en 0 para que pueda ir sumando
	private static int numTV = 0;
	
	public TV (Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		//Valores que uno escoge como defecto
		//Esto se tiene que hacer porque solo se pasan 2 parametros
		//Y como al crear el constructor deja de existir el constructor por defecto
		//Si no se indica los valores para los demas atributos, saldra error
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		//Como el constructor pertenece a la clase, puedo acceder al atributo
		//Sin necesidad de usar el metodo set
		//No tengo que poner = ++, eso es un error
		//Sencillamente se pone ++ para indicar que aumenta en 1
		TV.numTV ++; 
	
	}
	
	public void setMarca (Marca marca) {
		this.marca = marca;
	}
	
	public void setCanal (int canal) {
		if (this.estado && canal >=1 && canal <=120) {
			this.canal = canal;
		}
	}
	
	public void setPrecio (int precio) {
		this.precio = precio;
	}
	
	public void setVolumen (int volumen) {
		if(this.estado && volumen >=0 && volumen <=7) {
			this.volumen = volumen;
		}
	}
	
	public void setControl (Control control) {
		this.control = control;
	}
	
	public static void setnumTV (int numTV) {
		//Como es un atributo de clase, se accede de esta forma
		TV.numTV = numTV;
	}
	
	public Marca getMarca () {
		return this.marca;
	}
	
	public int getCanal () {
		return this.canal;
	}
	
	public int getPrecio () {
		return this.precio;
	}
	
	public int getVolumen () {
		return this.volumen;
	}
	
	public Control getControl () {
		return this.control;
	}
	
	public static int getnumTV () {
		//Como es un atributo de clase, se accede de esta forma
		return TV.numTV;
	}
	
	//No tengo parametros porque solo le estoy cambiando el valor al atributo
	//Cuando le voy a cambiar el valor dentro del metodo ahi si le paso un parametro
	//Sin embargo, como es un boolean no hay necesidad
	public void turnOn () {
		this.estado = true;
		}
	
	public void turnOff () {
		this.estado = false;
	}
	
	
	public void canalUp () {
		this.setCanal(canal + 1);
	}
	
	public void canalDown () {
		this.setCanal(canal - 1);
	}
	
	public void volumenUp () {
		this.setVolumen(volumen + 1);
	}
	
	public void volumenDown () {
		this.setVolumen(volumen - 1);
	}
	
}
