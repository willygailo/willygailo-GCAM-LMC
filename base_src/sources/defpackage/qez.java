package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qez extends qey {
    private static final long serialVersionUID = 2587302975077663557L;
    final qde d;

    public qez(qde qdeVar, int i) {
        super(i);
        this.d = qdeVar;
    }

    @Override // defpackage.qey
    public final void a() {
        int i = this.a;
        qde qdeVar = this.d;
        for (int i2 = this.b; i2 != i; i2++) {
            if (this.c) {
                return;
            }
            qdeVar.d(Integer.valueOf(i2));
        }
        if (this.c) {
            return;
        }
        qdeVar.gO();
    }

    @Override // defpackage.qey
    public final void d(long j) {
        int i = this.a;
        int i2 = this.b;
        qde qdeVar = this.d;
        long j2 = 0;
        while (true) {
            if (j2 == j || i2 == i) {
                if (i2 == i) {
                    if (this.c) {
                        return;
                    }
                    qdeVar.gO();
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
                if (qdeVar.d(Integer.valueOf(i2))) {
                    j2++;
                }
                i2++;
            }
        }
    }
}
