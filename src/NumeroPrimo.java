/* Um número primo é aquele que é dividido apenas por um e por ele mesmo. Entre 0 e 100
 * existem apenas 25 número primos. Sendo assim, faça um programa que o usuário digite um número,
 * logo após chame uma função calcularnumeroprimo() e imprima se ele é falso ou verdadeiro.
 * 
 * x: "3 é um número primo? - TRUE
 * 6 é um número primo: - FALSE.
 */


import javax.swing.JOptionPane;
 
public class NumeroPrimo {
     
    public static void main(String[] args) {    
        int num[] = new int[1];    
         
        for (int i = 0; i < num.length; i++) { 
        	
        	num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número entre 0 e 100 para verificar se é primo:"));    
        }
         
        for (int i = 0; i < num.length; i++) {
            if( calcularnumeroprimo(num[i]) ) {
            	System.out.println(num[i] + " é primo." );
            }
            else {
            	System.out.println(num[i] + " não é primo." );
            }
                
        }    
    }
     
    private static boolean calcularnumeroprimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
}