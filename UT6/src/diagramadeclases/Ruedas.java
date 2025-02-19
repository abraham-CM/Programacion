package diagramadeclases;

public class Ruedas {
	
private float tamaño;
private String condicion;


public Ruedas(float tamaño, String condicion) {
	this.tamaño = tamaño;
	this.condicion = condicion;
}

public Ruedas() {
	// TODO Auto-generated constructor stub
}

//get-set
public float getTamaño() {
	return tamaño;
}
public void setTamaño(float tamaño) {
	this.tamaño = tamaño;
}
public String getCondicion() {
	return condicion;
}
public void setCondicion(String condicion) {
	this.condicion = condicion;
}

}
