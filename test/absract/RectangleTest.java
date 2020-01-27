package absract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea() {
        var rect1 = new Rectangle(5,4);
        var area = rect1.getArea();
        assertEquals(20,area);
    }
}