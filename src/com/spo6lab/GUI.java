package com.spo6lab;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by Владислав on 11/25/2016.
 */
public class GUI {

    private JPanel panel;
    private JFrame frame;


    public void go(Process manager[]){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setLayout(new GridLayout(3,2,10,10));

        frame.setContentPane(panel);
        frame.setSize(1200,600);
        frame.setVisible(true);

        for(int i=0;i<9;i++){
            try {
                manager[i] = new Process(i, "Привет о процесса "+i, new JPanel());
                panel.add(manager[i].getPanel());
                frame.setVisible(true);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        manager[5].getPanel().setBackground(Color.yellow);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }




    public JPanel getPanel() {
        return panel;
    }
    public JFrame getFrame() {
        return frame;
    }
}
