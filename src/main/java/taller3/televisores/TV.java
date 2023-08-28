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
		this.canal = canal;
	}
	
	public void setPrecio (int precio) {
		this.precio = precio;
	}
	
	public void setVolumen (int volumen) {
		this.volumen = volumen;
	}
	
	public void setControl (Control control) {
		this.control = control;
	}
	
	public void setnumTV (int numTV) {
		//Como es un atributo de clase, se accede de esta forma
		TV.numTV = numTV;
	}
	
	public Marca getMarca () {
		return marca;
	}
	
	public int getCanal () {
		return canal;
	}
	
	public int getPrecio () {
		return precio;
	}
	
	public int getVolumen () {
		return volumen;
	}
	
	public Control getControl () {
		return control;
	}
	
	public int getnumTV () {
		//Como es un atributo de clase, se accede de esta forma
		return numTV;
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
	
	//Como no estoy utilizando 
	public void canalUp () {
		while (this.estado){
			if (this.canal >= 1 && this.canal <= 120){
				this.canal ++;
			}
			
			if (this.canal < 1 || this.canal > 120) {
	            break;
	        }
		}
	}
	
	public void canalDown () {
		while (this.estado){
			if (this.canal >= 1 && this.canal <= 120){
				this.canal --;
			}

			if (this.canal < 1 || this.canal > 120) {
	            break;
	        }
		}
	}
	
	public void volumenUp () {
		while (this.estado){
			if (this.volumen >= 0 && this.volumen <= 7){
				this.volumen ++;
			}
			
			if (this.volumen < 0 || this.volumen > 7) {
	            break;
	        }
		}
	}
	
	public void volumenDown () {
		while (this.estado){
			if (this.volumen >= 0 && this.volumen <= 7){
				this.volumen --;
			}
			
			if (this.volumen < 0 || this.volumen > 7) {
	            break;
	        }
		}
	}
	
	public void enlazar (Control control) {
    	this.control = control;
    }

}
