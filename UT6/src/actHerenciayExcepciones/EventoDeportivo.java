package actHerenciayExcepciones;
import java.time.LocalDate;
import java.util.ArrayList;

// Clase abstracta que representa un evento deportivo
public abstract class EventoDeportivo implements Ganador {
    private String nombre;
    private LocalDate fecha;
    private String lugar;
    private ArrayList<Participante> participantes;

    // Constructor
    public EventoDeportivo(String nombre, LocalDate fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.participantes = new ArrayList<>();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    // Método para inscribir un participante
    public void inscribirParticipante(Participante participante) {
        participantes.add(participante);
    }

    // Método abstracto para obtener el ganador (debe ser implementado en las subclases)
    @Override
    public abstract Participante obtenerGanador();
}