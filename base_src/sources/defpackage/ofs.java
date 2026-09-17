package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ofs extends pfx {
    private ofu a;
    private final int b;

    public ofs(ofu ofuVar, int i) {
        this.a = ofuVar;
        this.b = i;
    }

    @Override // defpackage.pfx
    protected final void c() {
        long j;
        int i;
        int iA;
        oft oftVar;
        ofu ofuVar = this.a;
        this.a = null;
        if (ofuVar == null) {
            return;
        }
        do {
            j = ofuVar.b.get();
            i = (int) j;
            iA = ofu.a(j);
            if (i == Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(33);
                sb.append("Refcount is: ");
                sb.append(j);
                throw new AssertionError(sb.toString());
            }
            if (i == -2147483647) {
                iA++;
            }
        } while (!ofuVar.b.compareAndSet(j, ofu.b(iA, i - 1)));
        if (i == -2147483647) {
            do {
                oftVar = (oft) ofuVar.c.get();
                if (oftVar == null || oftVar.a > this.b) {
                    return;
                } else {
                    oftVar.cancel(true);
                }
            } while (!ofuVar.c.compareAndSet(oftVar, null));
        }
    }

    @Override // defpackage.pfx
    protected final boolean e(pht phtVar) {
        return super.e(phtVar);
    }

    @Override // defpackage.pfx
    protected final String ga() {
        pgj pgjVar;
        ofu ofuVar = this.a;
        if (ofuVar == null || (pgjVar = ofuVar.a.a) == null) {
            return null;
        }
        String strValueOf = String.valueOf(pgjVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 11);
        sb.append("callable=[");
        sb.append(strValueOf);
        sb.append("]");
        String string = sb.toString();
        oft oftVar = (oft) this.a.c.get();
        if (oftVar == null) {
            return string;
        }
        String strValueOf2 = String.valueOf(string);
        String strValueOf3 = String.valueOf(oftVar);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 10 + String.valueOf(strValueOf3).length());
        sb2.append(strValueOf2);
        sb2.append(", trial=[");
        sb2.append(strValueOf3);
        sb2.append("]");
        return sb2.toString();
    }
}
