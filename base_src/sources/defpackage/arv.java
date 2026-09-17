package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class arv implements Runnable {
    final aqt a;
    public final asl b = asl.h();

    static {
        kus.g("WorkForegroundRunnable");
    }

    public arv(aqt aqtVar) {
        this.a = aqtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.a.o;
        this.b.e(null);
    }
}
