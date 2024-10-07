package application;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor total da compra: ");
		double valorCompra = sc.nextDouble();
		
		System.out.print("Quantidade de parcelas: ");
		short parcelas = sc.nextShort();
		
		while (parcelas % 2 != 0 || parcelas > 8 || parcelas < 2) {
			System.out.println("Número de parcelas inválido!\n"
					+ "Informe novamente um valor par até 8 parcelas: ");
			parcelas = sc.nextShort();
		}
		
		switch (parcelas) {
		case 2 -> valorCompra += valorCompra * 0.03;
		case 4 -> valorCompra += valorCompra * 0.07;
		case 6 -> valorCompra += valorCompra * 0.09;
		case 8 -> valorCompra += valorCompra * 0.12;
		
		default ->
			valorCompra += 0; 
		}
		
		System.out.printf("Valor total a pagar: R$ %.2f", valorCompra);
		
		sc.close();
	}

}
