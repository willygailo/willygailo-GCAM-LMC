package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ogk implements pgk {
    final /* synthetic */ ogi a;
    final /* synthetic */ pgk b;

    public ogk(ogi ogiVar, pgk pgkVar) {
        this.a = ogiVar;
        this.b = pgkVar;
    }

    @Override // defpackage.pgk
    public final pht a(Object obj) {
        ogi ogiVarC = ogq.c(this.a);
        try {
            return this.b.a(obj);
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
