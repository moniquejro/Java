package PacoteJava;

import java.util.Scanner;

public class parEimpar 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		int n1;
		
		System.out.println("Vamos brincar de par ou �mpar!");
		System.out.println("\nDigite um n�mero INTEIRO! -->");
		n1 = entrada.nextInt();
		
		if (n1 % 2 == 0)
		{
			if (n1 >= 0 )
			{
				System.out.println("\nSeu n�mero � PAR e POSITIVO!");
			}
			else
			{
				System.out.println("\nEste n�mero � PAR e NEGATIVO!");
			}
		}
		else 
		{
			if (n1 >= 0)
			{
				System.out.println("\nEste n�mero � �MPAR e POSITIVO!");
			}
			else
			{
				System.out.println("\nEste n�mero � �MPAR e NEGATIVO!");
			}	
		}
		
	}

}
