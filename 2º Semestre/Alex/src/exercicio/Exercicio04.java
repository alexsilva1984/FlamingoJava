//Escreva um algoritmo para ler dois valores do teclado e 
//exibir como resposta a subtração dos valores.

package exercicio;

import java.util.Scanner;

 public class Exercicio04 {

	 public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero=sc.nextInt();
		System.out.println("Digite outro numero");
		int numero1=sc.nextInt();
		int subtracao=numero-numero1;
		System.out.println("O valor da subtração é: " +subtracao);
		sc.close();
	 }
 }
 