package sistema;

import funcionarios.Empregado;
import funcionarios.Professor;
import relatorio.Relatorio;

public class Sistema {

	public static void main(String[] args) {
		Relatorio rg = new Relatorio();
		Empregado empregado = new Empregado("Santiago", 1200.0);
		Empregado professor = new Professor("Gabriel", 1300.0, 100);
		Empregado empregado2 = new Empregado("Cristina", 1500.0);
		Empregado professor2 = new Professor("Monica", 1250.0, 200);
		System.out.println("-".repeat(80));
		System.out.println("|                           Faculdade Federal SG                               |");
		System.out.println("-".repeat(80));
		System.out.println(empregado.toString());
		System.out.println(professor.toString());
		System.out.println(empregado2.toString());
		System.out.println(professor2.toString());
		System.out.println();

		rg.calculaGastos(empregado, professor, empregado2, professor2);
	}

}
