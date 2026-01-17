class Speed {
	public static void main(String[] args) {
		Vehicle v = new Bicycle();
		Vehicle c = new Car();
		v.speedUp();
		c.speedUp();
	}
}

class Vehicle {
	public void speedUp(){
		System.out.println("Vehicle speed up");
	}
}
class Car extends Vehicle{
	@Override
	public void speedUp(){
		System.out.println("Car speed up");
	}
}
class Bicycle extends Vehicle{
	@Override
	public void speedUp(){
		System.out.println("Bicycle speed up");
	}

}