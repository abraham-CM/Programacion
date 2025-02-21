package ejePOO20del02;

public class  Usuarios {
private int mensajes;
private String gmail;
private String nick;


//metodos
public void masmensajes() {
	this.mensajes = mensajes+1;
}
public void menosmensajes() {
	this.mensajes = mensajes-1;
}
public void newcorreo(String correo) {
	gmail = correo;
}

//constructor
public Usuarios(int mensajes, String gmail, String nick) {
	super();
	this.mensajes = mensajes;
	this.gmail = gmail;
	this.nick = nick;
}
public Usuarios() {
	
}
//get-set
public int getMensajes() {
	return mensajes;
}
public void setMensajes(int mensajes) {
	this.mensajes = mensajes;
}
public String getGmail() {
	return gmail;
}
public void setGmail(String gmail) {
	this.gmail = gmail;
}
public String getNick() {
	return nick;
}
public void setNick(String nick) {
	this.nick = nick;
}

}
