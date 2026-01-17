class Q4 {
	int id;
	String name;
	int[] arr;
	public Q4(int id,String name,int[] arr){
		this.id = id;
		this.name = name;
		this.arr= arr;
	}
	public Q4(Q4 obj){
		this.id = obj.id;
		this.name = obj.name;
		this.arr= obj.arr;
	}
	void display(){
		System.out.println(id+" "+name+" "+Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] org = {79,80,98};
		Q4 obj1 = new Q4(123,"Murali",org);
		Q4 obj2 = new Q4(obj1);
		obj2.disply();
		
	}
}