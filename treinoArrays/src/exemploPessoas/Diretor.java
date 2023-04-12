package exemploPessoas;

public class Diretor extends Assistente {

	public Diretor(String nome, String cpf, String usuario, String senha) {
		super(nome, cpf, usuario, senha);

	}

	@Override
	public String toString() {
		return "=".repeat(10) + "\r\nDiretor\r\nNome: " + getNome() + "\r\nCpf: " + getCpf() + "\r\nUsuario: "
				+ getUsuario() + "\r\nSenha: " + getSenha();
	}

}
