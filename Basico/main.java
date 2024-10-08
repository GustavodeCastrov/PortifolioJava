
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome = "Gustavo";
		String dataNas = "03/06/2008";
		String curso = "Desenvolvimento de Sistemas";
		String unicurr = "Programação de Aplicativos";
		boolean matriculado = true;
		
		System.out.println("Informações: ");
		System.out.println("Nome: " + nome);
		System.out.println("Data de nascimento: " + dataNas);
		System.out.println("Curso: " + curso);
		System.out.println("Unidade Curricular: " + unicurr);
		System.out.println("Matriculado: " + (matriculado ? "Sim" : "Não"));

	}

}
