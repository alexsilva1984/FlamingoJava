package exercicio03flamingo;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
		// Fahrenheit.
		// A fórmula de conversão é F = (9*C + 160)/5, sendo F a temperatura em
		// Fahrenheit e C a temperatura em Celsius.
		System.out.println("Digite a temperatura em Graus Celsius");
		int temperatura = sc.nextInt();
		int Fahrenheit = (9 * temperatura + 160) / 5;
		System.out.println("A temperatura em Fahrenheit é: " + Fahrenheit);
		sc.close();

	}

}
