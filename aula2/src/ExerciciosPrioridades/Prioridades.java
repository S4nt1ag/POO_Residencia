package ExerciciosPrioridades;

public class Prioridades {

	public static void main(String[] args) {
		
		double resultado;
		
		resultado = 5.0 + 4.0 * 2.0;
		System.out.println("Operação: 5 + 4 * 2 = "+ resultado);
		
		resultado = (5.0 + 4.0) * 2.0;
		System.out.println("Operação: (5 + 4) * 2 = "+ resultado);
		
		resultado = 1.0 + 2.0 / 3.0 * 4.0;
		System.out.println("Operação: 1.0 + 2.0 / 3.0 * 4.0 = "+ resultado);
		
		resultado = (1.0 + 2.0) / (3.0 * 4.0);
		System.out.println("(1.0 + 2.0) / (3.0 * 4.0) = "+ resultado);
	}

}
