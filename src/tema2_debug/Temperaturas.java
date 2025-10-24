package tema2_debug;

import java.util.Scanner;

/**
 * Programa con errores para practicar la depuración. El programa pide una
 * temperatura y muestra si hace frío, calor o temperatura templada. Después,
 * repite mientras el usuario quiera continuar.
 */
public class Temperaturas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		mostrarMensajeBienvenida(); // RLM24102025: Error de sintaxis, falta ;

		boolean continuar = true;

		while (continuar == true) { // RLM24102025: Error lógico, solo pone false, para que funcione while hace
			// falta una condición
			double temperatura = pedirTemperatura(sc); // RLM24102025: Error de sintaxis, falta ;
			mostrarResultado(temperatura); // RLM24102025: Error de sintaxis, falta ;

			System.out.print("¿Desea introducir otra temperatura? (s/n): ");
			String respuesta = sc.next();

			if (respuesta.equals("n") || respuesta.equals("N")) { // RLM24102025: Error de ejecución, al poner n o N, no
				// ejecuta nada, por lo tanto, el programa nunca
				// acabará
				continuar = false;
			}

		}

		sc.close();// RLM24102025: Error de sintaxis, falta ;
		System.out.println("Programa finalizado.");
	}

	public static void mostrarMensajeBienvenida() {
		System.out.println("Bienvenido al analizador de temperaturas."); // RLM24102025: Error de sintaxis, falta ;
		System.out.println("Este programa indica si hace frío, calor o está templado."); // RLM24102025: Error de
																							// sintaxis, falta ;
	}

	public static double pedirTemperatura(Scanner sc) {
		double t;
		do {
			System.out.print("Introduce la temperatura en grados: ");
			t = sc.nextDouble();
			if (t < -10 && t > 50) {
				System.out.println("Temperatura fuera del rango permitido (-10 a 50)."); // RLM24102025: Error de
																							// sintaxis, falta ;
			}
		} while (t < -10 && t > 50);
		return t;
	}

	public static void mostrarResultado(double temperatura) {
		if (temperatura < 15)
			System.out.println("Hace frío."); // RLM24102025: Error de sintaxis, falta ;
		else if (temperatura >= 15 && temperatura < 30)
			System.out.println("Temperatura templada."); // RLM24102025: Error de sintaxis, falta ;
		else if (temperatura >= 30)
			System.out.println("¡Hace mucho calor!"); // RLM24102025: Error de sintaxis, falta ;
		else
			System.out.println("Valor no reconocido."); // RLM24102025: Error de sintaxis, falta ;
	}
}