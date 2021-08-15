package swings;
import java.awt.event.*;  
import javax.swing.*;

public class swings {  
    static String myBio="Hello!! My name is Abhishek Jathan.";
public static void main(String[] args) {  
	myBio="";
	JFrame f= new JFrame("About me");  
    JLabel l1,l2,l3; 
    JButton b=new JButton("Click to reveal details");  
    JPanel panel=new JPanel();   
    panel.setBounds(40,80,200,200); 
    b.setBounds(250, 5, 200, 20);  
    
    //bio.setVisible(false);
    b.addActionListener(
    	new ActionListener(){	  
    	public void actionPerformed(ActionEvent e){  
    	    	//myBio="Hello!! My name is Abhishek Jathan.";
    			JTextArea bio;
    			bio=new JTextArea(myBio);
    			//bio.setVisible(true);
    			bio.setBounds(100,200,200,100);
    			panel.add(bio);
    	        }  
    	}
    );   
    
    l1=new JLabel("About me");  
    l1.setBounds(0,0, 100,20);  
    l2=new JLabel("Name: Abhishek Jathan");
    l2.setBounds(0, 21, 180, 20);
    l3=new JLabel("Bio:");
    l3.setBounds(0,42, 100,20); 
    
    f.add(panel);
   // panel.add(bio);
    f.add(l1);  
    f.add(l2);
    f.add(l3);
    f.add(b);
    f.setSize(500,500);  
    f.setLayout(null);  
    f.setVisible(true);
    
	}  
}  