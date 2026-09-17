package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class mml implements phh {
    final /* synthetic */ moa a;

    public mml(moa moaVar) {
        this.a = moaVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        this.a.l(mnc.a(th));
    }

    @Override // defpackage.phh
    public final void b(Object obj) {
        if (obj == null) {
            this.a.l(mnc.a(new NullPointerException("Function output is null")));
        } else {
            this.a.k(obj);
        }
    }
}
