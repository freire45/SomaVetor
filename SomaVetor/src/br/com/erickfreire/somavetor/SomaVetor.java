package br.com.erickfreire.somavetor;


/**
 * Programa em Java que soma valores de um vetor
 * @author Erick Freire
 * @version 1 - Criado em 21-05-2021 as 14:24
 */

public class SomaVetor {
	public static void main(String[] args) {
		
		final int TAMANHO_VETOR = 10;
		int[] vetor = new int[TAMANHO_VETOR];
		
		for(int contador = 0; contador < vetor.length; contador++)
			vetor[contador] = 2 + 2 * contador;
		
		System.out.printf("%s%8s%n", "Index", "Valor");
		
		for(int contador = 0; contador < vetor.length; contador++)
			System.out.printf("%5d%8d%n", contador, vetor[contador]);
		

	}

}
