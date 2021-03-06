package com.google.ar.core.examples.java.helloar;

import com.google.gson.Gson;

/**
 * Written by Bartosz Szczygiel <eziosoft@gmail.com>
 * Created on 02/10/2018.
 */
public class Point {
    public float x;
    public float y;
    public float z;


    public Point(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public void set(Point p) {
        this.x = p.x;
        this.y = p.y;
        this.z = p.z;
    }

    public Point getPoint() {
        return new Point(x, y, z);
    }


    float getDistance2D(Point p) {
        float deltaX = (x - p.x) * (x - p.x);
        float deltaY = (z - p.z) * (z - p.z);
        return (float) Math.sqrt(deltaX + deltaY);
    }


}
