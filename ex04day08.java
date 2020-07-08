package PacoteJava;

import java.util.Scanner;

public class ex04day08 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		int idade, sexo, fp, contpc=0, contmn=0, contha=0, contpn40=0,contpc18=0, x=1;
		
		while(x<=6)
		{
			System.out.println("Entre com a sua idade: ");
			idade = ler.nextInt();
			System.out.println("Entre com seu sexo-- 1- F | 2- M ");
			sexo = ler.nextInt();
			System.out.println("Entre com seu fator psicológico-- 1- Calmo(a) | 2- Nervoso(a) | 3- Agressivo | 4 ");
			fp = ler.nextInt();
			
			if (fp==1)
			{
				contpc++;
			}
			if (sexo == 1 && fp == 2)
			{
				contmn++;
			}
			if(sexo == 2 && fp == 3)
			{
				contha++;
			}
			if(fp == 2 && idade>40)
			{
				contpn40++;
			}
			if(fp == 1 && idade < 18)
			{
				contpc18++;
			}
			x++;
		}
		System.out.println("\nPessoas calmas: "+contpc);
		System.out.println("\nPessoas nervosas: "+contmn);
		System.out.println("\nHomens agressivos: "+contha);
		System.out.println("\nPessoas nervosas com mais de 40 anos: "+contpn40);
		System.out.println("\nPessoas calmas com menos de 18 anos: "+contpc18);
	}

}
