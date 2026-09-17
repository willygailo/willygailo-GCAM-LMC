package defpackage;

import android.os.Handler;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public class mab implements mag {
    private final mag a;

    public mab(mag magVar) {
        this.a = magVar;
    }

    @Override // defpackage.mag
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.mag
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.mag
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.mag, defpackage.lie, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.mag
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.mag
    public final Surface e() {
        return this.a.e();
    }

    @Override // defpackage.mag
    public mad f() {
        return this.a.f();
    }

    @Override // defpackage.mag
    public mad g() {
        return this.a.g();
    }

    @Override // defpackage.mag
    public final void h() {
        this.a.h();
    }

    @Override // defpackage.mag
    public void i(maf mafVar, Handler handler) {
        this.a.i(mafVar, handler);
    }

    public final String toString() {
        return this.a.toString();
    }
}
