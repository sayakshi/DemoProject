package JavaProgram;

class Vehicle {
    protected String licensePlate = null;

    public void setLicensePlate(String license) {
        licensePlate = license;
    }
}

class CarIn extends Vehicle{
	
	protected int numberOfSeats = 0;
	 
    public CarIn(int i_NumberOfSeats) {
       super();
        //perform other initialization here
        numberOfSeats = i_NumberOfSeats;
      //  System.out.println("numberOfSeats");
    }
 
    public void setLicensePlate(String license) {
    	// System.out.println("setLicensePlate");
        super.setLicensePlate(license);
    }
 
    public String toString() {
    //	System.out.println("Inside toSting");
        return "The car has " + numberOfSeats + " seats. Its license is " + licensePlate;
    }
 
    /*public int getNumberOfSeats() {
        return this.numberOfSeats;
    }*/
}

class SportsCar extends CarIn {
    double maxSpeed = 0;
 
    public SportsCar(int i_NumberOfSeats, double d_MaxSpeed) {
        super(i_NumberOfSeats);
        //perform other initialization here
        maxSpeed = d_MaxSpeed;
    }
 
    @Override
    public void setLicensePlate(String license) {
        licensePlate = license.toLowerCase();
    }
 
    @Override
    public String toString() {
    	//System.out.println("Inside toSting");
        return super.toString() + ". Its max speed is " + maxSpeed;
    }
 
}

public class VehiclesTest
{
    public static void main(String args[])
    {
    	CarIn personalCar = new CarIn(4);
    	
        personalCar.setLicensePlate("PERSONAL-BN123");
    //  personalCar.toString();
       System.out.println(personalCar);
     SportsCar sportsTeam = new SportsCar(2, 200);
     System.out.println(sportsTeam);
     sportsTeam.setLicensePlate("SPORTS-AB989");
     System.out.println(sportsTeam);
    }
}
