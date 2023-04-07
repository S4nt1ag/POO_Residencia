package contas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaCorrenteEspecial extends ContaCorrente {
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

	public void imprimeExtrato() {
		System.out.println("### Extrato da Conta Corrente Expecial ###");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
		Date date = new Date();
		System.out.println("Titular: " + this.getTitular());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data: " + sdf.format(date));

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
