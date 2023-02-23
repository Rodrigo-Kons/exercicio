package entidades;

public class Relogio {
	
	public int anguloRelogio(int hora, int minuto) {
		
		int angulo = Math.abs(angulo = ((11 * minuto - 60 * hora) / 2));
		if(angulo > 180) {
			angulo = Math.abs(360 - angulo);
		}
		return angulo;
	}
}
