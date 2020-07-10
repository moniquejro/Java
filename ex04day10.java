package PacoteJava;

public class ex04day10 
{

	public static void main(String[] args) 
	{
		double soma=0;
		int x = 1, y = 1, a;
		
		//while (a<=99)
		
		for (a=1; a<=50; a++)
		{
			soma = soma+(x/y);
			x+=2;
			y++;
		}
		
		System.out.println("A soma dos valores é igual a "+soma);

	}

}
