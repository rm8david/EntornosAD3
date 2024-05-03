package testing;

import java.util.ArrayList;
import java.util.Scanner;
import javabean.Bebida;

public class Principal {

	public static void main(String[] args) {
		
		Bebida cola = new Bebida("coca-cola",1.3);
		Bebida fnar = new Bebida("fanta naranja",1.2);
		Bebida flim = new Bebida("fanta limon",1.2);
		Bebida agua = new Bebida("agua",1.0);

		ArrayList<Bebida> total = new ArrayList<Bebida>();
		Scanner leer = new Scanner(System.in);
		int opcion = 0;
		while (true){
			cargarMenu();
			opcion = leer.nextInt();
			if (opcion == 5) {
				System.out.println("HASTA PRONTO");
				System.out.println("INFORME DE VENTAS");
				recaudacion(total);
				break;
			}
			switch (opcion) {
			case 1:
				System.out.println("Distrute de su coca-cola");
				total.add(cola);
				break;
			case 2:
				System.out.println("Distrute de su Fanta de Naranja");
				total.add(fnar);
				break;
			case 3:
				System.out.println("Distrute de su Fanta de Limón");
				total.add(flim);
				break;
			case 4:
				System.out.println("Distrute de su agua");
				total.add(agua);
				break;
			default:
				System.out.println("OPCION INCORRECTA");
				break;
				}
			}
		leer.close();
			
		}
	
	public static void cargarMenu() {
		System.out.println("MAQUINA DE BEBIDAS");
		System.out.println("-----------------------");
		System.out.println("1. Coca Cola--------1,30€");
		System.out.println("2. Fanta Naranja----1,20€");
		System.out.println("3. Fanta Limón------1,20€");
		System.out.println("4. Agua-------------1,00€");
		System.out.println("5. Apagar máquina");
		System.out.println("-----------------------");
		System.out.println("¿Que opción elige?");
	}
	
	public static void recaudacion(ArrayList<Bebida> ventas) {
		double total = 0.0;
		for(Bebida bebida:ventas) {
			total+= bebida.getPrecio();
			System.out.println(bebida.toString());
		}
		System.out.println("RECAUDACION: " + total);
		
	}

}
