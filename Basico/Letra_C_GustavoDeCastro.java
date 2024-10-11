
/* c) Informar um saldo e imprimir o saldo com reajuste de 1%  *  
*	Dev: Gustavo de Castro 
*	10/10/2024 
 */  
package pack;
import java.util.Scanner; 
public class Letra_C_GustavoDeCastro {  	
	public static void main(String[] args) {  	 	
		Scanner sca = new Scanner(System.in); 
 	 	 
 	 	double sala, salaf = 0; 
 	 	 
 	 	System.out.println("Digite o valor do salário: "); 
 	 	sala = sca.nextDouble(); 
 	 	 
 	 	salaf = sala * 0.01 + sala; 
 	 	 
 	 	System.out.println("O valor do novo salário é: "+salaf); 
 
 	 	sca.close(); 
 	} 
} 
