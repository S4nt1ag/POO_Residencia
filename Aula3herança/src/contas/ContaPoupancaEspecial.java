package contas;

public class ContaPoupancaEspecial extends ContaPoupanca{
	private double cartaoDebito;
	
	public ContaPoupancaEspecial(int agencia, String titular, double saldo, String tipo,double rendimento, double cartaoDebito) {
		super(agencia, titular, saldo, tipo, rendimento);
		this.cartaoDebito = cartaoDebito;
	}
	@Override
	public void Imprimir() {
		super.Imprimir();
		System.out.println("cartao debito: "+ this.cartaoDebito);
	}
}
