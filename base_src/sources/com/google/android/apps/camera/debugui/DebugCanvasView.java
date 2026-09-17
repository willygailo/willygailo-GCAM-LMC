package com.google.android.apps.camera.debugui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.AttributeSet;
import com.google.android.apps.camera.debugui.DebugCanvasView;
import defpackage.dka;
import defpackage.ohz;
import defpackage.oom;
import j$.util.Collection;
import j$.util.function.Consumer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DebugCanvasView extends dka {
    public final Paint a;
    public final Paint b;
    public final RectF c;
    private final Paint e;
    private final Paint f;
    private final Paint g;
    private final Paint h;
    private final Paint i;
    private final Paint j;
    private volatile List k;
    private volatile List l;
    private volatile MeteringRectangle m;
    private volatile ohz n;
    private volatile float o;
    private volatile float p;
    private volatile float q;
    private volatile ohz r;
    private volatile List s;
    private volatile float[] t;

    public DebugCanvasView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.a = paint;
        Paint paint2 = new Paint();
        this.b = paint2;
        Paint paint3 = new Paint();
        this.e = paint3;
        Paint paint4 = new Paint();
        this.f = paint4;
        Paint paint5 = new Paint();
        this.g = paint5;
        Paint paint6 = new Paint();
        this.h = paint6;
        Paint paint7 = new Paint();
        this.i = paint7;
        Paint paint8 = new Paint();
        this.j = paint8;
        this.k = oom.l();
        this.l = oom.l();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3.0f);
        paint.setColor(-256);
        paint.setTextSize(48.0f);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(3.0f);
        paint2.setColor(-1);
        paint2.setTextSize(30.0f);
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(3.0f);
        paint3.setStrokeMiter(0.6f);
        paint3.setColor(-16776961);
        paint3.setTextSize(64.0f);
        paint4.setColor(-65536);
        paint4.setStrokeWidth(16.0f);
        paint4.setStyle(Paint.Style.STROKE);
        paint5.setColor(-16711936);
        paint5.setStrokeWidth(3.0f);
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setTextSize(48.0f);
        paint6.setColor(-65536);
        paint6.setStrokeWidth(4.0f);
        paint6.setStyle(Paint.Style.STROKE);
        paint7.setColor(-1);
        paint7.setStrokeWidth(2.0f);
        paint7.setStyle(Paint.Style.STROKE);
        paint8.setColor(-1);
        paint8.setStrokeWidth(2.0f);
        paint8.setStyle(Paint.Style.STROKE);
        paint8.setTextSize(48.0f);
        this.c = new RectF();
        this.m = null;
        this.n = null;
    }

    public final RectF a(Canvas canvas, Rect rect, Paint paint) {
        RectF rectF = new RectF(rect);
        c().mapRect(rectF);
        canvas.drawRect(rectF, paint);
        return rectF;
    }

    public final void b(Canvas canvas, Point point) {
        if (point == null) {
            return;
        }
        float[] fArr = {point.x, point.y};
        c().mapPoints(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        canvas.drawLine(f - 15.0f, f2, f + 15.0f, f2, this.a);
        float f3 = fArr[0];
        float f4 = fArr[1];
        canvas.drawLine(f3, f4 - 15.0f, f3, f4 + 15.0f, this.a);
    }

    @Override // android.view.View
    protected final void onDraw(final Canvas canvas) {
        if (d()) {
            final int i = 1;
            Collection.EL.stream(this.k).forEach(new Consumer(this) { // from class: djw
                public final /* synthetic */ DebugCanvasView a;

                {
                    this.a = this;
                }

                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    switch (i) {
                        case 0:
                            DebugCanvasView debugCanvasView = this.a;
                            Canvas canvas2 = canvas;
                            djx djxVar = (djx) obj;
                            Face faceB = djxVar.b();
                            debugCanvasView.b(canvas2, faceB.getLeftEyePosition());
                            debugCanvasView.b(canvas2, faceB.getRightEyePosition());
                            debugCanvasView.b(canvas2, faceB.getMouthPosition());
                            RectF rectFA = debugCanvasView.a(canvas2, faceB.getBounds(), debugCanvasView.b);
                            canvas2.drawText(String.format("[ %.2f ]", Float.valueOf(djxVar.a())), rectFA.left, rectFA.bottom + 60.0f, debugCanvasView.b);
                            if (djxVar.c().g()) {
                                for (int i2 = 0; i2 < ((oom) djxVar.c().c()).size(); i2++) {
                                    canvas2.drawText(String.format("[ %.2f ]", ((oom) djxVar.c().c()).get(i2)), rectFA.left, rectFA.bottom + (((((oom) djxVar.c().c()).size() - i2) + 1) * 60), debugCanvasView.b);
                                }
                            }
                            break;
                        default:
                            DebugCanvasView debugCanvasView2 = this.a;
                            Canvas canvas3 = canvas;
                            Face face = (Face) obj;
                            debugCanvasView2.b(canvas3, face.getLeftEyePosition());
                            debugCanvasView2.b(canvas3, face.getRightEyePosition());
                            debugCanvasView2.b(canvas3, face.getMouthPosition());
                            RectF rectFA2 = debugCanvasView2.a(canvas3, face.getBounds(), debugCanvasView2.a);
                            int score = face.getScore();
                            StringBuilder sb = new StringBuilder(13);
                            sb.append("[");
                            sb.append(score);
                            sb.append("]");
                            canvas3.drawText(sb.toString(), rectFA2.left, rectFA2.bottom, debugCanvasView2.a);
                            break;
                    }
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    switch (i) {
                        case 0:
                            break;
                    }
                    return Consumer.CC.$default$andThen(this, consumer);
                }
            });
            if (!this.l.isEmpty()) {
                final int i2 = 0;
                Collection.EL.stream(this.l).forEach(new Consumer(this) { // from class: djw
                    public final /* synthetic */ DebugCanvasView a;

                    {
                        this.a = this;
                    }

                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj) {
                        switch (i2) {
                            case 0:
                                DebugCanvasView debugCanvasView = this.a;
                                Canvas canvas2 = canvas;
                                djx djxVar = (djx) obj;
                                Face faceB = djxVar.b();
                                debugCanvasView.b(canvas2, faceB.getLeftEyePosition());
                                debugCanvasView.b(canvas2, faceB.getRightEyePosition());
                                debugCanvasView.b(canvas2, faceB.getMouthPosition());
                                RectF rectFA = debugCanvasView.a(canvas2, faceB.getBounds(), debugCanvasView.b);
                                canvas2.drawText(String.format("[ %.2f ]", Float.valueOf(djxVar.a())), rectFA.left, rectFA.bottom + 60.0f, debugCanvasView.b);
                                if (djxVar.c().g()) {
                                    for (int i3 = 0; i3 < ((oom) djxVar.c().c()).size(); i3++) {
                                        canvas2.drawText(String.format("[ %.2f ]", ((oom) djxVar.c().c()).get(i3)), rectFA.left, rectFA.bottom + (((((oom) djxVar.c().c()).size() - i3) + 1) * 60), debugCanvasView.b);
                                    }
                                }
                                break;
                            default:
                                DebugCanvasView debugCanvasView2 = this.a;
                                Canvas canvas3 = canvas;
                                Face face = (Face) obj;
                                debugCanvasView2.b(canvas3, face.getLeftEyePosition());
                                debugCanvasView2.b(canvas3, face.getRightEyePosition());
                                debugCanvasView2.b(canvas3, face.getMouthPosition());
                                RectF rectFA2 = debugCanvasView2.a(canvas3, face.getBounds(), debugCanvasView2.a);
                                int score = face.getScore();
                                StringBuilder sb = new StringBuilder(13);
                                sb.append("[");
                                sb.append(score);
                                sb.append("]");
                                canvas3.drawText(sb.toString(), rectFA2.left, rectFA2.bottom, debugCanvasView2.a);
                                break;
                        }
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        switch (i2) {
                            case 0:
                                break;
                        }
                        return Consumer.CC.$default$andThen(this, consumer);
                    }
                });
            }
            StringBuilder sb = new StringBuilder(19);
            sb.append("srp:");
            sb.append(0.0f);
            canvas.drawText(sb.toString(), this.c.left + 25.0f, this.c.bottom - 25.0f, this.j);
            StringBuilder sb2 = new StringBuilder(19);
            sb2.append("clp:");
            sb2.append(0.0f);
            canvas.drawText(sb2.toString(), this.c.left + 25.0f, this.c.bottom - 75.0f, this.j);
            StringBuilder sb3 = new StringBuilder(18);
            sb3.append("tp:");
            sb3.append(0.0f);
            canvas.drawText(sb3.toString(), this.c.left + 25.0f, this.c.bottom - 125.0f, this.j);
            canvas.drawRect(this.c, this.f);
            super.onDraw(canvas);
        }
    }
}
