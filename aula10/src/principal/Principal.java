package principal;

import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import io.Leitor;

public class Principal {

	public static void main(String[] args) throws ParseException, IOException {

//		//Date com SimpleDateFormat
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		Date date = new Date();
//		
//		System.out.println("Date antes de formatar: " + date);
//		System.out.println("Date depois de formatar: " + simpleDateFormat.format(date));
//		
//		String stx = "07/11/1978 10:23:45";
//		Date dataUsuario = simpleDateFormat.parse(stx);
//		System.out.println("Date digitado e formatado: " + dataUsuario);
		
//		//GregorianCalendar
//		GregorianCalendar gc = new GregorianCalendar();
//		System.out.println(gc);
//		//Mostra qual o dia da semana 1 = domingo, 2=segunda, etc
//		System.out.println(gc.get(gc.DAY_OF_MONTH));
//		//Adiciona 2 meses à data atual
//		gc.add(gc.DAY_OF_MONTH, 2);
//		System.out.println(gc.get(gc.DAY_OF_MONTH));
//		//Imprime falso. 2009 não é bissexto.
//		System.out.println(gc.isLeapYear(2020));
//		//Atribui a data do GregorianCalendar à uma variável Date
//		Date d1 = gc.getTime();
//		System.out.println(d1);
//		//Armazena a data de d1 para o GregorianCalendar gc.
//		gc.setTime(d1);
		
//		//LocalDate/LocalDateTime e DateTimeFormatter
//		LocalDate hoje = LocalDate.now();
//		System.out.println("LocalDate antes de formatar: " + hoje);
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		String hojeFormatado = hoje.format(formatter);
//		System.out.println("LocalDate depois de formatar: " + hojeFormatado);
//		
		for (int i=0; i<8000; i++) {
		LocalDateTime agora = LocalDateTime.now();
		//System.out.println("LocalDateTime antes de formatar: " + agora);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
		String agoraFormatado = agora.format(formatter2);
		System.out.println("LocalDateTime depois de formatar: " + agoraFormatado+"_nomeArquivo"+i+".txt");
		}	
//		//Enums
//		String testaEnum = "GERENTE";
//		String nome = PessoasEnum.PRESIDENTE.name();
//		int numero = PessoasEnum.PRESIDENTE.ordinal();
//		
//		System.out.println("Testando enum: "+numero);
//		System.out.println("Testando enum: "+nome);
		
//		try {
//			Escritor.escrever(".\\arquivos\\teste.txt");
//		}
//		catch(IOException IOe) {
//			System.out.println("Houve um erro ao escrever o arquivo: "+IOe.getCause());
//		}
		
		try {
			Leitor.ler(".\\arquivos\\teste.txt");
		}
		catch(IOException IOe) {
			System.out.println("Houve um erro ao escrever o arquivo: "+IOe.getCause());
		}

	}
	
}
