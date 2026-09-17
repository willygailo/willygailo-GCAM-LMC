package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cks {
    private cle a;
    private Integer b;

    public final ckt a() {
        Integer num;
        cle cleVar = this.a;
        if (cleVar != null && (num = this.b) != null) {
            return new ckt(cleVar, num.intValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" outputVideo");
        }
        if (this.b == null) {
            sb.append(" pendingVideoId");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(cle cleVar) {
        if (cleVar == null) {
            throw new NullPointerException("Null outputVideo");
        }
        this.a = cleVar;
    }

    public final void c(int i) {
        this.b = Integer.valueOf(i);
    }
}
