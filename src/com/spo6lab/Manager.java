package com.spo6lab;

/**
 * Created by Владислав on 11/25/2016.
 */
public class Manager {

    public static final int COUNT = 9;
    public static final int CREATEINTERRUPT = 500;
    public static final int GOINTERRUPT = 10;
    private Process[] manager = new Process[COUNT];
    private int active;
    private int recieve;

    public void GO(){
        GUI gui = new GUI(manager);
        while (true){
            active = (int) (Math.random()*COUNT);
            recieve = (int) (Math.random()*COUNT);
            manager[active].setActive(true);
            gui.update();
            manager[recieve].getMessage(manager[active].sendMessage(recieve),active);
            gui.update();
            manager[active].setActive(false);
            gui.update();
        }
    }
}
