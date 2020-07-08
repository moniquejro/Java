package PacoteJava;

import java.util.Scanner;

public class ex30807 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		
		int idadeUser, idade21 = 0, idade50 = 0;

        System.out.println("Informe a idade: ");
        idadeUser = ler.nextInt();

        while(idadeUser != -99) 
        {

                if (idadeUser < 21) 
                {
                    idade21++;
                }
                if(idadeUser > 50) 
                {
                    idade50++;
                }
                System.out.println("Informe a idade: ");
                idadeUser = ler.nextInt();
        }
        System.out.println(idade21+" usuário(s) tem menos de 21 anos.");
        System.out.println(idade50+" usuário(s) tem mais de 50 anos.");		
	}

}