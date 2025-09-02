package Awtex;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JLabel namelabel = new JLabel("Name: ");
        namelabel.setBounds(100,50,100,30);
        f.add(namelabel);
        JTextField namefield = new JTextField();
        namefield.setBounds(230,50,200,30);
        f.add(namefield);

        JLabel passlabel = new JLabel("Password: ");
        passlabel.setBounds(100,100,100,30);
        f.add(passlabel);
        JTextField passfield = new JTextField();
        passfield.setBounds(230,100,200,30);
        f.add(passfield);

        JLabel address = new JLabel("Address: ");
        address.setBounds(100,150,100,30);
        f.add(address);
        JTextField addfield = new JTextField();
        addfield.setBounds(230,150,200,30);
        f.add(addfield);

        JLabel gender = new JLabel("Gender : ");
        gender.setBounds(100,200,100,30);
        f.add(gender);
        JRadioButton m = new JRadioButton("Male: ");
        m.setBounds(200,200,100,30);
        f.add(m);

        JRadioButton fe = new JRadioButton("Female: ");
        fe.setBounds(300,200,100,30);
        f.add(fe);

        JLabel hobby = new JLabel("Hobby : ");
        hobby.setBounds(100,250,100,30);
        f.add(hobby);

        JRadioButton foot = new JRadioButton("Football: ");
        foot.setBounds(200,250,100,30);
        f.add(foot);

        JRadioButton cric = new JRadioButton("Cricket: ");
        cric.setBounds(300,250,100,30);
        f.add(cric);

        foot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (foot.isSelected()) {
                    System.out.println("Option 1 selected");
                }
            }
        });

        cric.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cric.isSelected()) {
                    System.out.println("Option 2 selected");
                }
            }
        });

        JLabel cityLabel = new JLabel("City:");
        cityLabel.setBounds(100,300,100,30);
        f.add(cityLabel);
        String citiesNames[] = {"Jaipur","Ajmer","Bikaner","Jodhpur"};
        JComboBox cityField = new JComboBox(citiesNames);
        cityField.setBounds(230,300,200,30);
        f.add(cityField);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);

    }
}
