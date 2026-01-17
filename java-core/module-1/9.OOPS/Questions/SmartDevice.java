class SmartDevice {
	String device;
	String os;
	int bat;
	public SmartDevice(){
		this.device = "unknown";
		this.os = "Android";
		this.bat = 5000;
	}
	public SmartDevice(String device){
		this();
		this.device=device;
	}
	public SmartDevice(String device,String os){
		this();
		this.device=device;
		this.os= os;
	}
	public SmartDevice(String device,String os,int bat){
		this();
		this.device=device;
		this.os= os;
		this.bat= bat;
	}

	public static void main(String[] args) {
		SmartDevice sd= new SmartDevice("Samsung");
		System.out.println(sd.device);
		System.out.println(sd.os);
		System.out.println(sd.bat);
		SmartDevice sd1 = new SmartDevice()
		
	}
}