package PacoteJava;

import java.util.Scanner;

public class ex03 
{

	public static void main(String[] args) 
	{
		Scanner leitura = new Scanner (System.in);
		
		int seg, hora, min;
		
		System.out.println("Qual é a duração do evento em segundos?");
		
		seg = leitura.nextInt();
		min = seg/60;
		hora = min/60;
		
		System.out.printf("\nO evento dua "+min+" minutos.");
		System.out.printf("\nO evento dura "+hora+" hora(s).");

	}

}
