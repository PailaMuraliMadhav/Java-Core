import java.util.*;
class Shape{
	public void calculateArea(){
		System.out.println("Shape area");

	}
}
class Circle extends Shape{
	double r = 5;
	@Override
	public void calculateArea(){
		System.out.println( Math.PI*r*r);

	}

}
class Retangle extends Shape{
	double l=4;
	double b= 6;
	@Override
	public void calculateArea(){
		System.out.println( l*b);
	}
}
class triangle extends Shape{
	double l=5;
	double b= 7;
	@Override
	public void calculateArea(){
		System.out.println( 0.5*l*b);
			}
}


class Area{
	public static void main(String[] args) {
		Shape s= new Circle();
		s.calculateArea();
		Shape r = new Retangle();
		r.calculateArea();
		Shape t = new triangle();
		t.calculateArea();
		
	}
}