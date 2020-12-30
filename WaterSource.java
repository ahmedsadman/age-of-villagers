public class WaterSource extends ComplexShape {
    public WaterSource(int x, int y) {
        super(x, y);
        this.x = x;
        this.y = y;

        // A water source or "well" is a basic cyllinder
        Shape[] components = new Shape[] { new Cylinder(x, y, 10, 20) };
        this.addComponents(components);
    }
}
