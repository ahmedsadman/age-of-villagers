public class Tree extends ComplexShape {
    public Tree(int x, int y) {
        super(x, y);
        this.x = x;
        this.y = y;

        // A tree would contain one cylinder and one circle
        Shape trunk = new Cylinder(x, y, 3, 10); // 3 -> default trunk radius, 10 -> default height
        Shape circle = new Circle(x, y, 30);

        Shape[] components = new Shape[] { trunk, circle };
        this.addComponents(components);
    }
}
