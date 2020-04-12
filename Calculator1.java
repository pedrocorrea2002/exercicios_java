package Calculadora;

import java.util.Scanner;

public class Calculator1{
	public static void main(String[] args){
		
		int A=0,B=0;
		String nome;
		
		Scanner number = new Scanner(System.in);
		Scanner word = new Scanner(System.in);
		
		System.out.println("Primeiramente, qual seu nome?");
		nome = word.next().trim();
		
		System.out.println(nome+", Insira o primeiro número:");
		{while (A == 0){
		try {
		 A = Integer.parseInt(number.nextLine());
		} catch (NumberFormatException e){
			System.out.println("Resposta Inválida!:");
			System.out.println("Insira novamente o primeiro número:");
		}}
		System.out.println("Insira o segundo número:");
		
		{while(B == 0){	
		try{
		 B = Integer.parseInt(number.nextLine());
		} catch (NumberFormatException e){
			System.out.println("Resposta Inválida!:");
			System.out.println("Insira novamente o segundo número:");
		}}
		
		int R1=(A + B);
		int R2=(A - B);
		int R3=(A * B);
		int R4= A / B;
		int R5=(A % B);
				
		System.out.println("Soma= "+R1);
		System.out.println("Subtração= "+R2);
		System.out.println("Multiplicação= "+R3);
		System.out.println("Divisão= "+R4);
		System.out.println("Resto= "+R5);
		
		
		}}}}
	












