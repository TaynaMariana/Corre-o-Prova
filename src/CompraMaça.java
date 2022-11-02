/*As maçãs custam R$1,30 cada se forem compradas menos de uma dúzia, e R$1,00 se forem compradas
 * pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o 
 * custo total da compra.
 */

import java.util.Scanner;

public class CompraMaça {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		double valor; // armazena o valor da compra
		int quant; //armazena a quantidade de maça
		
		System.out.print("Informe a quantidade de maçã desejada: ");
		quant = tec.nextInt();
		
		if(quant < 12) {
			valor = 1.3 * quant;
			System.out.print("O total de sua compra foi de R$" + valor);
		}
		else {
			valor = 1 * quant;
			System.out.print("O total de sua compra foi de R$" + valor);
		}
	}

}
