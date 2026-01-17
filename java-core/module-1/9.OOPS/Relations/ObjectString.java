class ObjectString{
	int id;
	String name;
	public ObjectString(int id,String name){
		this.id=id;
		this.name=name;

	}
	@Override
	public String toString(){
		return "ObjectString ID: "+id+", name: "+name+"]";
	}
	public static void main(String[] args) {
		ObjectString o = new ObjectString(1,"Murali");
		System.out.println(o);
		System.out.println(o.toString());
		
	}
}