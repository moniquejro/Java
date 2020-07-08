package PacoteJava;

public class ex01day08 {

	public static void main(String[] args) 
	{
			int num=1000, numD=0;
			
			for (num=1000; num<=1999; num++)
			{
				if (num % 11 == 5)
				{
					numD++;
					System.out.println(num+" é divisível por 11 de resto 5.");
				}
			}System.out.println("\n"+numD+" números no total são divisíveis por 11 de resto 5.");
			
	}

}
