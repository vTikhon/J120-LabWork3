package ru.avalon.vergentev.j120.labwork3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import static java.awt.GridBagConstraints.*;

public class Game extends JFrame implements MouseMotionListener {
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

        GridBagConstraints button1Position = new GridBagConstraints(0,0,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        button1.addMouseMotionListener(this);
        add(button1, button1Position);
        button1.setFont(new Font("Segoe UI", Font.BOLD, 40));

        GridBagConstraints button2Position = new GridBagConstraints(0,1,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        button2.addMouseMotionListener(this);
        add(button2, button2Position);
        button2.setFont(new Font("Segoe UI", Font.BOLD, 40));

        GridBagConstraints button3Position = new GridBagConstraints(0,2,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        button3.addMouseMotionListener(this);
        add(button3, button3Position);
        button3.setFont(new Font("Segoe UI", Font.BOLD, 40));

        GridBagConstraints button4Position = new GridBagConstraints(0,3,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        button4.addMouseMotionListener(this);
        add(button4, button4Position);
        button4.setFont(new Font("Segoe UI", Font.BOLD, 40));

        GridBagConstraints button5Position = new GridBagConstraints(1,0,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        button5.addMouseMotionListener(this);
        add(button5, button5Position);
        button5.setFont(new Font("Segoe UI", Font.BOLD, 40));

        GridBagConstraints button6Position = new GridBagConstraints(1,1,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        button6.addMouseMotionListener(this);
        add(button6, button6Position);
        button6.setFont(new Font("Segoe UI", Font.BOLD, 40));

        GridBagConstraints button7Position = new GridBagConstraints(1,2,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        button7.addMouseMotionListener(this);
        add(button7, button7Position);
        button7.setFont(new Font("Segoe UI", Font.BOLD, 40));

        GridBagConstraints button8Position = new GridBagConstraints(1,3,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        button8.addMouseMotionListener(this);
        add(button8, button8Position);
        button8.setFont(new Font("Segoe UI", Font.BOLD, 40));

        GridBagConstraints button9Position = new GridBagConstraints(2,0,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        button9.addMouseMotionListener(this);
        add(button9, button9Position);
        button9.setFont(new Font("Segoe UI", Font.BOLD, 40));

        GridBagConstraints button10Position = new GridBagConstraints(2,1,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        button10.addMouseMotionListener(this);
        add(button10, button10Position);
        button10.setFont(new Font("Segoe UI", Font.BOLD, 40));

        GridBagConstraints button11Position = new GridBagConstraints(2,2,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        button11.addMouseMotionListener(this);
        add(button11, button11Position);
        button11.setFont(new Font("Segoe UI", Font.BOLD, 40));

        GridBagConstraints button12Position = new GridBagConstraints(2,3,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        button12.addMouseMotionListener(this);
        add(button12, button12Position);
        button12.setFont(new Font("Segoe UI", Font.BOLD, 40));

        GridBagConstraints button13Position = new GridBagConstraints(3,0,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        button13.addMouseMotionListener(this);
        add(button13, button13Position);
        button13.setFont(new Font("Segoe UI", Font.BOLD, 40));

        GridBagConstraints button14Position = new GridBagConstraints(3,1,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        button14.addMouseMotionListener(this);
        add(button14, button14Position);
        button14.setFont(new Font("Segoe UI", Font.BOLD, 40));

        GridBagConstraints button15Position = new GridBagConstraints(3,2,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        button15.addMouseMotionListener(this);
        add(button15, button15Position);
        button15.setFont(new Font("Segoe UI", Font.BOLD, 40));
    }


    //METHODS
    @Override
    public void mouseDragged(MouseEvent e) {
        if      (e.getSource() == button1) algorithmIfButtonIsPushed(button1);
        else if (e.getSource() == button2) algorithmIfButtonIsPushed(button2);
        else if (e.getSource() == button3) algorithmIfButtonIsPushed(button3);
        else if (e.getSource() == button4) algorithmIfButtonIsPushed(button4);
        else if (e.getSource() == button5) algorithmIfButtonIsPushed(button5);
        else if (e.getSource() == button6) algorithmIfButtonIsPushed(button6);
        else if (e.getSource() == button7) algorithmIfButtonIsPushed(button7);
        else if (e.getSource() == button8) algorithmIfButtonIsPushed(button8);
        else if (e.getSource() == button9) algorithmIfButtonIsPushed(button9);
        else if (e.getSource() == button10) algorithmIfButtonIsPushed(button10);
        else if (e.getSource() == button11) algorithmIfButtonIsPushed(button11);
        else if (e.getSource() == button12) algorithmIfButtonIsPushed(button12);
        else if (e.getSource() == button13) algorithmIfButtonIsPushed(button13);
        else if (e.getSource() == button14) algorithmIfButtonIsPushed(button14);
        else if (e.getSource() == button15) algorithmIfButtonIsPushed(button15);
    }

    public void algorithmIfButtonIsPushed (JButton button) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }


//    public void mouseDragged( MouseEvent event )
//    {
//        statusBar.setText( String.format( "Dragged at [%d, %d]",
//                event.getX(), event.getY() ) );
//    }
//
//
//    public void mouseMoved( MouseEvent event )
//    {
//        statusBar.setText( String.format( "Moved at [%d, %d]",
//                event.getX(), event.getY() ) );
//    }

}
