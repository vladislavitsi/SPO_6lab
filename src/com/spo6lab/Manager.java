package com.spo6lab;

/**
 * Created by Владислав on 11/25/2016.
 */
public class Manager {

    private Process[] manager = new Process[9];

    public void GO(){
        GUI gui = new GUI();
        gui.go(manager);
    }
}
