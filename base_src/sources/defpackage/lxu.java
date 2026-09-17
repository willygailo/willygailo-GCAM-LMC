package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lxu implements lie {
    final /* synthetic */ lxv a;
    private final lxn b;
    private boolean c;
    private boolean d;

    public lxu(lxv lxvVar, lxn lxnVar) {
        this.a = lxvVar;
        this.b = lxnVar;
    }

    public final void a(boolean z) {
        synchronized (this) {
            if (!this.d) {
                long j = this.b.a;
                if (j != 0) {
                    boolean z2 = this.c;
                    if (z2 && !z) {
                        j = -j;
                    } else if (z2 || !z) {
                        j = 0;
                    }
                    this.c = z;
                    this.a.h(j);
                }
            }
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.d) {
                return;
            }
            this.d = true;
            long j = this.c ? -this.b.a : 0L;
            lie lieVarC = this.a.c();
            this.b.close();
            this.a.h(j);
            lieVarC.close();
        }
    }
}
