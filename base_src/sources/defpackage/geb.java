package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class geb extends mip {
    final /* synthetic */ pih a;

    public geb(pih pihVar) {
        this.a = pihVar;
    }

    @Override // defpackage.mip
    public final void fG(lzv lzvVar) {
        if (lzvVar == null) {
            this.a.a(new NullPointerException("Null metadata provided."));
        } else {
            this.a.o(lzvVar);
        }
    }
}
