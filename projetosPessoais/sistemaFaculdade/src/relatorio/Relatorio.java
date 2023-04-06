package relatorio;

import funcionarios.Empregado;

public class Relatorio {

	public void calculaGastos(Empregado... empregado) {
		double gastosTotais = 0;

		System.out.println("-".repeat(80));
		System.out.println("                                  Contra cheque");
		System.out.println("-".repeat(80));

		for (Empregado empreg : empregado) {
			System.out.printf(
					"Nome:\t\t\t\t\t\t\t%-23s|%nsalario base:\t\t\t\t\t\tR$ %-20.2f|%n"
							+ "adicional bonus/h:\t\t\t\t\tR$ %-20.2f|%nTotal recebido:\t\t\t\t\t\tR$ %-20.2f|%n",
					empreg.getNome(), empreg.getSalario(), empreg.getGastos() - empreg.getSalario(),
					empreg.getGastos());
			System.out.println("*".repeat(80));
			gastosTotais += empreg.getGastos();
		}

		System.out.println("Total gasto: R$ " + gastosTotais);
	}

}
