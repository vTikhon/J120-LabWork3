package ru.avalon.vergentev.j120.labwork3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import static java.awt.GridBagConstraints.*;

public class Game extends JFrame implements MouseListener {
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button10 = new JButton("10");
    JButton button11 = new JButton("11");
    JButton button12 = new JButton("12");
    JButton button13 = new JButton("13");
    JButton button14 = new JButton("14");
    JButton button15 = new JButton("15");
    JButton button16 = new JButton("16");

    public Game () {
        super("Tikhon's Game15");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 400);
        getContentPane().setBackground(new Color(200,200,200));
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        GridBagConstraints button1Position = new GridBagConstraints(0,0,1,1,1,1,1,1, new Insets(0,0,0,0),1,1);
        button1.addMouseListener(this);
        add(button1, button1Position);
        GridBagConstraints button2Position = new GridBagConstraints(0,1,1,1,1,1,1,1, new Insets(0,0,0,0),1,1);
        button2.addMouseListener(this);
        add(button2, button2Position);
        GridBagConstraints button3Position = new GridBagConstraints(0,2,1,1,1,1,1,1, new Insets(0,0,0,0),1,1);
        button3.addMouseListener(this);
        add(button3, button3Position);
        GridBagConstraints button4Position = new GridBagConstraints(0,3,1,1,1,1,1,1, new Insets(0,0,0,0),1,1);
        button4.addMouseListener(this);
        add(button4, button4Position);
        GridBagConstraints button5Position = new GridBagConstraints(1,0,1,1,1,1,1,1, new Insets(0,0,0,0),1,1);
        button5.addMouseListener(this);
        add(button5, button5Position);
        GridBagConstraints button6Position = new GridBagConstraints(1,1,1,1,1,1,1,1, new Insets(0,0,0,0),1,1);
        button6.addMouseListener(this);
        add(button6, button6Position);
        GridBagConstraints button7Position = new GridBagConstraints(1,2,1,1,1,1,1,1, new Insets(0,0,0,0),1,1);
        button7.addMouseListener(this);
        add(button7, button7Position);
        GridBagConstraints button8Position = new GridBagConstraints(1,3,1,1,1,1,1,1, new Insets(0,0,0,0),1,1);
        button8.addMouseListener(this);
        add(button8, button8Position);
        GridBagConstraints button9Position = new GridBagConstraints(2,0,1,1,1,1,1,1, new Insets(0,0,0,0),1,1);
        button9.addMouseListener(this);
        add(button9, button9Position);
        GridBagConstraints button10Position = new GridBagConstraints(2,1,1,1,1,1,1,1, new Insets(0,0,0,0),1,1);
        button10.addMouseListener(this);
        add(button10, button10Position);
        GridBagConstraints button11Position = new GridBagConstraints(2,2,1,1,1,1,1,1, new Insets(0,0,0,0),1,1);
        button11.addMouseListener(this);
        add(button11, button11Position);
        GridBagConstraints button12Position = new GridBagConstraints(2,3,1,1,1,1,1,1, new Insets(0,0,0,0),1,1);
        button12.addMouseListener(this);
        add(button12, button12Position);
        GridBagConstraints button13Position = new GridBagConstraints(3,0,1,1,1,1,1,1, new Insets(0,0,0,0),1,1);
        button13.addMouseListener(this);
        add(button13, button13Position);
        GridBagConstraints button14Position = new GridBagConstraints(3,1,1,1,1,1,1,1, new Insets(0,0,0,0),1,1);
        button14.addMouseListener(this);
        add(button14, button14Position);
        GridBagConstraints button15Position = new GridBagConstraints(3,2,1,1,1,1,1,1, new Insets(0,0,0,0),1,1);
        button15.addMouseListener(this);
        add(button15, button15Position);
        GridBagConstraints button16Position = new GridBagConstraints(3,3,1,1,1,1,1,1, new Insets(0,0,0,0),1,1);
        button16.addMouseListener(this);
        add(button16, button16Position);
    }



    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
