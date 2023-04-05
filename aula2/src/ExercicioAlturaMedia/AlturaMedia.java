package ExercicioAlturaMedia;

import java.util.Scanner;

public class AlturaMedia {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double altura1, altura2, altura3, mediaAltura;
		
		System.out.print("Escreva a altura da primeira pessoa: ");
		altura1 = scan.nextDouble();
		System.out.print("Escreva a altura da segunda pessoa: ");
		altura2 = scan.nextDouble();
		System.out.print("Escreva a altura da terceira pessoa: ");
		altura3 = scan.nextDouble();
		
		mediaAltura = (altura1+altura2+altura3)/3;
		
		System.out.printf("A média das alturas é: %.2f metros", mediaAltura);
		scan.close();
	}

}
