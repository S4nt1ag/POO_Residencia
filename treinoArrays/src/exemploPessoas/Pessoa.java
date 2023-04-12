package exemploPessoas;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private String cpf;
	private String usuario;
	private String senha;

	public Pessoa(String nome, String cpf, String usuario, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.usuario = usuario;
		this.senha = senha;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Pessoa [getNome()=" + getNome() + ", getCpf()=" + getCpf() + ", getUsuario()=" + getUsuario()
				+ ", getSenha()=" + getSenha() + "]";
	}

	@Override
	public int compareTo(Pessoa oPessoa) {
		// TODO Auto-generated method stub
		return 0;
	}

}
