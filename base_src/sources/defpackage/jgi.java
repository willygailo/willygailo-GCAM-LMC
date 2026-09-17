package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.GoogleCameraEngR18F1.R;
import j$.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
final class jgi implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ jgk b;

    public jgi(jgk jgkVar, View view) {
        this.b = jgkVar;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        final lap lapVar = new lap();
        final View view = this.a;
        final Runnable runnable = new Runnable() { // from class: jgf
            @Override // java.lang.Runnable
            public final void run() {
                final jgi jgiVar = this.a;
                View view2 = view;
                lap lapVar2 = lapVar;
                jgc jgcVar = new jly() { // from class: jgc
                    @Override // defpackage.jly
                    public final View a(Context context, boolean z) {
                        return LayoutInflater.from(context).inflate(R.layout.translate_tooltip, (ViewGroup) null);
                    }
                };
                jgk jgkVar = jgiVar.b;
                jlz jlzVar = new jlz(jgcVar);
                jlzVar.s(view2);
                jlzVar.i();
                jlzVar.h = jgiVar.b.k.k(ddl.ay);
                jlzVar.n();
                jlzVar.c = 300;
                jlzVar.e(new Runnable() { // from class: jge
                    @Override // java.lang.Runnable
                    public final void run() {
                        jgiVar.b.g(jrl.LENS);
                    }
                });
                final jgk jgkVar2 = jgiVar.b;
                jlzVar.g(new Runnable() { // from class: jgg
                    @Override // java.lang.Runnable
                    public final void run() {
                        jgkVar2.m.b("TRANSLATE_TOOLTIP");
                    }
                }, pgr.INSTANCE);
                final jgk jgkVar3 = jgiVar.b;
                jlzVar.d(new Supplier() { // from class: jgh
                    @Override // j$.util.function.Supplier
                    public final Object get() {
                        jgk jgkVar4 = jgkVar3;
                        int iA = jgkVar4.m.a("TRANSLATE_TOOLTIP");
                        boolean z = false;
                        boolean z2 = iA <= 6 && iA % 3 == 0;
                        if (z2 || iA >= 6) {
                            z = z2;
                        } else {
                            jgkVar4.m.b("TRANSLATE_TOOLTIP");
                        }
                        return Boolean.valueOf(z);
                    }
                });
                jlzVar.m = 10;
                jlzVar.i = jgiVar.b.l;
                jlzVar.o();
                jlzVar.f = true;
                jlzVar.r();
                jlzVar.e = true;
                jgkVar.i = jlzVar.a();
                lapVar2.c(jgiVar.b.i);
            }
        };
        final Handler handlerBU = mip.bU();
        handlerBU.postDelayed(runnable, 300L);
        lapVar.c(new lie() { // from class: jgd
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                handlerBU.removeCallbacks(runnable);
            }
        });
        this.b.n = ojc.i(lapVar);
    }
}
