package repasoexamen;

public class MonoVolumen extends Coche {
private int plazas;
private Ruedas rueda;




public MonoVolumen(String marca, int numero, float precioCoste, float precioVenta, int plazas) {
	super(marca, numero, precioCoste, precioVenta);
	this.plazas = plazas;
	
}




public int getPlazas() {
	return plazas;
}

public void setPlazas(int plazas) {
	this.plazas = plazas;
}
public String toString(Coche c1) {
	return "MonoVolumen [plazas=" + plazas + ", rueda=" + rueda + ", getPlazas()=" + getPlazas() + ", getMarca()="
			+ getMarca() + ", getNuermo()=" + getNuermo() + ", getPrecioCoste()=" + getPrecioCoste()
			+ ", getPrecioVenta()=" + getPrecioVenta() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}


}
