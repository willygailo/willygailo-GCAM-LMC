package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes2.dex */
final class jky {
    final /* synthetic */ jkz a;
    private final Animator b;

    public jky(jkz jkzVar, Animator animator) {
        this.a = jkzVar;
        this.b = animator;
    }

    final void a() {
        this.b.setStartDelay(150L);
    }

    final void b() {
        this.b.addListener(new jkx(this));
    }

    final void c(ojc ojcVar) {
        if (ojcVar.g()) {
            this.b.addListener(mip.ev(new jkv(this, ojcVar, 1)));
        }
    }

    final void d(int i) {
        this.b.setDuration(i);
    }

    final void e() {
        this.b.setInterpolator(jkz.a);
    }

    final void f() {
        this.b.setInterpolator(this.a.s);
    }

    final void g() {
        this.b.setInterpolator(this.a.t);
    }

    final void h(ojc ojcVar) {
        if (ojcVar.g()) {
            this.b.addListener(mip.ew(new jkv(this, ojcVar, 0)));
        }
    }

    final void i() {
        this.b.addListener(new jkw(this));
    }
}
