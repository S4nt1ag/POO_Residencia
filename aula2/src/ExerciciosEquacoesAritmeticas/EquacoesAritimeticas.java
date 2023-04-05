package ExerciciosEquacoesAritmeticas;


import java.util.Scanner;
public class EquacoesAritimeticas 
{

	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		double a, b, soma, sub, mult, div;
		
		System.out.print("Digite o primeiro numero: ");
		a = sc.nextDouble();
		System.out.print("Digite o segundo numero: ");
		b = sc.nextDouble();

		soma = a + b;
		sub  = a - b;
		mult = a * b;
		div  = a / b;
		
		System.out.println("Os resultados são: ");
		System.out.println();
		System.out.printf("A soma entre %.0f e %.0f é %.0f", a,b,soma);
		System.out.println();
		System.out.printf("A subtração entre %.0f e %.0f é %.0f", a,b,sub);
		System.out.println();
		System.out.printf("A multiplicação entre %.0f e %.0f é %.0f", a,b,mult);
		System.out.println();
		System.out.printf("A divisão entre %.0f e %.0f é %.2f", a,b,div);
		
		
		sc.close();
	}
	

}
