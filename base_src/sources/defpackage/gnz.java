package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gnz implements Runnable {
    public final /* synthetic */ goa a;

    @Override // java.lang.Runnable
    public final void run() {
        goa goaVar = this.a;
        if (goaVar.a || !goaVar.b.c.get()) {
            return;
        }
        goaVar.a = true;
        goaVar.b.d.y();
        goaVar.b.a.b.B();
    }
}
