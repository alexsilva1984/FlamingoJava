package exercicio;

import java.util.Scanner;

 public class Exercicio10 {

	 public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a diagonal maior");
		float diagonalmaior=sc.nextFloat();
		
		System.out.println("Digite a diagonal menor");
		float diagonalmenor=sc.nextFloat();
		
		float area=(diagonalmaior*diagonalmenor)/2;
		System.out.println("O área do quadrado corresponde a: " +area);
		sc.close();
	 }
 }
 