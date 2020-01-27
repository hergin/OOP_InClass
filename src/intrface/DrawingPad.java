package intrface;

import java.util.ArrayList;
import java.util.List;

public class DrawingPad {

    List<Movable> allItems;

    public DrawingPad() {
        this.allItems = new ArrayList<>();
    }

    void draw() {

    }

    void dragDrop(Movable item) {
        item.moveUp();
    }

}
