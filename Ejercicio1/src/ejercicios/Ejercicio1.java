package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int suma=0, impares=0, ceros=0;
		System.out.println("Introduzca cualquier número, un negativo para salir");
		int numero = leer.nextInt();
		
		while (true) {
			if(numero < 0) {
				System.out.println("número negativo. Saliendo...");
				break;
			}
			if(numero == 0) {
				ceros++;
				numero = leer.nextInt();
			}
				else if(numero%2==0) {
						suma+=numero;
						numero = leer.nextInt();
				}
						else {
							impares++;
							numero = leer.nextInt();
			}
		}
		leer.close();
		System.out.println("La suma de todos los numeros pares es: " + suma);
		System.out.println("La cantidad de ceros introducidos es: " + ceros);
		System.out.println("La cantidad de numeros impar introducidos es: " + impares);
	}

}
