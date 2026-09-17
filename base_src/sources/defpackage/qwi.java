package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qwi extends qwg {
    public final Runnable a;

    public qwi(Runnable runnable, long j, qwh qwhVar) {
        super(j, qwhVar);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } finally {
            this.h.g();
        }
    }

    public final String toString() {
        return "Task[" + qnm.f(this.a) + '@' + qnm.g(this.a) + ", " + this.g + ", " + this.h + ']';
    }
}
