package swings;
import java.awt.Color;
import java.awt.event.*;  
import javax.swing.*;

public class swing1 {  
    // static String myBio="Hello!! My name is Abhishek Jathan.";
    public static void main(String[] args) {  
	// String myBio=" hee";
	JFrame f= new JFrame("About me");  	//#1
    JLabel l1,l2,l3; 					//#2
    JButton b=new JButton("Click to reveal details");  	//#3
    JPanel panel=new JPanel();								//#4
    JMenu menu;			//$5
    panel.setBounds(20,80,200,300); 
    b.setBounds(250, 5, 200, 20);  
    
    // myBio="Hello!! My name is Abhishek Jathan.";
    JTextArea bio=new JTextArea(2,1);					//#6
    //bio.setVisible(true);
    bio.setBounds(100,200,200,200);
    //bio.setVisible(false);
    
    String data[][]={{"12th","2018","87"},
    		{"CET","2018","16195"}};    
    String column[]={"Course","Year","Score"};         
    JTable jt=new JTable(data,column);    				//#7
    jt.setBounds(280,80,200,200);  
    
    JMenuBar mb=new JMenuBar();  
    JMenuItem i1;//#8
    menu=new JMenu("Menu");  
    i1=new JMenuItem("Quit");  
    menu.add(i1);
    mb.add(menu); 
    i1.addActionListener(
        	new ActionListener(){	  
            	public void actionPerformed(ActionEvent e){
                        System.exit(0);
                    }  
            	}
            ); 
    
    b.addActionListener(
    	new ActionListener(){	  
    	public void actionPerformed(ActionEvent e){
                panel.add(bio);
                panel.setBackground(Color.gray); 
                String myBio = "Hello !! My name is Abhishek Jathan. I live with my parents, an Older sister and a pet cat.";
                bio.setText(myBio);
            }  
    	}
    );   
    
    l1=new JLabel("About me");  
    l1.setBounds(0,0, 100,20);  
    l2=new JLabel("Name: Abhishek Jathan");
    l2.setBounds(0, 21, 180, 20);
    l3=new JLabel("Bio:");
    l3.setBounds(0,42, 100,20); 
    f.setJMenuBar(mb);
    f.add(panel);
   // panel.add(bio);
    f.add(jt);
    f.add(l1);  
    f.add(l2);
    f.add(l3);
    f.add(b);
    f.setSize(700,500);  
    f.setLayout(null);  
    f.setVisible(true);
    
	}  
}  