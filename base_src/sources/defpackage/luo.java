package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class luo implements lie {
    final /* synthetic */ lup a;
    private boolean b = false;
    private final /* synthetic */ int c;

    public luo(lup lupVar, int i) {
        this.c = i;
        this.a = lupVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        switch (this.c) {
            case 0:
                synchronized (this) {
                    if (this.b) {
                        z = false;
                    } else {
                        this.b = true;
                        z = true;
                    }
                    break;
                }
                if (z) {
                    lup lupVar = this.a;
                    synchronized (lupVar) {
                        obr.ap(lupVar.b > 0);
                        int i = lupVar.b - 1;
                        lupVar.b = i;
                        if (i == 0 && lupVar.a == 0) {
                            lupVar.c = true;
                            z3 = true;
                        }
                        break;
                    }
                    if (z3) {
                        lupVar.d.close();
                    }
                    lupVar.c();
                    return;
                }
                return;
            default:
                synchronized (this) {
                    if (this.b) {
                        z2 = false;
                    } else {
                        this.b = true;
                        z2 = true;
                    }
                    break;
                }
                if (z2) {
                    lup lupVar2 = this.a;
                    synchronized (lupVar2) {
                        obr.ap(lupVar2.a > 0);
                        int i2 = lupVar2.a - 1;
                        lupVar2.a = i2;
                        if (i2 == 0 && lupVar2.b == 0) {
                            lupVar2.c = true;
                            z3 = true;
                        }
                        break;
                    }
                    if (z3) {
                        lupVar2.d.close();
                    }
                    lupVar2.c();
                    return;
                }
                return;
        }
    }
}
