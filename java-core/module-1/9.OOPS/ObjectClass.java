class ObjectClass{
	int id;
	String name;
	public ObjectClass(int id,String name){
		this.id=id;
		this.name=name;

	}
	//if not overrriden it will print the class address
	@Override
	public String toString(){
		return "Object ID: "+id+", name: "+name+"]";
	}
	public static void main(String[] args) {
		ObjectClass o = new ObjectClass(1,"Murali");
		System.out.println(o);//Object ID: 1, name: Murali]
		System.out.println(o.toString());//Object ID: 1, name: Murali]
		System.out.println(o.hashCode());//785447854
		System.out.println(Integer.toHexString(o.hashCode()));//2ed0fbae
		System.out.println(o);

		System.out.println(o.getClass());//class ObjectClass
		System.out.println(o.getClass().getName());//ObjectClass

		System.out.println(o.getClass().getName()+"@"+Integer.toHexString(o.hashCode()));//ObjectClass@2ed0fbae
		
	}
}