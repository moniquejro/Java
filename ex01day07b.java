package PacoteJava;

import java.util.Scanner;

public class ex01day07b {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		float n1, n2, n3, maior;
		
		System.out.println("Vamos ver qual dos 3 n�s � o maior.");
		System.out.println("Digite o 1� n�: ");
		n1 = entrada.nextFloat();
		System.out.println("Digite o 2� n�: ");
		n2 = entrada.nextFloat();
		System.out.println("Digite o 3� n�: ");
		n3 = entrada.nextFloat();
		
		maior = n1;
		
		if (n2 > n3 && n2 > n1)
		{
			maior = n2;
			System.out.println("O maior n� foi "+n2);
		}
		else if (n3 > n1 && n3 > n2)
		{
			maior = n3;
			System.out.println("O maior n� foi "+n3);
		}
		else
		{
			System.out.println("O maior n� foi"+n1);
		}
	}

}
