package repasoRecuperacion;

import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Usuario> usuarios;
	private ArrayList<Ejemplar> ejemplares;



public void addUsu(Usuario usu){
	Usuario.add(usu);
}
public void addEje(Ejemplar eje){
	Ejemplar.add(eje);
}



public void addPress(String idUsuario, String idEjem) {
	Usuario usuario = buscarUsuario(idUsuario);
}





private Usuario buscarUsuario(String idUsuario) {
	for(Usuario i : usuarios) {
		if(i.getIdUsuario().equals(idUsuario)) {
			return i;
		}
	}
	return null;
}

/*
public void prestamos(Biblioteca pres) {
	for(Biblioteca i : prestamos) {
		if(i.equals(pres)) System.out.println("ese ejemplar ya esta en prestamo");
		else {
			prestamos.add(pres);
		}
	}
}
 */


public void devolucion (Biblioteca f) {
	
}
//metodo para enseñar los ejemplares q tenemos 
public void showEje () {
	for(Ejemplar i :  ejemplares) {
		System.out.println(i);
	}
}

	@Override
public String toString() {
	return "Biblioteca [ejemplares=" + ejemplares + "]";
}
	
	
	public Biblioteca(ArrayList<Usuario> usuarios, ArrayList<Ejemplar> ejemplares) {
		this.usuarios = usuarios;
		this.ejemplares = ejemplares;
	}


	public Biblioteca() {
		super();
	}
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public ArrayList<Ejemplar> getEjemplares() {
		return ejemplares;
	}
	public void setEjemplares(ArrayList<Ejemplar> ejemplares) {
		this.ejemplares = ejemplares;
	}
	


}
