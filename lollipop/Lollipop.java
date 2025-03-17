/*
 * code for lollipop GUI
 */

import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;


/**
 * Write a description of class Lollipop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lollipop
{
    // instance variables - replace the example below with your own
    public Lollipop()
    {
        UI.initialise();
        UI.addButton("Quit", UI::quit);
    }

    /** draw a red lollipop on a stick */
    private void drawLollipop(){
        UI.setLineWidth(10);// set line width to 10
        UI.drawLine(300, 200, 300, 400);// draw line (300, 200) to 300,400)
        UI.setLineWidth(1);//set line width to 1
        UI.setColor(Color.blue);// set color to blue
        UI.fillOval(260, 160, 80, 80);//fill oval @(260, 160), 80x80
    }
    public static void main(String[] args){
        Lollipop obj = new Lollipop();
        obj.drawLollipop();
    }
}
