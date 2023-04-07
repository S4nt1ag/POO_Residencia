package contas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaCorrente extends Conta {

	private double tarifa;
	private double limite;

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void imprimeExtrato() {
		System.out.println("### Extrato da Conta Corrente ###");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
		Date date = new Date();
		System.out.println("Titular: " + this.getTitular());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data: " + sdf.format(date));

	}

	public String toString() {
		return "ContaCorrente [tarifa=" + tarifa + ", limite=" + limite + "]";
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
