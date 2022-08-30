package exercicio;

import java.util.Scanner;

public class Exercicio12 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da área do circulo");
		float area=sc.nextFloat();
		
		float circulo = (float) (3.14*(area*area));
		System.out.println("O área do circulo corresponde a: " +circulo);
		sc.close();
	 }
 }