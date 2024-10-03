/* Crie um programa chamado 'Teste de Ansiedade' onde o usuário responderá
 * 10 perguntas específicas para o resultado final. O usuário pode responder
 * apenas 'sim' ou 'não' para cada pergunta.
 * 
 * Se o usuário responder 'sim' em sete perguntas ou mais, a impressão será:
 * "Você possui fortes indícios de ansiedade. Faça terapia"
 * 
 * Se o usuário responder 'sim' em menos de cinco perguntas a impressão será: 
 * "Você está aparentemente bem e sem riscos de ansiedade."
 * 
 * Se o usuário responder 'sim' em cinco ou seis perguntas a impressão será:
 * "Você precisa cuidar do corpo e da mente. Procure orientação médica."
 * 
 * As perguntas específicas são: 
 * 
 * 1. Você se sente com dificuldades de concentração?
 * 2. Você se sente cansado facilmente?
 * 3. Tem dificuldades em adormecer ou permanecer a dormir?
 * 4. Você se preocupa muito com o futuro?
 * 5 . Tem dificuldades em relaxar?
 * 6. Sentiu-se tão preocupado que foi difícil ficar parado?
 * 7. Sentiu-se facilmente irritável ou chateado?
 * 8. Sentiu medo como se algo muito ruim fosse acontecer?
 * 9. Você se preocupa com a opinião dos outros?
 * 10. Você está com dificuldade em lembrar de detalhes?
 */

import java.util.Scanner;
public class Teste_Ansiedade {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		int sim = 0, nao = 0;
		String[] perguntas = { "1. Você se sente com dificuldades de concentração?",
				"2. Você se sente cansado facilmente?", "3. Tem dificuldades em adormecer ou permanecer a dormir?",
				"4. Você se preocupa muito com o futuro?", "5. Tem dificuldades em relaxar?",
				"6. Sentiu-se tão preocupado que foi difícil ficar parado?",
				"7. Sentiu-se facilmente irritável ou chateado?",
				"8. Sentiu medo como se algo muito ruim fosse acontecer?",
				"9. Você se preocupa com a opinião dos outros?",
				"10. Você está com dificuldade em lembrar de detalhes?" };

		for (String pergunta : perguntas) {
			System.out.println(pergunta + " Responda com 'sim' ou 'não'");
			String resp = sca.nextLine();

			while (!resp.equalsIgnoreCase("sim") && !resp.equalsIgnoreCase("não")) {
				System.out.println("Resposta inválida!");
				System.out.println(pergunta + " Responda com 'sim' ou 'não'");
				resp = sca.nextLine();
			}

			if (resp.equalsIgnoreCase("sim")) {
				sim++;
			}
			
			else if (resp.equalsIgnoreCase("não")) {
				nao++;
			}
			
		}

		if (sim >= 7) {
			System.out.println("Você possui fortes indicios de ansiedade. Faça terapia.");
		} 
		else if (sim < 5) {
			System.out.println("Você está aparentemente bem e sem riscos de ansiedade.");
		} 
		else if (sim == 5 || sim == 6) {
			System.out.println("Você precisa cuidar do corpo e da mente. Procure orientação médica.");
		}
		sca.close();

	}
}
