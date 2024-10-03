/*
 * Exercício 4: Ler um número inteiro N e calcular todos os seus divisores.
 * Dev: Gustavo de Castro Vaz
 * Data: 23/09/24
 */
import java.util.Scanner;
public class Exercício4 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = sca.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		
		sca.close();
	}
}
