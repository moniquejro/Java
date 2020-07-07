package PacoteJava;

import java.util.Scanner;

public class ex04day07
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		int n1;
		float raiz, potencia;
		
		System.out.println("Vamos brincar de par ou ímpar!");
		System.out.println("\nDigite um número INTEIRO! -->");
		n1 = entrada.nextInt();
		
		if (n1 % 2 == 0)
		{
			raiz = (float) Math.sqrt(n1);
			System.out.println("\nSeu número é PAR e sua raiz é "+raiz+".");
		}
		else 
		{
			potencia = (float) Math.pow(n1, 2);
			System.out.println("\nEste número é ÍMPAR e, "+n1+" elevado a 2, é igual a "+potencia+".");
		}
		
	}

}
