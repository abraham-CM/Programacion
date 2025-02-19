package repaso;

public class Curso  {
private String nombre;
private int codCurso;


public Curso(String nombre, int codCurso) {
	
	this.nombre = nombre;
	this.codCurso = codCurso;
}
public Curso(int codeD) {
	
}


@Override
public String toString() {
	return "Curso [nombre=" + nombre + ", codCurso=" + codCurso + "]";
}
//get.set
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getCodCurso() {
	return codCurso;
}
public void setCodCurso(int codCurso) {
	this.codCurso = codCurso;
}





}
