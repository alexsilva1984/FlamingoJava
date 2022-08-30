package exercicio03flamingo;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor do raio da  lata de óleo: ");
		float raio = sc.nextFloat();
		System.out.println("  Informe a altura da lata de óleo: ");
		float altura = sc.nextFloat();
		float volume = (float) 3.14159 * (raio * raio) * altura;
		System.out.println(volume + "  é o valor do volume da lata de óleo.");
		sc.close();
	}

}
