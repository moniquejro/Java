package PacoteJava;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) 
	{
		Scanner leitura = new Scanner (System.in);
		
		int ano, mes, dia, totalDia;
		
		System.out.println("Qual � a sua idade em dias? ");
		totalDia = leitura.nextInt();
		
		ano = totalDia/365;
		mes = (totalDia%365)/30;
		dia = (totalDia%365)%30;
		
		System.out.printf("Sua idade em anos � %d",ano);
		System.out.printf("\nMeses voc� tem %d",mes);
		System.out.printf("\nE dias �(s�o) %d",dia);
		
		
	}

}
