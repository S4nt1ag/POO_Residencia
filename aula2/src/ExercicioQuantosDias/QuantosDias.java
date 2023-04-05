package ExercicioQuantosDias;

import java.util.Scanner;

public class QuantosDias {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int anoAtual, qtdAnosBi, dias;
		
		System.out.print("Digite o ano atual: ");
		anoAtual = scan.nextInt();
		
		
		qtdAnosBi = anoAtual / 4;
		dias = (anoAtual - 1) * 365 +  qtdAnosBi;
		System.out.println("Já se passaram "+ dias + " dias desde 01/01/0001");
		scan.close();
	}

}
