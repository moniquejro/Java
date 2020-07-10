package PacoteJava;

import java.util.Scanner;

public class ex06day10 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		
		int [] vetor = new int [3];
		int [][] matriz = new int [3][3];
		int [][] matrizM = new int [3][3];
		int i, j;
		
		for (i=0; i<3; i++)
		{
			System.out.println("Diga os valores do vetor: ");
			vetor[i] = ler.nextInt();
		}
		
		for (i=0; i<3; i++)
		{
			for (j=0; j<3; j++)
			{
			System.out.println("Diga os valores da matriz: ");
			matriz[i][j] = ler.nextInt();
		
			}
		}
		
		for (i=0; i<3; i++)
		{
			for (j=0; j<3; j++)
			{
				matrizM[i][j] = matriz[i][j] * vetor[i];
			}
		}
		System.out.println("A nova matriz, depois da multiplicação com o vetor, será:");
		for (i=0; i<3; i++)
		{
			for (j=0; j<3; j++)
			{
				System.out.println(matrizM[i][j]);
			}
		}
	}

}
