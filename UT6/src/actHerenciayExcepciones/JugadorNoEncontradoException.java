package actHerenciayExcepciones;
// Excepción personalizada para cuando un jugador no se encuentra en un equipo
public class JugadorNoEncontradoException extends Exception {
    public JugadorNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}