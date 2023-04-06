package relatorios;

import pessoas.Assistente;
import pessoas.Diretor;
import pessoas.Funcionario;
import pessoas.Gerente;
import pessoas.Operador;

public class FolhaPagamento {

	public double calculaFolhaPagamento(Funcionario funcionario) {
		return funcionario.getSalario() + funcionario.getBonificacao();

	}

	public double calculaFolhaPagamento(Operador operador) {
		return operador.getSalario() + operador.getBonificacao();

	}

	public double calculaFolhaPagamento(Assistente assistente) {
		return assistente.getSalario() + assistente.getBonificacao();

	}

	public double calculaFolhaPagamento(Gerente gerente) {
		return gerente.getSalario() + gerente.getBonificacao();

	}

	public double calculaFolhaPagamento(Diretor diretor) {
		return diretor.getSalario() + diretor.getBonificacao();

	}
}
