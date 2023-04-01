package ExercicioQuantosDias;

public class QuantosDias {

	public static void main(String[] args) {
		
		int anoAtual = 2023, qtdAnosBi, dias;
		
		qtdAnosBi = anoAtual / 4;
		dias = (anoAtual - 1) * 365 +  qtdAnosBi;
		
		System.out.println("Já se passaram "+ dias + " dias desde 01/01/0001");
	}

}
