package MID_Spring2022;

public abstract class Shape extends GeometricShape{
    double radius;
    void setRadius(double radius){
        this.radius=radius;
    }
    double getRadius(){
        return this.radius;
    }

    double  volume(){
        double area= (4/3)*Math.PI*(radius*radius*radius);
        return area;
    }

}
