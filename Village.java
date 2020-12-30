import java.util.*;
import Shapes.Shape;
import Objects.*;

public class Village {
    String name;
    List<Shape> components;

    public Village(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addHouse(int x, int y) {
        House house = new House(x, y, 20, 30);
        this.components.add(house);
    }

    public void addTree(int x, int y) {
        TreeComp tree = new TreeComp(x, y);
        this.components.add(tree);
    }
}
