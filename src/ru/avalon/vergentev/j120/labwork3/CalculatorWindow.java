package ru.avalon.vergentev.j120.labwork3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorWindow extends JFrame {
    JButton buttonFree1 = new JButton("");
    JButton buttonFree2 = new JButton("");
    JButton buttonFree3 = new JButton("");
    JButton buttonFree4 = new JButton("");
    JButton buttonFree5 = new JButton("");
    JButton buttonFree6 = new JButton("");
    JButton buttonPoint = new JButton(".");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonAddition = new JButton("+");
    JButton buttonSubtraction = new JButton("-");
    JButton buttonMultiplication = new JButton("\u00D7");
    JButton buttonDivision = new JButton("\u00F7");
    JButton buttonEquals = new JButton("=");
    JButton buttonPlusMinus = new JButton("+/-");
    JButton buttonClean = new JButton("C");
    String pole1String = "";
    String pole2String = "0";
    JLabel textLabel1 = new JLabel(pole1String, SwingConstants.RIGHT);
    JLabel textLabel2 = new JLabel(pole2String, SwingConstants.RIGHT);
    double pole1Double;
    double pole2Double;
    int pole1Integer;
    int pole2Integer;
    CalculatorAction calculation = new CalculatorAction();


    public CalculatorWindow() {
        super("Калькулятор Тихона");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(340, 550);
        getContentPane().setBackground(new Color(186,186,186));
        setResizable(true);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        GridBagConstraints textLabel1Position = new GridBagConstraints();
        textLabel1Position.fill = GridBagConstraints.BOTH;
        textLabel1Position.weightx = 1;
        textLabel1Position.weighty = 1;
        textLabel1Position.gridx = 0;
        textLabel1Position.gridy = 0;
        textLabel1Position.gridheight = 1;
        textLabel1Position.gridwidth = 4;
//        textLabel1Position.ipadx = 0;
//        textLabel1Position.ipady = 40;
        textLabel1.setForeground(new Color(40, 40, 40));
//        textLabel1.setBackground(new Color(0, 200, 0));
        textLabel1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 200)));
        textLabel1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
//        textLabel1.setBounds(10,40,100,25);
//        textLabel1.setSize(400, 400);
        add(textLabel1, textLabel1Position);

        GridBagConstraints textLabel2Position = new GridBagConstraints();
        textLabel2Position.fill = GridBagConstraints.BOTH;
        textLabel2Position.weightx = 1;
        textLabel2Position.weighty = 1;
        textLabel2Position.gridx = 0;
        textLabel2Position.gridy = 1;
        textLabel2Position.gridheight = 2;
        textLabel2Position.gridwidth = 4;
        textLabel2Position.ipadx = 0;
        textLabel2Position.ipady = 60;
        textLabel2.setForeground(new Color(0, 0, 0));
//        textLabel2.setBackground(new Color(200, 0, 0));
        textLabel2.setBorder(BorderFactory.createLineBorder(new Color(200, 0, 0)));
        textLabel2.setForeground(Color.black);
//        textLabel2.setColor(Color.RED);
//        Font label2Font = textLabel2.getFont();
//        String label2Text = textLabel2.getText();
//        int stringWidthLabel2 = textLabel2.getFontMetrics(label2Font).stringWidth(label2Text);
//        int componentWidthLabel2 = textLabel2.getWidth();
//        double widthRatioLabel2 = (double)componentWidthLabel2 / (double)stringWidthLabel2;
//        int newFontSizeLabel2 = (int)(label2Font.getSize() * widthRatioLabel2);
//        int componentHeightLabel2 = textLabel2.getHeight();
//        int fontSizeToUseLabel2 = Math.min(newFontSizeLabel2, componentHeightLabel2);
        textLabel2.setFont(new Font("Segoe UI", Font.BOLD, 47));
        add(textLabel2, textLabel2Position);

        GridBagConstraints buttonFree1Position = new GridBagConstraints();
        buttonFree1Position.fill = GridBagConstraints.BOTH;
        buttonFree1Position.weightx = 1;
        buttonFree1Position.weighty = 1;
        buttonFree1Position.gridx = 0;
        buttonFree1Position.gridy = 4;
        buttonFree1Position.gridheight = 1;
        buttonFree1Position.gridwidth = 1;
        add(buttonFree1, buttonFree1Position);
        buttonFree1.setBackground(new Color(225,225,225));
        buttonFree1.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonFree2Position = new GridBagConstraints();
        buttonFree2Position.fill = GridBagConstraints.BOTH;
        buttonFree2Position.weightx = 1;
        buttonFree2Position.weighty = 1;
        buttonFree2Position.gridx = 1;
        buttonFree2Position.gridy = 4;
        buttonFree2Position.gridheight = 1;
        buttonFree2Position.gridwidth = 1;
        add(buttonFree2, buttonFree2Position);
        buttonFree2.setBackground(new Color(225,225,225));
        buttonFree2.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonCleanPosition = new GridBagConstraints();
        buttonCleanPosition.fill = GridBagConstraints.BOTH;
        buttonCleanPosition.weightx = 1;
        buttonCleanPosition.weighty = 1;
        buttonCleanPosition.gridx = 2;
        buttonCleanPosition.gridy = 4;
        buttonCleanPosition.gridheight = 1;
        buttonCleanPosition.gridwidth = 1;
        add(buttonClean, buttonCleanPosition);
        buttonClean.addActionListener(calculation);
        buttonClean.setBackground(new Color(225,225,225));
        buttonClean.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonFree3Position = new GridBagConstraints();
        buttonFree3Position.fill = GridBagConstraints.BOTH;
        buttonFree3Position.weightx = 1;
        buttonFree3Position.weighty = 1;
        buttonFree3Position.gridx = 3;
        buttonFree3Position.gridy = 4;
        buttonFree3Position.gridheight = 1;
        buttonFree3Position.gridwidth = 1;
        add(buttonFree3, buttonFree3Position);
        buttonFree3.setBackground(new Color(225,225,225));
        buttonFree3.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonFree4Position = new GridBagConstraints();
        buttonFree4Position.fill = GridBagConstraints.BOTH;
        buttonFree4Position.weightx = 1;
        buttonFree4Position.weighty = 1;
        buttonFree4Position.gridx = 0;
        buttonFree4Position.gridy = 5;
        buttonFree4Position.gridheight = 1;
        buttonFree4Position.gridwidth = 1;
        add(buttonFree4, buttonFree4Position);
        buttonFree4.setBackground(new Color(225,225,225));
        buttonFree4.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonFree5Position = new GridBagConstraints();
        buttonFree5Position.fill = GridBagConstraints.BOTH;
        buttonFree5Position.weightx = 1;
        buttonFree5Position.weighty = 1;
        buttonFree5Position.gridx = 1;
        buttonFree5Position.gridy = 5;
        buttonFree5Position.gridheight = 1;
        buttonFree5Position.gridwidth = 1;
        add(buttonFree5, buttonFree5Position);
        buttonFree5.setBackground(new Color(225,225,225));
        buttonFree5.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonFree6Position = new GridBagConstraints();
        buttonFree6Position.fill = GridBagConstraints.BOTH;
        buttonFree6Position.weightx = 1;
        buttonFree6Position.weighty = 1;
        buttonFree6Position.gridx = 2;
        buttonFree6Position.gridy = 5;
        buttonFree6Position.gridheight = 1;
        buttonFree6Position.gridwidth = 1;
        add(buttonFree6, buttonFree6Position);
        buttonFree6.setBackground(new Color(225,225,225));
        buttonFree6.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonDivisionPosition = new GridBagConstraints();
        buttonDivisionPosition.fill = GridBagConstraints.BOTH;
        buttonDivisionPosition.weightx = 1;
        buttonDivisionPosition.weighty = 1;
        buttonDivisionPosition.gridx = 3;
        buttonDivisionPosition.gridy = 5;
        buttonDivisionPosition.gridheight = 1;
        buttonDivisionPosition.gridwidth = 1;
        add(buttonDivision, buttonDivisionPosition);
        buttonDivision.addActionListener(calculation);
        buttonDivision.setBackground(new Color(225,225,225));
        buttonDivision.setFont(new Font("Segoe UI", Font.PLAIN, 27));

        GridBagConstraints buttonSevenPosition = new GridBagConstraints();
        buttonSevenPosition.fill = GridBagConstraints.BOTH;
        buttonSevenPosition.weightx = 1;
        buttonSevenPosition.weighty = 1;
        buttonSevenPosition.gridx = 0;
        buttonSevenPosition.gridy = 6;
        buttonSevenPosition.gridheight = 1;
        buttonSevenPosition.gridwidth = 1;
        add(buttonSeven, buttonSevenPosition);
        buttonSeven.addActionListener(calculation);
        buttonSeven.setBackground(Color.WHITE);
        buttonSeven.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonEightPosition = new GridBagConstraints();
        buttonEightPosition.fill = GridBagConstraints.BOTH;
        buttonEightPosition.weightx = 1;
        buttonEightPosition.weighty = 1;
        buttonEightPosition.gridx = 1;
        buttonEightPosition.gridy = 6;
        buttonEightPosition.gridheight = 1;
        buttonEightPosition.gridwidth = 1;
        add(buttonEight, buttonEightPosition);
        buttonEight.addActionListener(calculation);
        buttonEight.setBackground(Color.WHITE);
        buttonEight.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonNinePosition = new GridBagConstraints();
        buttonNinePosition.fill = GridBagConstraints.BOTH;
        buttonNinePosition.weightx = 1;
        buttonNinePosition.weighty = 1;
        buttonNinePosition.gridx = 2;
        buttonNinePosition.gridy = 6;
        buttonNinePosition.gridheight = 1;
        buttonNinePosition.gridwidth = 1;
        add(buttonNine, buttonNinePosition);
        buttonNine.addActionListener(calculation);
        buttonNine.setBackground(Color.WHITE);
        buttonNine.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonMultiplicationPosition = new GridBagConstraints();
        buttonMultiplicationPosition.fill = GridBagConstraints.BOTH;
        buttonMultiplicationPosition.weightx = 1;
        buttonMultiplicationPosition.weighty = 1;
        buttonMultiplicationPosition.gridx = 3;
        buttonMultiplicationPosition.gridy = 6;
        buttonMultiplicationPosition.gridheight = 1;
        buttonMultiplicationPosition.gridwidth = 1;
        add(buttonMultiplication, buttonMultiplicationPosition);
        buttonMultiplication.addActionListener(calculation);
        buttonMultiplication.setBackground(new Color(225,225,225));
        buttonMultiplication.setFont(new Font("Segoe UI", Font.PLAIN, 27));

        GridBagConstraints buttonFourPosition = new GridBagConstraints();
        buttonFourPosition.fill = GridBagConstraints.BOTH;
        buttonFourPosition.weightx = 1;
        buttonFourPosition.weighty = 1;
        buttonFourPosition.gridx = 0;
        buttonFourPosition.gridy = 7;
        buttonFourPosition.gridheight = 1;
        buttonFourPosition.gridwidth = 1;
        add(buttonFour, buttonFourPosition);
        buttonFour.addActionListener(calculation);
        buttonFour.setBackground(Color.WHITE);
        buttonFour.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonFivePosition = new GridBagConstraints();
        buttonFivePosition.fill = GridBagConstraints.BOTH;
        buttonFivePosition.weightx = 1;
        buttonFivePosition.weighty = 1;
        buttonFivePosition.gridx = 1;
        buttonFivePosition.gridy = 7;
        buttonFivePosition.gridheight = 1;
        buttonFivePosition.gridwidth = 1;
        add(buttonFive, buttonFivePosition);
        buttonFive.addActionListener(calculation);
        buttonFive.setBackground(Color.WHITE);
        buttonFive.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonSixPosition = new GridBagConstraints();
        buttonSixPosition.fill = GridBagConstraints.BOTH;
        buttonSixPosition.weightx = 1;
        buttonSixPosition.weighty = 1;
        buttonSixPosition.gridx = 2;
        buttonSixPosition.gridy = 7;
        buttonSixPosition.gridheight = 1;
        buttonSixPosition.gridwidth = 1;
        add(buttonSix, buttonSixPosition);
        buttonSix.addActionListener(calculation);
        buttonSix.setBackground(Color.WHITE);
        buttonSix.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonSubtractionPosition = new GridBagConstraints();
        buttonSubtractionPosition.fill = GridBagConstraints.BOTH;
        buttonSubtractionPosition.weightx = 1;
        buttonSubtractionPosition.weighty = 1;
        buttonSubtractionPosition.gridx = 3;
        buttonSubtractionPosition.gridy = 7;
        buttonSubtractionPosition.gridheight = 1;
        buttonSubtractionPosition.gridwidth = 1;
        add(buttonSubtraction, buttonSubtractionPosition);
        buttonSubtraction.addActionListener(calculation);
        buttonSubtraction.setBackground(new Color(225,225,225));
        buttonSubtraction.setFont(new Font("Segoe UI", Font.PLAIN, 27));

        GridBagConstraints buttonOnePosition = new GridBagConstraints();
        buttonOnePosition.fill = GridBagConstraints.BOTH;
        buttonOnePosition.weightx = 1;
        buttonOnePosition.weighty = 1;
        buttonOnePosition.gridx = 0;
        buttonOnePosition.gridy = 8;
        buttonOnePosition.gridheight = 1;
        buttonOnePosition.gridwidth = 1;
        add(buttonOne, buttonOnePosition);
        buttonOne.addActionListener(calculation);
        buttonOne.setBackground(Color.WHITE);
        buttonOne.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonTwoPosition = new GridBagConstraints();
        buttonTwoPosition.fill = GridBagConstraints.BOTH;
        buttonTwoPosition.weightx = 1;
        buttonTwoPosition.weighty = 1;
        buttonTwoPosition.gridx = 1;
        buttonTwoPosition.gridy = 8;
        buttonTwoPosition.gridheight = 1;
        buttonTwoPosition.gridwidth = 1;
        add(buttonTwo, buttonTwoPosition);
        buttonTwo.addActionListener(calculation);
        buttonTwo.setBackground(Color.WHITE);
        buttonTwo.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonThreePosition = new GridBagConstraints();
        buttonThreePosition.fill = GridBagConstraints.BOTH;
        buttonThreePosition.weightx = 1;
        buttonThreePosition.weighty = 1;
        buttonThreePosition.gridx = 2;
        buttonThreePosition.gridy = 8;
        buttonThreePosition.gridheight = 1;
        buttonThreePosition.gridwidth = 1;
        add(buttonThree, buttonThreePosition);
        buttonThree.addActionListener(calculation);
        buttonThree.setBackground(Color.WHITE);
        buttonThree.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonAdditionPosition = new GridBagConstraints();
        buttonAdditionPosition.fill = GridBagConstraints.BOTH;
        buttonAdditionPosition.weightx = 1;
        buttonAdditionPosition.weighty = 1;
        buttonAdditionPosition.gridx = 3;
        buttonAdditionPosition.gridy = 8;
        buttonAdditionPosition.gridheight = 1;
        buttonAdditionPosition.gridwidth = 1;
        add(buttonAddition, buttonAdditionPosition);
        buttonAddition.addActionListener(calculation);
        buttonAddition.setBackground(new Color(225,225,225));
        buttonAddition.setFont(new Font("Segoe UI", Font.PLAIN, 27));

        GridBagConstraints buttonPlusMinusPosition = new GridBagConstraints();
        buttonPlusMinusPosition.fill = GridBagConstraints.BOTH;
        buttonPlusMinusPosition.weightx = 1;
        buttonPlusMinusPosition.weighty = 1;
        buttonPlusMinusPosition.gridx = 0;
        buttonPlusMinusPosition.gridy = 9;
        buttonPlusMinusPosition.gridheight = 1;
        buttonPlusMinusPosition.gridwidth = 1;
        add(buttonPlusMinus, buttonPlusMinusPosition);
        buttonPlusMinus.addActionListener(calculation);
        buttonPlusMinus.setBackground(Color.WHITE);
        buttonPlusMinus.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonZeroPosition = new GridBagConstraints();
        buttonZeroPosition.fill = GridBagConstraints.BOTH;
        buttonZeroPosition.weightx = 1;
        buttonZeroPosition.weighty = 1;
        buttonZeroPosition.gridx = 1;
        buttonZeroPosition.gridy = 9;
        buttonZeroPosition.gridheight = 1;
        buttonZeroPosition.gridwidth = 1;
        add(buttonZero, buttonZeroPosition);
        buttonZero.addActionListener(calculation);
        buttonZero.setBackground(Color.WHITE);
        buttonZero.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonPointPosition = new GridBagConstraints();
        buttonPointPosition.fill = GridBagConstraints.BOTH;
        buttonPointPosition.weightx = 1;
        buttonPointPosition.weighty = 1;
        buttonPointPosition.gridx = 2;
        buttonPointPosition.gridy = 9;
        buttonPointPosition.gridheight = 1;
        buttonPointPosition.gridwidth = 1;
        add(buttonPoint, buttonPointPosition);
        buttonPoint.addActionListener(calculation);
        buttonPoint.setBackground(Color.WHITE);
        buttonPoint.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonEqualsPosition = new GridBagConstraints();
        buttonEqualsPosition.fill = GridBagConstraints.BOTH;
        buttonEqualsPosition.weightx = 1;
        buttonEqualsPosition.weighty = 1;
        buttonEqualsPosition.gridx = 3;
        buttonEqualsPosition.gridy = 9;
        buttonEqualsPosition.gridheight = 1;
        buttonEqualsPosition.gridwidth = 1;
        add(buttonEquals, buttonEqualsPosition);
        buttonEquals.addActionListener(calculation);
        buttonEquals.setBackground(new Color(225,225,225));
        buttonEquals.setFont(new Font("Segoe UI", Font.PLAIN, 27));

    }


    public class CalculatorAction implements ActionListener {
        public void actionPerformed(ActionEvent userAction) {
            if (userAction.getSource() == buttonZero) {
                if (pole2String == "0") {
                    pole2String = "0";
                    textLabel2.setText(pole2String);
                } else {
                    pole2String = pole2String + "0";
                    textLabel2.setText(pole2String);
                }
            }
            if (userAction.getSource() == buttonOne) {
                if (pole2String == "0") {
                    pole2String = "1";
                    textLabel2.setText(pole2String);
                } else {
                    pole2String = pole2String + "1";
                    textLabel2.setText(pole2String);
                }
            }
            if (userAction.getSource() == buttonTwo) {
                if (pole2String == "0") {
                    pole2String = "2";
                    textLabel2.setText(pole2String);
                } else {
                    pole2String = pole2String + "2";
                    textLabel2.setText(pole2String);
                }
            }
            if (userAction.getSource() == buttonThree) {
                if (pole2String == "0") {
                    pole2String = "3";
                    textLabel2.setText(pole2String);
                } else {
                    pole2String = pole2String + "3";
                    textLabel2.setText(pole2String);
                }
            }
            if (userAction.getSource() == buttonFour) {
                if (pole2String == "0") {
                    pole2String = "4";
                    textLabel2.setText(pole2String);
                } else {
                    pole2String = pole2String + "4";
                    textLabel2.setText(pole2String);
                }
            }
            if (userAction.getSource() == buttonFive) {
                if (pole2String == "0") {
                    pole2String = "5";
                    textLabel2.setText(pole2String);
                } else {
                    pole2String = pole2String + "5";
                    textLabel2.setText(pole2String);
                }
            }
            if (userAction.getSource() == buttonSix) {
                if (pole2String == "0") {
                    pole2String = "6";
                    textLabel2.setText(pole2String);
                } else {
                    pole2String = pole2String + "6";
                    textLabel2.setText(pole2String);
                }
            }
            if (userAction.getSource() == buttonSeven) {
                if (pole2String == "0") {
                    pole2String = "7";
                    textLabel2.setText(pole2String);
                } else {
                    pole2String = pole2String + "7";
                    textLabel2.setText(pole2String);
                }
            }
            if (userAction.getSource() == buttonEight) {
                if (pole2String == "0") {
                    pole2String = "8";
                    textLabel2.setText(pole2String);
                } else {
                    pole2String = pole2String + "8";
                    textLabel2.setText(pole2String);
                }
            }
            if (userAction.getSource() == buttonNine) {
                if (pole2String == "0") {
                    pole2String = "9";
                    textLabel2.setText(pole2String);
                } else {
                    pole2String = pole2String + "9";
                    textLabel2.setText(pole2String);
                }
            }
            if (userAction.getSource() == buttonPoint) {
                if (pole2String.contains(".")) {
                    textLabel2.setText(pole2String);
                } else {
                    pole2String = pole2String + ".";
                    textLabel2.setText(pole2String);
                }
            }


            if (userAction.getSource() == buttonAddition) {
                if (pole1String.contains("+") && pole2String == "") {

                } else if (pole1String.contains("+") && pole2String != "") {
                    pole2Double = Double.parseDouble(pole2String);
                    pole1Double = pole1Double + pole2Double;
                    pole2Double = pole1Double;
                    if (pole1Double % 1 == 0) {
                        pole1Integer = (int) pole1Double;
                        pole1String = Integer.toString(pole1Integer);
                        pole2String = pole1String;
                        pole1String = pole1String + "+";
                        textLabel1.setText(pole1String);
                        textLabel2.setText(pole2String);
                        pole2String = "";
                    } else {
                        pole1String = Double.toString(pole1Double);
                        pole2String = pole1String;
                        pole1String = pole1String + "+";
                        textLabel1.setText(pole1String);
                        textLabel2.setText(pole2String);
                        pole2String = "";
                    }
                } else if (pole1String.contains("-") && pole2String == "") {
                    if (pole1Double % 1 == 0) {
                        pole1Integer = (int) pole1Double;
                        pole1String = Integer.toString(pole1Integer);
                        pole1String = pole1String + "+";
                        textLabel1.setText(pole1String);
                    } else {
                        pole1String = Double.toString(pole1Double);
                        pole1String = pole1String + "+";
                        textLabel1.setText(pole1String);
                    }
                } else if (pole1String.contains("\u00D7") && pole2String == "") {
                    if (pole1Double % 1 == 0) {
                        pole1Integer = (int) pole1Double;
                        pole1String = Integer.toString(pole1Integer);
                        pole1String = pole1String + "+";
                        textLabel1.setText(pole1String);
                    } else {
                        pole1String = Double.toString(pole1Double);
                        pole1String = pole1String + "+";
                        textLabel1.setText(pole1String);
                    }
                } else if (pole1String.contains("\u00F7") && pole2String == "") {
                    if (pole1Double % 1 == 0) {
                        pole1Integer = (int) pole1Double;
                        pole1String = Integer.toString(pole1Integer);
                        pole1String = pole1String + "+";
                        textLabel1.setText(pole1String);
                    } else {
                        pole1String = Double.toString(pole1Double);
                        pole1String = pole1String + "+";
                        textLabel1.setText(pole1String);
                    }
                } else {
                    pole1String = pole2String + "+";
                    textLabel1.setText(pole1String);
                    pole1Double = Double.parseDouble(pole2String);
                    textLabel2.setText(pole2String);
                    pole2String = "";
                }
            }


            if (userAction.getSource() == buttonSubtraction) {
                if (pole1String.contains("-") && pole2String == "") {

                } else if (pole1String.contains("-") && pole2String != "") {
                    pole2Double = Double.parseDouble(pole2String);
                    pole1Double = pole1Double - pole2Double;
                    pole2Double = pole1Double;
                    if (pole1Double % 1 == 0) {
                        pole1Integer = (int) pole1Double;
                        pole1String = Integer.toString(pole1Integer);
                        pole2String = pole1String;
                        pole1String = pole1String + "-";
                        textLabel1.setText(pole1String);
                        textLabel2.setText(pole2String);
                        pole2String = "";
                    } else {
                        pole1String = Double.toString(pole1Double);
                        pole2String = pole1String;
                        pole1String = pole1String + "-";
                        textLabel1.setText(pole1String);
                        textLabel2.setText(pole2String);
                        pole2String = "";
                    }
                } else if (pole1String.contains("+") && pole2String == "") {
                    if (pole1Double % 1 == 0) {
                        pole1Integer = (int) pole1Double;
                        pole1String = Integer.toString(pole1Integer);
                        pole1String = pole1String + "-";
                        textLabel1.setText(pole1String);
                    } else {
                        pole1String = Double.toString(pole1Double);
                        pole1String = pole1String + "-";
                        textLabel1.setText(pole1String);
                    }
                } else if (pole1String.contains("\u00D7") && pole2String == "") {
                    if (pole1Double % 1 == 0) {
                        pole1Integer = (int) pole1Double;
                        pole1String = Integer.toString(pole1Integer);
                        pole1String = pole1String + "-";
                        textLabel1.setText(pole1String);
                    } else {
                        pole1String = Double.toString(pole1Double);
                        pole1String = pole1String + "-";
                        textLabel1.setText(pole1String);
                    }
                } else if (pole1String.contains("\u00F7") && pole2String == "") {
                    if (pole1Double % 1 == 0) {
                        pole1Integer = (int) pole1Double;
                        pole1String = Integer.toString(pole1Integer);
                        pole1String = pole1String + "-";
                        textLabel1.setText(pole1String);
                    } else {
                        pole1String = Double.toString(pole1Double);
                        pole1String = pole1String + "-";
                        textLabel1.setText(pole1String);
                    }
                } else {
                    pole1String = pole2String + "-";
                    textLabel1.setText(pole1String);
                    pole1Double = Double.parseDouble(pole2String);
                    textLabel2.setText(pole2String);
                    pole2String = "";
                }
            }


            if (userAction.getSource() == buttonMultiplication) {
                if (pole1String.contains("\u00D7") && pole2String == "") {

                } else if (pole1String.contains("\u00D7") && pole2String != "") {
                    pole2Double = Double.parseDouble(pole2String);
                    pole1Double = pole1Double * pole2Double;
                    pole2Double = pole1Double;
                    if (pole1Double % 1 == 0) {
                        pole1Integer = (int) pole1Double;
                        pole1String = Integer.toString(pole1Integer);
                        pole2String = pole1String;
                        pole1String = pole1String + "\u00D7";
                        textLabel1.setText(pole1String);
                        textLabel2.setText(pole2String);
                        pole2String = "";
                    } else {
                        pole1String = Double.toString(pole1Double);
                        pole2String = pole1String;
                        pole1String = pole1String + "\u00D7";
                        textLabel1.setText(pole1String);
                        textLabel2.setText(pole2String);
                        pole2String = "";
                    }
                } else if (pole1String.contains("+") && pole2String == "") {
                    if (pole1Double % 1 == 0) {
                        pole1Integer = (int) pole1Double;
                        pole1String = Integer.toString(pole1Integer);
                        pole1String = pole1String + "\u00D7";
                        textLabel1.setText(pole1String);
                    } else {
                        pole1String = Double.toString(pole1Double);
                        pole1String = pole1String + "\u00D7";
                        textLabel1.setText(pole1String);
                    }
                } else if (pole1String.contains("-") && pole2String == "") {
                    if (pole1Double % 1 == 0) {
                        pole1Integer = (int) pole1Double;
                        pole1String = Integer.toString(pole1Integer);
                        pole1String = pole1String + "\u00D7";
                        textLabel1.setText(pole1String);
                    } else {
                        pole1String = Double.toString(pole1Double);
                        pole1String = pole1String + "\u00D7";
                        textLabel1.setText(pole1String);
                    }
                } else if (pole1String.contains("\u00F7") && pole2String == "") {
                    if (pole1Double % 1 == 0) {
                        pole1Integer = (int) pole1Double;
                        pole1String = Integer.toString(pole1Integer);
                        pole1String = pole1String + "\u00D7";
                        textLabel1.setText(pole1String);
                    } else {
                        pole1String = Double.toString(pole1Double);
                        pole1String = pole1String + "\u00D7";
                        textLabel1.setText(pole1String);
                    }
                } else {
                    pole1String = pole2String + "\u00D7";
                    textLabel1.setText(pole1String);
                    pole1Double = Double.parseDouble(pole2String);
                    textLabel2.setText(pole2String);
                    pole2String = "";
                }
            }


            if (userAction.getSource() == buttonDivision) {
                if (pole1String.contains("\u00F7") && pole2String == "") {

                } else if (pole1String.contains("\u00F7") && pole2String != "") {
                    pole2Double = Double.parseDouble(pole2String);
                    pole1Double = pole1Double / pole2Double;
                    pole2Double = pole1Double;
                    if (pole1Double % 1 == 0) {
                        pole1Integer = (int) pole1Double;
                        pole1String = Integer.toString(pole1Integer);
                        pole2String = pole1String;
                        pole1String = pole1String + "\u00F7";
                        textLabel1.setText(pole1String);
                        textLabel2.setText(pole2String);
                        pole2String = "";
                    } else {
                        pole1String = Double.toString(pole1Double);
                        pole2String = pole1String;
                        pole1String = pole1String + "\u00F7";
                        textLabel1.setText(pole1String);
                        textLabel2.setText(pole2String);
                        pole2String = "";
                    }
                } else if (pole1String.contains("+") && pole2String == "") {
                    if (pole1Double % 1 == 0) {
                        pole1Integer = (int) pole1Double;
                        pole1String = Integer.toString(pole1Integer);
                        pole1String = pole1String + "\u00F7";
                        textLabel1.setText(pole1String);
                    } else {
                        pole1String = Double.toString(pole1Double);
                        pole1String = pole1String + "\u00F7";
                        textLabel1.setText(pole1String);
                    }
                } else if (pole1String.contains("-") && pole2String == "") {
                    if (pole1Double % 1 == 0) {
                        pole1Integer = (int) pole1Double;
                        pole1String = Integer.toString(pole1Integer);
                        pole1String = pole1String + "\u00F7";
                        textLabel1.setText(pole1String);
                    } else {
                        pole1String = Double.toString(pole1Double);
                        pole1String = pole1String + "\u00F7";
                        textLabel1.setText(pole1String);
                    }
                } else if (pole1String.contains("\u00D7") && pole2String == "") {
                    if (pole1Double % 1 == 0) {
                        pole1Integer = (int) pole1Double;
                        pole1String = Integer.toString(pole1Integer);
                        pole1String = pole1String + "\u00F7";
                        textLabel1.setText(pole1String);
                    } else {
                        pole1String = Double.toString(pole1Double);
                        pole1String = pole1String + "\u00F7";
                        textLabel1.setText(pole1String);
                    }
                } else {
                    pole1String = pole2String + "\u00F7";
                    textLabel1.setText(pole1String);
                    pole1Double = Double.parseDouble(pole2String);
                    textLabel2.setText(pole2String);
                    pole2String = "";
                }
            }


            if (userAction.getSource() == buttonPlusMinus) {
                pole2Double = Double.parseDouble(pole2String);
                if (pole2Double % 1 == 0) {
                    pole2Integer = (int) pole2Double;
                    pole2Integer = -1 * pole2Integer;
                    pole2String = Integer.toString(pole2Integer);
                    textLabel2.setText(pole2String);
                } else {
                    pole2Double = -1 * pole2Double;
                    pole2String = Double.toString(pole2Double);
                    textLabel2.setText(pole2String);
                }
            }

            if (userAction.getSource() == buttonEquals) {
                if (pole1String.contains("+")) {
                    pole1String = pole1String + pole2String;
                    textLabel1.setText(pole1String + "=");
                    pole2Double = Double.parseDouble(pole2String);
                    pole1Double = pole1Double + pole2Double;
                    if (pole1Double % 1 == 0) {
                        pole1Integer = (int) pole1Double;
                        pole2String = Integer.toString(pole1Integer);
                        textLabel2.setText(pole2String);
                    } else {
                        pole2String = Double.toString(pole1Double);
                        textLabel2.setText(pole2String);
                    }
                }
                if (pole1String.contains("-")) {
                    pole1String = pole1String + pole2String;
                    textLabel1.setText(pole1String + "=");
                    pole2Double = Double.parseDouble(pole2String);
                    pole1Double = pole1Double - pole2Double;
                    if (pole1Double % 1 == 0) {
                        pole1Integer = (int) pole1Double;
                        pole2String = Integer.toString(pole1Integer);
                        textLabel2.setText(pole2String);
                    } else {
                        pole2String = Double.toString(pole1Double);
                        textLabel2.setText(pole2String);
                    }
                }
                if (pole1String.contains("\u00D7")) {
                    pole1String = pole1String + pole2String;
                    textLabel1.setText(pole1String + "=");
                    pole2Double = Double.parseDouble(pole2String);
                    pole1Double = pole1Double * pole2Double;
                    if (pole1Double % 1 == 0) {
                        pole1Integer = (int) pole1Double;
                        pole2String = Integer.toString(pole1Integer);
                        textLabel2.setText(pole2String);
                    } else {
                        pole2String = Double.toString(pole1Double);
                        textLabel2.setText(pole2String);
                    }
                }
                if (pole1String.contains("\u00F7")) {
                    pole1String = pole1String + pole2String;
                    textLabel1.setText(pole1String + "=");
                    pole2Double = Double.parseDouble(pole2String);
                    pole1Double = pole1Double / pole2Double;
                    if (pole1Double % 1 == 0) {
                        pole1Integer = (int) pole1Double;
                        pole2String = Integer.toString(pole1Integer);
                        textLabel2.setText(pole2String);
                    } else {
                        pole2String = Double.toString(pole1Double);
                        textLabel2.setText(pole2String);
                    }
                }
            }
            if (userAction.getSource() == buttonClean) {
                pole1String = "";
                pole2String = "0";
                textLabel1.setText(pole1String);
                textLabel2.setText(pole2String);
                pole2Double = Double.parseDouble(pole2String);
            }
        }
    }
}

