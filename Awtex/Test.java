package Awtex;

import java.awt.*;

public class Test {
        public static void main(String args[]) {
            Frame myFrame=new Frame("My first frame");
            Label nameLabel = new Label("Name");
            nameLabel.setBounds(100,50,100,50);
            nameLabel.setBackground(Color.red);
            nameLabel.setForeground(Color.white);
            myFrame.add(nameLabel);
            TextField nameTextField=new TextField();
            nameTextField.setBounds(230,50,200,30);
            myFrame.add(nameTextField);

            Label password = new Label("Password");
            password.setBounds(100,100,100,30);
            password.setBackground(Color.red);
            password.setForeground(Color.white);
            myFrame.add(password);
            TextField passfield=new TextField();
            passfield.setBounds(230,100,200,30);
            myFrame.add(passfield);

            myFrame.setLayout(null);
            myFrame.setVisible(true);
            myFrame.setSize(500,500);
        }
    }