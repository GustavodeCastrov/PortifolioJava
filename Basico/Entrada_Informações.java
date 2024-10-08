import java.util.Scanner;
public class Entrada_Informações {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite ás informações, digite qualquer tecla para começar: ");
		String  info = scanner.nextLine();
		System.out.println("Digite o nome: ");
		String nome = scanner.nextLine();
		System.out.println("Digite a data de nascimento (DD/MM/AA) do aluno " + nome + ":");
		String dataNas = scanner.nextLine();
		System.out.println("Digite o curso do aluno "+ nome+ ":");
		String curso = scanner.nextLine();
		System.out.println("Digite a unidade curricular: ");
		String unicarr = scanner.nextLine();
		System.out.println("O aluno" + nome + "está matriculado? (Sim/Não)");
		String matri = scanner.nextLine();
		
		System.out.println("Informações: ");
		System.out.println("Nome: " + nome);
		System.out.println("Data de nascimento: " + dataNas);
		System.out.println("Curso: " + curso);
		System.out.println("Unidade Curricular: " + unicarr);
		
		if(matri.equals("Sim")) {
			System.out.println("O aluno está matriculado!");
		}
		else if(matri.equals("Não")) {
			System.out.println("O aluno não está matriculado!");
		}
		else {
			System.out.println("Erro!");
		}
	
		
		

				
		
		
		
		
		
		
		
		
		
	}

}
