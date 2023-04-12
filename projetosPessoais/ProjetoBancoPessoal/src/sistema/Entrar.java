package sistema;

import java.util.Scanner;

import utilitarios.Clear;

public class Entrar {
	public void CriarLogin() {
		CadastroUsuarioESenha cadastro = new CadastroUsuarioESenha();
		Clear cl = new Clear();
		Scanner sc = new Scanner(System.in);

		cadastro.cadastrarUsuario("user1", "senha123");
		cadastro.cadastrarUsuario("user2", "abc456");

		System.out.println("=".repeat(57));
		System.out.println("   _____             _   _       ____                   \r\n"
				+ "  / ____|           | | ( )     |  _ \\                  \r\n"
				+ " | (___   __ _ _ __ | |_|/ ___  | |_) | __ _ _ __   ___ \r\n"
				+ "  \\___ \\ / _` | '_ \\| __| / __| |  _ < / _` | '_ \\ / __|\r\n"
				+ "  ____) | (_| | | | | |_  \\__ \\ | |_) | (_| | | | | (__ \r\n"
				+ " |_____/ \\__,_|_| |_|\\__| |___/ |____/ \\__,_|_| |_|\\___|");
		System.out.println("=".repeat(57));
		System.out.print("Usuário: ");
		String usuario = sc.nextLine();
		System.out.print("Senha: ");
		String senha = sc.nextLine();
		while (cadastro.verificarUsuario(usuario, senha) == false) {
			System.out.println("=".repeat(57));
			System.out.println("Usuário ou senha incorretos.");
			System.out.print("Usuário: ");
			usuario = sc.nextLine();
			System.out.print("Senha: ");
			senha = sc.nextLine();
		}
		System.out.println("Bem vindo (a) " + usuario);

	}

}
