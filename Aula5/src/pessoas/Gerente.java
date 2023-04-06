package pessoas;

public class Gerente extends Assistente{

	private int senha;
	private int numeroFuncionarios;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		}
		else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}
	
	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public double getBonificacao() {
		
		return super.getBonificacao() + this.getSalario() * 0.15;
	}
	
	
}
