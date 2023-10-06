package Object;

public class DogApp {

	public static void main(String[] args) {
		Dog d = new Dog();
			d.eat();
			d.sleep();
			d.bark();

			System.out.println("=======================================");
		
		Dog d1=new Dog("Rockey");
			d1.eat();
			d1.sleep();
			d1.bark();
			
			System.out.println("===================================");
			
		Dog d2 = new Dog("Goldy","GR");
			d2.eat();
			d2.sleep();
			d2.bark();
			
			System.out.println("===================================");
		
		Dog d3 = new Dog("Bheema","LR",5);
			d3.eat();
			d3.sleep();
			d3.bark();
			
			System.out.println("===================================");
		
		Dog d4 = new Dog("Whity","GR",10,"White");
			d4.eat();
			d4.sleep();
			d4.bark();
			
			System.out.println("===================================");
		
		Dog d5 = new Dog("Broono ",3,"Golden");
			d5.eat();
			d5.sleep();
			d5.bark();
			
			System.out.println("===================================");
		
		Dog d6 = new Dog("Rooby",8,"StreetDog","cream");
			d6.eat();
			d6.sleep();
			d6.bark();
			
			System.out.println("===================================");
			
		Dog d7 = new Dog(2);
			d7.eat();
			d7.sleep();
			d7.bark();
	}

}
