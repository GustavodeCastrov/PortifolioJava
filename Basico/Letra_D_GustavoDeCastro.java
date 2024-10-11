/*
 * d) Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor. 
 * 
 * Dev: Gustavo de Castro
 * 10/10/2024
 */



package pack;
import java.util.Scanner;
public class Letra_D_GustavoDeCastro {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);  
		System.out.print("Digite um número: "); int num = sca.nextInt(); 

		System.out.println("O número é: "+num); 
		System.out.println("O antecessor é: "+ (num - 1)); 
		System.out.println("O sucessor é: "+ (num + 1)); 
}
}