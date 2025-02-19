package repasoexamen;

import java.util.ArrayList;
import java.util.Scanner;

import diagramadeclases.Monovolumen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean menu=true;

        MonoVolumen c1 = null;
		while(menu) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1 crear mono Volumen");
			System.out.println("2 ver mono Volumen");
			System.out.println("salir");
			int opcion = sc.nextInt();
			switch (opcion) {
			case 1: 


				System.out.println("introduce marca");
				String nombre = sc.next();

				System.out.println("introduce numero");
				int num = sc.nextInt();

				System.out.println("introduce precioCoste");
				int preC= sc.nextInt();


				System.out.println("introduce precioVenta");

				int preV= sc.nextInt();
				System.out.println("introduce cantidad de plazas");

				int plazas= sc.nextInt();

				System.out.println("introduce Numero de bastidor");
				String nBastidor= sc.next();
				Motor m = new Motor(nBastidor);



				System.out.println("introduce la cantidad de ruedas");
				int nR = sc.nextInt();
				ArrayList<Ruedas> rueda = new ArrayList();
				for(int i=0;i<nR;i++) {
					System.out.println("introduce el tamaño y la candicion de la rueda");
					int tam= sc.nextInt();
					String condicion = sc.next();
					Ruedas ruedaa= new Ruedas(tam, condicion);
					rueda.add(ruedaa);
				}

				int r = rueda.size();		
				 
				c1 = new MonoVolumen(nombre, num, preC, preV, plazas);
				 
				 
				break;
			case 2:
				System.out.println(c1.toString());
				
				break;
			case 3:menu=false;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		}	

	}

}
