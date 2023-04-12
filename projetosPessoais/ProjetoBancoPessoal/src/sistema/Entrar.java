package sistema;

import java.util.Scanner;

import utilitarios.Clear;

public class Entrar {
	public void CriarLogin() {
		Clear cl = new Clear();
		Scanner sc = new Scanner(System.in);
		int senha;
		String usuario;

		System.out.println("=".repeat(57));
		System.out.println("   _____             _   _       ____                   \r\n"
				+ "  / ____|           | | ( )     |  _ \\                  \r\n"
				+ " | (___   __ _ _ __ | |_|/ ___  | |_) | __ _ _ __   ___ \r\n"
				+ "  \\___ \\ / _` | '_ \\| __| / __| |  _ < / _` | '_ \\ / __|\r\n"
				+ "  ____) | (_| | | | | |_  \\__ \\ | |_) | (_| | | | | (__ \r\n"
				+ " |_____/ \\__,_|_| |_|\\__| |___/ |____/ \\__,_|_| |_|\\___|");
		System.out.println("=".repeat(57));
		System.out.print("Usuario: ");
		usuario = sc.next();
		System.out.print("Senha: ");
		senha = sc.nextInt();

		while (usuario != "sant" && senha != 1234) {

			System.out.println("=".repeat(57));
			System.out.println("Senha e/ou Usuario incorreto(s)");
			System.out.print("Usuario: ");
			usuario = sc.next();
			System.out.print("Senha: ");
			senha = sc.nextInt();
		}
		System.out.println("Logado");

	}
}
