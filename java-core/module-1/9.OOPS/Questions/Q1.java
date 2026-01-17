class Q1 {
	int x;
	int y;
	public void initialize(){
		this.x =5;
		System.out.println(x);
		this.y = 6;
		System.out.println(y);
	}
	public void update(){
		int x =10;
		this.x = x++;
		this.y = this.y+2;
		this.display();

	}
	public void display(){
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		Q1 obj = new Q1();
		obj.initialize();
		obj.update();
		
	}
}