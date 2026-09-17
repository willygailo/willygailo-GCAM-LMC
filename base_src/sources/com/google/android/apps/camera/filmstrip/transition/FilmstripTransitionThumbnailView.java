package com.google.android.apps.camera.filmstrip.transition;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class FilmstripTransitionThumbnailView extends View {
    public final Object a;
    public Bitmap b;
    public Paint c;
    private float d;

    public FilmstripTransitionThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Object();
        this.d = -1.0f;
        setWillNotDraw(false);
    }

    public final Bitmap a() {
        Bitmap bitmap;
        synchronized (this.a) {
            bitmap = this.b;
        }
        return bitmap;
    }

    public final void b(float f) {
        this.d = f;
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.d < 0.0f) {
            return;
        }
        synchronized (this.a) {
            canvas.drawCircle(canvas.getWidth() / 2, canvas.getHeight() / 2, this.d, this.c);
        }
    }
}
