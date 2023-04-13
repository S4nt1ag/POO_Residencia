package contas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta{

	private double rendimento;

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public String toString() {
		return "ContaPoupanca [rendimento=" + rendimento + ", getSaldo()=" + getSaldo() + ", getNumero()=" + getNumero()
				+ ", getAgencia()=" + getAgencia() + ", getTitular()=" + getTitular() + ", getTipo()=" + getTipo()
				+ "]";
	}

	public void imprimeExtrato() {
		System.out.println("### Extrato da Conta Poupança ###");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
		Date date = new Date();
		System.out.println("Titular: " + this.getTitular());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data: " + sdf.format(date));
		
	}

	public void programaSocial() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
