package principal;

import pessoas.Assistente;
import pessoas.Diretor;
import pessoas.Funcionario;
import pessoas.Gerente;
import pessoas.OperadorCaixa;
import relatorios.FolhaPagamento;

public class Principal {

	public static void main(String[] args) {
		
//		Gerente gerente =  new Gerente();
//		gerente.setSalario(4000.0);
//		gerente.autentica(0);
//		System.out.println("Bonificacao: " + gerente.getBonificacao());
		FolhaPagamento fp = new FolhaPagamento();
		
		Funcionario func1 = new OperadorCaixa();
		func1.setSalario(4000.0);
		System.out.println("\nSalario: " + func1.getBonificacao());
		System.out.println("Pagamento: " + fp.calculaFolhaPagamento(func1));
		
		Funcionario func2 = new Assistente();
		func2.setSalario(4000.0);
		System.out.println("\nSalario: " + func2.getBonificacao());
		System.out.println("Pagamento: " + fp.calculaFolhaPagamento(func2));
		
		Funcionario func3 = new Gerente();
		func3.setSalario(4000.0);
		System.out.println("\nSalario: " + func3.getBonificacao());
		System.out.println("Pagamento: " + fp.calculaFolhaPagamento(func3));
				
		Funcionario func4 = new Diretor();
		func4.setSalario(4000.0);
		System.out.println("\nSalario: " + func4.getBonificacao());
		System.out.println("Pagamento: " + fp.calculaFolhaPagamento(func4));
		
	}

}
