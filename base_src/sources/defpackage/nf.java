package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
final class nf extends na {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    public nf(SeekBar seekBar) {
        super(seekBar);
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.b = seekBar;
    }

    private final void b() {
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.f || this.g) {
                Drawable drawableMutate = drawable.mutate();
                this.c = drawableMutate;
                if (this.f) {
                    drawableMutate.setTintList(this.d);
                }
                if (this.g) {
                    this.c.setTintMode(this.e);
                }
                if (this.c.isStateful()) {
                    this.c.setState(this.b.getDrawableState());
                }
            }
        }
    }

    @Override // defpackage.na
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, R.attr.seekBarStyle);
        rn rnVarQ = rn.q(this.b.getContext(), attributeSet, jq.g, R.attr.seekBarStyle);
        SeekBar seekBar = this.b;
        gl.E(seekBar, seekBar.getContext(), jq.g, attributeSet, rnVarQ.b, R.attr.seekBarStyle, 0);
        Drawable drawableI = rnVarQ.i(0);
        if (drawableI != null) {
            this.b.setThumb(drawableI);
        }
        Drawable drawableH = rnVarQ.h(1);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.c = drawableH;
        if (drawableH != null) {
            drawableH.setCallback(this.b);
            drawableH.setLayoutDirection(gl.f(this.b));
            if (drawableH.isStateful()) {
                drawableH.setState(this.b.getDrawableState());
            }
            b();
        }
        this.b.invalidate();
        if (rnVarQ.p(3)) {
            this.e = oj.a(rnVarQ.c(3, -1), this.e);
            this.g = true;
        }
        if (rnVarQ.p(2)) {
            this.d = rnVarQ.g(2);
            this.f = true;
        }
        rnVarQ.n();
        b();
    }
}
