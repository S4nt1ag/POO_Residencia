package contas;

public class ContaPoupanca extends Conta{
	private double rendimento;
	
	public ContaPoupanca(int agencia, String titular, double saldo, String tipo,double rendimento) {
		super(agencia, titular, saldo, tipo);
		this.rendimento = rendimento;
	}
	@Override
	public void Imprimir() {
		super.Imprimir();
		System.out.println("Tarifa: "+ this.rendimento);
		
	}
}
