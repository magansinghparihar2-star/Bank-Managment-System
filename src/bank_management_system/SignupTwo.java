package bank_management_system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SignupTwo extends JFrame implements ActionListener {

    JTextField aadharTextField, panTexrField;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, income, occupation, education;
    String formno;


    SignupTwo(String formno) {
        this.formno = formno;
        setLayout(null);

        setTitle("New ACCOUNT APPLICATION FORM - PAGE 2");


        JLabel additionalDetails = new JLabel("page 2 : Additional Details");
        additionalDetails.setFont(new Font("inter", Font.BOLD, 20));
        additionalDetails.setBounds(290, 80, 400, 40);
        add(additionalDetails);

        JLabel name = new JLabel("Religion :");
        name.setFont(new Font("inter", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox<>(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel Fname = new JLabel("Category :");
        Fname.setFont(new Font("inter", Font.BOLD, 20));
        Fname.setBounds(100, 190, 200, 30);
        add(Fname);

        String valCategroy[] = {"General", "Obc", "Sc/St", "Other"};
        category = new JComboBox(valCategroy);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel DOB = new JLabel("Income :");
        DOB.setFont(new Font("inter", Font.BOLD, 20));
        DOB.setBounds(100, 240, 200, 30);
        add(DOB);

        String incomeCategory[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("inter", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        JLabel email = new JLabel("Qualification :");
        email.setFont(new Font("inter", Font.BOLD, 20));
        email.setBounds(100, 315, 200, 30);
        add(email);

        String valQualification[] = {"Below High School", "High School", "Higher Secondary", "Bachelor Degree",
                "Master Degree", "Doctorate", "Professional Degree"};
        education = new JComboBox(valQualification);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel marital = new JLabel("Occupation :");
        marital.setFont(new Font("inter", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);

        String valOccupation[] = {"Salaried", "Self-Employed", "Student", "Retired", "Other"};
        occupation = new JComboBox(valOccupation);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel pan = new JLabel(" Pan Number: ");
        pan.setFont(new Font("inter", Font.BOLD, 20));
        pan.setBounds(100, 440, 200, 30);
        add(pan);

        panTexrField = new JTextField();
        panTexrField.setFont(new Font("inter", Font.BOLD, 14));
        panTexrField.setBounds(300, 440, 400, 30);
        add(panTexrField);

        JLabel aadhar = new JLabel(" Aadhar Number: ");
        aadhar.setFont(new Font("inter", Font.BOLD, 20));
        aadhar.setBounds(100, 490, 200, 30);
        add(aadhar);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("inter", Font.BOLD, 14));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);

        JLabel state = new JLabel(" Senior Citizen: ");
        state.setFont(new Font("inter", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup seniorC = new ButtonGroup();
        seniorC.add(syes);
        seniorC.add(sno);

        JLabel pincode = new JLabel(" Existing Account: ");
        pincode.setFont(new Font("inter", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup Existingacc = new ButtonGroup();
        Existingacc.add(eyes);
        Existingacc.add(eno);


        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("inter", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 100);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae) {
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String senoircitizen = null;
        if (syes.isSelected()) {
            senoircitizen = "Yes";
        } else if (sno.isSelected()) {
            senoircitizen = "No";

        }
        String existingaccount = null;
        if (eyes.isSelected()) {
            existingaccount = "Yes";
        } else if (eno.isSelected()) {
            existingaccount = "No";
        }
        String pan = panTexrField.getText();
        String aadhar = aadharTextField.getText();

        try {
            conn c = new conn();
            String query = "insert into signuptwo values ('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+pan+"', '"+aadhar+"', '"+ senoircitizen+"', '"+existingaccount+"')";
            c.s.executeUpdate(query);
            {
                //signupthree
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        new SignupTwo("");
        {

        }
    }
}


