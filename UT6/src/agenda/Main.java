package agenda;

import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
	//primero se crea el objeto del arraylist y luego se añaden
	ArrayList<Cita> listaCitas = new ArrayList<>();
	Cita cita = new Cita(19, 4, "ojitos Lindos", "cancion sad");
	Cita cita2 = new Cita(19, 3, "Penas de antaño", "cancion sad");
	Cita cita3 = new Cita(20, 2, "Malibu con piña", "cancion amor");
	Pagina pag = new Pagina(1, 1, listaCitas);
	pag.addCita(cita);
	pag.addCita(cita2);
	pag.addCita(cita3);
	
//pag.showCita(listaCitas);
ArrayList<Pagina> paginas = new ArrayList<>();
Pagina p1 = new Pagina(20, 2, listaCitas);
Pagina p2 = new Pagina(2, 6, listaCitas);
Pagina p3 = new Pagina(10, 4, listaCitas);
Agenda agend = new Agenda(2024);
paginas.add(p1);
paginas.add(p2);	
paginas.add(p3);

pag.showP(paginas);
/*agend.toString();
//pag.imprimirArray(paginas);
agend.nextPag(paginas);
agend.toString();
agend.nextPag(paginas);
agend.toString();
agend.anteriorPag(paginas);
agend.toString();
//pag.showCita(listaCitas);*/
	
	//pag.serchCita("ojitos Lindos");
}
}
