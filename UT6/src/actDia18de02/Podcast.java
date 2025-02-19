package actDia18de02;

public class Podcast implements Reproducible {
    public void reproducir() {
        System.out.println("Reproduciendo episodio de podcast...");
    }
    public void pausar() {
        System.out.println("Episodio de podcast pausado.");
    }
    public TipoContenido obtenerTipoContenido() {
        return TipoContenido.PODCAST;
    }
}
