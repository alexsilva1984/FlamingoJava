package exercicio03flamingo;


import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor de custo de fábrica:");
		float ValorCustoDeFabrica=sc.nextFloat();
		float PorcentagemDeValorDoDistribuidor=28;
		float PorcentagemDeValorDeImposto=45;
		float ValorDoDistribuidor = ValorCustoDeFabrica*PorcentagemDeValorDoDistribuidor/100;
		float ValorDeImposto = ValorCustoDeFabrica*PorcentagemDeValorDeImposto/100;
		float ValorCustoDoConsumidor = ValorCustoDeFabrica+ValorDoDistribuidor+ValorDeImposto;
		System.out.println("O Custo do Consumidor é:"+ "R$"+ValorCustoDoConsumidor);
sc.close();		

	}

}
