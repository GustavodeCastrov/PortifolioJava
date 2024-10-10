/* h) Calcular e mostrar a média aritmética dos números pares compreendidos entre 13 e 73. Utilize
 *o laço que lhe for mais conveniente.
 *  
 *Dev: Gustavo de Castro
 *10/10/2024
 */


import java.util.Scanner;
public class Letra_H_GustavoDeCastro {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int contp = 0, somap = 0;
		double mediap = 0.0;
		
		for(int i = 13; i <= 73; i++) {
			if(i % 2 == 0) {
				contp = contp + 1;
				somap = somap + i;
			}
		}
		mediap = somap / contp;
		
		System.out.println("A quantidade de números pares entre 13 e 73 é: "+contp);
		System.out.println("A soma de todos os números pares entre 13 e 73 é: "+somap);
		System.out.println("A média dos números pares entre 13 e 73 é: "+mediap);

		sca.close();
	}
}
