//Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível ( 
//codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago
//pelo cliente sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.

package exercicio07flamingo;

import java.util.Scanner;

public class Exercicio09 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double valor,valorpago;

		
		System.out.println("Informe qual combustivel o cliente abasteceu!");
		String combustivel = sc.next(); 
		
		System.out.println("Informe a quantidade de Litros: ");
		double litros = sc.nextInt();
		
		 
		 switch (combustivel) {
		
			case  ("Alcool"):
				
				if (litros <=20)
				{
					valor = (litros *2.95);
					valorpago = valor - valor *3/100;
					System.out.println("O Valor a ser pago é R$ " + valorpago);
				}
				else
				{
					valor = (litros *2.95);
					valorpago = valor - valor *5/100;
					System.out.println("O Valor a ser pago é R$ " + valorpago);
				}
				break;
				
			   case ("Gasolina"):
				
				if (litros <=20)
				{
					valor = (litros *4.27);
					valorpago = valor - valor *4/100;
					System.out.println("O Valor a ser pago é R$ " + valorpago);
				}
				else
				{
					valor = (litros *4.27);
					valorpago = valor - valor *6/100;
					System.out.println("O Valor a ser pago é R$ " + valorpago);
				}
				break;
				
			
		}

	}
		
}




