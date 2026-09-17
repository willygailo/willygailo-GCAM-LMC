package com.softmoore.android.graphlib;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class GraphPoints {
    private int color;
    private List<Point> points;

    GraphPoints(List<Point> list, int i) {
        this.points = list;
        this.color = i;
        Collections.sort(list);
    }

    int getColor() {
        return this.color;
    }

    List<Point> getPoints() {
        return this.points;
    }
}
