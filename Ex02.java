package PacoteJava;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) 
	{
		Scanner leitura = new Scanner (System.in);
		
		int ano, mes, dia, totalDia;
		
		System.out.println("Qual é a sua idade em dias? ");
		totalDia = leitura.nextInt();
		
		ano = totalDia/365;
		mes = (totalDia%365)/30;
		dia = (totalDia%365)%30;
		
		System.out.printf("Sua idade em anos é %d",ano);
		System.out.printf("\nMeses você tem %d",mes);
		System.out.printf("\nE dias é(são) %d",dia);
		
		
	}

}
