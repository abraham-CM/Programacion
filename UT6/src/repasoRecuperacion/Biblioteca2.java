package repasoRecuperacion;

import java.util.ArrayList;
import java.util.Iterator;

// Clase Biblioteca2
public class Biblioteca2 {
    private ArrayList<Ejemplar> ejemplares;
    private ArrayList<Usuario> usuarios;

    // Constructor predeterminado
    public Biblioteca2() {
        this.ejemplares = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

   

    // Método para prestar ejemplaresl 
    public void prestamo(String codeUsu, String pedido) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUsuario().equals(codeUsu)) {
                for (Ejemplar ejemplar : ejemplares) {
                    if (ejemplar.toString().equals(pedido)) { // Comparar string
                        usuario.addPres(ejemplar);
                        ejemplares.remove(ejemplar);
                        break;
                    }
                }
            }
        }
    }

    // Método para devolver ejemplares
    public void devolucion(String codeUsu, int codEjemD) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUsuario().equals(codeUsu)) {
                usuario.devolucion(codEjemD);
            }
        }
    }

    // Agregar ejemplar
    public void addEje(Ejemplar ejemplar) {
        ejemplares.add(ejemplar);
    }

    // Agregar usuario
    public void addUsu(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Mostrar usuarios
    public void showUsu() {
        System.out.println("=== Lista de Usuarios ===");
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("ID Usuario: " + usuario.getIdUsuario());
            System.out.println("Ejemplares en préstamo:");
            if (usuario.getEjemplares()== null) {
                System.out.println("  Ninguno.");
            } else {
                for (Ejemplar ejemplar : usuario.getEjemplares()) {
                    System.out.println("  - " + ejemplar);
                }
            }
            System.out.println("-------------------------");
        }
    }

    // Mostrar ejemplares
    public void showEje() {
        System.out.println("=== Lista de Ejemplares Disponibles ===");
        for (Ejemplar ejemplar : ejemplares) {
            System.out.println(ejemplar);
        }
        System.out.println("-------------------------");
    }

    // Getters y setters
    public ArrayList<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(ArrayList<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
