package problem6;

public class Circle extends Forme{
    private double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getSurface() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle(radius " + radius + " cm)";
    }
}
