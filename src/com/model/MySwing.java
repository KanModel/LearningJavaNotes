package com.model;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kgdwhsk on 2016/7/29.
 */
public class MySwing extends JFrame {
    private JLabel l1;
    private JButton
            bu1 = new JButton("换字大法"),
            bu2 = new JButton("b2");
    private JTextField t1 = new JTextField(10);

    class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
//            String n = ((JButton)e.getSource()).getText();
            String n = t1.getText();
//            l1.setText(n);
            if(n.length() == 0b0){
                l1.setText("你什么也没给我");
            }else {
                l1.setText(n);
            }
        }
    }
    private ButtonListener bl = new ButtonListener();

    public MySwing(){
        super("This is my Swing!");
        l1 = new JLabel("a lable");
        add(l1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,500);
        bu1.addActionListener(bl);
        bu2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            t1.setText("");
            }
        });
        setLayout(new FlowLayout());
        add(bu1);
        add(t1);
        add(bu2);

        setVisible(true);
    }

    public JLabel getL1() {
        return l1;
    }
}
