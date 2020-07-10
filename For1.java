package PacoteJava;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		int valor=50, somavalor=0, cont=0, valor1, somavalor1=0;
		float media, media1;
		
		while (valor <= 55) // enquanto x for menor que 55 o programa vai rodar
		{
			System.out.println("Entre com um valor: ");
			valor1 = ler.nextInt();
			somavalor1=somavalor1+valor1;
			somavalor=somavalor+valor;
			valor++;
			cont++;
		}
		//fora do laço while faz a conta que rodou lá dentro
		media = somavalor/cont;
		media1= somavalor1/cont;
		System.out.println("Media de valores DA CONTAGEM foi de: "+media);
		System.out.println("Média de valores INSERIDOS foi de: "+media1);
	}

}
