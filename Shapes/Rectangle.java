package Shapes;

public class Rectangle extends BaseShape {
    int width;
    int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Draw the rectangle");
    }
}
