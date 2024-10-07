package application;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		int nota1 = sc.nextInt();
		
		System.out.print("Digite a segunda nota: ");
		int nota2 = sc.nextInt();
		
		System.out.print("Tipo de nota: A ou P (Aritmética ou Ponderada)\n"
				+ "Escolha: ");
		char tipoNota = sc.next().toUpperCase().charAt(0);
		
		while (tipoNota != 'A' && tipoNota != 'P') {
			System.out.print("Valor incorreto!\n"
					+ "Digite novamente um valor válido: ");
			tipoNota = sc.next().toUpperCase().charAt(0);
		}
		
		double totalNota = 0;
		switch (tipoNota) {
		case 'A' -> totalNota = (nota1 + nota2) / 2; 
		case 'P' -> totalNota = (nota1 * 3 +(nota2 * 7)) / (3 + 7); 
		
		default ->
		System.out.println("err");
		}
		
		System.out.printf("Nota final: %.0f", totalNota);
		
		
			
		sc.close();
	}

}
