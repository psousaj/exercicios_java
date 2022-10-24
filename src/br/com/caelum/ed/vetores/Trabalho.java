package br.com.caelum.ed.vetores;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Trabalho {
	public static void main(String[] args) {
		Vetor lista = new Vetor();
		Vetor novaLista = new Vetor();
		List<Aluno> listaNova = new Vector<>();
		ArrayList<Aluno> listaN = new ArrayList<Aluno>();
		
		lista.tamanho();
		
		for (int i = 0; i < 1000; i++) {
			Aluno aluno = new Aluno();
			lista.adiciona(aluno);
		}
		
		lista.tamanho();
		System.out.println("\n");
		
//		///			///			///			///			///
		
		novaLista.tamanho();
		
		for (int i = 0; i < 1000; i++) {
			novaLista.adiciona(lista.pega(i));
		}
		
		novaLista.tamanho();
		
		
//		///			///			///			///			///
	
		System.out.printf("\nO tamanho do vector e: %s", listaNova.size());
		
		for (int i = 0; i < 1000; i++) {
			Aluno aluno = new Aluno();
			listaNova.add(aluno);
		}
		
		System.out.printf("\nO tamanho do vector e: %s\n", listaNova.size());
		
//		///			///			///			///			///
		
		System.out.printf("\nO tamanho do ArrayList e: %s", listaN.size());
		
		for (int i = 0; i < 1000; i++) {
			Aluno aluno = new Aluno();
			listaN.add(aluno);
		}
		
		System.out.printf("\nO tamanho do ArrayList e: %s", listaN.size());
		
		
	}
	
}
