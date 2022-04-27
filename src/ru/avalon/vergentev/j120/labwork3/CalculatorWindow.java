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
        super("Tikhon's calculator");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(340, 550);
        getContentPane().setBackground(new Color(186,186,186));
        setResizable(true);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());

        GridBagConstraints textLabel1Position = new GridBagConstraints();
        setLabelInterface(textLabel1,  40, 40, 40, 0, 200, 0 ,
                textLabel1Position,  1,  1, 0,  0,  1,  4, 0, 40);
        textLabel1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 200)));
        textLabel1.setFont(new Font("Segoe UI", Font.PLAIN, 15));

        GridBagConstraints textLabel2Position = new GridBagConstraints();
        setLabelInterface(textLabel2,  0, 0, 0, 200, 0, 0 ,
                textLabel2Position,  1,  1, 0,  1,  2,  4, 0, 60);
        textLabel2.setBorder(BorderFactory.createLineBorder(new Color(200, 0, 0)));
        textLabel2.setFont(new Font("Segoe UI", Font.BOLD, 47));

        GridBagConstraints buttonFree1Position = new GridBagConstraints();
        setButtonInterface(buttonFree1,  225, 225, 225,
                buttonFree1Position,  1,  1, 0,  4,  1,  1);
        buttonFree1.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonFree2Position = new GridBagConstraints();
        setButtonInterface(buttonFree2,  225, 225, 225,
                buttonFree2Position,  1,  1, 1,  4,  1,  1);
        buttonFree2.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonCleanPosition = new GridBagConstraints();
        setButtonInterface(buttonClean,  225, 225, 225,
                buttonCleanPosition,  1,  1, 2 , 4, 1, 1);
        buttonClean.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonFree3Position = new GridBagConstraints();
        setButtonInterface(buttonFree3,  225, 225, 225,
                buttonFree3Position,  1,  1, 3 , 4, 1, 1);
        buttonFree3.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonFree4Position = new GridBagConstraints();
        setButtonInterface(buttonFree4,  225, 225, 225,
                buttonFree4Position,  1,  1, 0 , 5, 1, 1);
        buttonFree4.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonFree5Position = new GridBagConstraints();
        setButtonInterface(buttonFree5,  225, 225, 225,
                buttonFree5Position,  1,  1, 1 , 5, 1, 1);
        buttonFree5.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonFree6Position = new GridBagConstraints();
        setButtonInterface(buttonFree6,  225, 225, 225,
                buttonFree6Position,  1,  1, 2 , 5, 1, 1);
        buttonFree6.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonDivisionPosition = new GridBagConstraints();
        setButtonInterface(buttonDivision,  225, 225, 225,
                buttonDivisionPosition,  1,  1, 3 , 5, 1, 1);
        buttonDivision.addActionListener(calculation);
        buttonDivision.setFont(new Font("Segoe UI", Font.PLAIN, 27));

        GridBagConstraints buttonSevenPosition = new GridBagConstraints();
        setButtonInterface(buttonSeven,  255, 255, 255,
                buttonSevenPosition,  1,  1, 0 , 6, 1, 1);
        buttonSeven.addActionListener(calculation);
        buttonSeven.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonEightPosition = new GridBagConstraints();
        setButtonInterface(buttonEight,  255, 255, 255,
                buttonEightPosition,  1,  1, 1 , 6, 1, 1);
        buttonEight.addActionListener(calculation);
        buttonEight.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonNinePosition = new GridBagConstraints();
        setButtonInterface(buttonNine,  255, 255, 255,
                buttonNinePosition,  1,  1, 2 , 6, 1, 1);
        buttonNine.addActionListener(calculation);
        buttonNine.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonMultiplicationPosition = new GridBagConstraints();
        setButtonInterface(buttonMultiplication,  225, 225, 225,
                buttonMultiplicationPosition,  1,  1, 3 , 6, 1, 1);
        buttonMultiplication.addActionListener(calculation);
        buttonMultiplication.setFont(new Font("Segoe UI", Font.PLAIN, 27));

        GridBagConstraints buttonFourPosition = new GridBagConstraints();
        setButtonInterface(buttonFour,  255, 255, 255,
                buttonFourPosition,  1,  1, 0 , 7, 1, 1);
        buttonFour.addActionListener(calculation);
        buttonFour.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonFivePosition = new GridBagConstraints();
        setButtonInterface(buttonFive,  255, 255, 255,
                buttonFivePosition,  1,  1, 1 , 7, 1, 1);
        buttonFive.addActionListener(calculation);
        buttonFive.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonSixPosition = new GridBagConstraints();
        setButtonInterface(buttonSix,  255, 255, 255,
                buttonSixPosition,  1,  1, 2 , 7, 1, 1);
        buttonSix.addActionListener(calculation);
        buttonSix.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonSubtractionPosition = new GridBagConstraints();
        setButtonInterface(buttonSubtraction,  225, 225, 225,
                buttonSubtractionPosition,  1,  1, 3 , 7, 1, 1);
        buttonSubtraction.addActionListener(calculation);
        buttonSubtraction.setFont(new Font("Segoe UI", Font.PLAIN, 27));


        GridBagConstraints buttonOnePosition = new GridBagConstraints();
        setButtonInterface(buttonOne,  255, 255, 255,
                buttonOnePosition,  1,  1, 0 , 8, 1, 1);
        buttonOne.addActionListener(calculation);
        buttonOne.setFont(new Font("Segoe UI", Font.BOLD, 17));


        GridBagConstraints buttonTwoPosition = new GridBagConstraints();
        setButtonInterface(buttonTwo,  255, 255, 255,
                buttonTwoPosition,  1,  1, 1 , 8, 1, 1);
        buttonTwo.addActionListener(calculation);
        buttonTwo.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonThreePosition = new GridBagConstraints();
        setButtonInterface(buttonThree,  255, 255, 255,
                buttonThreePosition,  1,  1, 2 , 8, 1, 1);
        buttonThree.addActionListener(calculation);
        buttonThree.setFont(new Font("Segoe UI", Font.BOLD, 17));


        GridBagConstraints buttonAdditionPosition = new GridBagConstraints();
        setButtonInterface(buttonAddition,  225, 225, 225,
                buttonAdditionPosition,  1,  1, 3 , 8, 1, 1);
        buttonAddition.addActionListener(calculation);
        buttonAddition.setFont(new Font("Segoe UI", Font.PLAIN, 27));

        GridBagConstraints buttonPlusMinusPosition = new GridBagConstraints();
        setButtonInterface(buttonPlusMinus,  255, 255, 255,
                buttonPlusMinusPosition,  1,  1, 0 , 9, 1, 1);
        buttonPlusMinus.addActionListener(calculation);
        buttonPlusMinus.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonZeroPosition = new GridBagConstraints();
        setButtonInterface(buttonZero,  255, 255, 255,
                buttonZeroPosition,  1,  1, 1 , 9, 1, 1);
        buttonZero.addActionListener(calculation);
        buttonZero.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonPointPosition = new GridBagConstraints();
        setButtonInterface(buttonPoint,  255, 255, 255,
                buttonPointPosition,  1,  1, 2 , 9, 1, 1);
        buttonPoint.addActionListener(calculation);
        buttonPoint.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonEqualsPosition = new GridBagConstraints();
        setButtonInterface(buttonEquals, 225,225, 225,
                buttonEqualsPosition,  1,  1, 3 , 9, 1, 1);
        buttonEquals.addActionListener(calculation);
        buttonEquals.setFont(new Font("Segoe UI", Font.PLAIN, 27));
    }

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
        add(button, buttonPosition);
    }

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


    public class CalculatorAction implements ActionListener, ButtonsForCalculator {
        public void actionPerformed(ActionEvent userAction) {
            switch (userAction.getActionCommand()) {
                case ZERO_BUTTON -> buttonZeroPusher();
                case ONE_BUTTON -> buttonOnePusher();
                case TWO_BUTTON -> buttonTwoPusher();
                case THREE_BUTTON -> buttonThreePusher();
                case FOUR_BUTTON -> buttonFourPusher();
                case FIVE_BUTTON -> buttonFivePusher();
                case SIX_BUTTON -> buttonSixPusher();
                case SEVEN_BUTTON -> buttonSevenPusher();
                case EIGHT_BUTTON -> buttonEightPusher();
                case NINE_BUTTON -> buttonNinePusher();
                case ADDITION_BUTTON -> buttonAdditionPusher();
                case SUBTRACTION_BUTTON -> buttonSubtractionPusher();
                case MULTIPLICATION_BUTTON -> buttonMultiplicationPusher();
                case DIVISION_BUTTON -> buttonDivisionPusher();
                case PLUSMINUS_BUTTON -> buttonPlusMinusPusher();
                case EQUALS_BUTTON -> buttonEqualsPusher();
                case POINT_BUTTON -> buttonPointPusher();
                case CLEAN_BUTTON -> buttonCleanPusher();
            }
        }

        public void algorithmIfDigitalButtonIsPushed (String digitButton) {
            if (pole2String.equals("0")) {
                pole2String = digitButton;
                textLabel2.setText(pole2String);
            } else {
                pole2String = pole2String + digitButton;
                textLabel2.setText(pole2String);
            }
        }
        public void buttonZeroPusher () {algorithmIfDigitalButtonIsPushed("0");}
        public void buttonOnePusher () {algorithmIfDigitalButtonIsPushed("1");}
        public void buttonTwoPusher () {algorithmIfDigitalButtonIsPushed("2");}
        public void buttonThreePusher () {algorithmIfDigitalButtonIsPushed("3");}
        public void buttonFourPusher () {algorithmIfDigitalButtonIsPushed("4");}
        public void buttonFivePusher () {algorithmIfDigitalButtonIsPushed("5");}
        public void buttonSixPusher () {algorithmIfDigitalButtonIsPushed("6");}
        public void buttonSevenPusher () {algorithmIfDigitalButtonIsPushed("7");}
        public void buttonEightPusher () {algorithmIfDigitalButtonIsPushed("8");}
        public void buttonNinePusher () {algorithmIfDigitalButtonIsPushed("9");}

        public void correctLabel1IfItHasAnotherSymbol (String symbol) {
            if (pole1Double % 1 == 0) {
                pole1Integer = (int) pole1Double;
                pole1String = Integer.toString(pole1Integer);
            } else {
                pole1String = Double.toString(pole1Double);
            }
            pole1String = pole1String + symbol;
            textLabel1.setText(pole1String);
        }
        public void correctLabel1IfItTheSameSymbol (String symbol, char action) {
            pole2Double = Double.parseDouble(pole2String);
            switch (action) {
                case '+' -> pole1Double = pole1Double + pole2Double;
                case '-' -> pole1Double = pole1Double - pole2Double;
                case '*' -> pole1Double = pole1Double * pole2Double;
                case '/' -> pole1Double = pole1Double / pole2Double;
            }
            pole2Double = pole1Double;
            if (pole1Double % 1 == 0) {
                pole1Integer = (int) pole1Double;
                pole1String = Integer.toString(pole1Integer);
            } else {
                pole1String = Double.toString(pole1Double);
            }
            pole2String = pole1String;
            pole1String = pole1String + symbol;
            textLabel1.setText(pole1String);
            textLabel2.setText(pole2String);
            pole2String = "";
        }
        public void buttonAdditionPusher () {
            if (pole1String.contains("+") && !pole2String.equals("")) {correctLabel1IfItTheSameSymbol("+", '+');}
            else if (pole1String.contains("-") && pole2String.equals("")) {correctLabel1IfItHasAnotherSymbol("+");}
            else if (pole1String.contains("\u00D7") && pole2String.equals("")) {correctLabel1IfItHasAnotherSymbol("+");}
            else if (pole1String.contains("\u00F7") && pole2String.equals("")) {correctLabel1IfItHasAnotherSymbol("+");}
            else {
                pole1String = pole2String + "+";
                textLabel1.setText(pole1String);
                pole1Double = Double.parseDouble(pole2String);
                textLabel2.setText(pole2String);
                pole2String = "";
            }
        }
        public void buttonSubtractionPusher () {
            if (pole1String.contains("-") && !pole2String.equals("")) {correctLabel1IfItTheSameSymbol("-", '-');}
            else if (pole1String.contains("+") && pole2String.equals("")) {correctLabel1IfItHasAnotherSymbol("-");}
            else if (pole1String.contains("\u00D7") && pole2String.equals("")) {correctLabel1IfItHasAnotherSymbol("-");}
            else if (pole1String.contains("\u00F7") && pole2String.equals("")) {correctLabel1IfItHasAnotherSymbol("-");}
            else {
                pole1String = pole2String + "-";
                textLabel1.setText(pole1String);
                pole1Double = Double.parseDouble(pole2String);
                textLabel2.setText(pole2String);
                pole2String = "";
            }
        }
        public void buttonMultiplicationPusher () {
            if (pole1String.contains("\u00D7") && !pole2String.equals("")) {correctLabel1IfItTheSameSymbol("\u00D7", '*');}
            else if (pole1String.contains("+") && pole2String.equals("")) {correctLabel1IfItHasAnotherSymbol("\u00D7");}
            else if (pole1String.contains("-") && pole2String.equals("")) {correctLabel1IfItHasAnotherSymbol("\u00D7");}
            else if (pole1String.contains("\u00F7") && pole2String.equals("")) {correctLabel1IfItHasAnotherSymbol("\u00D7");}
            else {
                pole1String = pole2String + "\u00D7";
                textLabel1.setText(pole1String);
                pole1Double = Double.parseDouble(pole2String);
                textLabel2.setText(pole2String);
                pole2String = "";
            }
        }
        public void buttonDivisionPusher () {
            if (pole1String.contains("\u00F7") && !pole2String.equals("")) {correctLabel1IfItTheSameSymbol("\u00F7", '/');}
            else if (pole1String.contains("+") && pole2String.equals("")) {correctLabel1IfItHasAnotherSymbol("\u00F7");}
            else if (pole1String.contains("-") && pole2String.equals("")) {correctLabel1IfItHasAnotherSymbol("\u00F7");}
            else if (pole1String.contains("\u00D7") && pole2String.equals("")) {correctLabel1IfItHasAnotherSymbol("\u00F7");}
            else {
                pole1String = pole2String + "\u00F7";
                textLabel1.setText(pole1String);
                pole1Double = Double.parseDouble(pole2String);
                textLabel2.setText(pole2String);
                pole2String = "";
            }
        }
        public void buttonEqualsPusher () {
            if (pole1String.contains("+")) {equating('+');}
            if (pole1String.contains("-")) {equating('-');}
            if (pole1String.contains("\u00D7")) {equating('*');}
            if (pole1String.contains("\u00F7")) {equating('/');}
        }
        public void equating (char action) {
            pole1String = pole1String + pole2String;
            textLabel1.setText(pole1String + "=");
            pole2Double = Double.parseDouble(pole2String);
            switch (action) {
                case '+' -> pole1Double = pole1Double + pole2Double;
                case '-' -> pole1Double = pole1Double - pole2Double;
                case '*' -> pole1Double = pole1Double * pole2Double;
                case '/' -> pole1Double = pole1Double / pole2Double;
            }
            if (pole1Double % 1 == 0) {
                pole1Integer = (int) pole1Double;
                pole2String = Integer.toString(pole1Integer);
                textLabel2.setText(pole2String);
            } else {
                pole2String = Double.toString(pole1Double);
                textLabel2.setText(pole2String);
            }
        }

        public void buttonPlusMinusPusher () {
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

        public void buttonCleanPusher () {
            pole1String = "";
            pole2String = "0";
            textLabel1.setText(pole1String);
            textLabel2.setText(pole2String);
            pole2Double = Double.parseDouble(pole2String);
        }

        public void buttonPointPusher () {
            if (pole2String.contains(".")) {
                textLabel2.setText(pole2String);
            } else {
                pole2String = pole2String + ".";
                textLabel2.setText(pole2String);
            }
        }
    }
}

