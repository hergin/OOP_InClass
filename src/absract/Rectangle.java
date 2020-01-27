package absract;

public class Rectangle extends Shape {

    int height;
    int length;

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    @Override
    public double getArea() {
        return height * length;
    }

    public static void main(String[] args) {
        var rect1 = new Rectangle(5,4);
        var area = rect1.getArea();
    }
}
