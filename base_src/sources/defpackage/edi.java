package defpackage;

import j$.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
final class edi implements Supplier {
    public boolean a = false;
    private final ecb b;
    private final boolean c;
    private final lco d;

    public edi(imt imtVar, ims imsVar, lco lcoVar, ecb ecbVar, ddf ddfVar, lap lapVar) {
        this.b = ecbVar;
        this.d = lcoVar;
        this.c = (ddfVar.k(ddm.aa) && ecbVar == ecb.REGULAR) ? true : ddfVar.k(ddm.ab) && ecbVar == ecb.PORTRAIT;
        ddfVar.b();
        imv imvVarA = imw.a();
        imvVarA.c(pgr.INSTANCE);
        imvVarA.a = "TemporalBinning";
        imvVarA.f(imsVar);
        imvVarA.e(new edh(this, false));
        imvVarA.d(new edh(this, true));
        lapVar.c(imtVar.d(imvVarA.a()));
    }

    @Override // j$.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        synchronized (this) {
            boolean z = false;
            if (this.a) {
                return false;
            }
            if (this.c && ((Boolean) this.d.fA()).booleanValue()) {
                return false;
            }
            if (this.b == ecb.REGULAR || this.b == ecb.PORTRAIT) {
                z = true;
            } else {
                ecb ecbVar = ecb.LONG_EXPOSURE;
            }
            return Boolean.valueOf(z);
        }
    }
}
