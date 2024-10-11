package pack;
/* a) - Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba 
*em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: 
*F = C * 1.8 + 32; 
*K = C +  *273.15; 
*Re = C * 0.8; 
*Ra = C * 1.8 + 32 + 459.67 
 *  
*	Dev: Gustavo de Castro 
*	10/10/2024 
 */  
import java.util.Scanner; 
public class Letra_A_GustavoDeCastro {  	public static void main(String[] args) {  	 	Scanner sca = new Scanner(System.in); 
 	 	 
 	 	double tempK, tempRe, tempRa, tempF; 
 	 	 
 	 	System.out.println("Digite a temperatura( Celcius): ");  	 	double tempC = sca.nextDouble(); 
 	 	 
 	 	tempK = tempC + 273.15;  	 	tempF = tempC * 1.8 + 32;  	 	tempRe = tempC * 0.8; 
 	 	tempRa = tempC * 1.8 + 32 + 459.67; 
 	 	 
 	 	System.out.printf("Temperatura em Fahrenheint: %.2f",tempF); 
 	 	System.out.printf("\nTemperatura em Kelvin: %.2f",tempK);  	 	
 	 	System.out.printf("\nTemperatura em Reaumur: %.2f",tempRe); 
 	 	System.out.printf("\nTemperatura em Rankine: %.2f", tempRa); 
 	 	 
 	 	sca.close(); 
 	} 
} 
