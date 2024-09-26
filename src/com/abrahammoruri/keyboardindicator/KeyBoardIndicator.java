/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.abrahammoruri.keyboardindicator;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Admin
 */
public class KeyBoardIndicator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new IndicatorFrame().setVisible(true);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                IndicatorFrame.updateButtons();
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        }, 0, 500);
    }

    public static void listenForButtons(boolean yes) {
        Timer timer = new Timer();
        if (yes) {
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    IndicatorFrame.updateButtons();
                    //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            }, 0, 500);
        } else {
            timer.cancel();
        }
    }
}
