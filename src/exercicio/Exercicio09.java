package exercicio;

import java.util.Scanner;

public class Exercicio09 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base");
		float base=sc.nextFloat();
		
		System.out.println("Digite a altura");
		float altura=sc.nextFloat();
		
		float quadrado=(base*altura)/2;
		System.out.println("O área do quadrado corresponde a: " +quadrado);
		sc.close();
	 }
 }
 