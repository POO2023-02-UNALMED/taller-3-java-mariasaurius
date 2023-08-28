package taller3.televisores;

public class Control {
	private TV tv;
	
	// esto solo se usa si estoy en un main tv.turnOn()
	
	public void turnOn() {
		// desde la clase control estoy llamando al metodo de la tv turn on
        tv.turnOn();
    }

    public void turnOff() {
        tv.turnOff();
    }

    public void canalUp() {
        tv.canalUp();
    }

    public void canalDown(int canal) {
        tv.canalDown();
    }

    public void volumenUp(int volumen) {
        tv.volumenUp();
    }

    public void volumenDown(int volumen) {
        tv.volumenDown();
    }

    public void setCanal(int canal) {
        tv.setCanal(canal);
    }

    public void setVolumen(int volumen) {
        tv.setVolumen(volumen);
    }
	
    public void enlazar (TV tv) {
    	this.tv = tv;
    }
    
    public void setTv (TV tv) {
    	this.tv = tv;
    }
    
    public TV getTv () {
    	return tv;
    }

}
