// WAJP to achieve multiple inheritance
interface Father{
	void demo();


}
interface Mother{
	 void test();

} 
class Son implements Father, Mother{
	public void demo(){
		System.out.println("father class Demo");
	}
	public void test(){
		System.out.println("Mother Class TEst");
	}

}
class Multi {
	public static void main(String[] args) {
		
	
	Son s = new Son();
	// Mother m = new Son();
	s.demo();
	s.test();
}

	
}