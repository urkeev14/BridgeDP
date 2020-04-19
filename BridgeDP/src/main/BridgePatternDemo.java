/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import client.Circle;
import client.Shape;
import mycompany.domain.Point;
import mycompany.impl.GreenCircle;
import mycompany.impl.RedCircle;

/**
 *
 * @author urosv
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(new Point(100, 100), 10, new RedCircle());
        Shape greenCircle = new Circle(new Point(200, 200), 20, new GreenCircle());
        
        redCircle.draw();
        greenCircle.draw();
    }

}
