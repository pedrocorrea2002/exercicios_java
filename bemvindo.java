package Bem_Vindo;

import java.util.Scanner;

public class bemvindo{
	public static void main(String[] args){
		
		String nome,cidade;
		int idade=0;
		
		Scanner word = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		Scanner city = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome?");
		nome = word.next().trim();
		
		System.out.println("Seja bem vindo "+nome+", qual a sua idade?");
		
		{while(idade == 0){	
			try{
			 idade = Integer.parseInt(number.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Não entendi, repita por favor");
			}}
		
		System.out.println("E você mora onde?");
		cidade = city.next().trim();
		
		System.out.println("Prazer em conhece-lo, "+nome+" de "+idade+" anos que mora em "+cidade+" [^-^]");
		
		
		
	}}
	
}