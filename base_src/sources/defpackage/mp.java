package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class mp {
    private final View a;
    private rl d;
    private rl e;
    private rl f;
    private int c = -1;
    private final mu b = mu.d();

    public mp(View view) {
        this.a = view;
    }

    public final ColorStateList a() {
        rl rlVar = this.e;
        if (rlVar != null) {
            return rlVar.a;
        }
        return null;
    }

    public final PorterDuff.Mode b() {
        rl rlVar = this.e;
        if (rlVar != null) {
            return rlVar.b;
        }
        return null;
    }

    public final void c() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f == null) {
                    this.f = new rl();
                }
                rl rlVar = this.f;
                rlVar.a = null;
                rlVar.d = false;
                rlVar.b = null;
                rlVar.c = false;
                ColorStateList colorStateListL = gl.l(this.a);
                if (colorStateListL != null) {
                    rlVar.d = true;
                    rlVar.a = colorStateListL;
                }
                PorterDuff.Mode modeM = gl.m(this.a);
                if (modeM != null) {
                    rlVar.c = true;
                    rlVar.b = modeM;
                }
                if (rlVar.d || rlVar.c) {
                    qw.h(background, rlVar, this.a.getDrawableState());
                    return;
                }
            }
            rl rlVar2 = this.e;
            if (rlVar2 != null) {
                qw.h(background, rlVar2, this.a.getDrawableState());
                return;
            }
            rl rlVar3 = this.d;
            if (rlVar3 != null) {
                qw.h(background, rlVar3, this.a.getDrawableState());
            }
        }
    }

    public final void d(AttributeSet attributeSet, int i) {
        rn rnVarQ = rn.q(this.a.getContext(), attributeSet, jq.y, i);
        View view = this.a;
        gl.E(view, view.getContext(), jq.y, attributeSet, rnVarQ.b, i, 0);
        try {
            if (rnVarQ.p(0)) {
                this.c = rnVarQ.f(0, -1);
                ColorStateList colorStateListA = this.b.a(this.a.getContext(), this.c);
                if (colorStateListA != null) {
                    f(colorStateListA);
                }
            }
            if (rnVarQ.p(1)) {
                gl.H(this.a, rnVarQ.g(1));
            }
            if (rnVarQ.p(2)) {
                gl.I(this.a, oj.a(rnVarQ.c(2, -1), null));
            }
        } finally {
            rnVarQ.n();
        }
    }

    public final void e(int i) {
        this.c = i;
        mu muVar = this.b;
        f(muVar != null ? muVar.a(this.a.getContext(), i) : null);
        c();
    }

    final void f(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new rl();
            }
            rl rlVar = this.d;
            rlVar.a = colorStateList;
            rlVar.d = true;
        } else {
            this.d = null;
        }
        c();
    }

    public final void g(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new rl();
        }
        rl rlVar = this.e;
        rlVar.a = colorStateList;
        rlVar.d = true;
        c();
    }

    public final void h(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new rl();
        }
        rl rlVar = this.e;
        rlVar.b = mode;
        rlVar.c = true;
        c();
    }

    public final void i() {
        this.c = -1;
        f(null);
        c();
    }
}
