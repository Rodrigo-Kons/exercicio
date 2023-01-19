package exercicioAula29EstruturaSequencial;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 

		int x;
		int y;
		int soma;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		soma = (x + y);
		
		System.out.println("valores digitados : ");
		System.out.println(x);
		System.out.println(y);
		System.out.println("somatória dos valores é : ");
		System.out.println(soma);
	}

}
