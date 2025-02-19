package reto;

public class Main {
	public static void main(String[] args) {
		Coche coche = new Coche ("Miata MX-5", "Mazda");
		Conductor conductor = new Conductor ("Abraham");
		coche.mostrarDetalles();
		conductor.conducir(coche);
	}
}