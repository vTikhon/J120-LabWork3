package ru.avalon.vergentev.j120.labwork3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Game extends JFrame implements MouseMotionListener {
    JButton[] button = new JButton[15];
    String titleOfButton;
    int x, y, xEmpty, yEmpty, width, height;

    public Game () {
        super("Tikhon's Game15");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(416, 440);
        getContentPane().setBackground(new Color(180,180,180));
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4,4));
//        setLayout(null);
        initializationButtons();
    }

    //METHODS
    public void initializationButtons () {
        for (int i = 0; i < button.length; i++) {
            titleOfButton = Integer.toString(i+1);
            button[i] = new JButton(titleOfButton);
            button[i].setFont(new Font("Segoe UI", Font.BOLD, 40));
            button[i].setBackground(new Color(255,255,255));
//            button[i].setLocation(0, 0);
            button[i].setSize(100, 100);
            button[i].addMouseMotionListener(this);
            add(button[i]);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        for (JButton i : button) {
            if (e.getSource() == i) algorithmIfButtonIsPushed(i);
        }
    }
    @Override
    public void mouseMoved(MouseEvent e) {

    }

    public void algorithmIfButtonIsPushed (JButton buttonPushed) {
        //move buttons on discrete positions
        int mousePositionX = ((int) getMousePosition().getX() / 100) * 100;
        int mousePositionY = ((int) getMousePosition().getY() / 100) * 100;
        buttonPushed.setLocation(mousePositionX, mousePositionY);

    }



//    @Override
//    public void actionPerformed(ActionEvent e) {
//        for (JButton i : button) {
//            if (e.getSource() == i) algorithmIfButtonIsPushed(i);
//        }
//    }


//    public void algorithmIfButtonIsPushed (JButton buttonPushed) {
//        //searching coordinates of the empty button
//        for (int n = 0; n < 4; n++) {
//            for (int m = 0; m < 4; m++) {
//                for (JButton i : button) {
//                    x = (i.getX()) / i.getWidth();
//                    y = (i.getY()) / i.getHeight();
//                    if (n != x) {
//                        xEmpty = n*buttonPushed.getWidth();
//                    } else if (m != y) {
//                        yEmpty = m*buttonPushed.getHeight();
//                    }
//            }
//        }
//        }
//        System.out.println("old x, y = " + buttonPushed.getX() + ", " + buttonPushed.getY());
//        System.out.println("Empty " + xEmpty + ", " + yEmpty);
//        buttonPushed.setLocation(xEmpty, yEmpty);
//        System.out.println("new x, y = " + buttonPushed.getX() + ", " + buttonPushed.getY());
//
//        for (int n = 0; n < 4; n++) {
//            for (int m = 0; m < 4; m++) {
//                for (JButton i : button) {
//                    x = (i.getX()) / i.getWidth();
//                    y = (i.getY()) / i.getHeight();
//                    if (n != x) {
//                        xEmpty = n*buttonPushed.getWidth();
//                    } else if (m != y) {
//                        yEmpty = m*buttonPushed.getHeight();
//                    }
//                }
//            }
//        }
//        System.out.println("Empty " + xEmpty + ", " + yEmpty);
//    }





}
