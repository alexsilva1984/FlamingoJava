package exercicio;

import java.util.Scanner;

 public class Exercicio06 {

	 public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base");
		int base=sc.nextInt();
		System.out.println("Digite a altura");
		int altura=sc.nextInt();
		int retangulo=base*altura;
		System.out.println("O valor do retangulo é: " +retangulo);
		sc.close();
	 }
 }
 