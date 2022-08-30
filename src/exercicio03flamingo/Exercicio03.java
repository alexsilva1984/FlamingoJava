package exercicio03flamingo;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String funcionario;

		System.out.println("Digite o nome do funcionário");
		funcionario = sc.next();

		System.out.println("Digite o salário");
		float salario = sc.nextFloat();

		System.out.println("Digite a porcentagem");
		float porcentagem = sc.nextFloat();

		float NovoSalario = (salario * porcentagem) / 100 + salario;
		System.out.println("O Novo salário é : " + NovoSalario);
		sc.close();

	}

}
