package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class xu extends xq {
    final /* synthetic */ xv c;

    public xu(xv xvVar) {
        this.c = xvVar;
    }

    @Override // defpackage.xq
    protected final String c() {
        xr xrVar = (xr) this.c.a.get();
        if (xrVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + xrVar.a + "]";
    }
}
