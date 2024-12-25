package MID_Spring2022;

public abstract class Cylinder extends GeometricShape {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double getHeight() {
        return this.height;
    }


    double volume() {
        double area = Math.PI * (radius * radius) * height;
        return area;
    }
}