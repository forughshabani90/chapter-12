package listing;

public class InvalidRadiusException {
    private double radius;
    public InvalidRadiusException(double radius) {
        super();
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
}

