package br.com.caelum.ed.vetores;

import java.util.ArrayList;

public class Trabalho {
	public static void main(String[] args) {
		Vetor lista = new Vetor();
		Vetor novaLista = new Vetor();
		ArrayList<Vetor> listaNova = new ArrayList<Vetor>();
		
		lista.tamanho();
		
		for (int i = 0; i < 1000; i++) {
			Aluno aluno = new Aluno();
			lista.adiciona(aluno);
		}
		
		lista.tamanho();
		
//		///			///			///			///			///
		
		novaLista.tamanho();
		
		for (int i = 0; i < 1000; i++) {
			novaLista.adiciona(lista.pega(i));
		}
		
		novaLista.tamanho();
		
//		///			///			///			///			///
	
		
	}
}
