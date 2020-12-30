// A BaseShape represents a pixel

public class BaseShape implements Shape {
    int x;
    int y;

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
