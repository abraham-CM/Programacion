package agenda;

import java.util.Scanner;

public class Cita {
private int hora;
private int minutos;
private String titulo;
private String texto;




public Cita(int hora, int minutos, String titulo, String texto) {
	
	this.hora = hora;
	this.minutos = minutos;
	this.titulo = titulo;
	this.texto = texto;
}









public void modificarTexto(String texto) {
	this.texto=texto;
}




//set-get
public int getHora() {
	return hora;
}
public void setHora(int hora) {
	this.hora = hora;
}
public int getMinutas() {
	return minutos;
}
public void setMinutas(int minutas) {
	this.minutos = minutas;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getTexto() {
	return texto;
}
public void setTexto(String texto) {
	this.texto = texto;
}




@Override
public String toString() {
	return "Cita [hora=" + hora + ", minutos=" + minutos + ", titulo=" + titulo + ", texto=" + texto + "]";
}









public Object getDescripcion() {
	// TODO Auto-generated method stub
	return null;
}

}
