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
    public static final double X = 300.0;
    public static final double Y = 180.0;
    public static final double SIZE = 80.0;
    public static final double STICK = 200.0;
    
    public Lollipop()
    {
        UI.initialise();
        UI.addButton("Quit", UI::quit);
    }

    /** draw a red lollipop on a stick */
    private void drawLollipop(){
        double left = X-SIZE/2.0;     // left of the lollipop
        double top = Y-SIZE/2.0;      // top of the lollipop
        double bottom = Y+STICK;      // bottom of the stick
        
        UI.setLineWidth(SIZE/8.0);// set line width to 10
        UI.drawLine(X, Y, X, bottom);// draw line (300, 200) to 300,400)
        UI.setLineWidth(1);//set line width to 1
        UI.setColor(Color.blue);// set color to blue
        UI.fillOval(left, top, SIZE, SIZE);//fill oval @(260, 160), 80x80
    }
    public static void main(String[] args){
        Lollipop obj = new Lollipop();
        obj.drawLollipop();
    }
}
