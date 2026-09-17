package defpackage;

import android.media.MediaRecorder;
import android.view.Surface;
import java.io.FileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class coa implements lhd {
    private final lhd a;
    private final ijy b;

    public coa(lhd lhdVar, ijy ijyVar) {
        this.a = lhdVar;
        this.b = ijyVar;
    }

    @Override // defpackage.lhd
    public final synchronized void A(int i) {
        this.a.A(i);
    }

    @Override // defpackage.lhd
    public final synchronized void B(int i, int i2) {
        this.a.B(i, i2);
    }

    @Override // defpackage.lhd
    public final synchronized void C() {
        this.a.C();
    }

    @Override // defpackage.lhd
    public final synchronized void D() {
        this.a.D();
    }

    @Override // defpackage.lhd
    public final synchronized void E() {
        this.a.E();
    }

    @Override // defpackage.lhd
    public final MediaRecorder a() {
        return ((lha) this.a).a;
    }

    @Override // defpackage.lhd
    public final synchronized Surface b() {
        return this.a.b();
    }

    @Override // defpackage.lhd
    public final synchronized void c() {
        this.a.c();
    }

    @Override // defpackage.lhd
    public final synchronized void d() {
        try {
            this.b.i(ijx.MEDIA_RECORDER_PREPARE_START);
            this.a.d();
            this.b.c();
        } catch (Throwable th) {
            this.b.c();
            throw th;
        }
    }

    @Override // defpackage.lhd
    public final synchronized void e() {
        this.a.e();
    }

    @Override // defpackage.lhd
    public final synchronized void f() {
        this.a.f();
    }

    @Override // defpackage.lhd
    public final synchronized void g() {
        this.a.g();
    }

    @Override // defpackage.lhd
    public final synchronized void h(int i) {
        this.a.h(i);
    }

    @Override // defpackage.lhd
    public final synchronized void i(int i) {
        this.a.i(i);
    }

    @Override // defpackage.lhd
    public final synchronized void j(int i) {
        this.a.j(i);
    }

    @Override // defpackage.lhd
    public final synchronized void k(int i) {
        this.a.k(i);
    }

    @Override // defpackage.lhd
    public final synchronized void l(int i) {
        this.a.l(i);
    }

    @Override // defpackage.lhd
    public final synchronized void m(double d) {
        this.a.m(d);
    }

    @Override // defpackage.lhd
    public final synchronized void n(Surface surface) {
        this.a.n(surface);
    }

    @Override // defpackage.lhd
    public final synchronized void o(float f, float f2) {
        this.a.o(f, f2);
    }

    @Override // defpackage.lhd
    public final synchronized void p(int i) {
        this.a.p(i);
    }

    @Override // defpackage.lhd
    public final synchronized void q(long j) {
        this.a.q(j);
    }

    @Override // defpackage.lhd
    public final void r(FileDescriptor fileDescriptor) {
        this.a.r(fileDescriptor);
    }

    @Override // defpackage.lhd
    public final synchronized void s(MediaRecorder.OnErrorListener onErrorListener) {
        this.a.s(onErrorListener);
    }

    @Override // defpackage.lhd
    public final synchronized void t(MediaRecorder.OnInfoListener onInfoListener) {
        this.a.t(onInfoListener);
    }

    @Override // defpackage.lhd
    public final synchronized void u(int i) {
        this.a.u(i);
    }

    @Override // defpackage.lhd
    public final synchronized void v(FileDescriptor fileDescriptor) {
        this.a.v(fileDescriptor);
    }

    @Override // defpackage.lhd
    public final synchronized void w(String str) {
        this.a.w(str);
    }

    @Override // defpackage.lhd
    public final synchronized void x(int i) {
        this.a.x(i);
    }

    @Override // defpackage.lhd
    public final synchronized void y(int i) {
        this.a.y(i);
    }

    @Override // defpackage.lhd
    public final synchronized void z(int i) {
        this.a.z(i);
    }
}
