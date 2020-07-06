package PacoteJava;

import java.util.Scanner;

public class Ex04 
{

	public static void main(String[] args) 
	{
		Scanner leitura = new Scanner (System.in);
		
		int a, b, c;
		float d, r, s;
		
		System.out.println("Vamos calcular o valor de D a partir de 3 nºs inteiros (A, B e C) na seguinte expressão: \nD=(R+S)/2, onde R = (A+B)² e S = (B+C)².");
		System.out.println("\nQual é o valor de A? ");
		a = leitura.nextInt();
		System.out.println("\nQual é o valor de B? ");
		b = leitura.nextInt();
		System.out.println("\nQual é o valor de C? ");
		c = leitura.nextInt();
		
		r = (float) Math.pow((a+b), 2);
		s = (float) Math.pow((b+c), 2);
		d = (r+s)/2;
		d = Math.round(d);
		
		System.out.println("\nO valor de D é igual a "+d);
		
		
	}

}
