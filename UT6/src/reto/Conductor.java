package reto;

public class Conductor {
    private String nombre;
    public Conductor(String nombre) {
        this.nombre = nombre;
    }
    public void conducir(Coche coche) {
        System.out.println(nombre + " está conduciendo el coche con matrícula " + coche.matricula);
    }
}

