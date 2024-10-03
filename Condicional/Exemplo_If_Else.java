import java.util.Scanner;

public class Exemplo_If_Else {

	public static void main(String[] args) {

		String nome;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite 'sim' para matriculado e 'não' para não matriculado: ");
		nome = scanner.nextLine();
		// Método 'equals' é usado para comparar o conteúdo de dois objetos para
		// verificar se eles são iguais.
		// No exemplo input.equals ("Sim") verifica se o valor da String input é igual a
		// String.
		// O comando 'equalsIgnorecase' ignora a caixa de texto utilizada,
		// possibilitando o digitar em maiúsculo e minúsculo sem interferir no resultado

		if (nome.equalsIgnoreCase("sim")) {
			System.out.println("Você está matriculado. ");
		} else if (nome.equalsIgnoreCase("não")) {
			System.out.println("Você não está matriculado. ");
		} else {
			System.out.println("Erro, entrada inválida. ");
		}

	}

}
