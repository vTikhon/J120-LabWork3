package ru.avalon.vergentev.j120.labwork3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener, ButtonsForCalculator {
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
    String pole2StringTemp;
    JLabel textLabel1 = new JLabel(pole1String, SwingConstants.RIGHT);
    JLabel textLabel2 = new JLabel(pole2String, SwingConstants.RIGHT);
    double pole1Double, pole2Double;
    int pole1Integer, pole2Integer;

    public Calculator() {
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
        buttonClean.addActionListener(this);
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
        buttonDivision.addActionListener(this);
        buttonDivision.setFont(new Font("Segoe UI", Font.PLAIN, 27));

        GridBagConstraints buttonSevenPosition = new GridBagConstraints();
        setButtonInterface(buttonSeven,  255, 255, 255,
                buttonSevenPosition,  1,  1, 0 , 6, 1, 1);
        buttonSeven.addActionListener(this);
        buttonSeven.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonEightPosition = new GridBagConstraints();
        setButtonInterface(buttonEight,  255, 255, 255,
                buttonEightPosition,  1,  1, 1 , 6, 1, 1);
        buttonEight.addActionListener(this);
        buttonEight.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonNinePosition = new GridBagConstraints();
        setButtonInterface(buttonNine,  255, 255, 255,
                buttonNinePosition,  1,  1, 2 , 6, 1, 1);
        buttonNine.addActionListener(this);
        buttonNine.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonMultiplicationPosition = new GridBagConstraints();
        setButtonInterface(buttonMultiplication,  225, 225, 225,
                buttonMultiplicationPosition,  1,  1, 3 , 6, 1, 1);
        buttonMultiplication.addActionListener(this);
        buttonMultiplication.setFont(new Font("Segoe UI", Font.PLAIN, 27));

        GridBagConstraints buttonFourPosition = new GridBagConstraints();
        setButtonInterface(buttonFour,  255, 255, 255,
                buttonFourPosition,  1,  1, 0 , 7, 1, 1);
        buttonFour.addActionListener(this);
        buttonFour.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonFivePosition = new GridBagConstraints();
        setButtonInterface(buttonFive,  255, 255, 255,
                buttonFivePosition,  1,  1, 1 , 7, 1, 1);
        buttonFive.addActionListener(this);
        buttonFive.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonSixPosition = new GridBagConstraints();
        setButtonInterface(buttonSix,  255, 255, 255,
                buttonSixPosition,  1,  1, 2 , 7, 1, 1);
        buttonSix.addActionListener(this);
        buttonSix.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonSubtractionPosition = new GridBagConstraints();
        setButtonInterface(buttonSubtraction,  225, 225, 225,
                buttonSubtractionPosition,  1,  1, 3 , 7, 1, 1);
        buttonSubtraction.addActionListener(this);
        buttonSubtraction.setFont(new Font("Segoe UI", Font.PLAIN, 27));


        GridBagConstraints buttonOnePosition = new GridBagConstraints();
        setButtonInterface(buttonOne,  255, 255, 255,
                buttonOnePosition,  1,  1, 0 , 8, 1, 1);
        buttonOne.addActionListener(this);
        buttonOne.setFont(new Font("Segoe UI", Font.BOLD, 17));


        GridBagConstraints buttonTwoPosition = new GridBagConstraints();
        setButtonInterface(buttonTwo,  255, 255, 255,
                buttonTwoPosition,  1,  1, 1 , 8, 1, 1);
        buttonTwo.addActionListener(this);
        buttonTwo.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonThreePosition = new GridBagConstraints();
        setButtonInterface(buttonThree,  255, 255, 255,
                buttonThreePosition,  1,  1, 2 , 8, 1, 1);
        buttonThree.addActionListener(this);
        buttonThree.setFont(new Font("Segoe UI", Font.BOLD, 17));


        GridBagConstraints buttonAdditionPosition = new GridBagConstraints();
        setButtonInterface(buttonAddition,  225, 225, 225,
                buttonAdditionPosition,  1,  1, 3 , 8, 1, 1);
        buttonAddition.addActionListener(this);
        buttonAddition.setFont(new Font("Segoe UI", Font.PLAIN, 27));

        GridBagConstraints buttonPlusMinusPosition = new GridBagConstraints();
        setButtonInterface(buttonPlusMinus,  255, 255, 255,
                buttonPlusMinusPosition,  1,  1, 0 , 9, 1, 1);
        buttonPlusMinus.addActionListener(this);
        buttonPlusMinus.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonZeroPosition = new GridBagConstraints();
        setButtonInterface(buttonZero,  255, 255, 255,
                buttonZeroPosition,  1,  1, 1 , 9, 1, 1);
        buttonZero.addActionListener(this);
        buttonZero.setFont(new Font("Segoe UI", Font.BOLD, 17));

        GridBagConstraints buttonPointPosition = new GridBagConstraints();
        setButtonInterface(buttonPoint,  255, 255, 255,
                buttonPointPosition,  1,  1, 2 , 9, 1, 1);
        buttonPoint.addActionListener(this);
        buttonPoint.setFont(new Font("Segoe UI", Font.PLAIN, 17));

        GridBagConstraints buttonEqualsPosition = new GridBagConstraints();
        setButtonInterface(buttonEquals, 225,225, 225,
                buttonEqualsPosition,  1,  1, 3 , 9, 1, 1);
        buttonEquals.addActionListener(this);
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
        switch (userAction.getActionCommand()) {
            case ZERO_BUTTON -> algorithmIfDigitalButtonIsPushed("0");
            case ONE_BUTTON -> algorithmIfDigitalButtonIsPushed("1");
            case TWO_BUTTON -> algorithmIfDigitalButtonIsPushed("2");
            case THREE_BUTTON -> algorithmIfDigitalButtonIsPushed("3");
            case FOUR_BUTTON -> algorithmIfDigitalButtonIsPushed("4");
            case FIVE_BUTTON -> algorithmIfDigitalButtonIsPushed("5");
            case SIX_BUTTON -> algorithmIfDigitalButtonIsPushed("6");
            case SEVEN_BUTTON -> algorithmIfDigitalButtonIsPushed("7");
            case EIGHT_BUTTON -> algorithmIfDigitalButtonIsPushed("8");
            case NINE_BUTTON -> algorithmIfDigitalButtonIsPushed("9");
            case ADDITION_BUTTON -> algorithmIfOperationButtonIsPushed("+", "-", "\u00D7", "\u00F7", '+');
            case SUBTRACTION_BUTTON -> algorithmIfOperationButtonIsPushed("-", "+", "\u00D7", "\u00F7", '-');
            case MULTIPLICATION_BUTTON -> algorithmIfOperationButtonIsPushed("\u00D7", "+", "-", "\u00F7", '*');
            case DIVISION_BUTTON -> algorithmIfOperationButtonIsPushed("\u00F7", "+", "-", "\u00D7", '/');
            case PLUSMINUS_BUTTON -> algorithmIfPlusMinusButtonIsPushed();
            case EQUALS_BUTTON -> algorithmIfEqualButtonIsPushed();
            case POINT_BUTTON -> algorithmIfPointButtonIsPushed();
            case CLEAN_BUTTON -> algorithmIfCleanButtonIsPushed();
        }
    }

    public void algorithmIfDigitalButtonIsPushed (String digitButton) {
        if (pole2String.equals("0")) {
            pole2String = digitButton;
        } else {
            pole2String = pole2String + digitButton;
        }
        textLabel2.setText(pole2String);
    }
    
    public void algorithmIfOperationButtonIsPushed (String symbol,String symbol2, String symbol3, String symbol4, char operation) {
        if (pole1String.contains(symbol) && !pole2String.equals("")) {correctLabel1IfItTheSameSymbol(symbol, operation);}
        else if (pole1String.contains(symbol2) && pole2String.equals("")) {correctLabel1IfItHasAnotherSymbol(symbol);}
        else if (pole1String.contains(symbol3) && pole2String.equals("")) {correctLabel1IfItHasAnotherSymbol(symbol);}
        else if (pole1String.contains(symbol4) && pole2String.equals("")) {correctLabel1IfItHasAnotherSymbol(symbol);}
        else if (pole1String.contains(symbol) && pole2String.equals("")) {}   //ничего не делать, если символ уже был нажат
        else {
            pole1String = pole2String + symbol;
            textLabel1.setText(pole1String);
            pole1Double = Double.parseDouble(pole2String);
            textLabel2.setText(pole2String);
            pole2StringTemp = pole2String;
            pole2String = "";
        }
    }

    public void algorithmIfPlusMinusButtonIsPushed () {
        pole2Double = Double.parseDouble(pole2String);
        if (pole2Double % 1 == 0) {
            pole2Integer = (int) pole2Double;
            pole2Integer = -1 * pole2Integer;
            pole2String = Integer.toString(pole2Integer);
        } else {
            pole2Double = -1 * pole2Double;
            pole2String = Double.toString(pole2Double);
        }
        textLabel2.setText(pole2String);
    }

    public void algorithmIfCleanButtonIsPushed () {
        pole1String = "";
        pole2String = "0";
        textLabel1.setText(pole1String);
        textLabel2.setText(pole2String);
        pole2Double = Double.parseDouble(pole2String);
    }

    public void algorithmIfPointButtonIsPushed () {
        if (pole2String.contains(".")) {
            textLabel2.setText(pole2String);
        } else {
            pole2String = pole2String + ".";
            textLabel2.setText(pole2String);
        }
    }

    public void algorithmIfEqualButtonIsPushed () {
        if (pole1String.contains("+")) {calculating('+');}
        else if (pole1String.contains("-")) {calculating('-');}
        else if (pole1String.contains("\u00D7")) {calculating('*');}
        else if (pole1String.contains("\u00F7")) {calculating('/');}
    }

    public void calculating (char operation) {
        if (pole2String == "") {
            pole2String = pole2StringTemp;
        }
        pole1String = pole1String + pole2String;
        textLabel1.setText(pole1String + "=");
        pole2Double = Double.parseDouble(pole2String);
        switch (operation) {
            case '+' -> pole1Double = pole1Double + pole2Double;
            case '-' -> pole1Double = pole1Double - pole2Double;
            case '*' -> pole1Double = pole1Double * pole2Double;
            case '/' -> pole1Double = pole1Double / pole2Double;
        }
        doesTextHasPointOrNot();
        textLabel2.setText(pole2String);
    }

    public void correctLabel1IfItHasAnotherSymbol (String symbol) {
        doesTextHasPointOrNot();
        pole1String = pole1String + symbol;
        textLabel1.setText(pole1String);
    }
    public void correctLabel1IfItTheSameSymbol (String symbol, char operation) {
        pole2Double = Double.parseDouble(pole2String);
        switch (operation) {
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

    public void doesTextHasPointOrNot () {
        if (pole1Double % 1 == 0) {
            pole1Integer = (int) pole1Double;
            pole2String = Integer.toString(pole1Integer);
        } else {
            pole2String = Double.toString(pole1Double);
        }
    }
}

