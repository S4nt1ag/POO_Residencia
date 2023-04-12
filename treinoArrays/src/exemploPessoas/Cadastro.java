package exemploPessoas;

import java.util.ArrayList;
import java.util.Collections;

public class Cadastro {

	public static void main(String[] args) {
		ArrayList<Pessoa> cd = new ArrayList<Pessoa>();
		Pessoa pessoa1 = new Operador("Gabriel", "123456789", "sant", "senha123");
		Pessoa pessoa2 = new Assistente("Damico", "987654321", "gabr1", "4203");
		Pessoa pessoa3 = new Diretor("Romulo", "123654789", "artoda", "patos");
		Pessoa pessoa4 = new Gerente("Monica", "564312897", "ninha", "panteras");

		cd.add(pessoa1);
		cd.add(pessoa2);
		cd.add(pessoa3);
		cd.add(pessoa4);

		Collections.sort(cd);
		for (Pessoa i : cd) {
			System.out.println(i);
		}

	}

}
