package PacoteJava;

import java.util.Scanner;

public class ex05day10 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		
		float [] vet = new float [5];
		int codigo;
		
		for (int x=0; x<5; x++)
		{
			System.out.println("Entre com um valor: ");
			vet[x] = ler.nextFloat();
		}
		System.out.println("Entre com o c�digo: ");
		codigo = ler.nextInt();
		
		if(codigo == 0)
		{
			System.out.println("Cai fora, merm�o!");
		}
		else if(codigo == 1)
		{
			for (int x=0; x<5; x++)
			{
				System.out.println("Posi��o "+(x+1)+" : "+vet[x]);
			}
		}
		else if (codigo == 2)
		{
			for (int x=4; x>=0; x--)
			{
				System.out.println("Posi��o "+(x)+" : "+vet[x]);
			}
		}
		else
		{
			System.out.println("C�digo inv�lido.");
		}

	}

}
