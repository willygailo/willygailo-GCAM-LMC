package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qfa extends qey {
    private static final long serialVersionUID = 2587302975077663557L;
    final qym d;

    public qfa(qym qymVar, int i) {
        super(i);
        this.d = qymVar;
    }

    @Override // defpackage.qey
    public final void a() {
        int i = this.a;
        qym qymVar = this.d;
        for (int i2 = this.b; i2 != i; i2++) {
            if (this.c) {
                return;
            }
            qymVar.e(Integer.valueOf(i2));
        }
        if (this.c) {
            return;
        }
        qymVar.gO();
    }

    @Override // defpackage.qey
    public final void d(long j) {
        int i = this.a;
        int i2 = this.b;
        qym qymVar = this.d;
        long j2 = 0;
        while (true) {
            if (j2 == j || i2 == i) {
                if (i2 == i) {
                    if (this.c) {
                        return;
                    }
                    qymVar.gO();
                    return;
                }
                j = get();
                if (j2 == j) {
                    this.b = i2;
                    j = addAndGet(-j2);
                    if (j == 0) {
                        return;
                    } else {
                        j2 = 0;
                    }
                } else {
                    continue;
                }
            } else {
                if (this.c) {
                    return;
                }
                qymVar.e(Integer.valueOf(i2));
                j2++;
                i2++;
            }
        }
    }
}
