public class Cylinder extends Circle {
    int height;

    public Cylinder(int x, int y, int radius, int height) {
        super(x, y, radius);
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Draw cylinder");
    }
}
