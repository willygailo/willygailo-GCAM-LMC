package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ne extends SeekBar {
    private final nf a;

    public ne(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        ri.d(this, getContext());
        nf nfVar = new nf(this);
        this.a = nfVar;
        nfVar.a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        nf nfVar = this.a;
        Drawable drawable = nfVar.c;
        if (drawable != null && drawable.isStateful() && drawable.setState(nfVar.b.getDrawableState())) {
            nfVar.b.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        nf nfVar = this.a;
        if (nfVar.c != null) {
            int max = nfVar.b.getMax();
            if (max > 1) {
                int intrinsicWidth = nfVar.c.getIntrinsicWidth();
                int intrinsicHeight = nfVar.c.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth >> 1 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight >> 1 : 1;
                nfVar.c.setBounds(-i, -i2, i, i2);
                float width = ((nfVar.b.getWidth() - nfVar.b.getPaddingLeft()) - nfVar.b.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(nfVar.b.getPaddingLeft(), nfVar.b.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    nfVar.c.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
