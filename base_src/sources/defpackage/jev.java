package defpackage;

import android.content.Context;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
public final class jev {
    private final jfo d;
    private final WindowManager e;
    private final Context f;
    private int g;
    private float b = 0.0f;
    private float c = 0.0f;
    public boolean a = true;

    public jev(jfo jfoVar, WindowManager windowManager, Context context) {
        this.d = jfoVar;
        this.e = windowManager;
        this.f = context;
    }

    private final void e(boolean z) {
        if (Math.abs(this.b) <= jsa.b(80.0f) && Math.abs(this.c) <= 3.0f) {
            a();
            return;
        }
        int i = 2;
        int i2 = this.b > 0.0f ? 2 : 1;
        if (!f(z)) {
            this.d.u(i2, false);
            return;
        }
        if (this.e.getDefaultDisplay().getRotation() != 3) {
            i = i2;
        } else if (i2 == 2) {
            i = 1;
        }
        jfo jfoVar = this.d;
        if (i == 1) {
            ((jet) jfoVar).i.n();
        } else {
            ((jet) jfoVar).i.g();
        }
        a();
    }

    private final boolean f(boolean z) {
        return z == jrz.b(jrz.a(this.e.getDefaultDisplay(), this.f));
    }

    public final void a() {
        this.g = 0;
        this.b = 0.0f;
        this.c = 0.0f;
        jet jetVar = (jet) this.d;
        jetVar.b.setClickable(true);
        jetVar.d.F(true);
        jetVar.e.g(1);
    }

    public final void b(boolean z) {
        if (this.a || f(z)) {
            e(z);
        }
    }

    public final void c(float f) {
        if (this.e.getDefaultDisplay().getRotation() == 1) {
            f = -f;
        }
        this.c = f / 1000.0f;
    }

    public final void d(float f, boolean z) {
        boolean z2 = !f(z);
        if (this.a || !z2) {
            if (z && this.e.getDefaultDisplay().getRotation() == 1) {
                f = -f;
            }
            float f2 = this.b + f;
            this.b = f2;
            int i = this.g + 1;
            this.g = i;
            if (i <= 2) {
                return;
            }
            if (z2 && ((f2 > 0.0f && this.d.p()) || (this.b < 0.0f && this.d.o()))) {
                a();
                return;
            }
            if (z2 && Math.abs(this.b) >= jsa.b(5.0f)) {
                jet jetVar = (jet) this.d;
                if (jetVar.k) {
                    ((hme) jetVar.j.get()).a();
                }
            }
            if (Math.abs(this.b) >= jsa.b(80.0f)) {
                e(z);
            }
        }
    }
}
