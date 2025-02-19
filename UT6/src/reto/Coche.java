package reto;

public class Coche extends vehiculo {
	private String marca;
	public Coche(String matricula, String marca) {
		super(matricula);
		this.marca = marca;
	}
	@Override
	public void mostrarDetalles() {
		System.out.println("Coche - Matrícula: " + matricula + " - Marca: " + marca);
	}
}