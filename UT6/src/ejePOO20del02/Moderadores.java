package ejePOO20del02;

/**
 * Clase que representa a los moderadores, extendiendo la clase Usuarios
 */
public class Moderadores extends Usuarios {
    private int npostborrados;
    private Usuarios usuarios = new Usuarios();

    /**
     * Constructor de la clase Moderadores
     *
     * @param mensajes Numero de mensajes
     * @param gmail Correo electronico del moderador
     * @param nick Nombre de usuario del moderador
     * @param npostborrados Numero de mensajes borrados
     */
    public Moderadores(int mensajes, String gmail, String nick, int npostborrados) {
        super(mensajes, gmail, nick);
        this.npostborrados = npostborrados;
    }

    // metodos

    /**
     * Incrementa el numero de mensajes
     */
    public void masmensajes() {
        usuarios.masmensajes();
    }

    /**
     * Decrementa el numero de mensajes
     */
    public void menosmensajes() {
        usuarios.menosmensajes();
    }

    /**
     * Modifica el correo electronico del usuario
     *
     * @param correo Nuevo correo electronico
     */
    public void newcorreo(String correo) {
        usuarios.newcorreo(correo);
    }

    /**
     * Incrementa el numero de mensajes borrados
     */
    public void masdelete() {
        this.npostborrados = npostborrados+1;
    }
}
