package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class ign extends mip {
    final /* synthetic */ igq a;

    public ign(igq igqVar) {
        this.a = igqVar;
    }

    @Override // defpackage.mip
    public final void q(byte[] bArr) {
        if (bArr.length > 0) {
            ouj oujVar = igq.a;
        }
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((iha) it.next()).a(bArr);
        }
    }

    @Override // defpackage.mip
    public final void r() {
        ouj oujVar = igq.a;
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((iha) it.next()).b();
        }
    }

    @Override // defpackage.mip
    public final void s(int i) {
        int i2;
        ouj oujVar = igq.a;
        for (iha ihaVar : this.a.h) {
            switch (i) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 3;
                    break;
                case 3:
                    i2 = 4;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown fallback reason");
            }
            ihaVar.c(i2);
        }
    }
}
