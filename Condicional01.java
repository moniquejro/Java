package PacoteJava;

import java.util.Scanner;

public class Condicional01 
{

	public static void main(String[] args) 
	{
		int num;

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um valor para sabermos se \nele � positivo, negativo ou 0.");
		num = entrada.nextInt();
		
		if(num > 0) 
		{
				System.out.println("Esse n� � positivo.");
		}
		else if (num < 0)
			{
				System.out.println("Esse n� � negativo.");
			}
		else if (num == 0)
			{
				System.out.println("Esse n� � zero.");

			}
		else
		{
			System.out.println("Esse n� � irracional.");

		}
		
		
		/*if (num < 0 && num > 0)
		{
			System.out.println("Ok, consegui!");

		}
		else
		{
			System.out.println("Esse n� � zero.");

		}*/
	}
	
}