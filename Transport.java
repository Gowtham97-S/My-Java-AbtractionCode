package abstraction;

public class Transport extends AbstractClass {
	public void car() {  //Abstraction Method Declared
		System.out.println("Four Wheller");
	}
	public void auto() {
		System.out.println("Three Wheller");
	}
	public static void main(String[]args) {
		System.out.println("Transportation list:");
		Transport list = new Transport();
		list.bike();
		list.auto();
		list.car();
		
	}
}
