package diagramadeclases;
import java.util.*;

public class Coche {
private String marca;
private int numero;
private float precioCoste;
private float precioVenta;
//composiciones
private Motor motor;
private Carroceria carroceria;
private ArrayList<Ruedas> ruedas;
private ArrayList<Reparacion> reparacion;



//Constructor
public Coche (String marca, int numero, float precioCoste, float precioVenta) {
	this.marca = marca;
	this.numero = numero;
	this.precioCoste = precioCoste;
	this.precioVenta = precioVenta;
}
public Coche (String marca, int numero, float precioCoste, float precioVenta, Motor motor, Carroceria carroceria, Ruedas ruedas, Reparacion reparacion) {
	this.marca = marca;
	this.numero = numero;
	this.precioCoste = precioCoste;
	this.precioVenta = precioVenta;
	this.motor = motor;
	this.carroceria= carroceria;
}

//get-set
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public float getPrecioCoste() {
	return precioCoste;
}
public void setPrecioCoste(float precioCoste) {
	this.precioCoste = precioCoste;
}
public float getPrecioVenta() {
	return precioVenta;
}
public void setPrecioVenta(float precioVenta) {
	this.precioVenta = precioVenta;
}
public ArrayList<Reparacion> getReparacion() {
	return reparacion;
}
public void setReparacion(ArrayList<Reparacion> reparacion) {
	this.reparacion = reparacion;
}
////////////////
public Coche addruedas(Ruedas rueda) {
if(ruedas.size()>5)System.out.println("introduce un valor menos que 5");
this.ruedas.add(rueda);
return this;
}
public void showR() {
	for(Ruedas n:ruedas) {
		System.out.println(n);
	}
}
@Override
public String toString() {
	return "Coche [marca=" + marca + ", numero=" + numero + ", precioCoste=" + precioCoste + ", precioVenta="
			+ precioVenta + ", motor=" + motor + ", carroceria=" + carroceria + ", ruedas=" + ruedas + ", reparacion="
			+ reparacion + ", getMarca()=" + getMarca() + ", getNumero()=" + getNumero() + ", getPrecioCoste()="
			+ getPrecioCoste() + ", getPrecioVenta()=" + getPrecioVenta() + ", getReparacion()=" + getReparacion()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}





}
