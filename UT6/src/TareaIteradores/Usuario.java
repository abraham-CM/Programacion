package TareaIteradores;

import java.util.ArrayList;

class Usuario {
    String nombre;
    int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}

class RedSocial {
    private ArrayList<Usuario> amigos;

    public RedSocial() {
        amigos = new ArrayList<>();
    }

    public void agregarAmigo(Usuario amigo) {
        amigos.add(amigo);
    }

    public void mostrarAmigos() {
        if (amigos.isEmpty()) {
            System.out.println("No tienes amigos agregados.");
        } else {
            for (Usuario amigo : amigos) {
                System.out.println(amigo);
            }
        }
    }

    public void eliminarAmigosMenores(int edadMinima) {
        for (int i = amigos.size() - 1; i >= 0; i--) {
            if (amigos.get(i).edad < edadMinima) {
                amigos.remove(i);
            }
        }
    }

    public void buscarAmigo(String nombre) {
        for (Usuario amigo : amigos) {
            if (amigo.nombre.equalsIgnoreCase(nombre)) {
                System.out.println("Amigo encontrado: " + amigo);
                return;
            }
        }
        System.out.println("No se encontró un amigo con el nombre: " + nombre);
    }
}

