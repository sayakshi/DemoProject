package Protected;

import Public.carPublic;

public class callPublic {
	
	public static void main(String[] args) {
		car Toyota = new car();
		Toyota.sModel="Camry";
		Toyota.iGear = 5;
		Toyota.iHighestSpeed = 230;
		Toyota.DisplayChar();
		}

}
