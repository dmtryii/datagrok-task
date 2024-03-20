package com.dmtryii;

/*
    class Rect {
        double x, y, width, height;
        // you can use x1, y1, x2, y2 properties, too
    }

    double intersectionArea(Rect r1, Rect r2)
 */

public class Rect {
    double x, y, width, height;

    public Rect(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double intersectionArea(Rect rect) {
        double overlapX = Math.max(0, Math.min(this.x + this.width, rect.x + rect.width) - Math.max(this.x, rect.x));
        double overlapY = Math.max(0, Math.min(this.y + this.height, rect.y + rect.height) - Math.max(this.y, rect.y));
        return overlapX * overlapY;
    }
}
