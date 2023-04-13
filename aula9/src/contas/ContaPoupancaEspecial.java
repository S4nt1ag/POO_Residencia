package contas;

public class ContaPoupancaEspecial extends ContaPoupanca {

	double cartaoDebito;

	public double getCartaoDebito() {
		return cartaoDebito;
	}

	public void setCartaoDebito(double cartaoDebito) {
		this.cartaoDebito = cartaoDebito;
	}

	public String toString() {
		return "ContaPoupancaEspecial [cartaoDebito=" + cartaoDebito + ", getRendimento()=" + getRendimento()
				+ ", getSaldo()=" + getSaldo() + ", getNumero()=" + getNumero() + ", getAgencia()=" + getAgencia()
				+ ", getTitular()=" + getTitular() + ", getTipo()=" + getTipo() + "]";
	}
		
	
}
