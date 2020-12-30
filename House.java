public class House extends ComplexShape {
    public House(int x, int y, int width, int height) {
        super(x, y);
        Shape wall = new Rectangle(x, y, height, height);
        Shape roof = new Rectangle(x, y, width, width);

        // A house will contain walls and roofs
        Shape[] components = new Shape[] { wall, roof };
        this.addComponents(components);
    }
}
