interface Resizable {
    int rw(int w);
    int rh(int h);
}

class Rectangle implements Resizable {
    private int w;
    private int h;

    public Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    // interface method implementations
    public int rw(int w) {
        this.w = w;
        return this.w;
    }

    public int rh(int h) {
        this.h = h;
        return this.h;
    }

    // setter-style methods (your logic)
    int getw(int w) {
        this.w = w;
        return w;
    }

    int geth(int h) {
        this.h = h;
        return h;
    }

    void print(int w, int h) {
        System.out.println(w + " " + h);
    }
}

class TypesQ {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);

        r.getw(25);
        r.geth(35);

        r.print(45, 55);
    }
}
