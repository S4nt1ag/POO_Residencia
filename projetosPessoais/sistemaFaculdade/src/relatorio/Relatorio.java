package relatorio;

import funcionarios.Empregado;

public class Relatorio {

	public static void calculaGastos(Empregado... empregado) {
		double gastosTotais = 0;

		System.out.println("=".repeat(77));
		System.out.println("                               Contra cheque");
		System.out.println("=".repeat(77));

		for (Empregado empreg : empregado) {
			System.out.printf(
					"Nome:			%s%nsalario base:		R$ %.2f%nadicional bonus/h:	R$ %.2f%nTotal recebido:		R$ %.2f%n",
					empreg.getNome(), empreg.getSalario(), empreg.getGastos() - empreg.getSalario(),
					empreg.getGastos());
			System.out.println("=============================================================================");
			gastosTotais += empreg.getGastos();
		}

		System.out.println("Gastos totais: " + gastosTotais);
	}

}
