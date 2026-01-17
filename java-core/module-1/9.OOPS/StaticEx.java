// driver class
public class StaticEx {
	public static void main(String[] args) {
		System.out.println("Start");
		A.test();
		System.out.println("End");
	}
		static {
			System.out.println("Welcome 1");
		}
		static {
			System.out.println("Welcome 2");
		}

	class A {
		static {
			System.out.println("Welcome to A");
		}
		public static void test(){
			System.out.println("test start");
			System.out.println("test end");
		}
	}
	}
	/*
	welcome 1
	welcome 2
	start
	welcome to A
	test start
	test end 
	end
