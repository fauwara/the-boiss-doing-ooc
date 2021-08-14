// Develop a java standalone application that describes about yourself, your family
// and your achievements.
// Note: The application must contain at least 8 swing components.

// package a;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class index {

    // DRY CODE
    static JTextField createForm(JFrame frame, String name, int frameWidth, int yAxis, int height) {

        JLabel label;
        JTextField input;
            
        // label
        label = new JLabel( name + ": ");
        label.setBounds(frameWidth/8, yAxis, frameWidth/4, height);
        frame.add(label);
        
        // input
        input = new JTextField();
        input.setBounds((frameWidth/8 + frameWidth/4), yAxis, frameWidth/2, height);
        frame.add(input);
    
        return input;
    }

    public static void main(String[] args) {  
        
        JFrame f = new JFrame(); // creating the frame object
        int frameWidth = 400;
        int frameHeight = 400;

        // initializing form swing components
        JTextField dad = createForm(f, "DAD", frameWidth, 10, 30);
        JTextField mom = createForm(f, "MOM", frameWidth, 45, 30);
        JTextField user = createForm(f, "USER", frameWidth, 80, 30);

        // initialized label
        JLabel familyBio = new JLabel();
        familyBio.setBounds(frameWidth/8, 150, (frameWidth*3)/4, 40);
        f.add(familyBio);

        // initializing button swing components  
        JButton button = new JButton("CREATE FAMILY DESCRIPTION");
        button.setBounds(frameWidth/8, 115, (frameWidth*3)/4, 30);  
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String dadName = dad.getText();
                String momName = mom.getText();
                String userName = user.getText();

                familyBio.setText("<html><p>My name is " + userName + ", My moms name is " + momName + " and my dads name is " + dadName + "</p></html>");
            }
        });
        f.add(button);

        f.setSize(frameWidth,frameHeight);
        f.setLayout(null);  
        f.setVisible(true);
    }
}