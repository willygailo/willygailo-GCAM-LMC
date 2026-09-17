package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class qpy {
    public final Throwable b;
    public final qpb c;

    public /* synthetic */ qpy(Throwable th) {
        this(th, false);
    }

    public qpy(Throwable th, boolean z) {
        this.b = th;
        this.c = qnt.f(z);
    }

    public final boolean a() {
        return this.c.b();
    }

    public final String toString() {
        return qnm.f(this) + '[' + this.b + ']';
    }
}
