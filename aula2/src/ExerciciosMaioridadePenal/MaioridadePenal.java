package ExerciciosMaioridadePenal;

import java.util.Scanner;
public class MaioridadePenal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int maioridade = 18;
		int idade, anos;
		
		
		System.out.print("Digite sua Idade: ");
		idade = sc.nextInt();
		
		anos = maioridade - idade;
		
		if(anos > 1) 
		{
			System.out.println("Faltam "+ anos + " anos para você atingir a maioridade");
		}
		else if(anos == 1)
		{
			System.out.println("Falta "+ anos + " ano para você atingir a maioridade");
		}
		else {
			System.out.println("Você atingiu a maioridade");
		}

	}

}
