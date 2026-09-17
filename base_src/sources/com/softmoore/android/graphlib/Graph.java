package com.softmoore.android.graphlib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Graph {
    private final int axesColor;
    private final double axisX;
    private final double axisY;
    private final int bgColor;
    private final List<GraphFunction> functions;
    private final List<GraphPoints> graphPoints;
    private final List<GraphPoints> lineGraphs;
    private final List<Label> xLabels;
    private final double xMax;
    private final double xMin;
    private final List<Double> xTicks;
    private final List<Label> yLabels;
    private final double yMax;
    private final double yMin;
    private final List<Double> yTicks;

    public static class Builder {
        private List<GraphFunction> functions = new ArrayList(5);
        private List<GraphPoints> graphPoints = new ArrayList(5);
        private List<GraphPoints> lineGraphs = new ArrayList(5);
        private int bgColor = -1;
        private int axesColor = -16777216;
        private int functColor = -16777216;
        private int pointColor = -16777216;
        private double xMin = -10.0d;
        private double xMax = 10.0d;
        private double yMin = -10.0d;
        private double yMax = 10.0d;
        private double axisX = 0.0d;
        private double axisY = 0.0d;
        Double[] defaultTicks = {Double.valueOf(-8.0d), Double.valueOf(-6.0d), Double.valueOf(-4.0d), Double.valueOf(-2.0d), Double.valueOf(2.0d), Double.valueOf(4.0d), Double.valueOf(6.0d), Double.valueOf(8.0d)};
        private List<Double> xTicks = Arrays.asList(this.defaultTicks);
        private List<Double> yTicks = Arrays.asList(this.defaultTicks);
        private List<Label> xLabels = new ArrayList(10);
        private List<Label> yLabels = new ArrayList(10);

        public Builder addFunction(Function function) {
            this.functions.add(new GraphFunction(function, this.functColor));
            return this;
        }

        public Builder addFunction(Function function, int i) {
            this.functions.add(new GraphFunction(function, i));
            return this;
        }

        public Builder addLineGraph(List<Point> list) {
            this.lineGraphs.add(new GraphPoints(list, this.pointColor));
            return this;
        }

        public Builder addLineGraph(List<Point> list, int i) {
            this.lineGraphs.add(new GraphPoints(list, i));
            return this;
        }

        public Builder addLineGraph(Point[] pointArr) {
            this.lineGraphs.add(new GraphPoints(Arrays.asList(pointArr), this.pointColor));
            return this;
        }

        public Builder addLineGraph(Point[] pointArr, int i) {
            this.lineGraphs.add(new GraphPoints(Arrays.asList(pointArr), i));
            return this;
        }

        public Builder addPoints(List<Point> list) {
            this.graphPoints.add(new GraphPoints(list, this.pointColor));
            return this;
        }

        public Builder addPoints(List<Point> list, int i) {
            this.graphPoints.add(new GraphPoints(list, i));
            return this;
        }

        public Builder addPoints(Point[] pointArr) {
            this.graphPoints.add(new GraphPoints(Arrays.asList(pointArr), this.pointColor));
            return this;
        }

        public Builder addPoints(Point[] pointArr, int i) {
            this.graphPoints.add(new GraphPoints(Arrays.asList(pointArr), i));
            return this;
        }

        public Graph build() {
            return new Graph(this);
        }

        public Builder setAxes(double d, double d2) {
            this.axisX = d;
            this.axisY = d2;
            return this;
        }

        public Builder setAxesColor(int i) {
            this.axesColor = i;
            return this;
        }

        public Builder setBackgroundColor(int i) {
            this.bgColor = i;
            return this;
        }

        public Builder setFunctionColor(int i) {
            this.functColor = i;
            return this;
        }

        public Builder setPointColor(int i) {
            this.pointColor = i;
            return this;
        }

        public Builder setWorldCoordinates(double d, double d2, double d3, double d4) {
            this.xMin = d;
            this.xMax = d2;
            this.yMin = d3;
            this.yMax = d4;
            return this;
        }

        public Builder setXLabels(List<Label> list) {
            this.xLabels = list;
            return this;
        }

        public Builder setXLabels(Label[] labelArr) {
            this.xLabels = Arrays.asList(labelArr);
            return this;
        }

        public Builder setXTicks(List<Double> list) {
            this.xTicks = list;
            return this;
        }

        public Builder setXTicks(double[] dArr) {
            ArrayList arrayList = new ArrayList(dArr.length);
            for (double d : dArr) {
                arrayList.add(Double.valueOf(d));
            }
            this.xTicks = arrayList;
            return this;
        }

        public Builder setYLabels(List<Label> list) {
            this.yLabels = list;
            return this;
        }

        public Builder setYLabels(Label[] labelArr) {
            this.yLabels = Arrays.asList(labelArr);
            return this;
        }

        public Builder setYTicks(List<Double> list) {
            this.yTicks = list;
            return this;
        }

        public Builder setYTicks(double[] dArr) {
            ArrayList arrayList = new ArrayList(dArr.length);
            for (double d : dArr) {
                arrayList.add(Double.valueOf(d));
            }
            this.yTicks = arrayList;
            return this;
        }
    }

    private Graph(Builder builder) {
        this.functions = builder.functions;
        this.graphPoints = builder.graphPoints;
        this.lineGraphs = builder.lineGraphs;
        this.bgColor = builder.bgColor;
        this.axesColor = builder.axesColor;
        this.xMin = builder.xMin;
        this.xMax = builder.xMax;
        this.yMin = builder.yMin;
        this.yMax = builder.yMax;
        this.axisX = builder.axisX;
        this.axisY = builder.axisY;
        this.xTicks = builder.xTicks;
        this.yTicks = builder.yTicks;
        this.xLabels = builder.xLabels;
        this.yLabels = builder.yLabels;
    }

    public int getAxesColor() {
        return this.axesColor;
    }

    public double getAxisX() {
        return this.axisX;
    }

    public double getAxisY() {
        return this.axisY;
    }

    public int getBackgroundColor() {
        return this.bgColor;
    }

    public List<GraphFunction> getFunctions() {
        return this.functions;
    }

    public List<GraphPoints> getGraphPoints() {
        return this.graphPoints;
    }

    public List<GraphPoints> getLineGraphs() {
        return this.lineGraphs;
    }

    public List<Label> getXLabels() {
        return this.xLabels;
    }

    public double getXMax() {
        return this.xMax;
    }

    public double getXMin() {
        return this.xMin;
    }

    public List<Double> getXTicks() {
        return this.xTicks;
    }

    public List<Label> getYLabels() {
        return this.yLabels;
    }

    public double getYMax() {
        return this.yMax;
    }

    public double getYMin() {
        return this.yMin;
    }

    public List<Double> getYTicks() {
        return this.yTicks;
    }
}
