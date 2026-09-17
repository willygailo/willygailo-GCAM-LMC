package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hkp implements hko {
    final /* synthetic */ hko a;
    final /* synthetic */ long b;

    public hkp(hko hkoVar, long j) {
        this.a = hkoVar;
        this.b = j;
    }

    @Override // defpackage.hko
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.hko
    public final drc b() {
        return this.a.b();
    }

    @Override // defpackage.hko
    public final hkn c(long j) {
        hkn hknVarD = this.a.d(j);
        if (hknVarD == null || Math.abs(hknVarD.a - j) > this.b) {
            return null;
        }
        return hknVarD;
    }

    @Override // defpackage.hko
    public final hkn d(long j) {
        return this.a.d(j);
    }

    @Override // defpackage.hko
    public final void e() {
        this.a.e();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        long j = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 36);
        sb.append(strValueOf);
        sb.append("[maxTimeDiffNs=");
        sb.append(j);
        sb.append("]");
        return sb.toString();
    }
}
