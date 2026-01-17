//Marker
interface T1{

}
//Normal
interface T2{
	void demo();

}
//Functional
@FunctionalInterface
interface T3{
	void add(int a,int b);
}


class Types{
	public static void main(String[] args) {
		        T2 obj = new T2() {
            public void demo() {
                System.out.println("Normal Interface Method");
            }
        };
        obj.demo();
	}
}