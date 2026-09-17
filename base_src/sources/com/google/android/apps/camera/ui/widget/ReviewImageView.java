package com.google.android.apps.camera.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class ReviewImageView extends ImageView {
    public ReviewImageView(Context context) {
        super(context);
    }

    public ReviewImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ReviewImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ReviewImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    private final void c() {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) getDrawable();
        if (bitmapDrawable == null || bitmapDrawable.getBitmap().isRecycled()) {
            return;
        }
        bitmapDrawable.getBitmap().recycle();
    }

    public final void a() {
        c();
        setVisibility(8);
        setImageDrawable(null);
    }

    public final void b(Bitmap bitmap) {
        c();
        setVisibility(0);
        setImageBitmap(bitmap);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        BitmapDrawable bitmapDrawable = (BitmapDrawable) getDrawable();
        if (bitmapDrawable == null || bitmapDrawable.getBitmap() == null) {
            return;
        }
        Bitmap bitmap = bitmapDrawable.getBitmap();
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float width2 = getWidth();
        float height2 = getHeight();
        Matrix matrix = new Matrix();
        float fMin = Math.min(height2 / height, width2 / width);
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((width2 / 2.0f) - ((width * fMin) / 2.0f), (height2 / 2.0f) - ((height * fMin) / 2.0f));
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
