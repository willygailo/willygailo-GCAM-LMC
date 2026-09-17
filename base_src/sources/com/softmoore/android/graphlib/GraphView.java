package com.softmoore.android.graphlib;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class GraphView extends View {
    private Graph g;
    private int labelOffset;
    private Paint paint;
    private int pointRadius;
    private int textSize;
    private int tickOffset;

    public GraphView(Context context) {
        super(context);
        init();
    }

    public GraphView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void drawAxes(Canvas canvas) {
        int screenX = toScreenX(this.g.getAxisX());
        int screenY = toScreenY(this.g.getAxisY());
        Rect rect = new Rect();
        this.paint.setColor(this.g.getAxesColor());
        this.paint.setTextSize(this.textSize);
        if (isOnScreenY(screenY)) {
            float f = screenY;
            canvas.drawLine(0.0f, f, getWidth(), f, this.paint);
            this.paint.setTextAlign(Paint.Align.CENTER);
            if (this.g.getXLabels().size() > 0) {
                for (Label label : this.g.getXLabels()) {
                    String label2 = label.getLabel();
                    this.paint.getTextBounds(label2, 0, label2.length(), rect);
                    int iHeight = rect.height();
                    int screenX2 = toScreenX(label.getTick());
                    if (isOnScreenX(screenX2)) {
                        float f2 = screenX2;
                        int i = this.tickOffset;
                        canvas.drawLine(f2, screenY - i, f2, i + screenY, this.paint);
                        canvas.drawText(label2, f2, this.tickOffset + screenY + this.labelOffset + iHeight, this.paint);
                    }
                }
            } else {
                for (Double d : this.g.getXTicks()) {
                    String string = Double.toString(d.doubleValue());
                    if (d.doubleValue() == Math.rint(d.doubleValue())) {
                        string = Long.toString(Math.round(d.doubleValue()));
                    }
                    String str = string;
                    this.paint.getTextBounds(str, 0, str.length(), rect);
                    int iHeight2 = rect.height();
                    int screenX3 = toScreenX(d.doubleValue());
                    if (isOnScreenX(screenX3)) {
                        float f3 = screenX3;
                        int i2 = this.tickOffset;
                        canvas.drawLine(f3, screenY - i2, f3, i2 + screenY, this.paint);
                        canvas.drawText(str, f3, this.tickOffset + screenY + this.labelOffset + iHeight2, this.paint);
                    }
                }
            }
        }
        if (isOnScreenX(screenX)) {
            float f4 = screenX;
            canvas.drawLine(f4, 0.0f, f4, getHeight(), this.paint);
            this.paint.setTextAlign(Paint.Align.CENTER);
            if (this.g.getYLabels().size() > 0) {
                for (Label label3 : this.g.getYLabels()) {
                    String label4 = label3.getLabel();
                    this.paint.getTextBounds(label4, 0, label4.length(), rect);
                    int iHeight3 = rect.height();
                    int iWidth = rect.width();
                    int screenY2 = toScreenY(label3.getTick());
                    if (isOnScreenY(screenY2)) {
                        int i3 = this.tickOffset;
                        float f5 = screenY2;
                        canvas.drawLine(screenX - i3, f5, i3 + screenX, f5, this.paint);
                        canvas.drawText(label4, ((screenX - this.tickOffset) - this.labelOffset) - (iWidth / 2), screenY2 + (iHeight3 / 2), this.paint);
                    }
                }
                return;
            }
            Iterator<Double> it = this.g.getYTicks().iterator();
            while (it.hasNext()) {
                double dDoubleValue = it.next().doubleValue();
                String string2 = Double.toString(dDoubleValue);
                if (dDoubleValue == Math.rint(dDoubleValue)) {
                    string2 = Long.toString(Math.round(dDoubleValue));
                }
                String str2 = string2;
                this.paint.getTextBounds(str2, 0, str2.length(), rect);
                int iHeight4 = rect.height();
                int iWidth2 = rect.width();
                int screenY3 = toScreenY(dDoubleValue);
                if (isOnScreenY(screenY3)) {
                    int i4 = this.tickOffset;
                    float f6 = screenY3;
                    canvas.drawLine(screenX - i4, f6, i4 + screenX, f6, this.paint);
                    canvas.drawText(str2, ((screenX - this.tickOffset) - this.labelOffset) - (iWidth2 / 2), screenY3 + (iHeight4 / 2), this.paint);
                }
            }
        }
    }

    private void drawFunction(GraphFunction graphFunction, Canvas canvas) {
        List<ScreenPoint> screenPointsForFunction = getScreenPointsForFunction(graphFunction.getFunction());
        Path path = new Path();
        if (screenPointsForFunction.size() > 0) {
            ScreenPoint screenPoint = screenPointsForFunction.get(0);
            int x = screenPoint.getX();
            path.moveTo(screenPoint.getX(), screenPoint.getY());
            int x2 = x;
            for (int i = 1; i < screenPointsForFunction.size(); i++) {
                ScreenPoint screenPoint2 = screenPointsForFunction.get(i);
                if (screenPoint2.getX() == x2 + 1) {
                    path.lineTo(screenPoint2.getX(), screenPoint2.getY());
                } else {
                    path.moveTo(screenPoint2.getX(), screenPoint2.getY());
                }
                x2 = screenPoint2.getX();
            }
        }
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setColor(graphFunction.getColor());
        canvas.drawPath(path, this.paint);
    }

    private void drawFunctions(Canvas canvas) {
        Iterator<GraphFunction> it = this.g.getFunctions().iterator();
        while (it.hasNext()) {
            drawFunction(it.next(), canvas);
        }
    }

    private void drawGraphPoints(Canvas canvas) {
        Iterator<GraphPoints> it = this.g.getGraphPoints().iterator();
        while (it.hasNext()) {
            drawPoints(it.next(), canvas);
        }
    }

    private void drawLineGraph(GraphPoints graphPoints, Canvas canvas) {
        Path path = new Path();
        List<Point> points = graphPoints.getPoints();
        Point point = points.get(0);
        path.moveTo(toScreenX(point.getX()), toScreenY(point.getY()));
        for (int i = 1; i < points.size(); i++) {
            Point point2 = points.get(i);
            path.lineTo(toScreenX(point2.getX()), toScreenY(point2.getY()));
        }
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setColor(graphPoints.getColor());
        canvas.drawPath(path, this.paint);
    }

    private void drawLineGraphs(Canvas canvas) {
        Iterator<GraphPoints> it = this.g.getLineGraphs().iterator();
        while (it.hasNext()) {
            drawLineGraph(it.next(), canvas);
        }
    }

    private void drawPoints(GraphPoints graphPoints, Canvas canvas) {
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(graphPoints.getColor());
        for (Point point : graphPoints.getPoints()) {
            int screenX = toScreenX(point.getX());
            int screenY = toScreenY(point.getY());
            if (isNearScreenX(screenX) && isNearScreenY(screenY)) {
                canvas.drawCircle(screenX, screenY, this.pointRadius, this.paint);
            }
        }
    }

    private List<ScreenPoint> getScreenPointsForFunction(Function function) {
        ArrayList arrayList = new ArrayList(getWidth() + 2);
        for (int i = -1; i <= getWidth(); i++) {
            double dApply = function.apply(toWorldX(i));
            if (isFinite(dApply)) {
                int screenY = toScreenY(dApply);
                if (isNearScreenY(screenY)) {
                    arrayList.add(new ScreenPoint(i, screenY));
                }
            }
        }
        return arrayList;
    }

    private boolean isFinite(double d) {
        return Math.abs(d) <= Double.MAX_VALUE;
    }

    private boolean isNearScreenX(int i) {
        return Math.abs(i) <= getWidth() * 2;
    }

    private boolean isNearScreenY(int i) {
        return Math.abs(i) <= getHeight() * 2;
    }

    private boolean isOnScreenX(int i) {
        return i >= 0 && i < getWidth();
    }

    private boolean isOnScreenY(int i) {
        return i >= 0 && i <= getHeight();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b A[PHI: r0
      0x001b: PHI (r0v2 int) = (r0v1 int), (r0v4 int) binds: [B:4:0x000f, B:6:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    private ScreenPoint nextPoint(int i, Function function) {
        int screenY = Integer.MAX_VALUE;
        do {
            double dApply = function.apply(toWorldX(i));
            if (isFinite(dApply)) {
                screenY = toScreenY(dApply);
                if (!isNearScreenY(screenY)) {
                    i++;
                }
            } else {
                i++;
            }
            if (i > getWidth()) {
                break;
            }
        } while (!isNearScreenY(screenY));
        return new ScreenPoint(i, screenY);
    }

    protected void drawViewFrame(Canvas canvas) {
        canvas.drawColor(this.g.getBackgroundColor());
        this.paint.setColor(this.g.getAxesColor());
        this.paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.paint);
    }

    protected void init() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.densityDpi;
        int i2 = 5;
        if (i <= 120) {
            this.pointRadius = 3;
            this.tickOffset = 3;
            this.labelOffset = 3;
            this.textSize = 7;
        } else {
            if (i > 160) {
                if (i <= 240) {
                    this.pointRadius = 4;
                    this.tickOffset = 7;
                    this.labelOffset = 5;
                    this.textSize = 15;
                } else if (i <= 320) {
                    this.pointRadius = 6;
                    this.tickOffset = 7;
                    this.labelOffset = 5;
                    this.textSize = 20;
                    i2 = 2;
                } else if (i <= 480) {
                    this.pointRadius = 8;
                    this.tickOffset = 9;
                    this.labelOffset = 7;
                    this.textSize = 30;
                } else {
                    this.pointRadius = 10;
                    this.tickOffset = 10;
                    this.labelOffset = 9;
                    this.textSize = 35;
                    i2 = 3;
                }
                this.paint = new Paint();
                this.paint.setAntiAlias(true);
                this.paint.setStyle(Paint.Style.STROKE);
                this.paint.setStrokeWidth(i2);
            }
            this.pointRadius = 3;
            this.tickOffset = 4;
            this.labelOffset = 3;
            this.textSize = 8;
        }
        i2 = 1;
        this.paint = new Paint();
        this.paint.setAntiAlias(true);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(i2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        drawViewFrame(canvas);
        drawAxes(canvas);
        drawFunctions(canvas);
        drawGraphPoints(canvas);
        drawLineGraphs(canvas);
    }

    public void setGraph(Graph graph) {
        this.g = graph;
        invalidate();
    }

    public int toScreenX(double d) {
        double width = getWidth();
        double xMax = this.g.getXMax() - this.g.getXMin();
        Double.isNaN(width);
        return (int) ((width / xMax) * (d - this.g.getXMin()));
    }

    public int toScreenY(double d) {
        double height = getHeight();
        double yMin = this.g.getYMin() - this.g.getYMax();
        Double.isNaN(height);
        return (int) ((height / yMin) * (d - this.g.getYMax()));
    }

    public double toWorldX(int i) {
        double xMax = this.g.getXMax() - this.g.getXMin();
        double width = getWidth();
        Double.isNaN(width);
        double d = xMax / width;
        double d2 = i;
        Double.isNaN(d2);
        return (d * d2) + this.g.getXMin();
    }

    public double toWorldY(int i) {
        double yMin = this.g.getYMin() - this.g.getYMax();
        double height = getHeight();
        Double.isNaN(height);
        double d = yMin / height;
        double d2 = i;
        Double.isNaN(d2);
        return (d * d2) + this.g.getYMax();
    }
}
