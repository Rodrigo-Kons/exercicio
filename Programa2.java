package aplicacao;

import java.util.Scanner;

import entidade.Relogio2;

public class Programa2 {

	public static void main(String[] args) {
		
	
		Relogio2 relogio;
		relogio = new Relogio2();
		
		int hora;
		int minuto;
		int angulo;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor para a hora ?:");
		hora = sc.nextInt();
		System.out.println("digite o valor para minuto :");
		minuto = sc.nextInt();
		
		angulo = relogio.retornaAnguloRelogio(hora, minuto);
		
		System.out.println("o angulo é " +angulo);
		
		sc.close();
	}
}