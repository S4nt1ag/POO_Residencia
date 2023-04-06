package pessoas;

public class Diretor extends Gerente {

	public Diretor(String nome, String cpf, double salario, String matricula, int senha, int numeroFuncionarios) {
		super(nome, cpf, salario, matricula, senha, numeroFuncionarios);
	}

	public double getBonificacao() {
		return super.getBonificacao() + this.getSalario() * 0.10;
	}

	@Override
	public String toString() {
		return "Diretor [getNome()=" + getNome() + ", getCpf()=" + getCpf() + ", getSalario()=" + getSalario()
				+ ", getMatricula()=" + getMatricula() + "]";
	}

}
