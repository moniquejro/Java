package PacoteJava;

import java.util.Scanner;

public class ClasseGeneration {

	public static void main(String[] args) //é uma estrutura, por isso usa {} e n ;
		{
		Scanner leitura = new Scanner(System.in);	
		float n1, n2;
		double media, raiz, pot;
		
		System.out.printf("Entre com a nota 1: ");
		n1 = leitura.nextFloat();
		System.out.printf("Entre com a nota 2: ");
		n2 = leitura.nextFloat();
		media = (n1+n2)/2;
		System.out.printf("A media foi de %2.2f",media, "\n");
		raiz = Math.sqrt(media);
		pot = Math.pow(media, 2);
		System.out.printf("\nRaiz quadrada: \n");
		System.out.println(raiz);
		System.out.printf("\n");		
		System.out.println("Potencia: "+pot);
		}

}
