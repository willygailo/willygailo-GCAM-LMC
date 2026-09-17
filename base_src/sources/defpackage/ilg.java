package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ilg {
    private final lda a;
    private final lda b;
    private final lda c;
    private final hur d;
    private final huq e;
    private final huf f;

    public ilg(lda ldaVar, lda ldaVar2, lda ldaVar3, hur hurVar, huq huqVar, huf hufVar) {
        this.a = ldaVar;
        this.b = ldaVar2;
        this.c = ldaVar3;
        this.d = hurVar;
        this.e = huqVar;
        this.f = hufVar;
    }

    public final ilf a(ilv ilvVar) {
        long j = ilvVar.b;
        long j2 = true != "full".equals(this.b.fA()) ? 2000000L : 3500000L;
        if (((Integer) this.c.fA()).intValue() != 0) {
            j2 += 4300000;
        }
        if (((Boolean) this.a.fA()).booleanValue()) {
            j2 += 13000000;
        }
        int i = (int) (j / j2);
        long j3 = ilvVar.b;
        float f = 22.0f;
        if (this.d.fA() == htl.RES_1080P) {
            htg htgVar = (htg) this.e.a.fA();
            if (htgVar != htg.FPS_AUTO && htgVar != htg.FPS_30) {
                f = 33.0f;
            }
        } else {
            f = ((htg) this.e.b.fA()) == htg.FPS_60 ? 72.0f : 48.0f;
        }
        if (((Boolean) this.f.c(htu.r)).booleanValue()) {
            f *= 0.9f;
        }
        int i2 = (int) ((j3 / ((long) ((int) ((f * 1000000.0f) / 8.0f)))) / 60);
        return new ilf(i, i2, i < 50, i2 < 6, !ilvVar.b(), !ilvVar.c());
    }
}
