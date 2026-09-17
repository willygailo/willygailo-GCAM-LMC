package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class jgs implements lie {
    private final boolean a;
    private elw b;
    public final Context k;
    public jgu l;
    protected boolean m = false;

    protected jgs(boolean z, Context context) {
        this.a = z;
        this.k = context;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        d();
    }

    public final synchronized void d() {
        this.m = false;
        f();
    }

    public final synchronized void e(elw elwVar) {
        this.b = elwVar;
        this.m = true;
    }

    public final void f() {
        elw elwVar;
        jgu jguVar = this.l;
        if (jguVar == null || (elwVar = this.b) == null) {
            return;
        }
        elwVar.g(jguVar);
        this.l = null;
    }

    public final void g(jgu jguVar) {
        jgu jguVar2;
        if (this.b != null) {
            jgu jguVar3 = this.l;
            this.l = jguVar;
            if (jguVar3 != null && !jguVar.equals(jguVar3)) {
                this.b.g(jguVar3);
            }
            synchronized (this) {
                if (this.m && (jguVar2 = this.l) != null) {
                    this.b.d(jguVar2);
                }
            }
        }
    }

    public final jgu h(String str, int i, int i2) {
        jgv jgvVar = new jgv();
        jgvVar.e = str;
        jgvVar.f = this.k;
        jgvVar.i = i2;
        jgvVar.h = this.a;
        if (i == -1) {
            jgvVar.a = true;
        } else {
            jgvVar.a = false;
            jgvVar.b = i;
        }
        return jgvVar.a();
    }
}
