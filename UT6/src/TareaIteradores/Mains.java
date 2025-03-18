package TareaIteradores;

public class Mains {
    public static void main(String[] args) {
        RedSocial redSocial = new RedSocial();

        // Agregar amigos
        redSocial.agregarAmigo(new Usuario("Juan", 25));
        redSocial.agregarAmigo(new Usuario("Ana", 17));
        redSocial.agregarAmigo(new Usuario("Carlos", 30));
        redSocial.agregarAmigo(new Usuario("Luisa", 16));
        redSocial.agregarAmigo(new Usuario("Pedro", 22));
        redSocial.agregarAmigo(new Usuario("Sofía", 19));

        // Mostrar lista de amigos antes de eliminar
        System.out.println("Lista de amigos antes de eliminar menores de 18:");
        redSocial.mostrarAmigos();

        // Eliminar amigos menores de 18 años
        redSocial.eliminarAmigosMenores(18);

        // Mostrar lista de amigos después de eliminar
        System.out.println("\nLista de amigos después de eliminar menores de 18:");
        redSocial.mostrarAmigos();

        // Buscar un amigo por nombre
        System.out.println("\nBuscando a Carlos:");
        redSocial.buscarAmigo("Carlos");

        System.out.println("\nBuscando a Luisa:");
        redSocial.buscarAmigo("Luisa");
    }
}