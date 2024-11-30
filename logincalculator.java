import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class logincalculator{
    public static void main(String[] args) {
        //create a frame
        JFrame frame=new JFrame("login form");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        //create Label
        JLabel l1=new JLabel("username");
        l1.setBounds(30, 30, 80 ,25);
        frame.add(l1);

        JTextField t1=new JTextField();
        t1.setBounds(100,30,150,25);
        frame.add(t1);

        JLabel l2=new JLabel("password:");
        l2.setBounds(30, 80, 80 ,25);
        frame.add(l2);

        JPasswordField t2=new JPasswordField();
        t2.setBounds(100,80,150,25);
        frame.add(t2);
        

        //create submit button

        JButton b=new JButton("submit");
        b.setBounds(120,120,100,25);
        frame.add(b);
        
        //add action listener

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                //get username and passord
                String username=t1.getText();
                String password=new String (t2.getPassword());

                //check username and password correct
                if(username.equals("Bishal")&& password.equals("797075")){

                    //JOptionPane.showMessageDialog(frame, "welcome" +username);
                    //close the login window
                    frame.dispose();
                    //call calculator class
                    calculator.opencalculator();
                }
                else{
                    JOptionPane.showMessageDialog(frame,"invalid username and password" );

                }

            }
        });

    frame.setVisible(true);

        
    }
}