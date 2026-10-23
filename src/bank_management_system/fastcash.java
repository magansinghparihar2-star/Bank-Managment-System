package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Date;

public class fastcash extends JFrame implements ActionListener {

    JButton rs100, rs200, rs1000, rs2000, rs500, rs5000, back;
    String pinnumber;

    fastcash(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 800);
        add(image);

        JLabel text = new JLabel("SELECT WITHDRAWAL AMOUNT");
        text.setBounds(215, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        image.add(text);

        rs100 = new JButton("RS 100");
        rs100.setBounds(170, 365, 150, 30);
        rs100.addActionListener(this);
        image.add(rs100);

        rs200 = new JButton("RS 200");
        rs200.setBounds(355, 365, 150, 30);
        rs200.addActionListener(this);
        image.add(rs200);

        rs500 = new JButton("RS 500");
        rs500.setBounds(170, 400, 150, 30);
        rs500.addActionListener(this);
        image.add(rs500);

        rs1000 = new JButton("RS 1000");
        rs1000.setBounds(355, 400, 150, 30);
        rs1000.addActionListener(this);
        image.add(rs1000);

        rs2000 = new JButton("RS 2000");
        rs2000.setBounds(170, 435, 150, 30);
        rs2000.addActionListener(this);
        image.add(rs2000);

        rs5000 = new JButton("RS 5000");
        rs5000.setBounds(355, 435, 150, 30);
        rs5000.addActionListener(this);
        image.add(rs5000);

        back = new JButton("Back");
        back.setBounds(355, 470, 150, 30);
        back.addActionListener(this);
        image.add(back);





        setSize(900, 900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);

    }
    public void actionPerformed (ActionEvent ae){
        if (ae.getSource() == back) {
           setVisible(false);
           new Transactions(pinnumber).setVisible(true);

        } else {
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            conn c = new conn();
            try {
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                int balance = 0;
                while (rs.next()) {
                    if (rs.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else {
                        balance -= Integer.parseInt(rs.getString("amount"));

                    }
                }
                if (ae.getSource() != back && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }

                Date date = new Date();
                String query = "insert into bank values ('"+pinnumber+"', '"+date+"', 'Withdrawal', '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "RS" + "Debited Successfully");

                setVisible(false);
                new Transactions(pinnumber).setVisible(true);

            } catch (Exception e) {
                System.out.println(e);

            }

        }


    }
    public static void main(String[] args) {
        new fastcash("");
    }
}
