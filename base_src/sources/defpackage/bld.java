package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class bld implements blh {
    private bks a;

    public bld() {
        if (!bmf.o(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
    }

    @Override // defpackage.blh
    public final bks c() {
        return this.a;
    }

    @Override // defpackage.blh
    public final void d(blg blgVar) {
        blgVar.g(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // defpackage.blh
    public final void e(Drawable drawable) {
    }

    @Override // defpackage.blh
    public final void f(Drawable drawable) {
    }

    @Override // defpackage.bjq
    public final void g() {
    }

    @Override // defpackage.bjq
    public final void h() {
    }

    @Override // defpackage.bjq
    public final void i() {
    }

    @Override // defpackage.blh
    public final void j(blg blgVar) {
    }

    @Override // defpackage.blh
    public final void k(bks bksVar) {
        this.a = bksVar;
    }
}
