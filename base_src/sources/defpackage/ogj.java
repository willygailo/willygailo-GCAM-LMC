package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ogj implements pgj {
    final /* synthetic */ ogi a;
    final /* synthetic */ pgj b;

    public ogj(ogi ogiVar, pgj pgjVar) {
        this.a = ogiVar;
        this.b = pgjVar;
    }

    @Override // defpackage.pgj
    public final pht a() {
        ogi ogiVarC = ogq.c(this.a);
        try {
            return this.b.a();
        } finally {
            ogq.c(ogiVarC);
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 14);
        sb.append("propagating=[");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }
}
