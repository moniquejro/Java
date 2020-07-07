package PacoteJava;

import java.util.Scanner;

public class ex03day07 {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		
		int idade;
		
		System.out.println("As categorias são: \nINFANTIL (10 A 14 ANOS) \nJUVENIL(15 A 17 ANOS) \nADULTO(18 A 25 ANOS)");
		System.out.println("\nDigite a idade do participante: ");
		idade = entrada.nextInt();
		
		if (idade >= 10 && idade <= 14)
		{
			System.out.println("Com "+idade+" anos a categoria do participante é INFANTIL.");
		}
		else if ( idade > 14 && idade <= 17)
		{
			System.out.println("Com "+idade+" anos a categoria do participante é JUVENIL.");

		}
		else if (idade > 17 && idade <= 25)
		{
			System.out.println("Com "+idade+" anos a categoria do participante é ADULTO.");

		}
		else if (idade < 10)
		{
			System.out.println("Com "+idade+" anos você é muito novo para participar.");

		}
		else if (idade > 25 && idade < 999999999)
		{
			System.out.println("Com "+idade+" anos você não pode participar.");

		}
	}

}
