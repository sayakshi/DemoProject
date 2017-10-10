package Public;

import Protected.car;

public class callProtected extends car {
	
	/*public callProtected()
	
	{
		sModel="Camry";
		iGear=5;
		DisplayChar();
	}
*/	public static void main(String[] args) {
		callProtected Toyota = new callProtected();
		Toyota.sModel="Camry";
		Toyota.iGear = 5;
		Toyota.iHighestSpeed = 230;
		Toyota.DisplayChar();
		}
}
