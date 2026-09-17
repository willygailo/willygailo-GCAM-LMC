package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class pwl implements pwo {
    private final Context a;

    static {
        pwl.class.getSimpleName();
    }

    public pwl(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.pwo
    public final ozn a(pxg pxgVar) {
        return null;
    }

    @Override // defpackage.pwo
    public final pxd b() {
        return pvy.a();
    }

    @Override // defpackage.pwo
    public final pxe c() {
        pxe pxeVarB = pvy.b();
        return pxeVarB == null ? pwn.a(this.a) : pxeVarB;
    }

    @Override // defpackage.pwo
    public final pxf d() {
        return null;
    }

    @Override // defpackage.pwo
    public final void e() {
    }

    @Override // defpackage.pwo
    public final boolean f(pxd pxdVar) {
        return pxdVar == null ? pvy.c() : pvy.d(pxdVar);
    }
}
