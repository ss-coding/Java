package j002;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorUI {
    private JFrame frame;
    private JPanel panel;
    private JTextField display;
    private JButton button0, button1, button2, button3, button4,
    	button5, button6, button7, button8, button9, buttonAdd,
    	buttonSubtract, buttonMultiply, buttonDivide, buttonEquals,
    	buttonClear;

    public CalculatorUI() {
        frame = new JFrame("Calculator");

        panel = new JPanel(new GridLayout(4, 4));

        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonAdd = new JButton("+");
        buttonSubtract = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");
        buttonEquals = new JButton("=");
        buttonClear = new JButton("C");

        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonDivide);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonMultiply);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonSubtract);
        panel.add(buttonClear);
        panel.add(button0);
        panel.add(buttonEquals);
        panel.add(buttonAdd);

        frame.add(display, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorUI();
    }
}
