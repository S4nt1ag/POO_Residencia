package conta;

public abstract class Pessoa implements PessoaNec {

	private String nome;
	private String cpf;
	private String funcao;
	private double salario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
		if (funcao == "Assistente") {
			this.salario = 1300.0;
		} else if (funcao == "Operador") {
			this.salario = 1200.0;
		} else if (funcao == "Diretor") {
			this.salario = 2000.0;
		} else if (funcao == "Gerente") {
			this.salario = 3000.0;
		}
	}

	public double getSalario() {
		return salario;
	}

	public void extratoBancario() {
	};

	public void infoPessoa() {
	};

	public void deposito() {
	};

	public void saque() {

	};

}
