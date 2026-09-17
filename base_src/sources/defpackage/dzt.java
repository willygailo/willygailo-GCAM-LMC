package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dzt implements dzu {
    final /* synthetic */ htf a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ gqt g;
    final /* synthetic */ boolean h;
    final /* synthetic */ boolean i;

    public dzt(htf htfVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, gqt gqtVar, boolean z6, boolean z7) {
        this.a = htfVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = gqtVar;
        this.h = z6;
        this.i = z7;
    }

    @Override // defpackage.dzu
    public final htf a() {
        return this.a;
    }

    @Override // defpackage.dzu
    public final htf b() {
        return this.b ? this.a : htf.OFF;
    }

    @Override // defpackage.dzu
    public final boolean c() {
        return this.h;
    }

    @Override // defpackage.dzu
    public final boolean d() {
        return this.e;
    }

    @Override // defpackage.dzu
    public final boolean e() {
        return this.i;
    }

    @Override // defpackage.dzu
    public final boolean f() {
        return this.d;
    }
}
