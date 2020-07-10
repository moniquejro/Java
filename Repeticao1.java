package PacoteJava;

import java.util.Scanner;

public class Repeticao1 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		
		//dos 10 nº quantos sao pares e quantos impar
		
		int num, x, somapar = 0, somaimpar = 0;
		
		for (x=1; x<=10; x++) //inicio, fim e decremento(que roda o looping)
		{
			System.out.println("Entre com um numero: ");
			num = ler.nextInt();
			if (num%2==0)
			{
				somapar++; //soma recebe ele + 1
			}
			else
			{
				somaimpar++;
			}
			
		}
		System.out.println("Temos: "+somapar+" numero(s) par(es)");
		System.out.println("Temos: "+somaimpar+" numero(s) impar(es)");
			
	}

}
