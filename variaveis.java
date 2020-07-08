package PacoteJava;

public class variaveis {

	public static void main(String[] args) 
	{
		String nome;
		int idade = 30;
		char sexo = 'M'; //aspas simples
		double temperatura = 26.7; //numeros nao inteiros e inteiros
		boolean arCondicionado = false; // apenas vdd e false
		nome = "Monique Oliveira";
		System.out.println("Uso de variaveis na linguagem Java. \nExemplos: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Temperatura: " + temperatura );
		System.out.println("Ar condicionado: " + arCondicionado);
		System.out.println("________________________________________");
		System.out.println("");
		
		double i = 10;
		System.out.println("Operadores lógicos aritmeticos e atribuições. \nExemplos: ");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 | i = " + (i + 5 ));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5 ));
		System.out.println("i = " + i + " x 5 | i = " + (i * 5 ));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5 ));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5 ));
		System.out.println("i += 5       | i = " + (i += 5) );
		System.out.println("i -= 5       | i = " + (i -= 5) );
		System.out.println("i *= 5       | i = " + (i *= 5) );
		System.out.println("i /= 5       | i = " + (i /= 5) );
		
		i++;
		System.out.println("i++          | i = " + i);
		i--;
		System.out.println("i--++        | i = " + i);
		
		
		
		
	}

}
