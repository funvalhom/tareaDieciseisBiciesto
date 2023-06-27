package diaDieciseisEjercicioBiciesto;

public class Operacion {
	
	private int año;
	
	public void setAño(int año) {
		this.año = año;
	}
	
	public void conversionAño() {
		
		if (año % 4 == 0 && año % 100 !=0 || año % 400 == 0) {
			System.out.print("El año ingresado es biciesto");
		} else {
			System.out.print("El año no es biciesto");
		}
		
		
	}

}
