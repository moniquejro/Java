package PacoteJava;

import java.util.Scanner;

public class ex04day07
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		int n1;
		float raiz, potencia;
		
		System.out.println("Vamos brincar de par ou �mpar!");
		System.out.println("\nDigite um n�mero INTEIRO! -->");
		n1 = entrada.nextInt();
		
		if (n1 % 2 == 0)
		{
			raiz = (float) Math.sqrt(n1);
			System.out.println("\nSeu n�mero � PAR e sua raiz � "+raiz+".");
		}
		else 
		{
			potencia = (float) Math.pow(n1, 2);
			System.out.println("\nEste n�mero � �MPAR e, "+n1+" elevado a 2, � igual a "+potencia+".");
		}
		
	}

}
