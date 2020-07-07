package PacoteJava;

import java.util.Scanner;

public class parEimpar 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		int n1;
		
		System.out.println("Vamos brincar de par ou ímpar!");
		System.out.println("\nDigite um número INTEIRO! -->");
		n1 = entrada.nextInt();
		
		if (n1 % 2 == 0)
		{
			if (n1 >= 0 )
			{
				System.out.println("\nSeu número é PAR e POSITIVO!");
			}
			else
			{
				System.out.println("\nEste número é PAR e NEGATIVO!");
			}
		}
		else 
		{
			if (n1 >= 0)
			{
				System.out.println("\nEste número é ÍMPAR e POSITIVO!");
			}
			else
			{
				System.out.println("\nEste número é ÍMPAR e NEGATIVO!");
			}	
		}
		
	}

}
