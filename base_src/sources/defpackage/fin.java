package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fin implements Runnable {
    private final fhv a;
    private final fik b;

    public fin(fhv fhvVar, fik fikVar) {
        this.a = fhvVar;
        this.b = fikVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e(this.b);
    }
}
