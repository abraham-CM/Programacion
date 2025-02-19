package repaso;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	boolean menu = true;
	ArrayList<Curso> c = new ArrayList<>();
	Profesor pro = new Profesor("Paco", c);
	while(menu) {
		System.out.println("1, añadir curso");
		System.out.println("2, borrar curso");
		System.out.println("3, mostrar curso");
		System.out.println("salir");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("como quieres que se llame el curso");
			String nCurso = sc.next();
			System.out.println("Cual es el codigo del curso");
			int code = sc.nextInt();
			Curso curso = new Curso(nCurso, code);
			pro.addCursos(curso);
			System.out.println("La funcion se ejecuto con exito");
			break;
		case 2:
			System.out.println("que curso quieres borrar, introduce el codigo del curso");
			int codeD = sc.nextInt();
			
			
			for(Curso i : pro.getCursos()) {
				if(i.getCodCurso()==codeD) {
					pro.getCursos().remove(i);
					break;
				}
			}
			
			break;
		case 3:
			for(Curso i : pro.getCursos()) {
				System.out.println(i.toString());
			}
			break;
		case 4: menu=false;
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		}
	}
}
}
