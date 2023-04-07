package contas;

import java.text.SimpleDateFormat;
import java.util.Date;

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

	public void programaSocial() {
		if (this.verificaDoacao() == false) {
			System.out.println("### Não foi possivel realizar a doação ###");
		} else {
			System.out.println("### Doação feita ###");
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
			Date date = new Date();
			System.out.println("Titular: " + this.getTitular());
			System.out.println("Doação: " + this.getDoacao());
			System.out.println("Data: " + sdf.format(date));
		}
	}

}
