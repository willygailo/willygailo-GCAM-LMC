package com.google.android.libraries.memorymonitor;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import defpackage.mis;
import defpackage.mit;
import defpackage.miv;

/* JADX INFO: loaded from: classes.dex */
public class MemoryMonitorView extends View {
    public static final float a;
    private static final Runtime h;
    public final long b;
    public final long c;
    public final long d;
    public final float e;
    public final mit f;
    public volatile mis g;
    private Resources i;
    private int j;
    private int k;
    private Paint l;
    private Paint m;
    private Paint n;
    private float o;
    private float p;
    private float q;
    private final GestureDetector r;
    private final miv s;

    static {
        Runtime runtime = Runtime.getRuntime();
        h = runtime;
        a = b(runtime.maxMemory());
    }

    public MemoryMonitorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new mit();
        this.g = new mis();
        miv mivVar = new miv(this);
        this.s = mivVar;
        this.i = context.getResources();
        this.j = a(context, 45);
        this.k = a(context, 140);
        this.l = new Paint();
        Paint paint = new Paint();
        this.m = paint;
        paint.setStrokeWidth(a(context, 1));
        this.p = a(context, 2);
        this.q = a(context, 7);
        Paint paint2 = new Paint();
        this.n = paint2;
        paint2.setColor(-16777216);
        this.n.setTextSize(this.q);
        ActivityManager activityManager = (ActivityManager) getContext().getSystemService("activity");
        this.b = activityManager.getMemoryClass();
        this.c = activityManager.getLargeMemoryClass();
        this.d = h.maxMemory();
        this.e = this.i.getDisplayMetrics().heightPixels / 2;
        this.r = new GestureDetector(context, mivVar);
    }

    public static int a(Context context, int i) {
        return Math.round(i * context.getResources().getDisplayMetrics().density);
    }

    public static long b(double d) {
        return Math.round(d / 1048576.0d);
    }

    private final float c(long j) {
        long j2 = this.d;
        if (j2 == 0) {
            return 0.0f;
        }
        return (j / j2) * this.o;
    }

    private final float d(long j, int i, int i2, Canvas canvas, int i3) {
        this.l.setColor(i3);
        float fC = c(j);
        float width = (getWidth() * i2) / 3.0f;
        float height = (getHeight() - i) - fC;
        RectF rectF = new RectF(width, height, (getWidth() / 3.0f) + width, height + fC);
        float f = this.p;
        canvas.drawRoundRect(rectF, f, f, this.l);
        int height2 = getHeight();
        float f2 = this.q;
        long jB = b(j);
        StringBuilder sb = new StringBuilder(21);
        sb.append(jB);
        sb.append("M");
        canvas.drawText(sb.toString(), (i2 * getWidth()) / 3.0f, ((height2 - i) - fC) + (fC / 2.0f) + (f2 / 2.0f), this.n);
        return fC;
    }

    private final void e(int i, Canvas canvas, int i2) {
        d(0L, 0, i, canvas, i2);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        this.j = a(getContext(), 45);
        this.k = a(getContext(), 140);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.l.setColor(-7829368);
        this.o = getHeight() * 0.5f;
        RectF rectF = new RectF(0.0f, getHeight() - this.o, getWidth(), getHeight());
        float f = this.p;
        canvas.drawRoundRect(rectF, f, f, this.l);
        mis misVar = this.g;
        long j = this.f.c;
        long j2 = misVar.c;
        int iD = (int) (d(-j, 0, 0, canvas, -16711936) + 0.0f);
        if (j > 0) {
            d(j, iD, 0, canvas, -2998243);
        }
        long j3 = misVar.a;
        e(1, canvas, -256);
        long j4 = misVar.b;
        e(2, canvas, -13068292);
        int height = getHeight();
        long j5 = misVar.d;
        float fC = height - c(0L);
        this.m.setColor(-16777216);
        canvas.drawLine(0.0f, fC, getWidth() / 3.0f, fC, this.m);
        int height2 = getHeight();
        long j6 = misVar.e;
        float fC2 = height2 - c(0L);
        this.m.setColor(-2998243);
        canvas.drawLine(0.0f, fC2, getWidth() / 3.0f, fC2, this.m);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(this.j, size) : this.j;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(this.k, size2) : this.k;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            miv mivVar = this.s;
            int i = miv.d;
            float f = mivVar.b;
            if (f != mivVar.a) {
                mivVar.a("Inflating heap utilization to %.2f%% (%.2f MB)", Float.valueOf(f * 100.0f), Float.valueOf(mivVar.b * a));
                mit mitVar = mivVar.c.f;
                long jA = mitVar.c + ((long) ((mivVar.b - mit.a()) * mitVar.a));
                while (mitVar.c > jA && !mitVar.b.isEmpty()) {
                    mitVar.c -= (long) ((byte[]) mitVar.b.pop()).length;
                }
                while (true) {
                    long j = mitVar.c;
                    if (j >= jA) {
                        break;
                    }
                    int iMin = (int) Math.min(jA - j, 1048576L);
                    mitVar.b.push(new byte[iMin]);
                    mitVar.c += (long) iMin;
                }
            } else {
                mis misVar = mivVar.c.g;
                long j2 = misVar.d;
                long jB = b(0.0d);
                long j3 = misVar.e;
                long jB2 = b(0.0d);
                long jB3 = b(mivVar.c.d);
                MemoryMonitorView memoryMonitorView = mivVar.c;
                long j4 = memoryMonitorView.b;
                long j5 = memoryMonitorView.c;
                StringBuilder sb = new StringBuilder(418);
                sb.append("Red: Artificially inflated Dalvik heap alloc.\nGreen: Dalvik heap alloc.\nYellow: Native heap alloc\nBlue: Other private dirty (GL RAM)\nBlack line: Dalvik heap size: ");
                sb.append(jB);
                sb.append("MB\nRed line: Max Dalvik heap memory: ");
                sb.append(jB2);
                sb.append("MB\nGrey background bounds: large heap size: ");
                sb.append(jB3);
                sb.append("MB (should be the same as the red line)\nDefault heap: ");
                sb.append(j4);
                sb.append(" MB; large heap: ");
                sb.append(j5);
                sb.append(" MB");
                mivVar.a(sb.toString(), new Object[0]);
            }
        }
        return this.r.onTouchEvent(motionEvent);
    }
}
