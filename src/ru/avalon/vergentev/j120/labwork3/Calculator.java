package ru.avalon.vergentev.j120.labwork3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
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
    JButton buttonPlusMinus = new JButton("");
    JButton buttonClean = new JButton("C");
    String pole1String = "";
    String pole2String = "0";
    String pole2StringTemp;
    JLabel textLabel1 = new JLabel(pole1String, SwingConstants.RIGHT);
    JLabel textLabel2 = new JLabel(pole2String, SwingConstants.RIGHT);
    double pole1Double, pole2Double;

    public Calculator() {
        super("Tikhon's calculator");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(340, 550);
        getContentPane().setBackground(new Color(200,200,200));
        setResizable(true);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        GridBagConstraints textLabel1Position = new GridBagConstraints();
        setLabelInterface(textLabel1,  40, 40, 40, 0, 200, 0 ,
                textLabel1Position,  1,  1, 0,  0,  1,  4, 0, 40);
//        textLabel1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 200)));
        textLabel1.setFont(new Font("Segoe UI", Font.PLAIN, 15));

        GridBagConstraints textLabel2Position = new GridBagConstraints();
        setLabelInterface(textLabel2,  0, 0, 0, 200, 0, 0 ,
                textLabel2Position,  1,  1, 0,  1,  2,  4, 0, 60);
//        textLabel2.setBorder(BorderFactory.createLineBorder(new Color(200, 0, 0)));
        textLabel2.setFont(new Font("Segoe UI", Font.BOLD, 47));

        GridBagConstraints buttonFree1Position = new GridBagConstraints();
        setButtonInterface(buttonFree1,  235, 235, 235,
                buttonFree1Position,  1,  1, 0,  4,  1,  1);
        buttonFree1.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonFree2Position = new GridBagConstraints();
        setButtonInterface(buttonFree2,  235, 235, 235,
                buttonFree2Position,  1,  1, 1,  4,  1,  1);
        buttonFree2.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonCleanPosition = new GridBagConstraints();
        setButtonInterface(buttonClean,  235, 235, 235,
                buttonCleanPosition,  1,  1, 2 , 4, 1, 1);
        buttonClean.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonFree3Position = new GridBagConstraints();
        setButtonInterface(buttonFree3,  235, 235, 235,
                buttonFree3Position,  1,  1, 3 , 4, 1, 1);
        buttonFree3.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonFree4Position = new GridBagConstraints();
        setButtonInterface(buttonFree4,  235, 235, 235,
                buttonFree4Position,  1,  1, 0 , 5, 1, 1);
        buttonFree4.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonFree5Position = new GridBagConstraints();
        setButtonInterface(buttonFree5,  235, 235, 235,
                buttonFree5Position,  1,  1, 1 , 5, 1, 1);
        buttonFree5.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonFree6Position = new GridBagConstraints();
        setButtonInterface(buttonFree6,  235, 235, 235,
                buttonFree6Position,  1,  1, 2 , 5, 1, 1);
        buttonFree6.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonDivisionPosition = new GridBagConstraints();
        setButtonInterface(buttonDivision,  235, 235, 235,
                buttonDivisionPosition,  1,  1, 3 , 5, 1, 1);
        buttonDivision.setFont(new Font("Segoe UI", Font.PLAIN, 27));

        GridBagConstraints buttonSevenPosition = new GridBagConstraints();
        setButtonInterface(buttonSeven,  255, 255, 255,
                buttonSevenPosition,  1,  1, 0 , 6, 1, 1);
        buttonSeven.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonEightPosition = new GridBagConstraints();
        setButtonInterface(buttonEight,  255, 255, 255,
                buttonEightPosition,  1,  1, 1 , 6, 1, 1);
        buttonEight.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonNinePosition = new GridBagConstraints();
        setButtonInterface(buttonNine,  255, 255, 255,
                buttonNinePosition,  1,  1, 2 , 6, 1, 1);
        buttonNine.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonMultiplicationPosition = new GridBagConstraints();
        setButtonInterface(buttonMultiplication,  235, 235, 235,
                buttonMultiplicationPosition,  1,  1, 3 , 6, 1, 1);
        buttonMultiplication.setFont(new Font("Segoe UI", Font.PLAIN, 27));

        GridBagConstraints buttonFourPosition = new GridBagConstraints();
        setButtonInterface(buttonFour,  255, 255, 255,
                buttonFourPosition,  1,  1, 0 , 7, 1, 1);
        buttonFour.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonFivePosition = new GridBagConstraints();
        setButtonInterface(buttonFive,  255, 255, 255,
                buttonFivePosition,  1,  1, 1 , 7, 1, 1);
        buttonFive.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonSixPosition = new GridBagConstraints();
        setButtonInterface(buttonSix,  255, 255, 255,
                buttonSixPosition,  1,  1, 2 , 7, 1, 1);
        buttonSix.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonSubtractionPosition = new GridBagConstraints();
        setButtonInterface(buttonSubtraction,  235, 235, 235,
                buttonSubtractionPosition,  1,  1, 3 , 7, 1, 1);
        buttonSubtraction.setFont(new Font("Segoe UI", Font.PLAIN, 27));


        GridBagConstraints buttonOnePosition = new GridBagConstraints();
        setButtonInterface(buttonOne,  255, 255, 255,
                buttonOnePosition,  1,  1, 0 , 8, 1, 1);
        buttonOne.setFont(new Font("Segoe UI", Font.BOLD, 17));


        GridBagConstraints buttonTwoPosition = new GridBagConstraints();
        setButtonInterface(buttonTwo,  255, 255, 255,
                buttonTwoPosition,  1,  1, 1 , 8, 1, 1);
        buttonTwo.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonThreePosition = new GridBagConstraints();
        setButtonInterface(buttonThree,  255, 255, 255,
                buttonThreePosition,  1,  1, 2 , 8, 1, 1);
        buttonThree.setFont(new Font("Segoe UI", Font.BOLD, 17));


        GridBagConstraints buttonAdditionPosition = new GridBagConstraints();
        setButtonInterface(buttonAddition,  235, 235, 235,
                buttonAdditionPosition,  1,  1, 3 , 8, 1, 1);
        buttonAddition.setFont(new Font("Segoe UI", Font.PLAIN, 27));

        GridBagConstraints buttonPlusMinusPosition = new GridBagConstraints();
        setButtonInterface(buttonPlusMinus,  255, 255, 255,
                buttonPlusMinusPosition,  1,  1, 0 , 9, 1, 1);
        buttonPlusMinus.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonZeroPosition = new GridBagConstraints();
        setButtonInterface(buttonZero,  255, 255, 255,
                buttonZeroPosition,  1,  1, 1 , 9, 1, 1);
        buttonZero.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonPointPosition = new GridBagConstraints();
        setButtonInterface(buttonPoint,  255, 255, 255,
                buttonPointPosition,  1,  1, 2 , 9, 1, 1);
        buttonPoint.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonEqualsPosition = new GridBagConstraints();
        setButtonInterface(buttonEquals, 100,180, 220,
                buttonEqualsPosition,  1,  1, 3 , 9, 1, 1);
        buttonEquals.setFont(new Font("Segoe UI", Font.PLAIN, 27));
    }

    //METHODS
    //метод определ€ющий внешний вид кнопки (дл€ конструктора)
    public void setButtonInterface (JButton button,
                                    int red, int green, int blue,
                                    GridBagConstraints buttonPosition,
                                    int weightx, int weighty,
                                    int gridx, int gridy,
                                    int gridheight, int gridwidth) {
        button.setBackground(new Color(red,green,blue));
        buttonPosition.fill = GridBagConstraints.BOTH;
        buttonPosition.weightx = weightx;
        buttonPosition.weighty = weighty;
        buttonPosition.gridx = gridx;
        buttonPosition.gridy = gridy;
        buttonPosition.gridheight = gridheight;
        buttonPosition.gridwidth = gridwidth;
        button.addActionListener(this);
        add(button, buttonPosition);
    }

    //метод определ€ющий внешний вид текстового лэйбла (дл€ конструктора)
    public void setLabelInterface (JLabel label,
                                   int redFore, int greenFore, int blueFore,
                                    int redBack, int greenBack, int blueBack,
                                    GridBagConstraints labelPosition,
                                    int weightx, int weighty,
                                    int gridx, int gridy,
                                    int gridheight, int gridwidth,
                                   int ipadx, int ipady) {
        label.setForeground(new Color(redFore,greenFore,blueFore));
        label.setBackground(new Color(redBack,greenBack,blueBack));
        labelPosition.fill = GridBagConstraints.BOTH;
        labelPosition.weightx = weightx;
        labelPosition.weighty = weighty;
        labelPosition.gridx = gridx;
        labelPosition.gridy = gridy;
        labelPosition.gridheight = gridheight;
        labelPosition.gridwidth = gridwidth;
        labelPosition.ipadx = ipadx;
        labelPosition.ipady = ipady;
        add(label, labelPosition);
    }

    //функционал нажатий на кнопки
    @Override
    public void actionPerformed(ActionEvent userAction) {
        if (userAction.getSource() == buttonZero) algorithmIfDigitalButtonIsPushed("0");
        else if (userAction.getSource() == buttonOne) algorithmIfDigitalButtonIsPushed("1");
        else if (userAction.getSource() == buttonTwo) algorithmIfDigitalButtonIsPushed("2");
        else if (userAction.getSource() == buttonThree) algorithmIfDigitalButtonIsPushed("3");
        else if (userAction.getSource() == buttonFour) algorithmIfDigitalButtonIsPushed("4");
        else if (userAction.getSource() == buttonFive) algorithmIfDigitalButtonIsPushed("5");
        else if (userAction.getSource() == buttonSix) algorithmIfDigitalButtonIsPushed("6");
        else if (userAction.getSource() == buttonSeven) algorithmIfDigitalButtonIsPushed("7");
        else if (userAction.getSource() == buttonEight) algorithmIfDigitalButtonIsPushed("8");
        else if (userAction.getSource() == buttonNine) algorithmIfDigitalButtonIsPushed("9");
        else if (userAction.getSource() == buttonAddition) algorithmIfOperationButtonIsPushed("+");
        else if (userAction.getSource() == buttonSubtraction) algorithmIfOperationButtonIsPushed("-");
        else if (userAction.getSource() == buttonMultiplication) algorithmIfOperationButtonIsPushed("\u00D7");
        else if (userAction.getSource() == buttonDivision) algorithmIfOperationButtonIsPushed("\u00F7");
        else if (userAction.getSource() == buttonEquals) algorithmIfEqualButtonIsPushed();
        else if (userAction.getSource() == buttonPoint) algorithmIfPointButtonIsPushed();
        else if (userAction.getSource() == buttonClean) algorithmIfCleanButtonIsPushed();
    }

    public void algorithmIfDigitalButtonIsPushed (String digitButton) {
        if (pole2String.equals("0")) {
            pole2String = digitButton;
        } else {
            pole2String = pole2String + digitButton;
        }
        textLabel2.setText(pole2String);
    }

    public void algorithmIfPointButtonIsPushed () {
        if (pole2String.contains(".")) {
            textLabel2.setText(pole2String);
        } else if (pole2String.equals("")) {
            pole2String = pole2String + "0.";
            textLabel2.setText(pole2String);
        } else {
            pole2String = pole2String + ".";
            textLabel2.setText(pole2String);
        }
    }

    public void algorithmIfCleanButtonIsPushed () {
        pole1String = "";
        pole2String = "0";
        textLabel1.setText(pole1String);
        textLabel2.setText(pole2String);
        pole2Double = Double.parseDouble(pole2String);
    }
    
    public void algorithmIfOperationButtonIsPushed (String symbolOfButtonPushed) {
        if      (pole1String.contains("+") && pole2String.equals(""))  changeSymbolInTextLabel1(symbolOfButtonPushed);
        else if (pole1String.contains("+") && !pole2String.equals("")) calculatingIfOperationIsPushed("+", symbolOfButtonPushed);
        else if (pole1String.contains("-") && pole2String.equals("")) changeSymbolInTextLabel1(symbolOfButtonPushed);
        else if (pole1String.contains("-") && !pole2String.equals("")) calculatingIfOperationIsPushed("-", symbolOfButtonPushed); //проверка
        else if (pole1String.contains("\u00D7") && pole2String.equals("")) changeSymbolInTextLabel1(symbolOfButtonPushed);
        else if (pole1String.contains("\u00D7") && !pole2String.equals("")) calculatingIfOperationIsPushed("\u00D7", symbolOfButtonPushed); //поверка
        else if (pole1String.contains("\u00F7") && pole2String.equals("")) changeSymbolInTextLabel1(symbolOfButtonPushed);
        else if (pole1String.contains("\u00F7") && !pole2String.equals("")) calculatingIfOperationIsPushed("\u00F7", symbolOfButtonPushed); //проверка
        else {
            pole2Double = Double.parseDouble(pole2String);
            if (pole2Double % 1 == 0) {
                pole2String = Integer.toString((int)pole2Double);
            } else {
                pole2String = Double.toString(pole2Double);
            }
            pole1String = pole2String + symbolOfButtonPushed;
            textLabel1.setText(pole1String);
            pole1Double = Double.parseDouble(pole2String);
            textLabel2.setText(pole2String);
            pole2StringTemp = pole2String;
            pole2String = "";
        }
    }

    public void changeSymbolInTextLabel1 (String symbolOfButtonPushed) {
        removePointIfValueIsInteger();
        pole1String = pole1String.substring(0, pole1String.length()-1) + symbolOfButtonPushed;
        textLabel1.setText(pole1String);
        pole2String = "";
    }

    public void calculatingIfOperationIsPushed (String operation, String symbolOfButtonPushed) {
        if (pole2String.equals("0")) {
            pole1String = "";
            pole2String = "";
            textLabel1.setText(pole1String);
            textLabel2.setText("Infinity");
        } else {
            calculating(operation);
            pole2Double = pole1Double;
            if (pole1Double % 1 == 0) {
                pole1String = Integer.toString((int)pole1Double);
            } else {
                pole1String = Double.toString(pole1Double);
            }
            pole2String = pole1String;
            pole1String = pole1String + symbolOfButtonPushed;
            textLabel1.setText(pole1String);
            textLabel2.setText(pole2String);
            pole2String = "";
        }
    }

    public void algorithmIfEqualButtonIsPushed () {
        if (pole1String.contains("+")) calculatingIfEqualIsPushed("+");
        else if (pole1String.contains("-")) calculatingIfEqualIsPushed("-");
        else if (pole1String.contains("\u00D7")) calculatingIfEqualIsPushed("\u00D7");
        else if (pole1String.contains("\u00F7")) calculatingIfEqualIsPushed("\u00F7");
    }

    public void calculatingIfEqualIsPushed (String operation) {
        if (pole2String.equals("")) {
            pole2String = pole2StringTemp;
            pole1String = pole1String + pole2String;
            textLabel1.setText(pole1String + "=");
            calculating(operation);
            removePointIfValueIsInteger();
            textLabel2.setText(pole2String);
            pole1String = Double.toString(pole1Double);
        } else if (pole2String.equals("0")) {
            pole1String = "";
            pole2String = "";
            textLabel1.setText(pole1String);
            textLabel2.setText("Infinity");
        } else {
            pole1String = pole1String + pole2String;
            textLabel1.setText(pole1String + "=");
            calculating(operation);
            removePointIfValueIsInteger();
            textLabel2.setText(pole2String);
            pole1String = Double.toString(pole1Double);
        }
    }

    public double calculating (String operation) {
        pole2Double = Double.parseDouble(pole2String);
        switch (operation) {
            case "+" -> pole1Double = pole1Double + pole2Double;
            case "-" -> pole1Double = pole1Double - pole2Double;
            case "\u00D7" -> pole1Double = pole1Double * pole2Double;
            case "\u00F7" -> pole1Double = pole1Double / pole2Double;
        }
        return pole1Double;
    }

    public void removePointIfValueIsInteger () {
        if (pole1Double % 1 == 0) {
            pole2String = Integer.toString((int)pole1Double);
        } else {
            pole2String = Double.toString(pole1Double);
        }
    }
}

