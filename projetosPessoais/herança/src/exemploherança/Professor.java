package exemploherança;

public class Professor extends Pessoa {
	private float salario;
	
	public Professor (String nome, String cpf, float salario) {
		super(nome, cpf);
		this.salario = salario;
	}
	@Override
	public void Imprime() {
		super.Imprime();
		System.out.println("Salario: "+ this.salario);
	}
}
