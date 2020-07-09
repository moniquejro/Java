package PacoteJava;

import java.util.Scanner;

public class ex04day09 {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		float [][] matriz1 = new float [2][2], matriz2 = new float [2][2];
		float [][] matrizSoma = new float [2][2], matrizSubtracao = new float [2][2];
		int l, c=0, opcao;
		final int constante;
		
		// matriz 1
		for (l=0; l<matriz1.length; l++)
		{
 			for (c=0; c<matriz1.length; c++) 
 				{
 					System.out.println("Entre com os dados da primeira matriz: "); 
 					matriz1[l][c] = entrada.nextFloat(); 				
 				}
		}
		
	//matriz 2
		for (l=0; l<matriz2.length; l++)
		{
 			for (c=0; c<matriz2.length; c++) 
 				{
 					System.out.println("Entre com os dados da segunda matriz: "); 
 					matriz2[l][c] = entrada.nextFloat(); 				
 				}
		}
		
		System.out.println("Selecione uma opção: \n(1) para soma \n(2) subtração \n(3) adição de const \n(4) imprima o resultado");
		opcao = entrada.nextInt();
		
		switch(opcao) 
		{
		case 1: 
			for (l=0; l<matrizSoma.length; l++)
			{
	 			for (c=0; c<matrizSoma.length; c++) 
	 				{
	 					matrizSoma[l][c] = matriz1[l][c] + matriz2[l][c];
	 					System.out.println("A soma das matrizes resulta em: " +matrizSoma[l][c]);
	 				}	
			}
			break;
		case 2:
			for (l=0; l<matrizSoma.length; l++)
			{
	 			for (c=0; c<matrizSoma.length; c++) 
	 				{
		 				matrizSubtracao[l][c] = matriz1[l][c] - matriz2[l][c];
		 				System.out.println("A diferença das matrizes resulta em: " +matrizSubtracao[l][c]);
	 				}	
			}
			break;
		case 3: 
		{
			System.out.println("Entre com o valor da constante: "); //usuário entra com o valor 
			constante = entrada.nextInt();
			
			for (l=0; l<matriz1.length; l++)
			{
	 			for (c=0; c<matriz1.length; c++) 
	 				{
	 					matriz1[l][c] = matriz1[l][c] + constante;
	 					System.out.println("A soma das matrizes resulta em: " +matriz1[l][c]);
	 				}	
			}
		
			for (l=0; l<matriz2.length; l++)
			{
	 			for (c=0; c<matriz2.length; c++) 
	 				{
	 					matriz2[l][c] = matriz2[l][c] + constante;
	 					System.out.println("A soma das matrizes resulta em: " +matriz2[l][c]);
	 				}	
			}
		}
			break;
		case 4:
			for (l=0; l<matriz1.length; l++)
			{
	 			for (c=0; c<matriz1.length; c++) 
	 				{
	 					System.out.println("A impressão das matrizes é: " + matriz1[l][c]);
	 				
	 				}
			}
			
			for (l=0; l<matriz2.length; l++)
			{
	 			for (c=0; c<matriz2.length; c++) 
	 				{
	 					System.out.println("A impressão das matrizes é: " + matriz2[l][c]);
	 				
	 				}
			}
				break;	
				default:
					System.out.println("Opção inválida.");
		}
	}
}