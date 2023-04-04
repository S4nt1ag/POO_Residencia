package Contas;

public class Conta 
{
	
	public int numero;
	public int agencia;
	private double saldo;
	public String titular;
	public String tipo;

	
	public double getSaldo() 
	{
		return this.saldo;
	};
	public void sacar(double valor) 
	{
		if(this.saldo < valor) 
		{
			System.out.println("|       O seu saldo é insuficiente          |");
			System.out.println("-----------------------------------------------");
		}
		else if(valor < 0) 
		{
			System.out.println("|      impossivel realizar a operação         |");
			System.out.println("-----------------------------------------------");
		}
		else 
		{
			this.saldo -= valor;
			System.out.println("|               saque realizado               |");
			System.out.println("-----------------------------------------------");
		}
		
	};
	public void transferir(Conta contaDestino, double valor) 
	{
		if(this.saldo < valor) 
		{
			System.out.println("|        O seu saldo é insuficiente           |");
			System.out.println("-----------------------------------------------");
		}
		else if(valor < 0) 
		{
				System.out.println("|      impossivel realizar a operação         |");
				System.out.println("-----------------------------------------------");
		}
		else 
		{	
			this.saldo -= valor;
			contaDestino.saldo += valor;
			System.out.println("|           transferencia realizada           |");
			System.out.println("-----------------------------------------------");
		}
	};
	public void depositar(double valor) 
	{
		this.saldo += valor;
		System.out.println("|             Deposito concluido              |");
		System.out.println("-----------------------------------------------");
	};
	public void imprimir() {}
	public String toString() 
	{
		return "Conta [numero=" + numero + ", agencia=" + agencia + ", saldo=" + saldo + ", titular=" + titular
				+ ", tipo=" + tipo + "]";
	};
	
	
}
