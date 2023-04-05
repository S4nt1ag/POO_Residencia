package ExerciciosLojaFerramentas;

import java.util.Scanner;
public class LojaFerramentas 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		final double precoParafuso = 1.50; 
		final double precoArruela = 2.00; 
		final double precoPorca = 2.50;
		int quantidadeParafusos, quantidadeArruelas, quantidadePorcas;
		double totalParafusos, totalArruelas, totalPorcas, totalPagar;
		String nome;
		
		System.out.print("Digite seu nome: ");
		nome = sc.next();
		System.out.print("Digite a quantidade de parafusos que deseja: ");
		quantidadeParafusos = sc.nextInt();
		System.out.print("Digite a quantidade de arruelas que deseja: ");
		quantidadeArruelas = sc.nextInt();
		System.out.print("Digite a quantidade de porcas que deseja: ");
		quantidadePorcas = sc.nextInt();
		
		
		totalParafusos = precoParafuso * quantidadeParafusos;
		totalArruelas = precoArruela * quantidadeArruelas;
		totalPorcas = precoPorca * quantidadePorcas;
		
		totalPagar = totalParafusos + totalPorcas + totalArruelas; 
		
		
		System.out.println();
		System.out.print("Cliente: "+ nome + "\n");
		System.out.println("===============================");
		System.out.printf("Parafusos: %d subtotal: %.2f ", quantidadeParafusos,totalParafusos);
		System.out.println();
		System.out.printf("Arruelas:  %d subtotal: %.2f", quantidadeArruelas,totalArruelas);
		System.out.println();
		System.out.printf("Porcas:    %d subtotal: %.2f", quantidadePorcas,totalPorcas);
		System.out.println();
		System.out.println("===============================");
		System.out.println("Total a pagar:  R$ "+ totalPagar);
		
		sc.close();
	}

}
