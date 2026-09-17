package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class otm extends otn {
    public otm(pfc pfcVar) {
        super(pfcVar);
    }

    @Override // defpackage.otn
    public final int a(pfc pfcVar, int i) {
        int i2;
        if (pfcVar.d()) {
            return 1;
        }
        int i3 = 0;
        int iA = this.b.a(0);
        while (true) {
            i2 = pfcVar.c;
            if (i3 >= i2) {
                break;
            }
            if (pfcVar.b[i3] == iA) {
                if (i3 < 0) {
                    break;
                }
                return i2 - 1;
            }
            i3++;
        }
        return i2;
    }
}
