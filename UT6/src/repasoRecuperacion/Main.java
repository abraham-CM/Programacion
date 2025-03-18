package repasoRecuperacion;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Biblioteca2
        Biblioteca2 bb = new Biblioteca2();

        // Crear ejemplares
        Ejemplar ejem1 = new Ejemplar("Harry Potter", "J.K. Rowling", 2025, 33);
        Ejemplar ejem2 = new Ejemplar("Don Quijote", "Miguel de Cervantes", 1605, 73);

        // Crear usuarios
        Usuario usu1 = new Usuario("Abraham", "123456789");
        Usuario usu2 = new Usuario("Pedrito", "987654321");

        // Agregar ejemplares y usuarios a la biblioteca
        bb.addEje(ejem1);
        bb.addEje(ejem2);

        bb.addUsu(usu1);
        bb.addUsu(usu2);

        // Mostrar ejemplares disponibles inicialmente
        System.out.println("=== Ejemplares Disponibles ===");
        bb.showEje();

        // Realizar un préstamo
        System.out.println("\n=== Realizando Préstamo ===");
        bb.prestamo("123456789", "Don Quijote");

        // Mostrar ejemplares disponibles después del préstamo
        System.out.println("\n=== Ejemplares Disponibles Después del Préstamo ===");
        bb.showEje();

        // Mostrar estado de los usuarios
        System.out.println("\n=== Usuarios y sus Préstamos ===");
        bb.showUsu();

        // Devolver ejemplar
        System.out.println("\n=== Devolución de Ejemplar ===");
        bb.devolucion("123456789", 73);

        // Mostrar ejemplares disponibles después de la devolución
        System.out.println("\n=== Ejemplares Disponibles Después de la Devolución ===");
        bb.showEje();
    }
}
