package exercicio;

import java.util.Scanner;

public class Exercicio08 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		float numero=sc.nextFloat();
		System.out.println("Digite outro numero");
		float numero1=sc.nextFloat();
		float divisao=numero/numero1;
		System.out.println("O valor da divisão é: " +divisao);
		sc.close();
	 }
 }