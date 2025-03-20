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
    
    
    public Lollipop()
    {
        UI.initialise();
        UI.addButton("Quit", UI::quit);
    }
    
    /** Draw a lollipop at (300, 180) asking the user for its size */
    public void doDrawLollipop(){
        double diam =UI.askDouble("Diameter: ");
        drawLollipop(300, 180, diam, 200);
        drawLollipop(50, 60, diam/2.0, 90);
        drawLollipop(400, 100, diam, 70);
    }

    /** draw a blue lollipop on a stick */
    private void drawLollipop(double x, double y, double size, double stick){
        double left = x-size/2.0;     // left of the lollipop
        double top = y-size/2.0;      // top of the lollipop
        double bottom = y+stick;      // bottom of the stick
        
        UI.setLineWidth(size/8.0);// set line width to 10
        UI.drawLine(x, y, x, bottom);// draw line (300, 200) to 300,400)
        UI.setLineWidth(1);//set line width to 1
        UI.setColor(Color.blue);// set color to blue
        UI.fillOval(left, top, size, size);//fill oval @(260, 160), 80x80
    }
    public static void main(String[] args){
        Lollipop obj = new Lollipop();
        obj.doDrawLollipop();
    }
}
