package PacoteJava;

import java.util.Scanner;

import java.math.*;

public class ex01day10 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		
		float valor, novoValor, porc, parc;
		int opcao;
		
		System.out.println("Informe o valor do produto: ");
		valor = ler.nextFloat();
		
		System.out.println("Qual vai ser a forma de pagamento? \n[1]A vista, no dinheiro; \t[2]A vista, no crédito; \n[3]2x; \t[4]3x.");
		opcao = ler.nextInt();
		
		switch (opcao)
		{
		case 1:
			porc = (valor*20)/100;
			novoValor = valor - porc;
			System.out.println("O produto vai ter um desconto de "+porc+" \ne o novo valor a ser pago é R$"+novoValor+".");
		break;
		
		case 2:
			porc = (valor*15)/100;
			novoValor = valor - porc ;
			System.out.println("O produto vai ter um desconto de "+porc+" \ne o novo valor a ser pago é R$"+novoValor+".");
		break;
		
		case 3:
			parc = valor/2;
			System.out.println("Não houve desconto ou juros insidito ao produto \ne valor a ser pago ainda é R$"+valor+"\ncom duas parcelas de R$"+parc+".");
		break;
		
		case 4:
			porc = (valor*15)/100;
			novoValor = valor + porc;
			parc = novoValor/3;
			System.out.println("O produto vai ter juros no de "+porc+"\ne o novo valor a ser pago é R$"+novoValor+" \ncom três parcelas de R$"+parc+".");
		break;
		}
		
		
	}

}
