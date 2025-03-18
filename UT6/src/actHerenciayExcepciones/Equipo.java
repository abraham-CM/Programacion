package actHerenciayExcepciones;

import java.util.ArrayList;

// Clase que representa un equipo
public class Equipo {
    private String nombre;
    private ArrayList<Participante> jugadores;
    private int puntos;

    // Constructor
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
        this.puntos = 0;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Participante> getJugadores() {
        return jugadores;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    // Método para añadir un jugador
    public void añadirJugador(Participante jugador) {
        jugadores.add(jugador);
    }

    // Método para eliminar un jugador
    public void eliminarJugador(Participante jugador) throws JugadorNoEncontradoException {
        if (!jugadores.remove(jugador)) {
            throw new JugadorNoEncontradoException("Jugador no encontrado: " + jugador.getNombre());
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "Equipo: " + nombre + ", Puntos: " + puntos + ", Jugadores: " + jugadores;
    }

	public Participante getCapitan() {
		// TODO Auto-generated method stub
		return null;
	}
}