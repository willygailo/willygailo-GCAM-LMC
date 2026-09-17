package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class lsn {
    public final lnf a;
    public final lkd b;
    public final lso c;
    public final ltv d;
    public final lap e;
    public final ljf f;
    public final lis g;
    public final ltc h;
    public final Handler i;
    public lsi j;
    public final lsg k;
    private final lrx l;

    public lsn(lnf lnfVar, lkd lkdVar, lso lsoVar, ltv ltvVar, Handler handler, ltc ltcVar, lap lapVar, ljf ljfVar, lis lisVar, lrx lrxVar, lsg lsgVar) {
        this.a = lnfVar;
        this.b = lkdVar;
        this.c = lsoVar;
        this.d = ltvVar;
        this.i = handler;
        this.h = ltcVar;
        this.e = lapVar;
        this.f = ljfVar;
        this.l = lrxVar;
        this.g = lisVar.a("CameraOpener");
        this.k = lsgVar;
    }

    public final lsp a(ltc ltcVar, Handler handler) {
        return new lsp(ltcVar, this.d, handler, this.f, this.g, this.l);
    }
}
