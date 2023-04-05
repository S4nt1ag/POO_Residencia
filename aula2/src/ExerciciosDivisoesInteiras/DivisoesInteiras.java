package ExerciciosDivisoesInteiras;

import java.util.Scanner;
public class DivisoesInteiras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double metadeInteira, resto, valor;
		
		System.out.print("Digite um numero: ");
		valor = sc.nextInt();
		
		metadeInteira = valor/2;
		resto = valor %3;

		System.out.println("A metade inteira  é: "+ metadeInteira);
		System.out.println("O resto da divisão  é: "+ resto);
		sc.close();
	}

}
