package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gol extends ldl {
    private final goy a;
    private final goy b;
    private final goy c;
    private final goy d;
    private final goy e;
    private final goy f;

    public gol(lco lcoVar, goy goyVar, goy goyVar2, goy goyVar3, goy goyVar4, goy goyVar5, goy goyVar6) {
        super(lcoVar);
        this.a = goyVar;
        this.b = goyVar2;
        this.c = goyVar3;
        this.d = goyVar4;
        this.e = goyVar5;
        this.f = goyVar6;
    }

    @Override // defpackage.ldl
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        gjk gjkVar = (gjk) obj;
        switch (gjkVar) {
            case NORMAL:
                return this.a;
            case NORMAL_WITH_FLASH:
                return this.b;
            case HDR_PLUS:
                return this.c;
            case HDR_PLUS_WITH_TORCH:
                return this.d;
            case HDR_PLUS_ZSL:
                return this.e;
            case LONG_EXPOSURE:
                return this.f;
            default:
                String strValueOf = String.valueOf(gjkVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 48);
                sb.append("Invalid AutoHdrPlusRecommendation enum instance:");
                sb.append(strValueOf);
                throw new AssertionError(sb.toString());
        }
    }

    public final String toString() {
        ojb ojbVarAZ = obr.aZ(this);
        ojbVarAZ.b("normal", this.a);
        ojbVarAZ.b("normalFlash", this.b);
        ojbVarAZ.b("hdrPlus", this.c);
        ojbVarAZ.b("hdrPlusTorch", this.d);
        ojbVarAZ.b("hdrPlusZsl", this.e);
        return ojbVarAZ.toString();
    }
}
