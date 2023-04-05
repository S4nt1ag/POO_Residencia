package contas;

public class ContaCorrente extends Conta{
	private double tarifa;
	private double limite;
	
	public ContaCorrente (int agencia, String titular, double saldo, String tipo, double tarifa, double limite) {
		super(agencia, titular, saldo, tipo);
		this.tarifa = tarifa;
		this.limite = limite;
	}
	@Override
	public void Imprimir() {
		super.Imprimir();
		System.out.println("Tarifa: "+ this.tarifa);
		System.out.println("Limite: "+ this.limite);
	
	}
	

}
