package reto;

public abstract class vehiculo {
	protected String matricula;
	public vehiculo(String matricula) {
		this.matricula = matricula;
	}
	public abstract void mostrarDetalles();
}