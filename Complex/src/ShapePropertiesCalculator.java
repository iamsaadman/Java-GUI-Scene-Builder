import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePropertiesCalculator extends JFrame {

    private JLabel shapeLabel, resultLabel;
    private JComboBox<String> shapeComboBox;
    private JButton calculateButton;

    public ShapePropertiesCalculator() {
        setTitle("Shape Properties Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        shapeLabel = new JLabel("Select a shape:");
        shapeComboBox = new JComboBox<>(new String[]{"Select", "Circle", "Rectangle", "Triangle"});
        calculateButton = new JButton("Calculate");
        resultLabel = new JLabel("");

        setLayout(new GridLayout(4, 1));

        add(shapeLabel);
        add(shapeComboBox);
        add(calculateButton);
        add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedShape = (String) shapeComboBox.getSelectedItem();
                if (selectedShape.equals("Circle")) {
                    double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius:"));
                    double area = Math.PI * radius * radius;
                    resultLabel.setText("Area of Circle: " + area);
                } else if (selectedShape.equals("Rectangle")) {
                    double length = Double.parseDouble(JOptionPane.showInputDialog("Enter length:"));
                    double width = Double.parseDouble(JOptionPane.showInputDialog("Enter width:"));
                    double area = length * width;
                    resultLabel.setText("Area of Rectangle: " + area);
                } else if (selectedShape.equals("Triangle")) {
                    double base = Double.parseDouble(JOptionPane.showInputDialog("Enter base length:"));
                    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height:"));
                    double area = 0.5 * base * height;
                    resultLabel.setText("Area of Triangle: " + area);
                } else {
                    resultLabel.setText("Select a valid shape.");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ShapePropertiesCalculator calculator = new ShapePropertiesCalculator();
            calculator.setVisible(true);
        });
    }
}