package exercicioAula39EstruturaCondicional;

import java.util.Scanner;

public class exercicioAula39EstruturaCondicional {

	//Fazer um programa para ler um número inteiro, 
	//e depois dizer se este número é negativo ou não.
	//Exemplos:	Entrada: -10 Saída: negativo
		
	/*
	 * public static void main(String[] args) {
	 * 
	 * Scanner sc = new Scanner(System.in);
	 * 
	 * int x;
	 * 
	 * System.out.println("digite um numero inteiro !!");
	 * 
	 * x = sc.nextInt();
	 * 
	 * if (x < 0) { System.out.println("seu numero é negativo!!"); } else {
	 * System.out.println("seu numero é positivo!!");
	 * 
	 * } sc.close();
	 * 
	 * }
	 */

	
	//Exercicio 2 
	
	//Fazer um programa para ler um número inteiro e 
	//dizer se este número é par ou ímpar.
	
	/*
	 * public static void main (String[] args){
	 * 
	 * Scanner sc = new Scanner(System.in);
	 * 
	 * int x;
	 * 
	 * System.out.println("digite um numero inteiro!!");
	 * 
	 * x = sc.nextInt();
	 * 
	 * 
	 * if(x % 2 ==0) { System.out.println("par"); } else {
	 * System.out.println("impar"); }
	 * 
	 * sc.close(); }
	 */
	 
	 //Leia a hora inicial e a hora final de um jogo. 
	 //A seguir calcule a duração do jogo, sabendo que o mesmo pode
	 //começar em um dia e terminar em outro, tendo uma duração mínima 
	 //de 1 hora e máxima de 24 horas.
	 //Exemplos: Entrada: 16, 2   Saída: O JOGO DUROU 10 HORA(S)

		public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		
		
		System.out.println("digite o horario inicial do jogo!!!");
		
		x = sc.nextInt();
		
		System.out.println("digite o horario final do jogo!!!");
		
		y = sc.nextInt();
		
		
		int duracao;
		
		if(x < y){
			duracao =(y-x);
		}
		
		else {
			duracao = (24 - x + y);
		}
		
		System.out.println("o jogo durou "+ duracao +" horas");
		
		sc.close();
		}




		

}
