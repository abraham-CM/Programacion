package repaso;

import java.util.ArrayList;

public class Profesor {
private String nombre;
private ArrayList<Curso> cursos;

//constructores

public Profesor(String nombre, ArrayList<Curso> cursos) {
	this.nombre = nombre;
	this.cursos = cursos;
}


//metodos
public void addCursos (Curso curso) {
	cursos.add(curso);
}
public void deleteCursos (Curso curso) {
	cursos.remove(curso);
}

public void imprimir (){
	for(Curso p : cursos) {
		System.out.println(p);
	}
}



@Override
public String toString() {
	return "Profesor [nombre=" + nombre + ", cursos=" + cursos + "]";
}

//get.set
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public ArrayList<Curso> getCursos() {
	return cursos;
}
public void setCursos(ArrayList<Curso> cursos) {
	this.cursos = cursos;
}






}
