package application;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0;
		System.out.print("Escolha uma das seguintes opções: \n" + "1- Soma\n" + "2- Subtração\n" + "3- Multiplicação\n"
				+ "4- Divisão\n" + "5 - Sair\n" + "Opcão desejada: ");
		n = sc.nextInt();
		switch (n) {
		case 1 -> System.out.println("Você escolheu soma!");
		case 2 -> System.out.println("Você escolheu subtração!");
		case 3 -> System.out.println("Você escolheu multiplicação");
		case 4 -> System.out.println("Você escolheu divisão!");
		case 5 -> System.out.println("Obrigado por utilizar nosso programa!");
		default -> System.out.println("Valor inválido!");
		}

		sc.close();
	}

}
