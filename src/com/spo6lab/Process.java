package com.spo6lab;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by Владислав on 11/25/2016.
 */
public class Process{
    private int numb;
    private String message;
    private JLabel titleStatus;
    private JLabel titleInbox;
    private JLabel titleTime;
    private JLabel status;
    private JLabel inbox;
    private JLabel time;
    private JPanel panel;
    private boolean recived = false;

    /**
     * Конструктор класса Процесс, принимает его порядковый номер и личное сообщение
     *
     * @param numb
     * @param message
     */
    public Process(int numb, String message, JPanel panel) {
        this.numb = numb;
        this.message = message;
        //Инициализация панели процесса
        this.panel = panel;
        this.panel.setBackground(Color.white);
        this.panel.setLayout(new GridLayout(4,2));
        Border matteBorder = BorderFactory.createMatteBorder(1,1,5,5,Color.GRAY);
        Border titled = BorderFactory.createTitledBorder(matteBorder, "[ Процесс #"+numb+" ]");
        this.panel.setBorder(titled);
        //Инициализация текстовых полей
        Font fontB = new Font("myBoldFont", Font.BOLD, 13);
        Font fontN = new Font("myBoldFont", Font.ITALIC, 13);
        this.titleStatus = new JLabel("Статус: ");
        this.titleStatus.setFont(fontB);
        this.titleInbox = new JLabel("Входящее: ");
        this.titleInbox.setFont(fontB);
        this.titleTime = new JLabel("Время: ");
        this.titleTime.setFont(fontB);
        this.status = new JLabel("Процесс #"+this.numb+" создан");
        this.status.setFont(fontN);
        this.inbox = new JLabel("Не было входящих сообщений");
        this.inbox.setFont(fontN);
        this.time = new JLabel("");
        this.time.setFont(fontN);
        //Добавление текстовых полей на панель
        this.panel.add(this.titleStatus);
        this.panel.add(this.status);
        this.panel.add(this.titleTime);
        this.panel.add(this.time);
        this.panel.add(this.titleInbox);
        this.panel.add(this.inbox);
    }

    public void setActive(boolean isActive){
        if (isActive) panel.setBackground(Color.yellow);
        else panel.setBackground(Color.white);
    }


    public void getMessage(String message, int numb) {
        this.recived = true;
        this.status.setText("Получил сообщение от " + numb + " процесса");
        this.inbox.setText(message);
    }

    public String sendMessage(int numb) {
        this.status.setText("Отправленно -> #"+numb);
        return this.message;
    }

    public int getNumb() {
        return numb;
    }

    public JPanel getPanel() {
        return panel;
    }


}