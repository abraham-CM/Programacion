package repasoexamen;

import java.util.ArrayList;

public class Coche  {
	private String marca;
	private int numero;
	private float precioCoste;
	private float precioVenta;
	//composicion
//	MonoVolumen m = new MonoVolumen(marca, numero, precioCoste, precioCoste, numero);
	private Motor motor;
	private ArrayList<Ruedas> rueda;
	//constructores

	public Coche(String marca, int numero, float precioCoste, float precioVenta) {
		this.marca = marca;
		this.numero = numero;
		this.precioCoste = precioCoste;
		this.precioVenta = precioVenta;
	}


	//set-get
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getNuermo() {
		return numero;
	}
	public void setNuermo(int nuermo) {
		this.numero = nuermo;
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


	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", numero=" + numero + ", precioCoste=" + precioCoste + ", precioVenta="
				+ precioVenta + ", motor=" + motor + ", rueda=" + rueda + ", getMarca()=" + getMarca()
				+ ", getNuermo()=" + getNuermo() + ", getPrecioCoste()=" + getPrecioCoste() + ", getPrecioVenta()="
				+ getPrecioVenta() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	
	

	


}
