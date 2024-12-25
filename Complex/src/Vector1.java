public class Vector1 {
    private double w, x, y, z;

    public Vector1(double w, double x, double y, double z) {
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getW(){
        return this.w;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public Vector1 add(Vector1 other) {
        double newW = this.w + other.getW();
        double newX = this.x + other.getX();
        double newY = this.y + other.getY();
        double newZ = this.z + other.getZ();
        return new Vector1(newW, newX, newY, newZ);
    }

    public Vector1 crossMultiply(Vector1 other) {
        double newW = this.y * other.getZ() - this.z * other.getY();
        double newX = this.z * other.getX() - this.x * other.getZ();
        double newY = this.x * other.getY() - this.y * other.getX();
        double newZ = 0;
        return new Vector1(newW, newX, newY, newZ);
    }

    public Vector1 scalarMultiply(double scalar) {
        double newW = this.w * scalar;
        double newX = this.x * scalar;
        double newY = this.y * scalar;
        double newZ = this.z * scalar;
        return new Vector1(newW, newX, newY, newZ);
    }

    public double calculate2Norm() {
        return Math.sqrt(this.w * this.w + this.x * this.x + this.y * this.y + this.z * this.z);
    }

    public double calculateAngle(Vector1 other) {
        double dotProduct = this.w * other.getW() + this.x * other.getX() + this.y * other.getY() + this.z * other.getZ();
        double magnitudeProduct = this.calculate2Norm() * other.calculate2Norm();
        return Math.toDegrees(Math.acos(dotProduct / magnitudeProduct));

    }

    public static void main(String[] args) {
        Vector1 u = new Vector1(2, 1, -4, 5);
        Vector1 v = new Vector1(0, 1, -3, 2);

        Vector1 sum = u.add(v);
        Vector1 crossProduct = u.crossMultiply(v);
        Vector1 scalarProduct = u.scalarMultiply(2);
        double u2Norm = u.calculate2Norm();
        double v2Norm = v.calculate2Norm();
        double angleUV = u.calculateAngle(v);

        System.out.println("Vector U: [w=" + u.getW() + ", x=" + u.getX() + ", y=" + u.getY() + ", z=" + u.getZ() + "]");
        System.out.println("Vector V: [w=" + v.getW() + ", x=" + v.getX() + ", y=" + v.getY() + ", z=" + v.getZ() + "]");
        System.out.println("Sum of U and V: [w=" + sum.getW() + ", x=" + sum.getX() + ", y=" + sum.getY() + ", z=" + sum.getZ() + "]");
        System.out.println("Cross Product of U and V: [w=" + crossProduct.getW() + ", x=" + crossProduct.getX() + ", y=" + crossProduct.getY() + ", z=" + crossProduct.getZ() + "]");
        System.out.println("Scalar Product of U (2x): [w=" + scalarProduct.getW() + ", x=" + scalarProduct.getX() + ", y=" + scalarProduct.getY() + ", z=" + scalarProduct.getZ() + "]");
        System.out.println("2-Norm of U: " + u2Norm);
        System.out.println("2-Norm of V: " + v2Norm);
        System.out.println("Angle between U and V (in degrees): " + angleUV);
    }
}