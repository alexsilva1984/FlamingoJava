package exercicio03flamingo;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		int VarA;
	     int VarB;
	     int Aux;

	     System.out.println("Digite a Primeira Variavel");

	     Scanner sc = new Scanner(System.in);
	     VarA= sc.nextInt();

	     System.out.println("Digite a Segunda Variavel");
	     VarB= sc.nextInt();
	     
	     Aux=VarA;
	     VarA=VarB;
	     VarB=VarA;

	     System.out.println("O valor de A é: " +VarB);
	     System.out.println("O valor de B é: " +Aux);
	     sc.close();



	    }

	}
	