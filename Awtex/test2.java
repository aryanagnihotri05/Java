package Awtex;

import javax.swing.*;
import java.awt.*;

public class test2{
    public static void main(String[] args) {
        JFrame f = new JFrame("my frame");
        Label name = new Label("NAME");
        name.setBounds(100,50,100,30);
        f.add(name);
        TextField nametextfield = new TextField();
        nametextfield.setBounds(230, 50, 200, 30);
        f.add(nametextfield);

        Label password = new Label("PASSWORD");
        password.setBounds(100,130,100,30);
        f.add(password);
        TextField passwordtextfield = new TextField();
        passwordtextfield.setBounds(230, 130, 200, 30);
        f.add(passwordtextfield);

        Label c = new Label("CITY");
        c.setBounds(100,210,100,30);
        f.add(c);
        TextField citytextfield = new TextField();
        citytextfield.setBounds(230, 210, 200, 30);
        f.add(citytextfield);

        Label h = new Label("HOBBIES");
        h.setBounds(100,290,100,30);
        f.add(h);

        Label b = new Label("football");
        b.setBounds(250,290,100,30);
        f.add(b);

        Label r = new Label("cricket");
        r.setBounds(250,325,100,30);
        f.add(r);

        Label g = new Label("GENDER");
        g.setBounds(100,405,100,30);
        f.add(g);

        Label m = new Label("male");
        m.setBounds(250,405,100,30);
        f.add(m);

        Label x = new Label("female");
        x.setBounds(355,405,100,30);
        f.add(x);

        Label s = new Label("SUBMIT");
        s.setBounds(230,450,50,30);
        f.add(s);
        s.setBackground(Color.cyan);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);
    }
}
