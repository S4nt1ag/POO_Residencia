package pessoas;

public class Assistente extends Funcionario {

	public Assistente(String nome, String cpf, double salario, String matricula) {
		super(nome, cpf, salario, matricula);
	}

	public double getBonificacao() {
		return super.getBonificacao() + this.getSalario() * 0.05;
	}

	@Override
	public String toString() {
		return "Assistente [getNome()=" + getNome() + ", getCpf()=" + getCpf() + ", getSalario()=" + getSalario()
				+ ", getMatricula()=" + getMatricula() + "]";
	}

}
