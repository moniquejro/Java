package PacoteJava;

import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ex02day10 {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		
		float imc, peso ;
		float altura,  altura2;
		
		System.out.println("Vamos calcular seu IMC! \nInforme seu peso:");
		peso = ler.nextFloat();
		System.out.println("Agora informe ssua altura: ");
		altura = ler.nextFloat();
		
		altura2 = (float) Math.pow(altura, altura);
		imc = peso/(altura2);
		BigDecimal bd = new BigDecimal(imc).setScale(3, RoundingMode.HALF_EVEN);
		System.out.println("Seu IMC é de: "+bd.doubleValue());
		
		
		if (imc<= 18.5)
		{
			System.out.println("\nVocê está abaixo do peso.");
		}
		else if (imc >18.5 && imc< 25)
		{
				System.out.println("\nVocê está com o peso normal.");
		}
		else if (imc >25 && imc<=30)
		{
			System.out.println("\nVocê está acima do peso.");
		}
		else if ( imc >30)
		{
			System.out.println("\nVocê está obeso.");
		}
		else
		{
			System.out.println("\nInforme os valores novamente.");
		}
	}
}
