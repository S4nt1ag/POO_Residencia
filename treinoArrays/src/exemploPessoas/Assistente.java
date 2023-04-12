package exemploPessoas;

public class Assistente extends Pessoa {

	public Assistente(String nome, String cpf, String usuario, String senha) {
		super(nome, cpf, usuario, senha);

	}

	@Override
	public String toString() {
		return "=".repeat(10) + "\r\nAssistente\r\nNome: " + getNome() + "\r\nCpf: " + getCpf() + "\r\nUsuario: "
				+ getUsuario() + "\r\nSenha: " + getSenha();
	}

}
