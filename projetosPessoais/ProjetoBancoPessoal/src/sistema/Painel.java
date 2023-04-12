package sistema;

import java.util.Scanner;

public class Painel {
	int esc;
	Scanner sc = new Scanner(System.in);

	public void CriarPainel() {
		System.out.println("=".repeat(57));
		System.out.println("   _____             _   _       ____                   \r\n"
				+ "  / ____|           | | ( )     |  _ \\                  \r\n"
				+ " | (___   __ _ _ __ | |_|/ ___  | |_) | __ _ _ __   ___ \r\n"
				+ "  \\___ \\ / _` | '_ \\| __| / __| |  _ < / _` | '_ \\ / __|\r\n"
				+ "  ____) | (_| | | | | |_  \\__ \\ | |_) | (_| | | | | (__ \r\n"
				+ " |_____/ \\__,_|_| |_|\\__| |___/ |____/ \\__,_|_| |_|\\___|");
		System.out.println("=".repeat(57));
		System.out.println(
				"1 - Ver Saldo\r\n" + "2 - Transferir\r\n" + "3 - Sacar\r\n" + "4 - Depositar\r\n" + "5 - Finalizar");

		for (int i = 0; i < 32; i++) {
			System.out.println(" ");
		}
	}

	public void EscolhaPainel() {
		esc = sc.nextInt();

	}

}
