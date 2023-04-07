package sistema;

import conta.*;

public class Sistema {

	public static void main(String[] args) {

		Pessoa ps = new ContaPoupanca();
		Pessoa ps2 = new ContaCorrente();
		Pessoa ps3 = new ContaPoupanca();
		Pessoa ps4 = new ContaCorrente();

		ps.setNome("Romulo");
		ps.setCpf("123456789");
		ps.setFuncao("Diretor");
		((ContaPoupanca) (ps)).setSaldo(20000.0);

		ps2.setNome("Damico");
		ps2.setCpf("987654321");
		ps2.setFuncao("Assistente");
		((ContaCorrente) (ps2)).setSaldo(100.0);

		ps3.setNome("Santiago");
		ps3.setCpf("321654987");
		ps3.setFuncao("Gerente");
		((ContaPoupanca) (ps3)).setSaldo(12000.0);

		ps4.setNome("Gabriel");
		ps4.setCpf("987654321");
		ps4.setFuncao("Operador");
		((ContaCorrente) (ps4)).setSaldo(500.0);

		ps.infoPessoa();
		System.out.println();
		ps2.infoPessoa();
		System.out.println();
		ps3.infoPessoa();
		System.out.println();
		ps4.infoPessoa();
		System.out.println();

		ps.extratoBancario();
		System.out.println();
		ps2.extratoBancario();
		System.out.println();
		ps3.extratoBancario();
		System.out.println();
		ps4.extratoBancario();
		System.out.println();

		((ContaPoupanca) (ps)).setDeposito(2000.0);
		ps.deposito();
		System.out.println();

		((ContaCorrente) (ps2)).setSaque(50.0);
		ps2.saque();
		System.out.println();

	}

}
