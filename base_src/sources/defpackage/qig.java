package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
final class qig {
    final int a;
    long b;
    final qiu[] c;

    public qig(int i, ThreadFactory threadFactory) {
        this.a = i;
        this.c = new qiu[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.c[i2] = new qiu(threadFactory);
        }
    }

    public final void a() {
        for (qiu qiuVar : this.c) {
            qiuVar.gT();
        }
    }

    public final qiu b() {
        int i = this.a;
        if (i == 0) {
            return qih.f;
        }
        qiu[] qiuVarArr = this.c;
        long j = this.b;
        this.b = 1 + j;
        return qiuVarArr[(int) (j % ((long) i))];
    }
}
