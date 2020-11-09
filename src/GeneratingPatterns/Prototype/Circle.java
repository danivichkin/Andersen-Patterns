package GeneratingPatterns.Prototype;

public class Circle extends Shape {

    public int radius;

    public Circle() {
    }

    public Circle(Circle shape) {
        super(shape);
        if (shape != null) {
            this.radius = shape.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if(!(object2 instanceof Circle) || !super.equals(object2))
            return false;
        Circle circle = (Circle) object2;
        return circle.radius == radius;
    }

}
