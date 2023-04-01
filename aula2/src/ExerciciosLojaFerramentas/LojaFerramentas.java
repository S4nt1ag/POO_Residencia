package ExerciciosLojaFerramentas;

public class LojaFerramentas 
{

	public static void main(String[] args) 
	{
		
		double precoParafuso = 1.50, precoArruela = 2.00, precoPorca = 2.50;
		
		String nome = "Gabriel";
		int quantidadeParafusos = 30, quantidadeArruelas = 55, quantidadePorcas = 15;
		double totalParafusos, totalArruelas, totalPorcas, totalPagar;
		
		totalParafusos = precoParafuso * quantidadeParafusos;
		totalArruelas = precoArruela * quantidadeArruelas;
		totalPorcas = precoPorca * quantidadePorcas;
		
		totalPagar = totalParafusos + totalPorcas + totalArruelas; 
		
		System.out.println("Cliente: "+ nome + "\n");
		System.out.println("===============================");
		System.out.println("Parafusos: "+ quantidadeParafusos);
		System.out.println("Arruelas: " + quantidadeArruelas);
		System.out.println("Porcas: "+ quantidadePorcas);
		System.out.println("===============================");
		System.out.println("Total a pagar:  R$ "+ totalPagar);

	}

}
