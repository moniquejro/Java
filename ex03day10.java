package PacoteJava;

import java.util.Scanner;

public class ex03day10 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		
		int n1 = 0, ciclo1 = 0, ciclo2 = 0, ciclo3 = 0, ciclo4 = 0;
		
		System.out.println("Para interromper o programa digite -1.");
		System.out.println("Digite um número: ");
		n1 = ler.nextInt();
		
		while (n1 != -1)
		{
			if (n1 >=0 && n1<=25)
			{
				ciclo1++;
			} 
			else if (n1 >25 && n1 <=50 )
			{
				ciclo2++;
			}
			else if (n1 >50 && n1 <=75)
			{
				ciclo3++;
			}
			else if (n1 >75 && n1 <= 100)
			{
				ciclo4++;
			}
			System.out.println("Digite um número: ");
			n1 = ler.nextInt();
		}
		System.out.println("Entre o intervalor de 0 à 25 foram lidos "+ciclo1+" nºs.");
		System.out.println("Entre o intervalor de 26 à 50 foram lidos "+ciclo2+" nºs.");
		System.out.println("Entre o intervalor de 51 à 75 foram lidos "+ciclo3+" nºs.");
		System.out.println("Entre o intervalor de 76 à 100 foram lidos "+ciclo4+" nºs.");
	}

}
