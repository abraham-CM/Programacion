package actHerenciayExcepciones;
import java.time.LocalDate;
import java.util.ArrayList;

// Clase que representa una carrera, hereda de EventoDeportivo
public class Carrera extends EventoDeportivo {
    private double distancia;

    // Constructor
    public Carrera(String nombre, LocalDate fecha, String lugar, double distancia) {
        super(nombre, fecha, lugar);
        this.distancia = distancia;
    }

    // Getter y setter para distancia
    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    // Implementación del método obtenerGanador
    @Override
    public Participante obtenerGanador() {
        Participante ganador = null;
        double menorTiempo = Double.MAX_VALUE;

        for (Participante participante : getParticipantes()) {
            if (participante.getTiempo() < menorTiempo) {
                menorTiempo = participante.getTiempo();
                ganador = participante;
            }
        }
        return ganador;
    }
}