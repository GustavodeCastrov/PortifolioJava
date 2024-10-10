/* g) Faça um programa que leia um número inteiro N maior do que zero e calcule o fatorial desse
 *número. Fatorial de N é representado por N! e calculado da seguinte maneira: ��! = �� ∗ (�� − 1) ∗ (�� − 2) ∗. . .∗
 *3 ∗ 2 ∗ 1 Utilize o laço que lhe for mais conveniente.
 * 
 * Dev: Gustavo de Castro
 * 10/10/2024
 */

import java.util.Scanner;
public class Letra_G_GustavoDeCastro {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um número maior que zero: ");
		num = sca.nextInt();
		if(num <= 0) {
			System.out.println("Número inválido!");
			return;
		}
		else {
			int fatorial = 1;
			
			for(int i = 1; i <= num; i++) {
				fatorial*=i;
			}
			
			System.out.println("O fatorial de "+num+" é: "+fatorial);
		}
		
		sca.close();
	}
}