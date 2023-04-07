package contas;

public abstract class Conta implements ContaFacil {

	protected int numero;
	private int agencia;
	private String titular;
	private double saldo;
	private String tipo;
	private double doacao;

	public boolean verificaDoacao() {
		if (this.saldo >= this.doacao) {
			this.saldo -= this.doacao;
			return true;

		} else {
			return false;
		}
	}

	public double getDoacao() {
		return doacao;
	}

	public void setDoacao(double doacao) {
		this.doacao = doacao;

	}

	private int totalDeContas;

	public int getTotalDeContas() {
		return totalDeContas;
	}

	public Conta() {
		this.totalDeContas++;
		this.numero = this.totalDeContas;
	}

	private int gerarNumero() {
		return 5;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void sacar(double valor) {
		if (this.saldo < valor) {
			System.out.println("Seu saldo é insuficiente!");
		} else {
			this.saldo -= valor;
			System.out.println("Seu saldo é de: " + this.saldo);
		}
	}

	public void transferir(Conta contaDestino, double valor) {

		if (this.saldo < valor) {
			System.out.println("Seu saldo é insuficiente!");
		} else {
			this.saldo -= valor;
			contaDestino.saldo += valor;
			System.out.println("Seu saldo é de: " + this.saldo);
		}

	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void imprimir() {
	};

	public String toString() {
		return "Conta [numero=" + numero + ", agencia=" + agencia + ", titular=" + titular + ", saldo=" + saldo
				+ ", tipo=" + tipo + "]";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract void imprimeExtrato();

}
