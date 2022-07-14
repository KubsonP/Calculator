import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Calculator extends JFrame{
    public Calculator(){
        setSize(600, 500);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        JTextField n1 = new JTextField();
        n1.setBounds(20, 50, 100, 20);
        JTextField n2 = new JTextField();
        n2.setBounds(20, 70, 100, 20);
        JTextField result = new JTextField();
        result.setBounds(20, 130, 100, 20);
        JButton button1 = new JButton();
        button1.setBounds(20, 90, 50, 20);
        button1.setText("+");
        JButton button2 = new JButton();
        button2.setBounds(70, 90, 50, 20);
        button2.setText("-");
        JButton button3 = new JButton();
        button3.setBounds(20, 110, 50, 20);
        button3.setText("*");
        JButton button4 = new JButton();
        button4.setBounds(70, 110, 50, 20);
        button4.setText("/");

        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                int first = Integer.parseInt(n1.getText());
                int second = Integer.parseInt(n2.getText());

                result.setText(String.valueOf(first + second));

            }
        });
        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int first = Integer.parseInt(n1.getText());
                int second = Integer.parseInt(n2.getText());

                result.setText(String.valueOf(first - second));

            }
        });
        button3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int first = Integer.parseInt(n1.getText());
                int second = Integer.parseInt(n2.getText());

                result.setText(String.valueOf(first * second));

            }
        });
        button4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double first = Double.parseDouble(n1.getText());
                double second = Double.parseDouble(n2.getText());
                if (first == 0 || second == 0){
                    System.out.println("Ops");
                }else
                    result.setText(String.valueOf(first / second));

            }
        });


        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(n1);
        add(n2);
        add(result);
    }

}
