package actHerenciayExcepciones;
// Clase que representa a un participante
public class Participante {
    private String nombre;
    private String apellido;
    private int edad;
    private double tiempo; // Atributo adicional para carreras

    // Constructor
    public Participante(String nombre, String apellido, int edad, double tiempo) {
        if (nombre == null || apellido == null) {
            throw new IllegalArgumentException("Nombre y apellido no pueden ser nulos");
        }
        if (edad < 14) {
            throw new IllegalArgumentException("La edad no puede ser menor a 14");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tiempo = tiempo;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 14) {
            throw new IllegalArgumentException("La edad no puede ser menor a 14");
        }
        this.edad = edad;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    // Método toString
    @Override
    public String toString() {
        return nombre + " " + apellido + ", Edad: " + edad + ", Tiempo: " + tiempo + "s";
    }
}