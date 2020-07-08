package PacoteJava;

import java.util.Scanner;

public class ex05day08 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		int num, somanum=0;
		
		do
		{
			System.out.println("Entre com um valor: ");
			num = ler.nextInt();
			somanum = somanum + num;
		}
		while(num != 0);
		System.out.println("A soma dos nºs é igual a "+somanum);
	}

}
