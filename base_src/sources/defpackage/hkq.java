package defpackage;

import android.os.Trace;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class hkq implements dvq {
    private static final ouj a = ouj.h("com/google/android/apps/camera/qualityscore/FrameQualityScoreProcessor");
    private final hki b;
    private final hkr c;
    private final dvp d;
    private final fpo e;
    private final ojc f;
    private long g = -1;
    private final imf h;
    private final dqa i;

    public hkq(hki hkiVar, hkr hkrVar, dvp dvpVar, fpo fpoVar, lda ldaVar, ddf ddfVar, qkg qkgVar, imf imfVar, dqa dqaVar) {
        boolean z;
        this.b = hkiVar;
        this.c = hkrVar;
        this.d = dvpVar;
        this.e = fpoVar;
        if (((Boolean) ldaVar.fA()).booleanValue()) {
            z = true;
        } else {
            ddg ddgVar = ddd.a;
            ddfVar.d();
            z = false;
        }
        ddg ddgVar2 = ddd.a;
        ddfVar.d();
        this.f = z ? ojc.i((dwk) qkgVar.get()) : oih.a;
        this.h = imfVar;
        this.i = dqaVar;
    }

    public final synchronized void b(long j) {
        hjz hjzVarA;
        mad madVarC = this.e.c(j);
        if (madVarC == null) {
            return;
        }
        try {
            if (this.c.c(j) == null && (hjzVarA = this.d.a(j)) != null && !((Boolean) this.h.a().fA()).booleanValue() && !((Boolean) this.i.a().fA()).booleanValue()) {
                Trace.beginSection("frameQualityScorer.getFrameScore");
                hkn hknVarA = this.b.a(madVarC, hjzVarA);
                Trace.endSection();
                if (j <= this.g) {
                    ((oug) ((oug) a.b()).G(2516)).o("Out of order frame scores detected!");
                }
                this.c.f(hknVarA);
                if (this.f.g() && hknVarA.p.g()) {
                    dwk dwkVar = (dwk) this.f.c();
                    hla hlaVar = (hla) hknVarA.p.c();
                    ArrayList arrayList = new ArrayList();
                    for (hkz hkzVar : hlaVar.a) {
                        dwe dweVar = new dwe(null);
                        dweVar.c(-1L);
                        dweVar.b = oih.a;
                        dweVar.b(0.0f);
                        dweVar.d = oih.a;
                        dweVar.a(0.0f);
                        dweVar.c(hkzVar.a);
                        dweVar.b = hkzVar.b;
                        dweVar.b(hkzVar.c);
                        dweVar.d = hkzVar.d;
                        dweVar.a(hkzVar.e);
                        Long l = dweVar.a;
                        if (l != null && dweVar.c != null && dweVar.e != null) {
                            arrayList.add(new dwf(l.longValue(), dweVar.b, dweVar.c.floatValue(), dweVar.d, dweVar.e.floatValue()));
                        }
                        StringBuilder sb = new StringBuilder();
                        if (dweVar.a == null) {
                            sb.append(" trackId");
                        }
                        if (dweVar.c == null) {
                            sb.append(" score");
                        }
                        if (dweVar.e == null) {
                            sb.append(" aggregatedToneConfidence");
                        }
                        String strValueOf = String.valueOf(sb);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
                        sb2.append("Missing required properties:");
                        sb2.append(strValueOf);
                        throw new IllegalStateException(sb2.toString());
                    }
                    dwg dwgVar = new dwg(hlaVar.f, arrayList);
                    try {
                        synchronized (dwkVar.c) {
                            try {
                                dwkVar.b[dwkVar.a.b(dwgVar.a)] = dwgVar;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (IllegalArgumentException e) {
                    }
                }
                this.g = j;
            }
            madVarC.close();
        } catch (Throwable th2) {
            try {
                madVarC.close();
                throw th2;
            } catch (Throwable th3) {
                throw th2;
            }
        }
    }

    @Override // defpackage.dvq
    public final synchronized void k(hjz hjzVar) {
        b(hjzVar.b);
    }
}
