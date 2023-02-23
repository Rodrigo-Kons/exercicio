package aplicacao;

import java.util.Scanner;
import entidades.Relogio;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Relogio relogio = new Relogio();

		int hora;
		int minuto;
		int angulo;

		System.out.println("Digite a hora e minuto para o calculo do angulo");
		System.out.println("Hora : ");
		hora = sc.nextInt();
		System.out.println("minuto : ");
		minuto = sc.nextInt();

		angulo = relogio.anguloRelogio(hora, minuto);

		System.out.printf("o angulo formado pelos ponteiros é : %d ", angulo);

		sc.close();
	}
}
