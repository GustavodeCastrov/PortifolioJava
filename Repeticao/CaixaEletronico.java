import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int saldo = 1000;
		int valor = 0;
		int opcao = 0;

		while (opcao != 4) {
			System.out.print("\n=== Caixa Eletrônico === \n");
			System.out.print("1. Depositar \n");
			System.out.print("2. Sacar \n");
			System.out.print("3. Consultar saldo \n");
			System.out.print("4. Sair \n");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite o valor a ser depositado: ");
				valor = scanner.nextInt();

				saldo = saldo + valor;

				System.out.print("Depósito realizado com sucesso :) \n");
				break;

			case 2:
				System.out.print("Digite o valor a ser sacado: ");
				valor = scanner.nextInt();

				if (valor <= saldo) {
					saldo = saldo - valor;
					System.out.print("Saque realizado com sucesso :) \n");
				} else {
					System.out.print("Saldo insuficiente para realizar o saque. \n");
				}
				break;

			case 3:
				System.out.print("Seu saldo atual é: " + saldo + "\n");
				break;

			case 4:
				System.out.print("Saindo, obeigado por usar o Caixa Eletrônico :) \n");
				break;

			default:
				System.out.print("Opção inválida. tente novamente :( \n");
			}

		}

	}

}
