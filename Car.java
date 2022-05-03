package week1.day2;

public class Car {
	public void applybreak() {
		System.out.println("applyBreak");
	}
	public void applyGear() {
		System.out.println("applyGear");
	}
	public void switchonAc() {
		System.out.println("switchonAc");
	}
	public void applyAccelerate() {
		System.out.println("applyAccelerate");
	}
	
	public static void main(String[] args) {
		Car vehicle =new Car();
		vehicle.applybreak();
		
	}
}
