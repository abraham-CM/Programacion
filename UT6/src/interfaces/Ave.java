package interfaces;

public abstract class Ave {
    private String nombre;

    public Ave(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void volar(); // Método abstracto

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }
}
