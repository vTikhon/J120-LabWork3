package ru.avalon.vergentev.j120.labwork3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import static java.awt.GridBagConstraints.CENTER;

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

        GridBagConstraints textLabel1Position = new GridBagConstraints(0,0,4,1,1,1,CENTER,1, new Insets(0,0,0,0),0,40);
        setLabelInterface(textLabel1,  40, 40, 40, 0, 200, 0, textLabel1Position);
        textLabel1.setFont(new Font("Segoe UI", Font.PLAIN, 15));

        GridBagConstraints textLabel2Position = new GridBagConstraints(0,1,4,2,1,1,CENTER,1, new Insets(0,0,0,0),0,60);
        setLabelInterface(textLabel2,  0, 0, 0, 200, 0, 0, textLabel2Position);
        textLabel2.setFont(new Font("Segoe UI", Font.BOLD, 47));

        GridBagConstraints buttonFree1Position = new GridBagConstraints(0,4,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonFree1,  235, 235, 235, buttonFree1Position);
        buttonFree1.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonFree2Position = new GridBagConstraints(1,4,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonFree2,  235, 235, 235, buttonFree2Position);
        buttonFree2.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonCleanPosition = new GridBagConstraints(2,4,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonClean,  235, 235, 235, buttonCleanPosition);
        buttonClean.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonFree3Position = new GridBagConstraints(3,4,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonFree3,  235, 235, 235, buttonFree3Position);
        buttonFree3.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonFree4Position = new GridBagConstraints(0,5,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonFree4,  235, 235, 235, buttonFree4Position);
        buttonFree4.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonFree5Position = new GridBagConstraints(1,5,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonFree5,  235, 235, 235, buttonFree5Position);
        buttonFree5.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonFree6Position = new GridBagConstraints(2,5,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonFree6,  235, 235, 235, buttonFree6Position);
        buttonFree6.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonDivisionPosition = new GridBagConstraints(3,5,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonDivision,  235, 235, 235, buttonDivisionPosition);
        buttonDivision.setFont(new Font("Segoe UI", Font.PLAIN, 27));

        GridBagConstraints buttonSevenPosition = new GridBagConstraints(0,6,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonSeven,  255, 255, 255, buttonSevenPosition);
        buttonSeven.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonEightPosition = new GridBagConstraints(1,6,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonEight,  255, 255, 255, buttonEightPosition);
        buttonEight.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonNinePosition = new GridBagConstraints(2,6,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonNine,  255, 255, 255, buttonNinePosition);
        buttonNine.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonMultiplicationPosition = new GridBagConstraints(3,6,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonMultiplication,  235, 235, 235, buttonMultiplicationPosition);
        buttonMultiplication.setFont(new Font("Segoe UI", Font.PLAIN, 27));

        GridBagConstraints buttonFourPosition = new GridBagConstraints(0,7,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonFour,  255, 255, 255, buttonFourPosition);
        buttonFour.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonFivePosition = new GridBagConstraints(1,7,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonFive,  255, 255, 255, buttonFivePosition);
        buttonFive.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonSixPosition = new GridBagConstraints(2,7,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonSix,  255, 255, 255, buttonSixPosition);
        buttonSix.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonSubtractionPosition = new GridBagConstraints(3,7,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonSubtraction,  235, 235, 235, buttonSubtractionPosition);
        buttonSubtraction.setFont(new Font("Segoe UI", Font.PLAIN, 27));

        GridBagConstraints buttonOnePosition = new GridBagConstraints(0,8,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonOne,  255, 255, 255, buttonOnePosition);
        buttonOne.setFont(new Font("Segoe UI", Font.BOLD, 17));


        GridBagConstraints buttonTwoPosition = new GridBagConstraints(1,8,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonTwo,  255, 255, 255, buttonTwoPosition);
        buttonTwo.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonThreePosition = new GridBagConstraints(2,8,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonThree,  255, 255, 255, buttonThreePosition);
        buttonThree.setFont(new Font("Segoe UI", Font.BOLD, 17));


        GridBagConstraints buttonAdditionPosition = new GridBagConstraints(3,8,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonAddition,  235, 235, 235, buttonAdditionPosition);
        buttonAddition.setFont(new Font("Segoe UI", Font.PLAIN, 27));

        GridBagConstraints buttonPlusMinusPosition = new GridBagConstraints(0,9,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonPlusMinus,  255, 255, 255, buttonPlusMinusPosition);
        buttonPlusMinus.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonZeroPosition = new GridBagConstraints(1,9,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonZero,  255, 255, 255, buttonZeroPosition);
        buttonZero.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonPointPosition = new GridBagConstraints(2,9,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonPoint,  255, 255, 255, buttonPointPosition);
        buttonPoint.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonEqualsPosition = new GridBagConstraints(3,9,1,1,1,1,CENTER,1, new Insets(0,0,0,0),0,0);
        setButtonInterface(buttonEquals, 100,180, 220, buttonEqualsPosition);
        buttonEquals.setFont(new Font("Segoe UI", Font.PLAIN, 27));
    }

    //METHODS
    //method which preset the appearance of the text label (for constructor)
    public void setLabelInterface (JLabel label,
                                   int redFore, int greenFore, int blueFore,
                                   int redBack, int greenBack, int blueBack,
                                   GridBagConstraints labelPosition) {
        label.setForeground(new Color(redFore,greenFore,blueFore));
        label.setBackground(new Color(redBack,greenBack,blueBack));
        add(label, labelPosition);
    }

    //method which preset the appearance of the buttons (for constructor)
    public void setButtonInterface (JButton button,
                                    int red, int green, int blue,
                                    GridBagConstraints buttonPosition) {
        button.setBackground(new Color(red,green,blue));
        button.addActionListener(this);
        add(button, buttonPosition);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonZero) algorithmIfDigitalButtonIsPushed("0");
        else if (e.getSource() == buttonOne) algorithmIfDigitalButtonIsPushed("1");
        else if (e.getSource() == buttonTwo) algorithmIfDigitalButtonIsPushed("2");
        else if (e.getSource() == buttonThree) algorithmIfDigitalButtonIsPushed("3");
        else if (e.getSource() == buttonFour) algorithmIfDigitalButtonIsPushed("4");
        else if (e.getSource() == buttonFive) algorithmIfDigitalButtonIsPushed("5");
        else if (e.getSource() == buttonSix) algorithmIfDigitalButtonIsPushed("6");
        else if (e.getSource() == buttonSeven) algorithmIfDigitalButtonIsPushed("7");
        else if (e.getSource() == buttonEight) algorithmIfDigitalButtonIsPushed("8");
        else if (e.getSource() == buttonNine) algorithmIfDigitalButtonIsPushed("9");
        else if (e.getSource() == buttonAddition) algorithmIfOperationButtonIsPushed("+");
        else if (e.getSource() == buttonSubtraction) algorithmIfOperationButtonIsPushed("-");
        else if (e.getSource() == buttonMultiplication) algorithmIfOperationButtonIsPushed("\u00D7");
        else if (e.getSource() == buttonDivision) algorithmIfOperationButtonIsPushed("\u00F7");
        else if (e.getSource() == buttonEquals) algorithmIfEqualButtonIsPushed();
        else if (e.getSource() == buttonPoint) algorithmIfPointButtonIsPushed();
        else if (e.getSource() == buttonClean) algorithmIfCleanButtonIsPushed();
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
            case "+" : pole1Double = pole1Double + pole2Double; break;
            case "-" : pole1Double = pole1Double - pole2Double; break;
            case "\u00D7" : pole1Double = pole1Double * pole2Double; break;
            case "\u00F7" : pole1Double = pole1Double / pole2Double; break;
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

