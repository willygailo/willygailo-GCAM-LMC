package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ail implements Runnable {
    final /* synthetic */ qpn a;
    final /* synthetic */ qrg b;

    public ail(qpn qpnVar, qrg qrgVar) {
        this.a = qpnVar;
        this.b = qrgVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        qmd.m(new aik(this.a, this.b, null));
    }
}
