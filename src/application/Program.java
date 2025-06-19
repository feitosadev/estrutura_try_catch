package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		metodo1();
		
	}
	
	public static void metodo1() {
		System.out.println("Metodo 1 foi chamado.");
		metodo2();
		System.out.println("Metodo 1 foi encerrado.");
	}
	
	public static void metodo2() {
		System.out.println("Metodo 2 foi chamado");
		Scanner entrada = new Scanner(System.in);
		try {
			String[] vetor = entrada.nextLine().split(" ");
			int posicao = entrada.nextInt();
			System.out.println(vetor[posicao]);
		} catch (InputMismatchException e) {
			System.out.println("Você não digitou um número.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Número fora do tamanho do vetor.");
		}
		
		System.out.println("Metodo 2 foi encerrado.");
	}
}