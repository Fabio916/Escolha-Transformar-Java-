package application;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o dia da semana em que foram feitas horas extras: \n" + "[1] domingo\n"
				+ "[2] segunda-feira\n" + "[3] terça-feira\n" + "[4] quarta-feira\n" + "[5] quinta-feira\n"
				+ "[6] sexta-feira\n" + "[7] sábado\n" + "Digito: ");
		int diaExtra = sc.nextInt();

		while (diaExtra > 7 || diaExtra < 1) {
			System.out.print("Valor incorreto, digite novamente: ");
			diaExtra = sc.nextInt();
		}

		System.out.print("Agora insira as horas extras trabalhadas neste dia: ");
		int horas = sc.nextShort();

		double valorTotal = 0;
		switch (diaExtra) {
		case 1 -> valorTotal = horas * (30.0 + (30.0 * 0.50));
		case 2 -> valorTotal = horas * 30.0;
		case 3 -> valorTotal = horas * 30.0;
		case 4 -> valorTotal = horas * 30.0;
		case 5 -> valorTotal = horas * 30.0;
		case 6 -> valorTotal = horas * 30.0;
		case 7 -> valorTotal = horas * (30.0 + (30.0 * 0.50));

		default -> System.out.println("Erro");
		}

		System.out.printf("\nValor total a ser pago pelas horas extras: R$ %.2f", valorTotal);

		sc.close();
	}

}
