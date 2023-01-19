package exercicio2Aula29EstruturaSequencial;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		
		// exercicio 2 
//		Scanner sc = new Scanner(System.in); 
//
//		double r,area;
//
//		double p =  3.14159;
//		
//		System.out.println("digite o valor do raio do circulo !!");
//		r = sc.nextDouble();
//		
//		area = ((Math.pow(r,2))* p);
//		//area = ((r * r) * p);
//		
//		System.out.println("valore do raio é :  ");
//		System.out.println(r);
//		System.out.printf("valor da area é : %.4f ",area);
//		
//		sc.close();		
		
//  Exercio 3 Fazer um programa para ler quatro valores inteiros A, B, C e D.
//  A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D
//  segundo a fórmula: DIFERENCA = (A * B - C * D).
//	Exemplos:
//				Entrada: 
//				5
//				6
//				7
//				8
//				Saída:
//					DIFERENCA = -26
//				
//				Entrada: 
//				5
//				6
//				-7
//				8
//				Saída:
//				DIFERENCA = 86
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int a,b,c,d;
//		int diferenca;
//		
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		d = sc.nextInt();
//		
//		diferenca = ((a*b)-(c*d));
//		
//		System.out.println("valor é : "diferenca);
//
//		sc.close();
		
// exercico 4
// Fazer um programa que leia o número de um funcionário, 
// seu número de horas trabalhadas, o valor que recebe por 
// hora e calcula o salário desse funcionário. 
// A seguir, mostre o número e o salário do funcionário, com duas casas decimais		
// Entrada: 25,	100,5.50
// Saida : NUMBER = 25	SALARY = U$ 550.00		
	
		Scanner sc = new Scanner(System.in);
		
		int funcionario;
		double horaTrabalhadas,valorHora,salarioFuncionario;
		
		funcionario = sc.nextInt();
		horaTrabalhadas = sc.nextDouble();
		valorHora = sc.nextDouble();
		
		salarioFuncionario = valorHora*horaTrabalhadas;
		
		System.out.printf("numeros de funcionarios é : %d e o salario é %.2f",funcionario,salarioFuncionario);
		
		sc.close();
	}	
}
