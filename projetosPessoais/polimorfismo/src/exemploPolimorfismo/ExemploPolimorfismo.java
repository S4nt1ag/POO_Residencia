package exemploPolimorfismo;

public class ExemploPolimorfismo {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.mostraDados();
		System.out.println();
		Produto p2 = new Livro();
		p2.mostraDados();
		System.out.println();
		Livro l1 = new Livro();
		l1.mostraDados();
		l1.MostraAutor();
		System.out.println();
		Livro l2 = (Livro) l1;
		l2.MostraAutor();
		System.out.println();
		Produto p3 = new Revista();
		p3.mostraDados();
	}

}
