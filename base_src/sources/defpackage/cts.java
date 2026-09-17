package defpackage;

import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed.RecordSpeedSlider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class cts implements ctw {
    public final BottomBarController c;
    public final ddf d;
    public final elw e;
    public final epj f;
    public final lar g;
    public final jfn h;
    public final jlb i;
    public final WindowManager j;
    public boolean l;
    public boolean m;
    public int n;
    public final bqg o;
    public cth p;
    private RecordSpeedSlider r;
    public final ArrayList a = new ArrayList();
    public final AtomicInteger b = new AtomicInteger(-1);
    private final Set q = new HashSet();
    public lie k = bug.g;

    public cts(bqg bqgVar, BottomBarController bottomBarController, elw elwVar, ddf ddfVar, epj epjVar, lar larVar, jfn jfnVar, jlb jlbVar, WindowManager windowManager) {
        this.o = bqgVar;
        this.c = bottomBarController;
        this.e = elwVar;
        this.d = ddfVar;
        this.f = epjVar;
        this.g = larVar;
        this.h = jfnVar;
        this.i = jlbVar;
        this.j = windowManager;
    }

    private final void m(int i) {
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((ctx) it.next()).a(i);
        }
    }

    @Override // defpackage.ctw
    public final void a(ctx ctxVar) {
        this.q.add(ctxVar);
    }

    public final void b() {
        this.c.setClickable(false);
        this.h.l(false);
        this.i.F(false);
        this.f.g(2);
    }

    @Override // defpackage.ctw
    public final void c() {
        if (this.r.getChildAt(this.n) == null) {
            return;
        }
        this.r.getChildAt(this.n).setVisibility(8);
    }

    @Override // defpackage.ctw
    public final void d() {
        this.r.f(this.n);
    }

    @Override // defpackage.ctw
    public final void e(ctx ctxVar) {
        this.q.remove(ctxVar);
    }

    @Override // defpackage.ctw
    public final void f(boolean z) {
        this.m = z;
    }

    @Override // defpackage.ctw
    public final void g(boolean z) {
        RecordSpeedSlider recordSpeedSlider = this.r;
        if (recordSpeedSlider == null) {
            return;
        }
        if (z) {
            recordSpeedSlider.d();
        } else {
            recordSpeedSlider.c();
        }
    }

    @Override // defpackage.ctw
    public final void h(boolean z) {
        this.l = z;
    }

    @Override // defpackage.ctw
    public final void i() {
        if (this.r.getChildAt(this.n) == null) {
            return;
        }
        this.r.getChildAt(this.n).setVisibility(0);
    }

    @Override // defpackage.ctw
    public final void j(cth cthVar) {
        this.p = cthVar;
    }

    public final void k(int i, int i2) {
        if (!this.r.i()) {
            jrz jrzVar = jrz.PORTRAIT;
            switch (i - 1) {
                case 0:
                    m(i2 - 1);
                    break;
                default:
                    m(i2);
                    break;
            }
        }
        jrz jrzVar2 = jrz.PORTRAIT;
        switch (i - 1) {
            case 0:
                if (i2 > this.n) {
                    m(i2 - 1);
                }
                break;
            default:
                if (i2 < this.n) {
                    m(i2);
                }
                break;
        }
    }

    @Override // defpackage.ctw
    public final void l(ols olsVar, jen jenVar, int i, int i2, int i3, boolean z, int i4) {
        this.r = (RecordSpeedSlider) jenVar;
        g(false);
        this.n = i != 1 ? olsVar.n().size() : 0;
        this.l = true;
        this.m = true;
        this.a.clear();
        int i5 = i == 1 ? i2 + 1 : i2;
        if (this.b.get() == -1) {
            this.b.set(i5);
        }
        this.r.getLayoutParams().width = i4;
        this.r.addOnLayoutChangeListener(new ctr(this, i4, olsVar, i, i3, z, i5));
    }
}
