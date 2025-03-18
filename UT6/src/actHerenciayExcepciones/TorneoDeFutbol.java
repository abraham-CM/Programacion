package actHerenciayExcepciones;
import java.time.LocalDate;
import java.util.ArrayList;

// Clase que representa un torneo de fútbol, hereda de EventoDeportivo
public class TorneoDeFutbol extends EventoDeportivo {
    private ArrayList<Equipo> equipos;

    // Constructor
    public TorneoDeFutbol(String nombre, LocalDate fecha, String lugar) {
        super(nombre, fecha, lugar);
        this.equipos = new ArrayList<>();
    }

    // Método para añadir un equipo al torneo
    public void añadirEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    // Implementación del método obtenerGanador
    @Override
    public Participante obtenerGanador() {
        Equipo ganador = null;
        int maxPuntos = -1;

        for (Equipo equipo : equipos) {
            if (equipo.getPuntos() > maxPuntos) {
                maxPuntos = equipo.getPuntos();
                ganador = equipo;
            }
        }
        return ganador.getCapitan(); // Suponemos que el capitán representa al equipo
    }
}