package diagramadeclases;

public class Deportivo extends Coche {

	public Deportivo(String marca, int numero, float precioCoste, float precioVenta) {
		super(marca, numero, precioCoste, precioVenta);
	}

	@Override
	public String toString() {
		return "Deportivo [getMarca()=" + getMarca() + ", getNumero()=" + getNumero() + ", getPrecioCoste()="
				+ getPrecioCoste() + ", getPrecioVenta()=" + getPrecioVenta() + ", getReparacion()=" + getReparacion()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
