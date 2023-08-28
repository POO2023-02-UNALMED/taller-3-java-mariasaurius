package taller3.televisores;

public class Control {
	private TV tv;
	
	public void turnOn() {
        tv.turnOn();
    }

    public void turnOff() {
        tv.turnOff();
    }

    public void canalUp(int canal) {
        tv.canalUp(canal);
    }

    public void canalDown(int canal) {
        tv.canalDown(canal);
    }

    public void volumenUp(int volumen) {
        tv.volumenUp(volumen);
    }

    public void volumenDown(int volumen) {
        tv.volumenDown(volumen);
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
    
    public TV getTv (TV tv) {
    	return tv;
    }

}
