package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ke {
    gp b;
    public boolean c;
    private Interpolator e;
    private long d = -1;
    private final gq f = new kd(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.c) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((go) arrayList.get(i)).a();
            }
            this.c = false;
        }
    }

    public final void b() {
        View view;
        if (this.c) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            go goVar = (go) arrayList.get(i);
            long j = this.d;
            if (j >= 0) {
                goVar.c(j);
            }
            Interpolator interpolator = this.e;
            if (interpolator != null && (view = (View) goVar.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.b != null) {
                goVar.d(this.f);
            }
            View view2 = (View) goVar.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.c = true;
    }

    public final void c(go goVar) {
        if (this.c) {
            return;
        }
        this.a.add(goVar);
    }

    public final void d() {
        if (this.c) {
            return;
        }
        this.d = 250L;
    }

    public final void e(Interpolator interpolator) {
        if (this.c) {
            return;
        }
        this.e = interpolator;
    }

    public final void f(gp gpVar) {
        if (this.c) {
            return;
        }
        this.b = gpVar;
    }
}
