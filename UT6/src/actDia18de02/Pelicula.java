package actDia18de02;

public class Pelicula implements Reproducible {
    public void reproducir() {
        System.out.println("Reproduciendo película...");
    }
    public void pausar() {
        System.out.println("Película pausada.");
    }
    public TipoContenido obtenerTipoContenido() {
        return TipoContenido.PELICULA;
    }
}

