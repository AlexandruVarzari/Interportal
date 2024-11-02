package Lesson12JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    JTextField displayFirst;
    JTextField displaySecond;

    JTextField displayResult;

    public Calculator() {
        setTitle("Calculator");
        setSize(350, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        displayFirst = new JTextField(10);
        add(displayFirst);
        displaySecond = new JTextField(10);
        add(displaySecond);

        JButton plus = new JButton("+");
        plus.addActionListener(new Sum());
        add(plus);
        JButton minus = new JButton("-");
        minus.addActionListener(new Subtract());
        add(minus);
        JButton multiply = new JButton("*");
        multiply.addActionListener(new Multiplication());
        add(multiply);
        JButton divide = new JButton("/");
        divide.addActionListener(new Division());
        add(divide);
        displayResult = new JTextField(10);
        displayResult.setEditable(false);
        JButton clear = new JButton("C");
        add(clear);
        add(displayResult);
        clear.addActionListener(new Clear());
    }

    private class Sum implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int num1 = Integer.parseInt(displayFirst.getText());
            int num2 = Integer.parseInt(displaySecond.getText());
            int result = num1 + num2;
            displayResult.setText(String.valueOf(result));
        }
    }

    private class Subtract implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int num1 = Integer.parseInt(displayFirst.getText());
            int num2 = Integer.parseInt(displaySecond.getText());
            int result = num1 - num2;
            displayResult.setText(String.valueOf(result));
        }
    }

    private class Multiplication implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int num1 = Integer.parseInt(displayFirst.getText());
            int num2 = Integer.parseInt(displaySecond.getText());
            int result = num1 * num2;
            displayResult.setText(String.valueOf(result));
        }
    }

    private class Division implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int num1 = Integer.parseInt(displayFirst.getText());
            int num2 = Integer.parseInt(displaySecond.getText());
            int result = num1 / num2;
            displayResult.setText(String.valueOf(result));
        }
    }

    private class Clear implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            displayFirst.setText("");
            displaySecond.setText("");
            displayResult.setText("");
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setVisible(true);
    }
}
