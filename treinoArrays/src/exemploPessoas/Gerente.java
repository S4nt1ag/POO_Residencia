package exemploPessoas;

public class Gerente extends Diretor {

	public Gerente(String nome, String cpf, String usuario, String senha) {
		super(nome, cpf, usuario, senha);

	}

	@Override
	public String toString() {
		return "=".repeat(10) + "\r\nGerente\r\nNome: " + getNome() + "\r\nCpf: " + getCpf() + "\r\nUsuario: "
				+ getUsuario() + "\r\nSenha: " + getSenha();
	}

}
