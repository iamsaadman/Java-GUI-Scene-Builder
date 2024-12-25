package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Count implements ActionListener {
    JFrame  frame = new JFrame();
    JTextField field = new JTextField();
    JButton Count = new JButton();
    JLabel middlelabel = new JLabel();
    public Count(){
        frame.setTitle("Counter");
        frame.setSize(500,300);


        field.setBounds(50,70,300,80);
        Count.setText("Count");
        Count.setBounds(370,70,100,100);
        Count.addActionListener((ActionListener) this);
        middlelabel.setBounds(50,250,300,60);
        frame.add(field);
        frame.add(Count);
        frame.add(middlelabel);
        middlelabel.setText("WTF");

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    int count =0;
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Count) {
            String s = field.getText();
            String result = "";
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    result += Character.toUpperCase(c);
                } else if (c >= 'A' && c <= 'Z') {
                    result += Character.toLowerCase(c);
                } else {
                    result += c;
                }
            }
            field.setText(result);
        }
    }



    public static void main(String[] args) {
        new Count();
    }


}
