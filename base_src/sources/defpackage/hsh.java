package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hsh {
    public final dei a;
    private final mbk b;
    private final ljf c;
    private final ddf d;
    private final lis e;
    private final huf f;
    private final mcc g;

    public hsh(mbk mbkVar, ljf ljfVar, lis lisVar, ddf ddfVar, huf hufVar, mcc mccVar, dei deiVar) {
        this.b = mbkVar;
        this.c = ljfVar;
        this.d = ddfVar;
        this.e = lisVar.a("GcaMediaStorage");
        this.f = hufVar;
        this.g = mccVar;
        this.a = deiVar;
    }

    public final hsg a(long j, dxh dxhVar, String str) {
        return b(j, dxhVar, str, ((Boolean) this.f.c(htu.ab)).booleanValue() ? hss.MARS_STORE : hss.MEDIA_STORE);
    }

    public final hsg b(long j, dxh dxhVar, String str, hss hssVar) {
        this.c.e("Create fileGroup");
        hsg hsgVarB = hsg.b(this.b, j, dxhVar, str, this.e, this.d, this.g, hssVar);
        lis lisVar = this.e;
        String strValueOf = String.valueOf(hsgVarB);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 8);
        sb.append("Created ");
        sb.append(strValueOf);
        lisVar.f(sb.toString());
        this.c.f();
        return hsgVarB;
    }

    public final hsg c(long j) {
        return a(j, dxh.NIGHT, "NIGHT");
    }

    public final hsg d(long j) {
        return a(j, dxh.NONE, null);
    }
}
