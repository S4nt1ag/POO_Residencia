package pessoas;

public class Diretor extends Gerente{

	public static double getBonificacao() {

		return super.getBonificacao() + this.getSalario()*0.10;
	}

	
	
}
