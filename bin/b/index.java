import javax.swing.*;

public class index {
    JFrame f;

    index() {
        f = new JFrame();
        JTextArea ta = new JTextArea(200, 200);
        JButton b = new JButton("helel");
        JPanel p1 = new JPanel();
        p1.add(b);
        p1.add(ta);
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JTabbedPane tp = new JTabbedPane();

        
        // b.setBounds(20,20,50,50);
        

        tp.setBounds(25, 25, 400, 400);
        tp.add("ABOUT ME", p1);
        tp.add("FAMILY", p2);
        tp.add("ACHIEVMENTS", p3);
        f.add(tp);
        f.setSize(550, 550);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new index();
    }
}