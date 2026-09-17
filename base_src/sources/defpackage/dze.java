package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dze {
    private final ona a;

    public dze(ead eadVar) {
        this.a = ona.c(eadVar.c);
    }

    public final synchronized void a(long j) {
        this.a.add(Long.valueOf(j));
        this.a.toArray();
    }

    public final synchronized boolean b(long j) {
        return this.a.contains(Long.valueOf(j));
    }
}
