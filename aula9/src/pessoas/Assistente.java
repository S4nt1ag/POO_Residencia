package pessoas;

public class Assistente extends Funcionario{

	public double getBonificacao() {
		
		return super.getBonificacao() + this.getSalario()*0.05;
	}

	
	
}
