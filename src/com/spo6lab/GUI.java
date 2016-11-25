package com.spo6lab;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Владислав on 11/25/2016.
 */
public class GUI {

    private JPanel panel;
    private JFrame frame;

    /**
     * Конструктор класса GUI инициализирующий графический интерфейс
     * и инициализирующий создание процессов
     * @param manager
     */
    public GUI(Process manager[]) {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setLayout(new GridLayout(3,2,10,10));

        frame.setContentPane(panel);
        frame.setSize(1200,600);
        frame.setVisible(true);

        for(int i=0;i<Manager.COUNT;i++){
            try {
                manager[i] = new Process(i, "Привет от процесса #"+i, new JPanel());
                panel.add(manager[i].getPanel());
                frame.setVisible(true);
                Thread.sleep(Manager.CREATEINTERRUPT);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public void update(){
        frame.setVisible(true);
        try {
            Thread.sleep(Manager.GOINTERRUPT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public JPanel getPanel() {
        return panel;
    }
    public JFrame getFrame() {
        return frame;
    }
}
