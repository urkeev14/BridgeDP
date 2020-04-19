/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany.impl;

import mycompany.DrawAPI;
import mycompany.domain.Point;

/**
 *
 * @author urosv
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(Point center, int radius) {
        System.out.println("Drawing RED circle...");
        System.out.println("Radius: " + radius);
        System.out.println("Center: " + center.toString());
        System.out.println();
    }

}
