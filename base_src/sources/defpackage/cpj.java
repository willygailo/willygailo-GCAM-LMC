package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cpj {
    public final huf a;
    public final ddf b;
    private final nvb c;

    public cpj(huf hufVar, nvb nvbVar, ddf ddfVar, byte[] bArr, byte[] bArr2) {
        this.a = hufVar;
        this.c = nvbVar;
        this.b = ddfVar;
    }

    public final leb a(lwd lwdVar) {
        ddi ddiVar = lwdVar == lwd.FRONT ? dcu.f : dcu.g;
        ojc ojcVarA = this.b.a(ddiVar);
        if (!ojcVarA.g()) {
            if (lwdVar != lwd.FRONT && ((Boolean) this.a.c(htu.s)).booleanValue()) {
                return leb.RES_2160P;
            }
            return leb.RES_1080P;
        }
        switch (((Integer) ojcVarA.c()).intValue()) {
            case 144:
                return leb.RES_QCIF;
            case 240:
                return leb.RES_QVGA;
            case 288:
                return leb.RES_CIF;
            case 480:
                return leb.RES_480P;
            case 720:
                return leb.RES_720P;
            case 1080:
                return leb.RES_1080P;
            case 2160:
                return leb.RES_2160P;
            default:
                String strValueOf = String.valueOf(ojcVarA.c());
                String str = ddiVar.a;
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 35 + String.valueOf(str).length());
                sb.append("Value ");
                sb.append(strValueOf);
                sb.append(" for ADB flag ");
                sb.append(str);
                sb.append(" not supported.");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public final boolean b() {
        ddf ddfVar = this.b;
        ddi ddiVar = dcu.a;
        ddfVar.b();
        return ((Boolean) this.a.c(htu.r)).booleanValue() && this.b.k(dcu.o) && this.c.c();
    }

    public final boolean c() {
        return ((Boolean) this.a.c(htu.q)).booleanValue();
    }

    public final boolean d() {
        return this.b.j(dcu.s);
    }
}
