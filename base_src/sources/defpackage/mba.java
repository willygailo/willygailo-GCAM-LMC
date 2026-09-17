package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class mba {
    public mak a;
    public Set b;
    public Set c;
    public Set d;
    public maw e;
    private oom f;

    public final mbb a() {
        Set set;
        Set set2;
        maw mawVar;
        oom oomVar;
        Set set3 = this.b;
        if (set3 != null && (set = this.c) != null && (set2 = this.d) != null && (mawVar = this.e) != null && (oomVar = this.f) != null) {
            return new mbb(this.a, set3, set, set2, mawVar, oomVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" publicMediaFiles");
        }
        if (this.c == null) {
            sb.append(" privateMediaFiles");
        }
        if (this.d == null) {
            sb.append(" cachedMediaFiles");
        }
        if (this.e == null) {
            sb.append(" mediaGroupInfoBuilder");
        }
        if (this.f == null) {
            sb.append(" listeners");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(oom oomVar) {
        if (oomVar == null) {
            throw new NullPointerException("Null listeners");
        }
        this.f = oomVar;
    }
}
