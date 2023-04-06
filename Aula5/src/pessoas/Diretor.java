package pessoas;

public class Diretor extends Gerente{

	public double getBonificacao() {

		return super.getBonificacao() + this.getSalario()*0.10;
	}

	
	
}
