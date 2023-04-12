package exemploPessoas;

public class Operador extends Pessoa {

	public Operador(String nome, String cpf, String usuario, String senha) {
		super(nome, cpf, usuario, senha);
	}

	@Override
	public String toString() {
		return "=".repeat(10) + "\r\nOperador\r\nNome: " + getNome() + "\r\nCpf: " + getCpf() + "\r\nUsuario: "
				+ getUsuario() + "\r\nSenha: " + getSenha();
	}

}
