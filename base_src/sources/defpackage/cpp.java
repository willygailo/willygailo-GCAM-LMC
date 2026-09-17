package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cpp {
    public final cpn a;
    private final ddf b;

    public cpp(cpn cpnVar, ddf ddfVar) {
        this.a = cpnVar;
        this.b = ddfVar;
    }

    public final leb a(lwd lwdVar) {
        ddi ddiVar = lwdVar == lwd.FRONT ? dcu.f : dcu.g;
        ojc ojcVarA = this.b.a(ddiVar);
        if (!ojcVarA.g()) {
            if (lwdVar == lwd.FRONT && !this.b.k(ddl.U)) {
                this.b.e();
                return leb.RES_1080P;
            }
            ddf ddfVar = this.b;
            ddi ddiVar2 = ddl.a;
            ddfVar.e();
            return (leb) this.a.fA();
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
            case 108034:
                return leb.RES_1080P_3X4;
            case 216034:
                return leb.RES_2160P_3X4;
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
}
