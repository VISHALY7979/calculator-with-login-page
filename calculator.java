import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator{
    public static void opencalculator() {
        //create frame
        JFrame f1=new JFrame("calculator");
        f1.setSize(300,200);
        f1.setLayout(null);
        f1.setVisible(true);

        //create textfield
        JTextField t1=new JTextField();
        t1.setBounds(30,30,100,25);
        f1.add(t1);

        JTextField t2=new JTextField();
        t2.setBounds(30,80,100,25);
        f1.add(t2);

        //add label
        JLabel l=new JLabel("result:");
        l.setBounds(30,120,300,20);
        f1.add(l);

        //create button
        JButton b1=new JButton("+");
        b1.setBounds(30,180,50,25);
        f1.add(b1);

        JButton b2=new JButton("-");
        b2.setBounds(90,180,50,25);
        f1.add(b2);

        JButton b3=new JButton("*");
        b3.setBounds(150,180,50,25);
        f1.add(b3);

        JButton b4=new JButton("/");
        b4.setBounds(210,180,50,25);
        f1.add(b4);

        //add action listener
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                double num1=Double.parseDouble(t1.getText());
                double num2=Double.parseDouble(t2.getText());
                double result=num1+num2;
                l.setText("result"+result);
            }
            
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                double num1=Double.parseDouble(t1.getText());
                double num2=Double.parseDouble(t2.getText());
                double result=num1-num2;
                l.setText("result"+result);
            }
            
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                double num1=Double.parseDouble(t1.getText());
                double num2=Double.parseDouble(t2.getText());
                double result=num1*num2;
                l.setText("result"+result);
            }
            
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                double num1=Double.parseDouble(t1.getText());
                double num2=Double.parseDouble(t2.getText());
                double result=num1/num2;
                if(num2!=0){
                l.setText("result"+result);
                }
                else{
                    l.setText(" not divided by zero");
                }
            }
            
        });

        
    }
}