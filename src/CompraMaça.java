/*As ma��s custam R$1,30 cada se forem compradas menos de uma d�zia, e R$1,00 se forem compradas
 * pelo menos 12. Escreva um programa que leia o n�mero de ma��s compradas, calcule e escreva o 
 * custo total da compra.
 */

import java.util.Scanner;

public class CompraMa�a {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		double valor; // armazena o valor da compra
		int quant; //armazena a quantidade de ma�a
		
		System.out.print("Informe a quantidade de ma�� desejada: ");
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
