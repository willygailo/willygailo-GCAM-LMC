package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class brl implements bsd {
    private final brk a;
    private final jgu b;
    private final elw c;
    private int d = 1;

    public brl(elw elwVar, Context context, ddf ddfVar, brk brkVar) {
        this.c = elwVar;
        this.a = brkVar;
        jgv jgvVar = new jgv();
        jgvVar.e = brkVar.a;
        jgvVar.f = context;
        jgvVar.a = brkVar.b;
        jgvVar.b = brkVar.c;
        jgvVar.i = brkVar.d;
        jgvVar.h = ddfVar.k(ddl.ay);
        this.b = jgvVar.a();
    }

    @Override // defpackage.bsd
    public final void a() {
        this.c.g(this.b);
        this.d = 3;
        this.a.e.g();
    }

    @Override // defpackage.bsd
    public final void b() {
        this.c.d(this.b);
        this.d = 2;
        this.a.e.h();
    }

    @Override // defpackage.bsd
    public final int c() {
        return this.d;
    }
}
