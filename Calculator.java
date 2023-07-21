//Calculator app using java 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Calculator implements ActionListener {

    JFrame frame;
    JTextField jt;

    
    Calculator() {
        
        JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bsum, beql, bsub, bmul, bdiv, bdel, bcl, bpoi;

        frame = new JFrame("Calculator"); // Object of Frame

        frame.setSize(500, 500); // 500 width and 500 height
        frame.setLayout(null); // using no layout managers
        frame.setVisible(true); // making the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Default close operation
        frame.setBackground(Color.BLACK); 

        jt = new JTextField(); // Object of Text Field
        jt.setBounds(100, 5, 200, 40); // Set size of Text box
        jt.setEditable(false);
        jt.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(jt);

        // Create object of Buttons
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bsum = new JButton("+");
        b0 = new JButton("0");
        beql = new JButton("=");
        bsub = new JButton("-");
        bmul = new JButton("*");
        bdiv = new JButton("/");
        bdel = new JButton("D");
        bcl = new JButton("C");
        bpoi = new JButton(".");

        // Set size of the buttons
        b1.setBounds(100, 50, 45, 45);
        b2.setBounds(150, 50, 45, 45);
        b3.setBounds(200, 50, 45, 45);
        b4.setBounds(100, 100, 45, 45);
        b5.setBounds(150, 100, 45, 45);
        b6.setBounds(200, 100, 45, 45);
        b7.setBounds(100, 150, 45, 45);
        b8.setBounds(150, 150, 45, 45);
        b9.setBounds(200, 150, 45, 45);
        bsum.setBounds(100, 200, 45, 45);
        b0.setBounds(150, 200, 45, 45);
        beql.setBounds(200, 200, 45, 45);
        bsub.setBounds(250, 50, 45, 45);
        bmul.setBounds(250, 100, 45, 45);
        bdiv.setBounds(250, 150, 45, 45);
        bpoi.setBounds(250, 200, 45, 45);
        bcl.setBounds(100, 250, 95, 45);
        bdel.setBounds(200, 250, 95, 45);

        // Add buttons to the frame
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b0);
        frame.add(bsum);
        frame.add(beql);
        frame.add(bsub);
        frame.add(bmul);
        frame.add(bdiv);
        frame.add(bdel);
        frame.add(bcl);
        frame.add(bpoi);

        // Add action listeners to buttons
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bsum.addActionListener(this);
        beql.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bdel.addActionListener(this);
        bcl.addActionListener(this);
        bpoi.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
       String s = e.getActionCommand();
        
        if(s.equals("C")) { 
            Clear();                         //Clear the textfield 
        }
        else if (s.equals("D")) {
            Delete();                       //Delete the textfield
        } 

        else if(s.equals("=")) {
             calculate();                   //Calculate 
        }

        else {
            jt.setText(jt.getText() + s);
        }
        
    }



    public void Clear() {
        jt.setText("");
    }

    public void Delete() {
            int length = jt.getText().length();
            int num = length - 1;
            if(length>0) {
                StringBuilder back =new StringBuilder(jt.getText());
                back.deleteCharAt(num);
                jt.setText(back.toString());
            }
        }

        public void calculate() {
            String expression = jt.getText();
            char[] arr2 = expression.toCharArray();
            String  operand1 = "";
            String  operand2 = "";
            String  operator = "";
    
            double result = 0;
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] >= '0' && arr2[i] <= '9' || arr2[i] == '.') {
                    if (operator.isEmpty()) {
                        operand1 += arr2[i];
                    } else {
                        operand2 += arr2[i];
                    }
                }
                if (arr2[i] == '+' || arr2[i] == '-' || arr2[i] == '/' || arr2[i] == '*' || arr2[i] == '%') {
                    operator += arr2[i];
                }
            }
    
            if (operator.equals("+")) {
                result = Double.parseDouble(operand1) + Double.parseDouble(operand2);
            } else if (operator.equals("-")) {
                result = Double.parseDouble(operand1) - Double.parseDouble(operand2);
            } else if (operator.equals("/")) {
                result = Double.parseDouble(operand1) / Double.parseDouble(operand2);
            } else if (operator.equals("%")) {
                result = Double.parseDouble(operand1) % Double.parseDouble(operand2);
            } else if(operator.equals("*")) {
                result = Double.parseDouble(operand1) * Double.parseDouble(operand2);
            }
    
            jt.setText(String.valueOf(result));
        }
        
       
       
    
    //Main class
    public static void main(String[] args) {
        new Calculator();
    }
}

