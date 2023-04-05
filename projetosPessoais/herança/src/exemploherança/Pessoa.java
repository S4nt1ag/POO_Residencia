package exemploherança;

public class Pessoa {
	private String nome;
	private String cpf;
	
	//construtor
	public Pessoa (String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	//método
	public void Imprime() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Cpf: "+ this.cpf);
	}

}
