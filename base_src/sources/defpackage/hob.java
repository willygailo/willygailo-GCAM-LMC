package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hob implements Runnable {
    final /* synthetic */ qkg a;
    final /* synthetic */ lar b;
    final /* synthetic */ fhv c;

    public hob(qkg qkgVar, lar larVar, fhv fhvVar) {
        this.a = qkgVar;
        this.b = larVar;
        this.c = fhvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        enl.f(this.b, this.c, (hnv) this.a.get());
    }
}
