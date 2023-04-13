package contas;

public class ContaCorrenteEspecial extends ContaCorrente{
	private double cartaoCredito;
	private double investimento;
	
	public double getCartaoCredito() {
		return cartaoCredito;
	}
	public void setCartaoCredito(double cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	public double getInvestimento() {
		return investimento;
	}
	public void setInvestimento(double investimento) {
		this.investimento = investimento;
	}
	public String toString() {
		return "ContaCorrenteEspecial [cartaoCredito=" + cartaoCredito + ", investimento=" + investimento
				+ ", getTarifa()=" + getTarifa() + ", getLimite()=" + getLimite() + ", getSaldo()=" + getSaldo()
				+ ", getNumero()=" + getNumero() + ", getAgencia()=" + getAgencia() + ", getTitular()=" + getTitular()
				+ ", getTipo()=" + getTipo() + "]";
	}
	
	
}
