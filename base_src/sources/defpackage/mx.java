package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class mx {
    public rl a;
    private final ImageView b;

    public mx(ImageView imageView) {
        this.b = imageView;
    }

    public final void a() {
        rl rlVar;
        Drawable drawable = this.b.getDrawable();
        if (drawable != null) {
            Rect rect = oj.a;
        }
        if (drawable == null || (rlVar = this.a) == null) {
            return;
        }
        qw.h(drawable, rlVar, this.b.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i) {
        int iF;
        rn rnVarQ = rn.q(this.b.getContext(), attributeSet, jq.f, i);
        ImageView imageView = this.b;
        gl.E(imageView, imageView.getContext(), jq.f, attributeSet, rnVarQ.b, i, 0);
        try {
            Drawable drawable = this.b.getDrawable();
            if (drawable == null && (iF = rnVarQ.f(1, -1)) != -1 && (drawable = jr.b(this.b.getContext(), iF)) != null) {
                this.b.setImageDrawable(drawable);
            }
            if (drawable != null) {
                Rect rect = oj.a;
            }
            if (rnVarQ.p(2)) {
                this.b.setImageTintList(rnVarQ.g(2));
            }
            if (rnVarQ.p(3)) {
                this.b.setImageTintMode(oj.a(rnVarQ.c(3, -1), null));
            }
        } finally {
            rnVarQ.n();
        }
    }

    public final void c(int i) {
        if (i != 0) {
            Drawable drawableB = jr.b(this.b.getContext(), i);
            if (drawableB != null) {
                Rect rect = oj.a;
            }
            this.b.setImageDrawable(drawableB);
        } else {
            this.b.setImageDrawable(null);
        }
        a();
    }

    public final boolean d() {
        return !(this.b.getBackground() instanceof RippleDrawable);
    }
}
