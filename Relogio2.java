package entidade;

public class Relogio2 {

	int angulo;
	
	public int retornaAnguloRelogio(int hora, int minuto) {
		
		if(minuto <= 15 ) {
			 angulo = minuto * 3; 
		}
		else{
			 angulo = minuto * 6;
		}
		return angulo;
		
		/* if(minuto <= 15 ) {
			angulo = minuto * 3; 
		}
		else if(minuto <= 30 ){
			angulo = minuto * 6;
		}
		else if(minuto <=45 ){
			angulo = minuto * 3;
		}
		else (minuto < 59 ){
			angulo = minuto * 6;
		}
		return angulo;
		 * 
		 */
	} 
		
}

