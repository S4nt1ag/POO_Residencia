package exemploherança;

public class ExemploHeranca 
{

	public static void main(String[] args) 
	{
		
		Aluno al = new Aluno("Joao", "123456789", 11111);
		al.Imprime();
		
		Professor pl = new Professor("Carlos", "987654321", 3000f);
		pl.Imprime();
		
		Pessoa pel = new Pessoa("Maria", "987456321");
		pel.Imprime();
		

	}

}
