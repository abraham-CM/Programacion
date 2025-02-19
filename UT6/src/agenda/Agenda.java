package agenda;

import java.util.ArrayList;

public class Agenda {
private int anito;
ArrayList<Pagina>listaPag = new ArrayList<>();
/*private int dias[]= {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};
private String mes[]= {"enero", "febrero", "marzo", "abril", "mayo", "juanio", "julio", "agosto", 
		"septiembre", "octubre","novienbre", "diciembre"};*/
//metodos
int nPag=0;
public void add(Pagina pag) {
	listaPag.add(pag);
}
public void nextPag(ArrayList<Pagina> listaPag) {
	if(listaPag.size() == nPag)System.out.println("No hay mas paginas");
	else nPag++;
	System.out.println("Estas en la pagina: "+ (nPag+1));
}
public void anteriorPag(ArrayList<Pagina> listaPag) {
	if(0 == nPag)System.out.println("No hay mas paginas");
	else nPag--;
	System.out.println("Estas en la pagina: "+ (nPag+1));
}


@Override
public String toString() {
	return "Agenda [anito=" + anito + ", listaPag=" + listaPag.size() + ", nPag=" + nPag + ", getAnito()=" + getAnito() + "]";
}
//constructor
public Agenda(int anito) {
	this.anito = anito;
}
public void nPag(int npag) {
	this.nPag=npag;
}
//set-get
public int getAnito() {
	return anito;
}

public void setAnito(int anito) {
	this.anito = anito;
}

}
