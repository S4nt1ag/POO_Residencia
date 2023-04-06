package exemploPolimorfismo;

public class Livro extends Produto {

	@Override
	public void mostraDados() {
		System.out.println("Dados do livro!");
	}

	public void MostraAutor() {
		System.out.println("Dados do autor!");
	}
}
