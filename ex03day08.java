package PacoteJava;

import java.util.Scanner;

public class ex03day08 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		int idadeUser=0, idade21=0, idade50=0;
		
		do
		{
			if(idadeUser<=21)
			{
				idadeUser=idadeUser;
				idade21++;
			}
			else if (idadeUser>=50)
			{
				idade50++;
			}
			System.out.println("Entre com a sua idade: ");
			idadeUser = ler.nextInt();
			System.out.println("\nA idade que digitei foi "+idadeUser);
		}
		while(idadeUser!=-99);
		
		System.out.println("\n"+idade21+" usuários têm até 21 anos.");
		System.out.println("\n"+idade50+" usuários têm mais de 50 anos.");
	}

}
