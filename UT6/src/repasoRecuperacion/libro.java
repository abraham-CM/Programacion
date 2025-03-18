package repasoRecuperacion;

public class libro {
private String titulo;
private String autor;
private int añoPublicacion;




//constructor

@Override
public String toString() {
	return "libro [titulo=" + titulo + ", autor=" + autor + ", añoPublicacion=" + añoPublicacion + "]";
}

public libro(String titulo, String autor, int añoPublicacion) {
	this.titulo = titulo;
	this.autor = autor;
	this.añoPublicacion = añoPublicacion;
}

//get-set
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public int getAñoPublicacion() {
	return añoPublicacion;
}
public void setAñoPublicacion(int añoPublicacion) {
	this.añoPublicacion = añoPublicacion;
}


}
