package PacoteJava;

import java.util.Scanner;

public class ex02day08 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		
		int num, somaPar=0, somaImpar=0, x;
		
		for (x=1; x<=10; x++)
		{
			System.out.println("Digite um n�mero: ");
			num = ler.nextInt();
			if (num % 2 == 0)
			{
				somaPar++;
			}
			else
			{
				somaImpar++;
			}
		}
		System.out.println(somaPar+" n�s s�o pares.");
		System.out.println(somaImpar+" n�s s�o �mpares.");
	}

}
