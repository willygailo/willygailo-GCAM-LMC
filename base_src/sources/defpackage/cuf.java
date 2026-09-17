package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
final class cuf implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ cug b;

    public cuf(cug cugVar, View view) {
        this.b = cugVar;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        jlz jlzVar = new jlz(this.b.f.getResources().getString(R.string.try_stabilization_tooltip));
        jrz jrzVar = jrz.PORTRAIT;
        final int i = 0;
        switch (this.b.n.d.ordinal()) {
            case 1:
                jlzVar.t(this.a);
                break;
            case 2:
                jlzVar.h(this.a, 0);
                break;
            default:
                jlzVar.s(this.a);
                break;
        }
        cug cugVar = this.b;
        jlzVar.i();
        jlzVar.h = this.b.i.k(ddl.ay);
        jlzVar.n();
        final int i2 = 1;
        jlzVar.g(new Runnable(this) { // from class: cue
            public final /* synthetic */ cuf a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.a.b.d();
                        break;
                    default:
                        this.a.b.d.b("try_washington_tooltip");
                        break;
                }
            }
        }, this.b.e);
        jlzVar.f(new Runnable(this) { // from class: cue
            public final /* synthetic */ cuf a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.a.b.d();
                        break;
                    default:
                        this.a.b.d.b("try_washington_tooltip");
                        break;
                }
            }
        }, this.b.e);
        jlzVar.c = 1000;
        jlzVar.d = 5000;
        jlzVar.m = 10;
        jlzVar.i = this.b.c;
        jlzVar.e = false;
        jlzVar.f = true;
        jlzVar.o();
        jlzVar.r();
        cugVar.t = jlzVar.a();
    }
}
