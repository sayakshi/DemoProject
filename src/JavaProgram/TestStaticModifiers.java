package JavaProgram;

public class TestStaticModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car Tayota= new Car();
		 Tayota.iHighestSpeed=230;
		 Tayota.sModel="camary";
		 Car.iDoors=2;
		 Car.DisplayStaticCharacterstics();
		 Tayota.DisplayCharacterstics();
		 
		 
		 
		
	}

}
