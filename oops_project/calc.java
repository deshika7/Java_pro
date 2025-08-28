import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calc extends JFrame implements ActionListener {
    JTextField inputField;
    JButton[] numButtons = new JButton[10];
    JButton add, sub, mul, div, sin, cos, tan, log, sqrt, pow, clr, eq;
    JButton dec;
    String operator;
    double num1, num2, result;

    calc() {
        setTitle("Scientific Calculator");
        setSize(400, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inputField = new JTextField();
        inputField.setFont(new Font("Arial", Font.BOLD, 20));
        inputField.setHorizontalAlignment(JTextField.RIGHT);
        add(inputField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 4, 5, 5));

        // Number buttons
        for (int i = 0; i < 10; i++) {
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].addActionListener(this);
            panel.add(numButtons[i]);
        }

        // Decimal button
        dec = new JButton(".");
        dec.addActionListener(this);
        panel.add(dec);

        // Operations
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        sin = new JButton("sin");
        cos = new JButton("cos");
        tan = new JButton("tan");
        log = new JButton("log");
        sqrt = new JButton("√");
        pow = new JButton("^");
        clr = new JButton("C");
        eq = new JButton("=");

        JButton[] ops = {add, sub, mul, div, sin, cos, tan, log, sqrt, pow, clr, eq};
        for (JButton b : ops) {
            b.addActionListener(this);
            panel.add(b);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numButtons[i]) {
                inputField.setText(inputField.getText() + i);
            }
        }
        if (e.getSource() == dec) {
            inputField.setText(inputField.getText() + ".");
        }
        if (e.getSource() == add || e.getSource() == sub || e.getSource() == mul || e.getSource() == div || e.getSource() == pow) {
            num1 = Double.parseDouble(inputField.getText());
            operator = ((JButton) e.getSource()).getText();
            inputField.setText("");
        }
        if (e.getSource() == sin) inputField.setText(String.valueOf(Math.sin(Math.toRadians(Double.parseDouble(inputField.getText())))));
        if (e.getSource() == cos) inputField.setText(String.valueOf(Math.cos(Math.toRadians(Double.parseDouble(inputField.getText())))));
        if (e.getSource() == tan) inputField.setText(String.valueOf(Math.tan(Math.toRadians(Double.parseDouble(inputField.getText())))));
        if (e.getSource() == log) inputField.setText(String.valueOf(Math.log(Double.parseDouble(inputField.getText()))));
        if (e.getSource() == sqrt) inputField.setText(String.valueOf(Math.sqrt(Double.parseDouble(inputField.getText()))));

        if (e.getSource() == eq) {
            num2 = Double.parseDouble(inputField.getText());
            switch (operator) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> result = num1 / num2;
                case "^" -> result = Math.pow(num1, num2);
            }
            inputField.setText(String.valueOf(result));
        }
        if (e.getSource() == clr) {
            inputField.setText("");
            num1 = num2 = result = 0;
        }
    }

    public static void main(String[] args) {
        new calc();
    }
}
