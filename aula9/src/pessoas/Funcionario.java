package pessoas;

public class Funcionario implements Comparable<Funcionario>{

	private String nome;
	private String cpf;
	private double salario;
	private String Matricula;
	
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
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	
	public double getBonificacao() {
		return this.salario * 0.1;
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
	}

	@Override
	public int compareTo(Funcionario o) {
		
		if ( this.getNome().compareTo(o.getNome()) > 0 ) {
			return -1;
		}
		
		else if ( this.getNome().compareTo(o.getNome()) < 0 ) {
			return 1;
		}
		
		else{
			if(this.getSalario() < o.getSalario()) {
				return 1;
			}
			else if(this.getSalario() > o.getSalario()) {
				return -1;
			}
			else {
				return 0;
			}
		}
	}
	
}
