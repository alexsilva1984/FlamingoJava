package exercicio03flamingo;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite os anos");
		int anos=sc.nextInt();
		
		System.out.println("Digite os meses");
		int meses=sc.nextInt();
		
		System.out.println("Digite os dias");
		int dias=sc.nextInt();
		
		int IdadeTotalDias = (anos*365)+(meses*30)+ dias;
		System.out.println("O total da idade de dias é: " +IdadeTotalDias);
		sc.close();
	 }
 }
