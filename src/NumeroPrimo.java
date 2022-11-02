/* Um n�mero primo � aquele que � dividido apenas por um e por ele mesmo. Entre 0 e 100
 * existem apenas 25 n�mero primos. Sendo assim, fa�a um programa que o usu�rio digite um n�mero,
 * logo ap�s chame uma fun��o calcularnumeroprimo() e imprima se ele � falso ou verdadeiro.
 * 
 * x: "3 � um n�mero primo? - TRUE
 * 6 � um n�mero primo: - FALSE.
 */


import javax.swing.JOptionPane;
 
public class NumeroPrimo {
     
    public static void main(String[] args) {    
        int num[] = new int[1];    
         
        for (int i = 0; i < num.length; i++) { 
        	
        	num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero entre 0 e 100 para verificar se � primo:"));    
        }
         
        for (int i = 0; i < num.length; i++) {
            if( calcularnumeroprimo(num[i]) ) {
            	System.out.println(num[i] + " � primo." );
            }
            else {
            	System.out.println(num[i] + " n�o � primo." );
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