package actDia18de02;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Musica musica = new Musica();
	Pelicula peli = new Pelicula();
	Serie serie = new Serie();
	Podcast pod = new Podcast();
	
boolean menu= true;
while(menu) {	
	System.out.println("1, Musica");
	System.out.println("2, Pelicula");
	System.out.println("3, Serie");
	System.out.println("4, Podcast");
	System.out.println("5, salir");
int op = sc.nextInt();
switch (op) {
case 1: 
	musica.reproducir();
	musica.pausar();
	break;
case 2: 
	peli.reproducir();
	peli.pausar();
	break;
case 3: 
	serie.reproducir();
	serie.pausar();
	break;
case 4: 
	pod.reproducir();
	pod.pausar();
	break;
case 5:menu=false;
	break;
default:
	throw new IllegalArgumentException("Unexpected value: " + op);
}

}
}
}
