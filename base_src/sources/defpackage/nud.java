package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nud implements Runnable {
    final /* synthetic */ pvd a;

    public nud(pvd pvdVar) {
        this.a = pvdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.close();
    }
}
