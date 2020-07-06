package PacoteJava;

import java.util.Scanner;

public class Ex01java {
	public static void main(String[] args) 
	{
		Scanner leitura = new Scanner (System.in);
		
		int idade, mes, dia, totalDia;
		String nome;
		
		System.out.println("Qual é seu nome?\n");
		nome = leitura.next();
		System.out.printf("Qual é a sua idade?\n");
		idade = leitura.nextInt();
		System.out.printf("Quantos messes? \n");
		mes = leitura.nextInt();
		System.out.printf("Quantos dias você têm?\n");
		dia = leitura.nextInt();
		totalDia = (idade*365) + (mes*30) + dia;
		
		System.out.printf(nome);
		System.out.printf(nome,", sua idade em dias é %d",totalDia);
		
	}

}
