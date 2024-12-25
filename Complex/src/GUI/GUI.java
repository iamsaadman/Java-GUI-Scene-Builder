package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    JFrame jframe = new JFrame();
    JLabel welcome = new JLabel();
    JLabel num1 = new JLabel();
    JTextField num1input = new JTextField();
    JLabel num2 = new JLabel();
    JTextField num2input = new JTextField();

    JButton area = new JButton();
    JButton perimeter = new JButton();

    JButton rectangle = new JButton();
    JButton triangle = new JButton();
    JButton square = new JButton();
    JButton circle = new JButton();
    JTextArea bigscreen = new JTextArea();

    boolean triangleClicked = false;
    boolean rectangleClicked = false;
    boolean squareClicked = false;
    boolean circleClicked = false;
    boolean areaClicked = false;

    public GUI() {
        welcome.setBounds(250,10,300,20);
        num1.setBounds(50,50,100,50);
        num1input.setBounds(150,50,100,50);
        num2.setBounds(320,50,100,50);
        num2input.setBounds(450,50,100,50);

        rectangle.setBounds(50,120,100,50);
        circle.setBounds(230,120,100,50);
        square.setBounds(400,120,100,50);
        triangle.setBounds(630,120,100,50);

        area.setBounds(140,200,100,80);
        perimeter.setBounds(510,200,100,80);
        bigscreen.setBounds(100,320,600,400);
        welcome.setText("Weclome to our Project: Shape Calculator");
        jframe.setTitle("Project");
        num1.setText("Length 1: ");
        num2.setText("Length 2: ");
        triangle.setText("Triangle");
        square.setText("Square");
        rectangle.setText("Rectangle");
        circle.setText("Circle");
        area.setText("Area");
        perimeter.setText("Perimeter");

        jframe.add(welcome);
        jframe.add(num1);
        jframe.add(num2);
        jframe.add(num1input);
        jframe.add(num2input);
        jframe.add(triangle);
        jframe.add(square);
        jframe.add(rectangle);
        jframe.add(circle);
        jframe.add(area);
        jframe.add(perimeter);
        jframe.add(bigscreen);

        triangle.addActionListener(this);
        rectangle.addActionListener(this);
        square.addActionListener(this);
        circle.addActionListener(this);
        area.addActionListener(this);
        perimeter.addActionListener(this);

        jframe.setLocation(50,50);
        jframe.setSize(800,800);
        jframe.setLayout(null);
        jframe.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == triangle) {
            triangleClicked = true;
            rectangleClicked = false;
            squareClicked = false;
            circleClicked = false;
            areaClicked = false;
            num2.setVisible(true);
            num2input.setVisible(true);
            bigscreen.setText("Triangle button clicked. Enter side lengths and press Area.");
        }
        if (e.getSource() == rectangle) {
            triangleClicked = false;
            rectangleClicked = true;
            squareClicked = false;
            circleClicked = false;
            areaClicked = false;
            num2.setVisible(true);
            num2input.setVisible(true);
            bigscreen.setText("Rectangle button clicked. Enter length and width and press Area.");
        }
        if (e.getSource() == square) {
            triangleClicked = false;
            rectangleClicked = false;
            squareClicked = true;
            circleClicked = false;
            areaClicked = false;
            num2.setVisible(false);
            num2input.setVisible(false);
            bigscreen.setText("Square button clicked. Enter side length and press Area.");
        }
        if (e.getSource() == circle) {
            triangleClicked = false;
            rectangleClicked = false;
            squareClicked = false;
            circleClicked = true;
            areaClicked = false;
            num2.setVisible(false);
            num2input.setVisible(false);
            bigscreen.setText("Circle button clicked. Enter radius and press Area.");
        }
        if (e.getSource() == area) {
            if (triangleClicked) {
                double length1 = Double.parseDouble(num1input.getText());
                double length2 = Double.parseDouble(num2input.getText());

                double areaValue = 0.5 * length1 * length2;
                bigscreen.setText("Area of the triangle: " + areaValue + "\nPress Perimeter.");
                areaClicked = true;
            } else if (rectangleClicked) {
                double length = Double.parseDouble(num1input.getText());
                double width = Double.parseDouble(num2input.getText());

                double areaValue = length * width;
                bigscreen.setText("Area of the rectangle: " + areaValue + "\nPress Perimeter.");
                areaClicked = true;
            } else if (squareClicked) {
                double side = Double.parseDouble(num1input.getText());

                double areaValue = side * side;
                bigscreen.setText("Area of the square: " + areaValue + "\nPress Perimeter.");
                areaClicked = true;
            } else if (circleClicked) { // Calculate circle area
                double radius = Double.parseDouble(num1input.getText());
                double areaValue = Math.PI * radius * radius;
                bigscreen.setText("Area of the circle: " + areaValue + "\nPress Perimeter.");
                areaClicked = true;
            } else {
                bigscreen.setText("Press a shape button first.");
            }
        }
        if (e.getSource() == perimeter) {
            if ((triangleClicked || rectangleClicked || squareClicked || circleClicked) && areaClicked) {
                double perimeterValue = 0.0;

                if (triangleClicked) {
                    double side1 = Double.parseDouble(num1input.getText());
                    double side2 = Double.parseDouble(num2input.getText());
                    double side3 = Math.sqrt(side1 * side1 + side2 * side2);
                    perimeterValue = side1 + side2 + side3;
                } else if (rectangleClicked) {
                    double length = Double.parseDouble(num1input.getText());
                    double width = Double.parseDouble(num2input.getText());
                    perimeterValue = 2 * (length + width);
                } else if (squareClicked) {
                    double side = Double.parseDouble(num1input.getText());
                    perimeterValue = 4 * side;
                } else if (circleClicked) { // Calculate circle perimeter
                    double radius = Double.parseDouble(num1input.getText());
                    perimeterValue = 2 * Math.PI * radius;
                }

                bigscreen.setText("Perimeter: " + perimeterValue);
            } else {
                bigscreen.setText("Press shape and Area first.");
            }
        }
    }

    public static void main(String[] args) {
        new GUI();
    }
}
