package agenda;

import java.util.ArrayList;

public class Pagina {
private int dias;
private int mes;
private ArrayList<Cita> citas;
public Pagina(int dias, int mes, ArrayList<Cita> citas) {

	this.dias = dias;
	this.mes = mes;
	this.citas = new ArrayList<>(citas);
	
}
public Pagina(int dias, int mes) {
	this.dias = dias;
	this.mes = mes;
}
public Pagina () {
	
}
public void addCita(Cita cita){
citas.add(cita);
}
public void removeCita(Cita cita){
citas.remove(cita);
}



public int getDias() {
	return dias;
}
public void setDias(int dias) {
	this.dias = dias;
}
public int getMes() {
	return mes;
}
public void setMes(int mes) {
	this.mes = mes;
}
public ArrayList<Cita> getCitas() {
	return citas;
}
public void setCitas(ArrayList<Cita> citas) {
	this.citas = citas;
}
//ver citas

public void showP(ArrayList<Pagina> pagina) {
	
	for(Pagina pag : pagina) {
		System.out.println(pag.toString());
		showC(citas);
		
	}
}
public void showC(ArrayList<Cita> a) {
	for(Cita c : citas ) {
		System.out.println(c);
	}
}
@Override
public String toString() {
	return "Pagina [dias=" + dias + ", mes=" + mes;
}

/*
public void imprimirArray(ArrayList<Pagina> a) {
	for(Pagina b: a) {
		System.out.println(b.toString());
		imprimircitas(citas);
	}
}
 public void imprimircitas(ArrayList<Cita> a) {
	for(Cita b: a) {
		System.out.println(b.toString());
	}
}*/




/*public Cita serchCita(String titulo) {
	for(int i=0; i<=citas.size();i++) {
		ArrayList<Cita> Cita;
		if(titulo equals(Cita)){
			System.out.println(titulo +" esta en la pagina " + i);
		}else System.out.println("Esa cita no esta");
	}
	return null;
}*/

 






}