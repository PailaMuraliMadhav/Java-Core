class Fat {
    public void test() {
        System.out.println("Father class test");
    }
    public void demo(int a) {
        System.out.println("Father class demo");
    }
}

class So extends Fat {
   @Override
    public void test() {
        System.out.println("Son class test");
    }

    @Override
    public void demo(int a) {
        System.out.println("Son class demo");
    }
}

public class MethodOverrided {
    public static void main(String[] args) {
        Fat ref = new Fat();
        ref.test();
        ref.demo(0);

        So ref2 = new So();
        ref2.test();
        ref2.demo(0);

        Fat ref3 = new So();
        ref3.test();
        ref3.demo(0);

        So ref4 = (So) ref3;
        ref4.test();
        ref4.demo(0);
    }
}
