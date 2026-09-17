package defpackage;

import android.view.Surface;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cpd implements cpc {
    private final qkg a;
    private clg b;
    private final nvb c;

    public cpd(qkg qkgVar, nvb nvbVar, byte[] bArr, byte[] bArr2) {
        this.a = qkgVar;
        this.c = nvbVar;
    }

    @Override // defpackage.cpc
    public final bpt a(bnh bnhVar) {
        clg clgVar = this.b;
        clgVar.getClass();
        return clgVar.a(bnhVar);
    }

    @Override // defpackage.cpc
    public final pht b() {
        clg clgVar = this.b;
        clgVar.getClass();
        return clgVar.c();
    }

    @Override // defpackage.cpc
    public final pht c(lic licVar) {
        clg clgVar = this.b;
        clgVar.getClass();
        return clgVar.b(licVar);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        clg clgVar = this.b;
        if (clgVar != null) {
            clgVar.close();
        }
    }

    @Override // defpackage.cpc
    public final void d(ckd ckdVar, jnj jnjVar, Surface surface) {
        clg clgVar = ((clz) this.a).get();
        this.b = clgVar;
        clgVar.d(ckdVar, jnjVar, surface);
        this.c.k(cms.CAPTURE_SESSION).c(this);
    }

    @Override // defpackage.cpc
    public final void e() {
        clg clgVar = this.b;
        clgVar.getClass();
        clgVar.f();
    }

    @Override // defpackage.cpc
    public final void f(List list) {
        clg clgVar = this.b;
        clgVar.getClass();
        clgVar.e(list);
        plk.V(null);
    }
}
