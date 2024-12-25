import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ace extends JFrame {
 JLabel shapeLabel;
    JComboBox<String> shapeComboBox;
   JLabel param1Label;
     JTextField param1TextField;
   JLabel param2Label;
     JTextField param2TextField;
    JButton calculateButton;
    JLabel resultLabel;

    Ace ace = new Ace();
    public Ace() {
        setTitle("Shape Properties Calculator");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        shapeLabel = new JLabel("Select Shape:");
        shapeComboBox = new JComboBox<>(new String[]{"Rectangle", "Triangle", "Circle", "Square"});

        param1Label = new JLabel("Parameter 1:");
        param1TextField = new JTextField(10);

        param2Label = new JLabel("Parameter 2:");
        param2TextField = new JTextField(10);

        calculateButton = new JButton("Calculate");
        resultLabel = new JLabel();

        setLayout(new GridLayout(6, 2, 10, 10));

        add(shapeLabel);
        add(shapeComboBox);
        add(param1Label);
        add(param1TextField);
        add(param2Label);
        add(param2TextField);
        add(new JLabel()); // Empty cell for spacing
        add(calculateButton);
        add(new JLabel()); // Empty cell for spacing
        add(resultLabel);

        ace.setVisible(true);
        ace.setLayout(null);


        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateShapeProperties();
            }
        });
    }

    private void calculateShapeProperties() {
        String selectedShape = (String) shapeComboBox.getSelectedItem();
        double param1, param2;
        param1 = Double.parseDouble(param1TextField.getText());
        param2 = Double.parseDouble(param2TextField.getText());

        double area = 0;
        double perimeter = 0;

        switch (selectedShape) {
            case "Rectangle":
                area = param1 * param2;
                perimeter = 2 * (param1 + param2);
                break;
            case "Triangle":
                area = 0.5 * param1 * param2;
                perimeter = param1 + param2 + Math.sqrt(param1 * param1 + param2 * param2);
                break;
            case "Circle":
                area = Math.PI * param1 * param1;
                perimeter = 2 * Math.PI * param1;
                break;
            case "Square":
                area = param1 * param1;
                perimeter = 4 * param1;
                break;
        }

        resultLabel.setText("Area: " + area + "  Perimeter: " + perimeter);
    }

    public static void main(String[] args) {
    new Ace();
  }
}