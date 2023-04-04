package Principal;

import Contas.Conta;

public class Sistema 
{

	public static void main(String[] args) 
	{
		System.out.println("-----------------------------------------------");
		System.out.println("|              Sistema Bancário               |");
		System.out.println("-----------------------------------------------");
		Conta alunos = new Conta();
		alunos.numero = 11;
		alunos.agencia = 1;
		alunos.titular = "alunos";
		alunos.depositar(10000.0);
		alunos.tipo = "Corrente";
		System.out.printf("| O saldo da conta alunos é: %.2f ", alunos.getSaldo());
		System.out.println();
		System.out.println("-----------------------------------------------");

		Conta professor = new Conta();
		professor.numero = 10;
		professor.agencia = 1;
		professor.titular = "Professor";
		professor.depositar(100.0);
		professor.tipo = "Corrente";
		System.out.printf("| O saldo da conta professor é: %.2f ", professor.getSaldo());
		System.out.println();
		System.out.println("-----------------------------------------------");

		alunos.transferir(professor, 1000);

		System.out.printf("| O saldo da conta alunos é: %.2f ", alunos.getSaldo());
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.printf("| O saldo da conta professor é: %.2f ", professor.getSaldo());
		System.out.println();
		System.out.println("-----------------------------------------------");

	}
}
