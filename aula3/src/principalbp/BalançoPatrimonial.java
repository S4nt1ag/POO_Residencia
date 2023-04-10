package principalbp;

import java.util.Scanner;
import mes.Mes;
public class BalançoPatrimonial 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double jan, fev, mar, abr, mai, jun, jul;
		
		System.out.print("digite o gasto de Janeiro: ");
		jan = sc.nextDouble();
		System.out.print("digite o gasto de Fevereiro: ");
		fev = sc.nextDouble();
		System.out.print("digite o gasto de Março: ");
		mar = sc.nextDouble();
		System.out.print("digite o gasto de Abril: ");
		abr = sc.nextDouble();
		System.out.print("digite o gasto de Maio: ");
		mai = sc.nextDouble();
		System.out.print("digite o gasto de Junho: ");
		jun = sc.nextDouble();
		System.out.print("digite o gasto de Julho: ");
		jul = sc.nextDouble();
		System.out.println();
		sc.close();
		
		Mes tri = new Mes(jan, fev, mar);
		System.out.println("O total de gastos dos 3 primeiros meses foi de: R$"+ tri.somarGastosTrimestre());
		Mes sep = new Mes(jan, fev, mar, abr, mai, jun, jul);
		System.out.println("O total de gastos dos 7 primeiros meses foi de: R$"+ sep.somarGastosSeptestre());
		
	}
	
	

}
