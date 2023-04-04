package mes;

public class Mes 
{ 
		
	private double gastosJaneiro;
	private double gastosFevereiro;
	private double gastosMarco;
	private double gastosAbril;
	private double gastosMaio;
	private double gastosJunho;
	private double gastosJulho;
	
	public Mes() {
		System.out.println("objeto criado com sucesso!");
	}
	
	public Mes(double gastosJaneiro, double gastosFevereiro, double gastosMarco) 
	{
		System.out.println("Objeto criado criado com sucesso!");
		this.gastosJaneiro = gastosJaneiro;
		this.gastosFevereiro = gastosFevereiro;
		this.gastosMarco = gastosMarco;
		
	};
	public Mes(double gastosJaneiro, double gastosFevereiro, double gastosMarco, double gastosAbril, double gastosMaio, double gastosJunho, double gastosJulho) 
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
	public double somarGastosTrimestre() 
	{
		double totalPeriodo;
		totalPeriodo = gastosJaneiro + gastosFevereiro + gastosMarco;
		return totalPeriodo;
	}
	public double somarGastosSeptestre() 
	{
		double totalPeriodo;
		totalPeriodo = gastosJaneiro + gastosFevereiro + gastosMarco + gastosAbril + gastosMaio + gastosJunho + gastosJulho;
		return totalPeriodo;
	}
	
}
