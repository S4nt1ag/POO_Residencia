package funcionarios;

public class Professor extends Empregado {
	private int horasDeAula;

	public Professor(String nome, Double salario, int horasDeAula) {
		super(nome, salario);
		this.horasDeAula = horasDeAula;
	}

	public int getHorasDeAula() {
		return horasDeAula;
	}

	public void setHorasDeAula(int horasDeAula) {
		this.horasDeAula = horasDeAula;
	}

	public int getBonus() {
		return this.getHorasDeAula() * 10;
	}

	public double getGastos() {
		return super.getGastos() + this.getBonus();
	}

	@Override
	public String toString() {
		return "Professor [getNome()=" + getNome() + ", getSalario()=" + getSalario() + ", getHorasDeAula()="
				+ getHorasDeAula() + "]";
	}

}
