package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private JPanel myPanel;
    private JButton a0Button;
    private JButton modbtn;
    private JButton noktabtn;
    private JButton esitbtn;
    private JTextField textField1;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton sonsilbtn;
    private JButton a00Button;
    private JButton sifirlabtn;
    private JButton toplabtn;
    private JButton a8Button;
    private JButton a7Button;
    private JButton cikarbtn;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton carpbtn;
    private JButton bolbtn;
    char operation;

    public static void main(String args[])
    {
        JFrame f = new JFrame("Calculator");
        f.setTitle("My Calculator");
        f.setContentPane(new Calculator().myPanel);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);


    }

    Calculator()
    {


        a0Button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
                  textField1.setText(textField1.getText() + "0");
           }
       });

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText(textField1.getText() + "1");
            }
        });

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText(textField1.getText() + "2");
            }
        });

        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText(textField1.getText() + "3");
            }
        });

        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText(textField1.getText() + "4");
            }
        });

        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText(textField1.getText() + "5");
            }
        });

        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText(textField1.getText() + "6");
            }
        });

        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText(textField1.getText() + "7");
            }
        });

        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText(textField1.getText() + "8");
            }
        });

        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText(textField1.getText() + "9");
            }
        });


        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText(textField1.getText() + "00");
            }
        });

        noktabtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText(textField1.getText() + ".");
            }
        });

        sifirlabtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText("");
            }
        });



        //İslemler

        modbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText(textField1.getText() + "%");
                operation = '%';
            }
        });

        bolbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText(textField1.getText() + "/");
                operation = '/';
            }
        });

        toplabtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText(textField1.getText() + "+");
                operation = '+';
            }
        });

        cikarbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField1.setText(textField1.getText() + "-");
                operation = '-';
            }
        });

        carpbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operation = '*';
                textField1.setText(textField1.getText() + "*");
            }
        });



        sonsilbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if(textField1.getText().length() > 0)
                    textField1.setText(textField1.getText().substring(0,textField1.getText().length() - 1));

            }
        });

        esitbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {


                textField1.setText(textField1.getText() + "=");

                //İslemler Burada Yapılacak.
            }
        });






    }

}
