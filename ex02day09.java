package PacoteJava;

import java.util.Scanner;

public class ex02day09 {

	public static void main(String[] args) 
	{

		Scanner ler = new Scanner(System.in);
        int [] vetor = new int[6];
        int somaPar = 0, somaImpar = 0;


        for(int i = 0; i < 6; i++) 
        {
            System.out.println("Infome o valor do vetor [" + (i+1) + "] : ");
            vetor[i] = ler.nextInt();

            if (vetor[i] % 2 == 0) {
                somaPar = somaPar + vetor[i];
            } else 
            {
                somaImpar = somaImpar + vetor[i];

            }
        }

        System.out.println("Soma dos valores pares: " + somaPar);
        System.out.println("Soma dos valores impares: " + somaImpar);


        System.out.printf("Valores par: ");
        for (int i= 0 ; i < 6 ; i++) 
        {

            if (vetor[i] % 2 == 0) 
            {
                System.out.print("\t" + vetor[i]);
            }
        }
        System.out.printf("\nValores impares: ");
        for (int i= 0 ; i < 6 ; i++) 
        {

            if (vetor[i] % 2 != 0) 
            {
                System.out.print("\t" + vetor[i]);
            }
        }
	}

}
