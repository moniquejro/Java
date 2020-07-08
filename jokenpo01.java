package jokenpo;

import java.util.Scanner;

public class jokenpo01 {

	public static void main(String[] args) 
	{
		int jogador;
		Scanner mao = new Scanner (System.in);
		
		System.out.println("~~~~~~~~~~~~~~~");
		System.out.println("~~~~JoKenPo~~~~");
		System.out.println("~~~~~~~~~~~~~~~");
		System.out.println("[ 1 ] Pedra ");
		System.out.println("[ 2 ] Pedra ");
		System.out.println("[ 3 ] Pedra ");
		System.out.println("Escolha uma opção: ");
		jogador = mao.nextInt();
		
		switch (jogador)
		{
		case 1:
			System.out.println("Jogador escolheu PEDRA!");
			break;
		case 2:
			System.out.println("Jogador escolheu PAPEL!");
			break;
		case 3:
			System.out.println("Jogador escolheu TESOURA!");
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}
		
		int computador = (int) (Math.random()*3+1);
		
		switch (computador)
		{
		case 1:
			System.out.println("Computador escolheu PEDRA!");
			break;
		case 2:
			System.out.println("Computador escolheu PAPEL!");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA!");
			break;
		}
		
		if (jogador != computador) 
		{
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)) 
			{
				System.out.println("Você VENCEU!");
			} 
			else 
			{
				System.out.println("Computador venceu!");
			}
		} 
		else 
		{
			System.out.println("EMPATE!");
		}
	}

}
