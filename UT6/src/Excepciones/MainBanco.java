package Excepciones;

import java.util.Scanner;

public class MainBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
/** 
 * Declaro menu true para que se repita el while
 * @version 20-2025
 * @see cuentaBancaria
 * @author Abraham
 */
		boolean menu = true;
		cuentaBancaria banco = new cuentaBancaria(50);
		while(menu) {
			System.out.println("1, abonar");
			System.out.println("2, retirar");
			/**
			 * @param op opciones del switch
			*/
			int op = sc.nextInt();
			/**
			 * switch para elegir opcion del menu
			 */
			switch (op) {
			case 1: 
				try {
				System.out.println("cuanto quieres abonar");
				int n = sc.nextInt();
				banco.ingresar(n);
				System.out.println(banco.getSaldo());

				} catch (Exception e) {
					
					System.out.println(" estas en negativo");
				}
				
				break;
			case 2:
				System.out.println("cuanto quieres retiar");
				try {
				int r = sc.nextInt();
				banco.retirar(r);
				System.out.println(banco.getSaldo());
					
				} catch (Exception e) {
					System.out.println("no tienes suficiente dinero, o estas en negativo");
				}
				break;
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + op);
			}
		}
	}

}
