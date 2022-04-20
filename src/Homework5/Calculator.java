package Homework5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class Calculator extends JFrame implements ActionListener {

    private JPanel contentPane;
    public final String NONE = "none";
    private String num1;
    private String num2;
    private String res;
    private String operator;
    private DefaultListModel<String> listData;
    private JTextField textField;
    final JList<String> list;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculator frame = new Calculator();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */

    public Calculator() {
        num1 = NONE;
        num2 = NONE;
        res = NONE;
        operator = NONE;
        listData = new DefaultListModel<String>();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(12, 41, 312, 210);
        contentPane.add(panel);
        panel.setLayout(new GridLayout(4, 5, 0, 0));

        JButton button_7 = new JButton("7");
        panel.add(button_7);
        button_7.addActionListener(this);

        JButton button_8 = new JButton("8");
        panel.add(button_8);
        button_8.addActionListener(this);

        JButton button_9 = new JButton("9");
        panel.add(button_9);
        button_9.addActionListener(this);

        JButton button_10 = new JButton("+");
        panel.add(button_10);
        button_10.addActionListener(this);

        JButton button_11 = new JButton("C");
        panel.add(button_11);
        button_11.addActionListener(this);

        JButton button_4 = new JButton("4");
        panel.add(button_4);

        JButton button_5 = new JButton("5");
        panel.add(button_5);

        JButton button_6 = new JButton("6");
        panel.add(button_6);

        JButton button_12 = new JButton("-");
        panel.add(button_12);
        button_12.addActionListener(this);

        JButton button_13 = new JButton("CE");
        panel.add(button_13);
        button_13.addActionListener(this);

        JButton button_1 = new JButton("1");
        panel.add(button_1);
        button_1.addActionListener(this);

        JButton button_2 = new JButton("2");
        panel.add(button_2);
        button_2.addActionListener(this);

        JButton button_3 = new JButton("3");
        panel.add(button_3);
        button_3.addActionListener(this);

        JButton button_14 = new JButton("*");
        panel.add(button_14);

        JButton button_15 = new JButton("M");
        panel.add(button_15);

        JButton button_0 = new JButton("0");
        panel.add(button_0);

        button_0.addActionListener(this);

        JButton button_16 = new JButton(".");
        panel.add(button_16);

        JButton button_17 = new JButton("=");
        panel.add(button_17);

        JButton button_18 = new JButton("/");
        panel.add(button_18);

        JButton button_19 = new JButton("ME");
        panel.add(button_19);
        button_4.addActionListener(this);
        button_5.addActionListener(this);
        button_6.addActionListener(this);
        button_14.addActionListener(this);
        button_15.addActionListener(this);
        button_16.addActionListener(this);
        button_17.addActionListener(this);
        button_18.addActionListener(this);
        button_19.addActionListener(this);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(326, 41, 96, 210);
        contentPane.add(scrollPane);

        list = new JList<String>(listData);
        scrollPane.setViewportView(list);
        list.ensureIndexIsVisible(list.getSelectedIndex());
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent arg0) {
                // get the object on which the event occurred
                JList<?> lst = (JList<?>) arg0.getSource();
                try {
                    // try to convert to integer
                    String str = listData.getElementAt(lst.getSelectedIndex());
                    Integer.parseInt(str);
                    textField.setText(str);
                } catch (NumberFormatException e) {
                    // do nothing
                }
            }
        });

        textField = new JTextField();
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (c >= '0' && c <= '9') {
                    // textField.setText(textField.getText() + c);
                } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                    if (num1 == NONE || textField.getText() != res) {
                        num1 = textField.getText();
                        listData.addElement(num1);
                        list.ensureIndexIsVisible(list.getModel().getSize() - 1);
                        textField.setText("");
                    } else if (textField.getText().equals("")) {

                    } else {
                        num2 = textField.getText();
                        textField.setText("");
                        res = doMath(num1, String.valueOf(c), num2);
                        listData.addElement(operator);
                        listData.addElement(num2);
                        list.ensureIndexIsVisible(list.getModel().getSize() - 1);
                        num1 = res;
                        num2 = "";
                    }
                    operator = String.valueOf(c);
                    e.consume();
                } else if (c == KeyEvent.VK_ENTER) {
                    num2 = textField.getText();
                    res = doMath(num1, operator, num2);
                    listData.addElement(operator);
                    listData.addElement(num2);
                    num1 = res;
                    num2 = "";
                    textField.setText(res);
                    listData.addElement("=");
                    listData.addElement(res);
                    list.ensureIndexIsVisible(list.getModel().getSize() - 1);
                    operator = "=";
                    e.consume();
                } else {
                    e.consume();
                }

            }
        });
        textField.setBounds(12, 10, 410, 21);
        contentPane.add(textField);
        textField.setColumns(10);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // Get the string from the button
        String s = ae.getActionCommand();
        // Check if the button is number
        if (s.compareToIgnoreCase("0") >= 0 && s.compareToIgnoreCase("9") <= 0) {
            textField.setText(textField.getText() + s);
        }
        // Check if the button is operator
        else if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            if (num1 == NONE || (!textField.getText().equals("") && (textField.getText() != res) && (res != NONE))) {
                num1 = textField.getText();
                listData.addElement(num1);
                list.ensureIndexIsVisible(list.getModel().getSize() - 1);
                textField.setText("");
            } else if (textField.getText().equals("")) {
                operator = s;

            } else {
                num2 = textField.getText();
                textField.setText("");
                res = doMath(num1, operator, num2);
                listData.addElement(operator);
                listData.addElement(num2);
                list.ensureIndexIsVisible(list.getModel().getSize() - 1);
                num1 = res;
                num2 = "";
            }
            operator = s;
        } else if (s.equals("=")) {
            num2 = textField.getText();
            res = doMath(num1, operator, num2);
            listData.addElement(operator);
            listData.addElement(num2);
            num1 = res;
            num2 = "";
            textField.setText(res);
            listData.addElement(s);
            listData.addElement(res);
            list.ensureIndexIsVisible(list.getModel().getSize() - 1);

            operator = s;
        } else if (s.equals("C")) {
            num1 = NONE;
            num2 = "";
            operator = "";
            textField.setText("");

        } else if (s.equals("CE")) {
            DefaultListModel<String> listModel = (DefaultListModel<String>) list.getModel();
            listModel.removeAllElements();
            textField.setText("");
            num1 = NONE;
            num2 = "";
            operator = "";
        }
    }

    /**
     * Do the operator and return the value in String.
     * 
     * @param num1 1st number
     * @param num2 2nd number
     * @param op the operator
     * @return result
     */
    private String doMath(String num1, String op, String num2) {
        // convert to number
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        // do the operator
        switch (op) {
            case "+":
                number1 = number1 + number2;
                break;
            case "-":
                number1 = number1 - number2;
                break;
            case "*":
                number1 = number1 * number2;
                break;
            case "/":
                number1 = number1 / number2;
                break;
            default:
                break;
        }

        // convert to string and return it
        return ("" + number1);
    }
}
