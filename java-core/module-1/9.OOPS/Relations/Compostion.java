class Engine{
	public void start(){
		System.out.println("Engine starts");
	}
	public void stop(){
		System.out.println("Engine stop");
	}
}
class Car{
	private Engine eg ;
	public Car(){
		eg = new Engine();
	}
	public void drive(){
		eg.start();
		System.out.println("Car is running");
	}
	public void park(){
		eg.stop();
		System.out.println("Car is parked");
	}
}
class Compostion{
	public static void main(String[] args) {
		Car c = new Car();
		c.drive();
		c.park();
		
	}
}