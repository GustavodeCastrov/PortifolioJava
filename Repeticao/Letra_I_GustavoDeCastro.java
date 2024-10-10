/* i) Crie um programa que armazene 10 números inteiros e então determine e exiba o maior e o menor
número digitado.
 * 
 * Dev: Gustavo de Castro
 * 10/10/2024
 */

import java.util.Scanner;
public class Letra_I_GustavoDeCastro {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int[] num = new int[10];
		int maior = 0, menor =  999999999; 
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o "+(i+1)+"º número: ");
			num[i] = sca.nextInt();
			
			if(num[i] <= menor) {
				menor = num[i];
			}
			if(num[i] >= maior) {
				maior = num[i];
			}
		}
		
		System.out.println("O maior número é:"+maior);
		System.out.println("O menor número é "+menor);
		

	}

}
