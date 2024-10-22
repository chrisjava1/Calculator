import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    private static double num1 = 0, num2 = 0, result = 0;
    private static char operator;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator Simplu");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Layout manual

        JTextField textField = new JTextField();
        textField.setBounds(50, 40, 300, 50);
        frame.add(textField);

        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");

        JButton buttonAdd = new JButton("+");
        JButton buttonSub = new JButton("-");
        JButton buttonMul = new JButton("*");
        JButton buttonDiv = new JButton("/");
        JButton buttonEq = new JButton("=");
        JButton buttonClr = new JButton("C"); // Clear

        button1.setBounds(50, 100, 50, 50);
        button2.setBounds(120, 100, 50, 50);
        button3.setBounds(190, 100, 50, 50);

        button4.setBounds(50, 170, 50, 50);
        button5.setBounds(120, 170, 50, 50);
        button6.setBounds(190, 170, 50, 50);

        button7.setBounds(50, 240, 50, 50);
        button8.setBounds(120, 240, 50, 50);
        button9.setBounds(190, 240, 50, 50);
        button0.setBounds(120, 310, 50, 50);

        buttonAdd.setBounds(260, 100, 50, 50);
        buttonSub.setBounds(260, 170, 50, 50);
        buttonMul.setBounds(260, 240, 50, 50);
        buttonDiv.setBounds(260, 310, 50, 50);
        buttonEq.setBounds(190, 310, 50, 50);
        buttonClr.setBounds(50, 310, 50, 50);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button0);
        frame.add(buttonAdd);
        frame.add(buttonSub);
        frame.add(buttonMul);
        frame.add(buttonDiv);
        frame.add(buttonEq);
        frame.add(buttonClr);


        button1.addActionListener(e -> textField.setText(textField.getText() + "1"));
        button2.addActionListener(e -> textField.setText(textField.getText() + "2"));
        button3.addActionListener(e -> textField.setText(textField.getText() + "3"));
        button4.addActionListener(e -> textField.setText(textField.getText() + "4"));
        button5.addActionListener(e -> textField.setText(textField.getText() + "5"));
        button6.addActionListener(e -> textField.setText(textField.getText() + "6"));
        button7.addActionListener(e -> textField.setText(textField.getText() + "7"));
        button8.addActionListener(e -> textField.setText(textField.getText() + "8"));
        button9.addActionListener(e -> textField.setText(textField.getText() + "9"));
        button0.addActionListener(e -> textField.setText(textField.getText() + "0"));

        buttonAdd.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        });
        buttonSub.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        });
        buttonMul.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        });
        buttonDiv.addActionListener(e -> {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        });

        buttonEq.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(textField.getText());
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            textField.setText("Eroare");
                            return;
                        }
                        break;
                }
                textField.setText(String.valueOf(result));
            }
        });

        buttonClr.addActionListener(e -> textField.setText(""));

        frame.setVisible(true);
    }
}
