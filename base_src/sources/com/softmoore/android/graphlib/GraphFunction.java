package com.softmoore.android.graphlib;

/* JADX INFO: loaded from: classes2.dex */
class GraphFunction {
    private int color;
    private Function f;

    GraphFunction(Function function, int i) {
        this.f = function;
        this.color = i;
    }

    public int getColor() {
        return this.color;
    }

    Function getFunction() {
        return this.f;
    }
}
