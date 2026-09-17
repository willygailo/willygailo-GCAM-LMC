package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fim implements Runnable {
    private final fhi a;
    private final fik b;

    public fim(fhi fhiVar, fik fikVar) {
        this.a = fhiVar;
        this.b = fikVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.g(this.b);
    }
}
