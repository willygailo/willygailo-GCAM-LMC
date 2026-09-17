package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lrb {
    public final /* synthetic */ lrc a;

    public lrb(lrc lrcVar) {
        this.a = lrcVar;
    }

    public final void a() {
        boolean z;
        synchronized (lrc.a) {
            lrc lrcVar = this.a;
            z = true;
            if (lrcVar.e == 2) {
                lrcVar.e = 3;
                lrcVar.b = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.a.b();
        }
    }
}
