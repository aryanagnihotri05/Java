package lms;

import java.awt.*;
import java.awt.event.*;

public class login_page {
    public static void main(String[] args){
        // Create the main frame
        Frame mainFrame = new Frame("Main Screen");
        Button openNewScreenButton = new Button("Open New Screen");

        // Set button position and size
        openNewScreenButton.setBounds(100, 100, 120, 40);

        // Add an ActionListener to the button
        openNewScreenButton.addActionListener(e -> {
            Frame newScreen = new Frame("New Screen");

            // Set properties for the new frame
            newScreen.setSize(300, 200);
            newScreen.setLayout(null);
            newScreen.setVisible(true);

            // Add a label to the new frame
            Label newScreenLabel = new Label("This is a new screen", Label.CENTER);
            newScreenLabel.setBounds(50, 50, 200, 40);
            newScreen.add(newScreenLabel);

            // Add a window closing event to the new frame
            newScreen.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    newScreen.dispose();  // Close only the new screen
                }
            });
        });
        // Add button to the main frame
        mainFrame.add(openNewScreenButton);
        // Set properties for the main frame
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);

        // Add a window closing event to the main frame
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);  // Exit the application
            }
        });
    }
}