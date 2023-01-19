package exercicio1fixacaoAula23saidaDeDados;

import java.util.Locale;

public class exercicio1FixacaoAula23saidaDeDados {

	public static void main(String[] args) {
		
		String produto1="computador";
		String produto2="mesa de trabalho";
		
		int age = 30;
		int code = 5050;
		char genero ='f';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.println("PRODUTOS : " + produto1 + " com preço de $ "+preco1+ ", mesa de trabalho, com preço de $ "+ preco2);
		System.out.printf("PRODUTOS :  %s com preço de $ %.2f, %s com preço de $ %.2f%n",produto1,preco1,produto2, preco2);//%s = texto, %f numeros com visgula, %d inteiro
		System.out.println("Recorde : " + age +" anos, códego : "+code+" e genero :("+genero+")");
		System.out.println("Medida decimal é: "+medida);
		System.out.printf("Medida aredondada para duas casa é: %.2f centimetros %n",medida);
		
		Locale.setDefault(Locale.US);
		System.out.printf("Medida com unidades em US %.3f ",medida);
	}

}
