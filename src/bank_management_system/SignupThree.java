package bank_management_system;

import javax.swing.*;
import java.awt.*;

public class SignupThree extends JFrame {
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton next;

    SignupThree(){
        setLayout(null);
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("inter", Font.BOLD, 20));
        l1.setBounds(290,40,400,40);
        add(l1);

        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("inter", Font.BOLD, 20));
        type.setBounds(100,140,200,30);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("inter", Font.BOLD, 15));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 180, 200, 20);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("inter", Font.BOLD, 15));
        r2.setBackground(Color.WHITE);
        r2.setBounds(400, 180, 230, 20);

        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("inter", Font.BOLD, 15));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 220, 200, 20);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("inter", Font.BOLD, 15));
        r4.setBackground(Color.WHITE);
        r4.setBounds(400, 220, 230, 20);
        add(r4);

        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);

        JLabel cardnumber = new JLabel("Card Number");
        cardnumber.setFont(new Font("inter", Font.BOLD, 20));
        cardnumber.setBounds(100,300,200,30);
        add(cardnumber);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-7869");
        number.setFont(new Font("inter", Font.BOLD, 20));
        number.setBounds(330,300,300,30);
        add(number);

        JLabel carddetail = new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("inter", Font.BOLD, 11));
        carddetail.setBounds(100,330,300,30);
        add(carddetail);

        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("inter", Font.BOLD, 20));
        pin.setBounds(100,370,200,30);
        add(pin);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("inter", Font.BOLD, 20));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);

        JLabel pindetail = new JLabel("Your 4 Digit PIN");
        pindetail.setFont(new Font("inter", Font.BOLD, 11));
        pindetail.setBounds(100,400,300,30);
        add(pindetail);

        JLabel services = new JLabel("Service Required:");
        services.setFont(new Font("inter", Font.BOLD, 20));
        services.setBounds(100,450,200,30);
        add(services);

        c1 = new JCheckBox(" ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("inter", Font.BOLD, 15));
        c1.setBounds(100, 500, 200, 30);
        add(c1);

        c2 = new JCheckBox(" Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("inter", Font.BOLD, 15));
        c2.setBounds(350, 500, 200, 30);
        add(c2);

        c3 = new JCheckBox(" Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("inter", Font.BOLD, 15));
        c3.setBounds(100, 550, 200, 30);
        add(c3);

        c4 = new JCheckBox(" EMAIL & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("inter", Font.BOLD, 15));
        c4.setBounds(350, 550, 200, 30);
        add(c4);

        c5 = new JCheckBox(" Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("inter", Font.BOLD, 15));
        c5.setBounds(100, 600, 200, 30);
        add(c5);

        c6 = new JCheckBox(" E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("inter", Font.BOLD, 15));
        c6.setBounds(350, 600, 200, 30);
        add(c6);

        c7 = new JCheckBox(" I Hereby declares that the above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("inter", Font.BOLD, 11));
        c7.setBounds(100, 680, 550, 30);
        add(c7);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("inter", Font.BOLD, 14));
        next.setBounds(620, 730, 80, 30);
        add(next);

        setSize(850, 820);
        setLocation(350,0);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SignupThree();
    }
}
