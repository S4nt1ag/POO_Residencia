package pessoas;

public class Operador extends Funcionario {
	
	public Operador(String nome, String cpf, double salario, String matricula) {
		super(nome, cpf, salario, matricula);
	}
	public String getNome() {
		return super.getNome();
	}
	public double getBonificacao() {
		return super.getBonificacao();
	}
	@Override
	public String toString() {
		return "Operador [getNome()=" + getNome() + ", getCpf()=" + getCpf() + ", getSalario()=" + getSalario()
				+ ", getMatricula()=" + getMatricula() + "]";
	}
	
	
	
}
