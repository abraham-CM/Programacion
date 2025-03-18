package actHerenciayExcepciones;

import java.time.LocalDate;

// Clase principal para probar el sistema
public class Main {
    public static void main(String[] args) {
        // Crear participantes
        Participante p1 = new Participante("Juan", "Pérez", 20, 30.5);
        Participante p2 = new Participante("Ana", "Gómez", 22, 28.3);

        // Crear una carrera
        Carrera carrera = new Carrera("Maratón de la Ciudad", LocalDate.now(), "Parque Central", 42.195);
        carrera.inscribirParticipante(p1);
        carrera.inscribirParticipante(p2);

        // Obtener el ganador de la carrera
        System.out.println("Ganador de la carrera: " + carrera.obtenerGanador());

        // Crear un torneo de fútbol
        TorneoDeFutbol torneo = new TorneoDeFutbol("Copa Mundial", LocalDate.now(), "Estadio Nacional");
        Equipo equipo1 = new Equipo("Equipo A");
        equipo1.añadirJugador(p1);
        equipo1.setPuntos(10);

        torneo.añadirEquipo(equipo1);

        // Obtener el ganador del torneo
        System.out.println("Ganador del torneo: " + torneo.obtenerGanador());
    }
}