package contas;

public class Conta {

	public int numero;
	public int agencia;
	public String titular;
	private double saldo;
	public String tipo;
	
	public Conta() {
		
	}
	
	public Conta(int agencia, String titular, double saldo, String tipo) {
		this.numero = gerarNumero();
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;
		this.tipo = tipo;
		System.out.println("Construi minha conta");
	}
	
	public Conta(int numero, int agencia, String titular, double saldo, String tipo) {
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;
		this.tipo = tipo;
		System.out.println("Construi minha conta");
	}
	
	private int gerarNumero() {
		int numero;
		for( numero =0; numero < 4; numero ++) {
		
		}
		return numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void sacar(double valor) {
		if(this.saldo < valor) {
			System.out.println("Seu saldo é insuficiente!");
		}
		else {
			this.saldo -= valor;
			System.out.println("Seu saldo é de: " + this.saldo);
		}
	}
	
	public void transferir(Conta contaDestino, double valor) {
		
		if(this.saldo < valor) {
			System.out.println("Seu saldo é insuficiente!");
		}
		else {
			this.saldo -= valor;
			contaDestino.saldo += valor;
			System.out.println("Seu saldo é de: " + this.saldo);
		}
		
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	public void Imprimir() {
		System.out.println("Numero: "+ this.numero);
		System.out.println("Agencia: "+ this.agencia);
		System.out.println("Titular: "+ this.titular);
		System.out.println("Saldo: "+ this.saldo);
		System.out.println("Tipo: "+ this.tipo);
		
	}
	

	
	
	
}
