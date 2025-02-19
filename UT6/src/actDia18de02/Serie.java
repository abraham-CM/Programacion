package actDia18de02;

public class Serie implements Reproducible {
    public void reproducir() {
        System.out.println("Reproduciendo episodio de serie...");
    }
    public void pausar() {
        System.out.println("Episodio de serie pausado.");
    }
    public TipoContenido obtenerTipoContenido() {
        return TipoContenido.SERIE;
    }
}

