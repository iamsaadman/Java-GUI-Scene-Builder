import javax.swing.*;

public class FrameDemo {


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //frame.setSize(500,500);

        //frame.setLocation(200,50);

        frame.setBounds(500,250,500,500);
        frame.setTitle("Frame Demo");
        frame.setResizable(false);
    }
}
