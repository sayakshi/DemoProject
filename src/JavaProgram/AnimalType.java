package JavaProgram;

interface Animal {

	public void talk();
	
}

class Reptile implements Animal {

	
	public void talk() {
		System.out.println("Reptiletalks");
		
	}

}

class Mamal implements Animal{
	
	public void talk()
	{
		System.out.println("Mamal talk");
		
	}
		
		
	}


public class AnimalType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] a =new Animal[5];
	//	Animal a =new Animal(5);
		a[0] = new Mamal();
		a[0].talk();

	}

}
