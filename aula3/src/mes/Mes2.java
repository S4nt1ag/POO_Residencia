package mes;

public class Mes2 {
	private double gastosJaneiro=0;
	private double gastosFevereiro=0;
	private double gastosMarco=0;
	private double gastosAbril=0;
	private double gastosMaio=0;
	private double gastosJunho=0;
	private double gastosJulho=0;
	
	public Mes2(double gastosJaneiro, double gastosFevereiro, double gastosMarco, double gastosAbril, double gastosMaio, double gastosJunho, double gastosJulho) 
	{
		System.out.println("Objeto criado criado com sucesso!");
		this.gastosJaneiro = gastosJaneiro;
		this.gastosFevereiro = gastosFevereiro;
		this.gastosMarco = gastosMarco;
		this.gastosAbril = gastosJaneiro;
		this.gastosMaio = gastosFevereiro;
		this.gastosJunho = gastosMarco;
		this.gastosJulho = gastosJulho;
	};
	public void somarGastosSeptestre() 
	{
		double totalPeriodo1;
		totalPeriodo1 = this.gastosJaneiro + this.gastosFevereiro + this.gastosMarco + this.gastosAbril + this.gastosMaio + this.gastosJunho + this.gastosJulho;
		System.out.println(totalPeriodo1);
	}

}
