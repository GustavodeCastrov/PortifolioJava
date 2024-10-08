
/* 9) Faça um programa em java na IDE eclipse que leia o nome do usuário, dois números e no final
retorne a soma, a multiplicação, a divisão, a subtração e o resto da divisão para esse usuário.
*/
import java.util.Scanner;

public class Valores {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String nome;
		double divisao, resto, numero1, numero2, soma, multiplicacao, subtracao;

		System.out.print("Digite seu nome: ");
		nome = scanner.nextLine();

		System.out.print("Digite o primeiro número: ");
		numero1 = scanner.nextDouble();

		System.out.print("Digite o segundo número: ");
		numero2 = scanner.nextDouble();

		scanner.close();
		
		soma = (numero1 + numero2);
		multiplicacao = (numero1 * numero2);
		divisao = (numero1 / numero2);
		subtracao = (numero1 - numero2);
		resto = (numero1 % numero2);

		System.out.println("\nA soma dos números: " + soma);
		System.out.println("A multiplicação dos números: " + multiplicacao);
		System.out.println("A divisão dos números: " + divisao);
		System.out.println("A subtração dos números: " + subtracao);
		System.out.println("O resto da divisão: " + resto);
	}

}
