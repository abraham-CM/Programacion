package diagramadeclases;

public class Monovolumen extends Coche{
private int plazas;
public Monovolumen(int nPuertas, String marca, int numero, float precioCoste, float precioVenta) {
	super(marca, numero, precioCoste, precioVenta);
	this.plazas= plazas;
}

public int getPlazas() {
	return plazas;
}

public void setPlazas(int plazas) {
	this.plazas = plazas;
}


}
