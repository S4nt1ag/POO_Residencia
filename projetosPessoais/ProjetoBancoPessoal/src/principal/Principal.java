package principal;

import sistema.*;
import utilitarios.*;

public class Principal {

	public static void main(String[] args) {
		Clear cl = new Clear();
		Painel pn = new Painel();
		Entrar en = new Entrar();

		en.CriarLogin();
		cl.cls();

		pn.CriarPainel();
		pn.EscolhaPainel();

	}

}
