package funcionarios;

public class Empregado {
	private String nome;
	private double salario;

	public Empregado(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		// System.out.println("Criado com sucesso");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getGastos() {
		return this.salario;
	}

	@Override
	public String toString() {
		return "Empregado [getNome()=" + getNome() + ", getSalario()=" + getSalario() + "]";
	}

}
