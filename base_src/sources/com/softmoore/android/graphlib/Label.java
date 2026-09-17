package com.softmoore.android.graphlib;

/* JADX INFO: loaded from: classes2.dex */
public class Label {
    private String label;
    private double tick;

    public Label(double d, String str) {
        this.tick = d;
        this.label = str;
    }

    public String getLabel() {
        return this.label;
    }

    public double getTick() {
        return this.tick;
    }
}
