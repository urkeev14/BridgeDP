/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import mycompany.DrawAPI;
import mycompany.domain.Point;

/**
 *
 * @author urosv
 */
public class Circle extends Shape{

    private Point center;
    private int radius;
    
    public Circle(Point center, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(center, radius);
    }
    
}
