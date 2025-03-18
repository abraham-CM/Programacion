package repasoRecuperacion;

import java.util.ArrayList;
import java.util.Iterator;

public class Usuario {

    private String nombre;
    private String idUsuario;
    private ArrayList<Ejemplar> ejemplares;
    private Biblioteca2 bb; // Mejor pasar como referencia externa

    public void addPres(Ejemplar eje) {
        ejemplares.add(eje);
    }

    public void showEje() {
        for (Ejemplar i : ejemplares) {
            System.out.println(i);
        }
    }

    public void devolucion(int codEjem) {
        Iterator<Ejemplar> iter = ejemplares.iterator();
        while (iter.hasNext()) {
            Ejemplar i = iter.next();
            if (i.getCodigoEjemplar() == codEjem) {
                bb.addEje(i); // Usar instancia externa
                iter.remove(); // Eliminar elemento de manera segura
            }
        }
    }

    @Override
    public String toString() {
        return "Usuario [ejemplares=" + ejemplares + "]";
    }

    // Constructor con inicialización
    public Usuario(String nombre, String idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.ejemplares = new ArrayList<>(); // Inicializar lista
    }

    // Constructor con lista y biblioteca externa
    public Usuario(String nombre, String idUsuario, ArrayList<Ejemplar> ejem, Biblioteca2 biblioteca) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.ejemplares = ejem;
        this.bb = biblioteca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public ArrayList<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(ArrayList<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }
}
