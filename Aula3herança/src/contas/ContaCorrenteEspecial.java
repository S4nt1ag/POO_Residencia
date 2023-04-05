package contas;

public class ContaCorrenteEspecial extends ContaCorrente{
	private double cartaoCredito;
	private double investimento;
	
	public ContaCorrenteEspecial(int agencia, String titular, double saldo, String tipo, double tarifa, double limite, double cartaoCredito, double investimento) {
		super(agencia, titular, saldo, tipo, tarifa, limite);
		this.cartaoCredito = cartaoCredito;
		this.investimento = investimento;
		
		
	}
	@Override
	public void Imprimir() {
		super.Imprimir();
		System.out.println("cartao credito: "+ this.cartaoCredito);
		System.out.println("Investimento: "+ this.investimento);
	}
}
