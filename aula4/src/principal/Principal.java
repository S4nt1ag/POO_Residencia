package principal;

import pessoas.Assistente;
import pessoas.Diretor;
import pessoas.Funcionario;
import pessoas.Gerente;
import pessoas.Operador;
import relatorios.FolhaPagamento;

public class Principal {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("Santiago", "123456789", 1300.0, "22");

		FolhaPagamento fp = new FolhaPagamento();
		System.out.println(funcionario.toString());
		System.out.println("Bonificação funcionario: " + funcionario.getBonificacao());
		System.out.println("Pagamento: "+ fp.calculaFolhaPagamento(funcionario));
		System.out.println();
		Operador operador = new Operador("Damico", "987654321", 2000, "12");
		System.out.println(operador.toString());
		System.out.println("Bonificação operador: " + operador.getBonificacao());
		System.out.println("Pagamento: "+ fp.calculaFolhaPagamento(operador));
		System.out.println();
		Assistente assistente = new Assistente("Romulo", "123654789", 3000, "2");
		System.out.println(assistente.toString());
		System.out.println("Bonificação assistente: " + assistente.getBonificacao());
		System.out.println("Pagamento: "+ fp.calculaFolhaPagamento(assistente));
		System.out.println();
		Gerente gerente = new Gerente("Monica", "987456321", 4000, "26", 123, 3);
		System.out.println(gerente.toString());
		System.out.println("Bonificação gerente: " + gerente.getBonificacao());
		System.out.println("Pagamento: "+ fp.calculaFolhaPagamento(gerente));
		System.out.println();
		Diretor diretor = new Diretor("Cleiton", "456321789", 5000, "1", 321, 4);
		System.out.println(diretor.toString());
		System.out.println("Bonificação diretor: " + diretor.getBonificacao());
		System.out.println("Pagamento: "+ fp.calculaFolhaPagamento(diretor));
		System.out.println();

	}

}
