/* b) Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade
 * de funcionários e os salários, e devolvendo a média salarial.
 * 
 * Dev: Gustavo de Castro
 * 10/10/2024
 */

import java.util.Scanner;
public class Letra_B_GustavoDeCastro {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		double salariof = 0.0;
		
		System.out.println("Digite a quantidade de funcionários: ");
		int quantfuncio = sca.nextInt();
		
		for(int i = 1; i <= quantfuncio; i++) {
			System.out.println("Digite o valor do "+i+ "º salário: ");
			double salario = sca.nextDouble();
			
			salariof = salariof + salario;
		}
		
		double media = salariof / quantfuncio;
		
		System.out.println("A média dos salários é: "+media);
		
		sca.close();
	}
}
