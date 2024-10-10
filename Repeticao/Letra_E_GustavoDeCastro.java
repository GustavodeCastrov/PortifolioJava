/* e) Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura
de senha incorreta informada, escrever a mensagem &quot;Senha Invalida&quot;. Quando a senha for informada
corretamente deve ser impressa a mensagem &quot;Acesso Permitido&quot; e o algoritmo encerrado. Considere que a
senha correta é o valor 2002. Utilize o laço que lhe for mais conveniente.
 * 
 * Dev: Gustavo de Castro
 * 10/10/2024
 */

import java.util.Scanner;
public class Letra_E_GustavoDeCastro {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int senha = 0, cont = 3;
		
		while(senha != 2002) {
			
			System.out.println("Digite a senha: ");
			senha = sca.nextInt();
			
			if(senha != 2002) {
				cont = cont - 1;
				
				System.out.println("Acesso negado, você tem mais "+cont+ " tentativas");
				
				if(cont == 0) {
					System.out.println("Você não tem mais tentativas!");
					return;
				}
			}
			else {
				System.out.println("Acesso garantido!");
			}
		}
		
		sca.close();
	}
}
