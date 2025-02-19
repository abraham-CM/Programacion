package repasoexamen;
import java.util.*;
public class Ruedas {
private ArrayList<Ruedas> rueda;
private int tamaño;
private String condicion;



public Ruedas( int tamaño, String condicion) {

	this.tamaño = tamaño;
	this.condicion = condicion;
}


//get-set
public ArrayList<Ruedas> getRueda() {
	return rueda;
}

public void setRueda(Ruedas rueda) {
	rueda.add(rueda);
}
private void add(Ruedas rueda2) {
	// TODO Auto-generated method stub
	
}


public int getTamaño() {
	return tamaño;
}
public void setTamaño(int tamaño) {
	this.tamaño = tamaño;
}
public String getCondicion() {
	return condicion;
}
public void setCondicion(String condicion) {
	this.condicion = condicion;
}


public static void add(String tam, String condicion) {
	// TODO Auto-generated method stub
	
}


}
