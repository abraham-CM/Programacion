package ejePOO20del02;

import java.util.Scanner;

public class Main {
/**
 * Meotodo principal que inicia el menu
 * @param args argumentos de linea de comandos
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean menu1 = true;
		boolean menu2 = true;
		boolean menu3 = true;
		while(menu1) {
try {
	
			System.out.println(" 1, administrador ");
			System.out.println(" 2, moderador ");
			System.out.println(" 0, salir");
			int op = sc.nextInt();
			switch (op) {
			case 1: 
				System.out.println("Introduce tu correo electronico");
				String gmail = sc.next();
				System.out.println("Introduce tu nick");
				String nick = sc.next();
				Administradores adm = new Administradores(0, gmail, nick, 0, 0);
				System.out.println(" ");
				while(menu2) {

					System.out.println("=========== MENU ADMINISTRADOR ===========");
					System.out.println("1, incrementar numero de mensajes");
					System.out.println("2, decrementar numero de mensajes");
					System.out.println("3, modifica el correo electronico");
					System.out.println("4, modifica el nombre de usuario(nick)");
					System.out.println("5, numero de mensajes borrados");
					System.out.println("6, numero de baneos por spam");
					System.out.println("0, salir");
					int op2 = sc.nextInt();
					try {
						
					switch (op2) {
					case 1:
						adm.masmensajes();
						System.out.println("Los mensajes se han incrementado");
						break;
					case 2:
						adm.menosmensajes();
						System.out.println("Los mensajes se han decrementado");

						break;
					case 3: 
						System.out.println("escribe tu nuevo correo electronico");
						String correo2 = sc.next();
						adm.newcorreo(correo2);
						break;
					case 4:
						System.out.println("escribe tu nuevo nick");
						String name2 = sc.next();
						adm.newnombre(name2);
						break;
					case 5: 
						adm.mensajesBorrados();
						System.out.println("un mensaje a sido borrado");
						System.out.println("numero total de mensajes borrados: " + adm.getMbasura());
						break;
					case 6:
						adm.nbans();
						System.err.println("el numero de bans ha aumentado");
						break;

					case 0: menu2=false;
					break;

					default:
						throw new IllegalArgumentException("Unexpected value: " + op2);
					}
					} catch (Exception e) {
						System.out.println("introduce un valor valido");
						break;
					}
				}
				break;
			case 2:
				System.out.println("Introduce tu correo electronico");
				String gmail2 = sc.next();
				System.out.println("Introduce tu nick");
				String nick2 = sc.next();
				Moderadores mod = new Moderadores(0, gmail2, nick2, 0);
				System.out.println(" ");
				while(menu3) {
					System.out.println("=========== MENU MODERADOR ===========");
					System.out.println("1, incrementar numero de mensajes");
					System.out.println("2, decrementar numero de mensajes");
					System.out.println("3, modifica el correo electronico");
					System.out.println("4, numero de mensajes borrados");
					System.out.println("0, salir");
					int op3 = sc.nextInt();
					try {

						switch (op3) {
						case 1:
							mod.masmensajes();
							System.out.println("Los mensajes se han incrementado");
							break;
						case 2:mod.menosmensajes();
						System.out.println("Los mensajes se han decrementado");

						break;
						case 3: 
							System.out.println("escribe tu nuevo correo electronico");
							String correo2 = sc.next();
							mod.newcorreo(correo2);
							break;
						case 4: 
							mod.masdelete();
							System.out.println("un mensaje a sido borrado");
							break;
						case 0:menu3=false;
						break;

						default:
							throw new IllegalArgumentException("Unexpected value: " + op);
						}
					} catch (Exception e) {
						System.out.println("ese valor no es valido");
						break;
					}
				}
			case 0:
				menu1 =false;
				break;
			}




} catch (Exception e) {
	System.out.println("introduce un numero valido");
	break;
}
		}

	}
}
