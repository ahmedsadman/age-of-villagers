// A BaseShape represents a pixel
package Shapes;

public class BaseShape implements Shape {
    public int x;
    public int y;

    public BaseShape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void draw() {
        System.out.println("Render on screen");
    }
}
