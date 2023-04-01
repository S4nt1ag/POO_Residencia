package ExerciciosMaioridadePenal;

public class MaioridadePenal {

	public static void main(String[] args) {
		
		int maioridade = 18;
		int idade = 19, anos;
		
		anos = maioridade - idade;
		
		if(anos > 0) 
		{
			System.out.println("Falta(M) "+ anos + " ano(s) para você atingir a maioridade");
		}
		 else 
		{
			System.out.println("Você atingiu a maioridade");
		}
		
		

	}

}
