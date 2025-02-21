package ejePOO20del02;

/**
 * Clase que representa a los administradores, extendiendo la clase Usuarios.
 */
public class Administradores extends Usuarios {
    private int mbasura;
    private int nbans;
    private Usuarios usuarios = new Usuarios();

    /**
     * Incrementa el numero de mensajes
     */
    public void masmensajes() {
        usuarios.masmensajes();
    }

    /**
     * Decrementa el número de mensajes
     */
    public void menosmensajes() {
        usuarios.menosmensajes();
    }

    /**
     * Modifica el correo electronico del usuario
     *
     * @param correo Nuevo correo electrónico
     */
    public void newcorreo(String correo) {
        usuarios.newcorreo(correo);
    }

    /**
     * Modifica el nombre de usuario (nick)
     *
     * @param nombre Nuevo nombre de usuario
     */
    public void newnombre(String nombre) {
        usuarios.setNick(nombre);
    }

    /**
     * Incrementa el número de baneos por spam
     */
    public void nbans() {
        this.nbans = nbans++;
    }

    /**
     * Incrementa el numero de mensajes borrados
     */
    public void mensajesBorrados() {
        mbasura = mbasura++;
    }

    /**
     * Constructor de la clase Administradore.
     *
     * @param mensajes numero de mensajes
     * @param gmail correo electronico del administrador
     * @param nick Nombre de usuario del administrador
     * @param mbasura Numero de mensajes borrados
     * @param nbans numero de baneos por spam
     */
    public Administradores(int mensajes, String gmail, String nick, int mbasura, int nbans) {
        super(mensajes, gmail, nick);
        this.mbasura = mbasura;
        this.nbans = nbans;
    }

    /**
     * Obtiene el numero de mensajes borrados
     *
     * @return Numero de mensajes borrados
     */
    public int getMbasura() {
        return mbasura;
    }

    /**
     * Establece el numero de mensajes borrados
     *
     * @param mbasura numero de mensajes borrados
     */
    public void setMbasura(int mbasura) {
        this.mbasura = mbasura;
    }

    /**
     * Obtiene el número de baneos por spam
     *
     * @return Número de baneos por spam
     */
    public int getNbans() {
        return nbans;
    }

    /**
     * Establece el número de baneos por spam
     *
     * @param nbans Numero de baneos por spam
     */
    public void setNbans(int nbans) {
        this.nbans = nbans;
    }
}
