package PacoteJava;

import java.util.Scanner;

public class Ex04 
{

	public static void main(String[] args) 
	{
		Scanner leitura = new Scanner (System.in);
		
		int a, b, c;
		float d, r, s;
		
		System.out.println("Vamos calcular o valor de D a partir de 3 n�s inteiros (A, B e C) na seguinte express�o: \nD=(R+S)/2, onde R = (A+B)� e S = (B+C)�.");
		System.out.println("\nQual � o valor de A? ");
		a = leitura.nextInt();
		System.out.println("\nQual � o valor de B? ");
		b = leitura.nextInt();
		System.out.println("\nQual � o valor de C? ");
		c = leitura.nextInt();
		
		r = (float) Math.pow((a+b), 2);
		s = (float) Math.pow((b+c), 2);
		d = (r+s)/2;
		d = Math.round(d);
		
		System.out.println("\nO valor de D � igual a "+d);
		
		
	}

}
