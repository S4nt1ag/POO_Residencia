package principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import contas.Conta;
import contas.ContaCorrente;
import contas.ContaPoupanca;

public class Principal {

	public static void main(String[] args) {
		
//		List<Funcionario> listaFuncionarios = new ArrayList<>();
//
//		Funcionario f1 = new Funcionario();
//		f1.setNome("Vitor");
//		f1.setSalario(1000);
//		listaFuncionarios.add(f1);
//		
//		Funcionario f2 = new Funcionario();
//		f2.setNome("Vitor");
//		f2.setSalario(2000);
//		listaFuncionarios.add(f2);
//		
//		Funcionario f3 = new Funcionario();
//		f3.setNome("Rômulo");
//		f3.setSalario(800);
//		listaFuncionarios.add(f3);
//		
//		Funcionario f4 = new Funcionario();
//		f4.setNome("Allan");
//		f4.setSalario(900);
//		listaFuncionarios.add(f4);
//		
//		for(int i=0; i< listaFuncionarios.size(); i++) {
//			System.out.println(i + " - " + listaFuncionarios.get(i).toString());
//		}
//		
//		System.out.println();
//		Collections.sort(listaFuncionarios);
//		
//		for(int i=0; i< listaFuncionarios.size(); i++) {
//			System.out.println(i + " - " + listaFuncionarios.get(i).toString());
//		}
		
		// cria as contas
		ContaCorrente c1 = new ContaCorrente();
		c1.depositar(10000);
		ContaCorrente c2 = new ContaCorrente();
		c2.depositar(3000);
		List<ContaCorrente> listCC = new ArrayList<>();
		listCC.add(c1);
		listCC.add(c2);
		
		ContaPoupanca p1 = new ContaPoupanca();
		p1.depositar(10000);
		ContaPoupanca p2 = new ContaPoupanca();
		p2.depositar(3000);
		List<ContaPoupanca> listPP = new ArrayList<>();
		listPP.add(p1);
		listPP.add(p2);
		
		// cria o mapa
		Map<Integer, List<Conta>> mapaDeContas = new HashMap<>();
		
		// adiciona duas chaves e seus respectivos valores
		mapaDeContas.put(1, listCC);
		mapaDeContas.put(2, listPP);
		
		// qual a conta do diretor? (sem casting!)
		ContaCorrente contaDoDiretor = mapaDeContas.get(1);
		System.out.println(contaDoDiretor.getSaldo());

	}

}
