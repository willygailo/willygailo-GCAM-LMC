package com.softmoore.android.graphlib;

/* JADX INFO: loaded from: classes2.dex */
public class Point implements Comparable<Point> {
    private double x;
    private double y;

    public Point(double d, double d2) {
        this.x = d;
        this.y = d2;
    }

    @Override // java.lang.Comparable
    public int compareTo(Point point) {
        double d = this.x;
        double d2 = point.x;
        if (d < d2) {
            return -1;
        }
        return d == d2 ? 0 : 1;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
}
