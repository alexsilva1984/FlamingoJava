package Exercicio08flamingo;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		float largura, comprimento, area, soma = 0;
		char continuar;
		do {
			System.out.println("Digite o nome do comodo");
			
			nome = sc.nextLine();
			System.out.println("Digite o comprimento do comodo");
			comprimento = sc.nextFloat();
			System.out.println("Digite a largura do comodo");
			largura = sc.nextFloat();
			area = largura*comprimento;
			System.out.println("A área do comodo "+nome+ "é: "+area);
			System.out.println();
			
			System.out.println("Deseja continuar calculando?) (s:sim/n:não):");
			continuar = sc.next().charAt(0);
			System.out.println();
			soma = soma+area;
			sc.nextLine();
			
			
		} while (continuar!='n');
		System.out.println("A soma das areas dos comodos lidos são: "+soma);
		sc.close();

	}

}
