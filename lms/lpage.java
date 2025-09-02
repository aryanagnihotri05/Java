package lms;

import java.awt.*;
import java.awt.event.*;

public class lpage {

        public static void main(String[] args) {
            Frame mainFrame = new Frame("Gym Management");

            Button Add_Member = new Button("Add Member");
            Button View_Member = new Button("View Member");
            Button Delete_Member = new Button("Delete Member");
            Button Exit = new Button("Exit");

            Add_Member.setBounds(120, 100, 150, 40);
            View_Member.setBounds(120, 150, 150, 40);
            Delete_Member.setBounds(120, 200, 150, 40);
            Exit.setBounds(120, 250, 150, 40);

            Add_Member.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    mainFrame.dispose();
                    Addmember();
                }
            });

            View_Member.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    mainFrame.dispose();
                    Viewmember();
                }
            });

            Delete_Member.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    mainFrame.dispose();
                    Deletemember();
                }
            });

            Exit.addActionListener(e -> System.exit(0));


            mainFrame.add(Add_Member);
            mainFrame.add(View_Member);
            mainFrame.add(Delete_Member);
            mainFrame.add(Exit);

            mainFrame.setSize(400, 400);
            mainFrame.setLayout(null);
            mainFrame.setVisible(true);

            mainFrame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    System.exit(0);
                }
            });
        }


        public static void Addmember() {
            Frame secondFrame = new Frame("Add Member");

            Label label = new Label("Welcome to the second screen!", Label.CENTER);
            label.setBounds(50, 100, 300, 40);
            secondFrame.add(label);

            secondFrame.setSize(400, 400);
            secondFrame.setLayout(null);
            secondFrame.setVisible(true);

            secondFrame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    System.exit(0);
                }
            });
        }

        public static void Deletemember() {
            Frame delframe = new Frame("Second Screen");

            Label label = new Label("Welcome to the second screen!", Label.CENTER);
            label.setBounds(50, 100, 300, 40);
            delframe.add(label);

            delframe.setSize(400, 400);
            delframe.setLayout(null);
            delframe.setVisible(true);

            delframe.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    System.exit(0);
                }
            });
        }

        public static void Viewmember() {
            Frame delframe = new Frame("View Member");

            Label label = new Label("Welcome to the second screen!", Label.CENTER);
            label.setBounds(50, 100, 300, 40);
            delframe.add(label);

            delframe.setSize(400, 400);
            delframe.setLayout(null);
            delframe.setVisible(true);

            delframe.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    System.exit(0);
                }
            });
        }
    }

