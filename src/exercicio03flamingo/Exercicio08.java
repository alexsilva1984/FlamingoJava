package exercicio03flamingo;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tempo gasto");
		float tempogastoviagem = sc.nextFloat();
		
		System.out.println("Digite a velocidade media");
	    float velocidademedia = sc.nextFloat();
		
		float distancia = tempogastoviagem * velocidademedia;
		float litros_usados = (distancia / 12);

		System.out.println("A distância percorrida é: " + distancia);
		System.out.println("A quantidade de litros utilizados é: " + litros_usados);
		sc.close();
	}
}
