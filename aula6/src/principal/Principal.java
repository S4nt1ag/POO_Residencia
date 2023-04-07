package principal;

import contas.*;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Sistema Bancário");
		Conta conta = new ContaCorrente();
		Conta conta1 = new ContaPoupanca();
		Conta conta2 = new ContaPoupancaEspecial();
		Conta conta3 = new ContaCorrenteEspecial();

		conta.setSaldo(1000);
		conta.setTitular("Marcelo");

		conta1.setSaldo(2000);
		conta1.setTitular("Santiago");

		conta2.setTitular("Gabriel");
		conta2.setSaldo(2500);

		conta3.setSaldo(5000);
		conta3.setTitular("Bianca");

		conta.imprimeExtrato();
		System.out.println();
		conta3.imprimeExtrato();
		System.out.println();
		conta1.imprimeExtrato();
		System.out.println();
		conta2.imprimeExtrato();
		System.out.println();

		conta.setDoacao(1001);
		conta1.setDoacao(3000);
		conta2.setDoacao(1500);
		conta3.setDoacao(5000);

		conta.programaSocial();
		System.out.println();
		conta3.programaSocial();
		System.out.println();
		conta1.programaSocial();
		System.out.println();
		conta2.programaSocial();
		System.out.println();

		conta.imprimeExtrato();
		System.out.println();
		conta3.imprimeExtrato();
		System.out.println();
		conta1.imprimeExtrato();
		System.out.println();
		conta2.imprimeExtrato();
		System.out.println();

	}

}
