package diagramadeclases;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.println("cantidad de ruedas");
        int nRuedas = sc.nextInt();
        
        for(int i=0 ; i<nRuedas;i++) {
        	Ruedas ruedas= addRuedas (sc);
        }
//no puedo mostrar el array List
        boolean menu = true;
        System.out.println("1. Crea un coche estandar");
        System.out.println("2. Crea un coche deportivo");
        System.out.println("3. Crea un coche Monovolumen");
        System.out.println("4. Ver reparaciones");
        System.out.println("0. Salir");

        while(menu) {
            int opcion = sc.nextInt();
            Coche est11 = new Estandar(3, "toyota", 1234, 1300, 1500);
            switch (opcion) {
                case 1:
                   Coche est1 = new Estandar(3, "toyota", 1234, 1300, 1500);
                    System.out.println("ya lo has creado");
                    break;
                case 2:
                	Coche deport11 = new Deportivo("maserati", 3, 30000, 234000);
                    System.out.println("ya lo has creado");
                    break;
                case 3:
                    Coche mono1 = new Monovolumen(7, "opel zafira", 345, 12345, 12345);
                    System.out.println("ya lo has creado");
                    break;
                case 4:
                	System.out.println(est1.toString());
                    break;
                case 0: 
                    menu = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor selecciona otra vez.");
                    break;
            }
        }
        
        sc.close();
    }

	private static Ruedas addRuedas(Scanner sc) {
		// TODO Auto-generated method stub
		return null;
	}

}
