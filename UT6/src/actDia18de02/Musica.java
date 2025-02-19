package actDia18de02;

public class Musica implements Reproducible {
    public void reproducir() {
        System.out.println("Reproduciendo música...");
    }
    public void pausar() {
        System.out.println("Música pausada.");
    }
    public TipoContenido obtenerTipoContenido() {
        return TipoContenido.MUSICA;
    }
}
