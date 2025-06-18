package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String[] vetor = entrada.nextLine().split(" ");
		int posicao = entrada.nextInt();
		System.out.println(vetor[posicao]);
	}
}