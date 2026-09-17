package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class cvc {
    public final fjs a;
    public final cpj b;
    public final cib c;
    public final imt d;
    public final ijw e;
    private final cka f;

    public cvc(fjs fjsVar, cpj cpjVar, cib cibVar, imt imtVar, cka ckaVar, ijw ijwVar) {
        this.a = fjsVar;
        this.b = cpjVar;
        this.c = cibVar;
        this.d = imtVar;
        this.f = ckaVar;
        this.e = ijwVar;
    }

    public static int c(jrl jrlVar, boolean z) {
        cqj cqjVar = cqj.OFF;
        lga lgaVar = lga.VIDEO_BUFFER_DELAY;
        jrl jrlVar2 = jrl.UNINITIALIZED;
        switch (jrlVar.ordinal()) {
            case 2:
                return z ? 10 : 9;
            case 5:
                return z ? 33 : 24;
            case 8:
                return 21;
            case 13:
                return z ? 34 : 11;
            default:
                String strValueOf = String.valueOf(jrlVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 24);
                sb.append("Not a valid video mode: ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public final void a(Throwable th, lwd lwdVar) {
        int i;
        if (th instanceof TimeoutException) {
            i = 3;
        } else if (th instanceof IllegalStateException) {
            i = 4;
        } else {
            i = th instanceof IOException ? 5 : 1;
        }
        cju cjuVarA = this.f.a();
        poy poyVarM = pen.g.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pen penVar = (pen) poyVarM.b;
        penVar.e = i - 1;
        penVar.a |= 8;
        this.a.ar(c(this.c.a(), true), lwdVar, null, ((Float) cjuVarA.b.fA()).floatValue(), ((Boolean) ((lce) cjuVarA.e).d).booleanValue(), -1.0f, (pen) poyVarM.j(), this.d.c().j, false);
    }

    public final void b(ckv ckvVar, lwd lwdVar) {
        cju cjuVarA = this.f.a();
        poy poyVarM = pen.g.m();
        int i = ckvVar.e.b;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pen penVar = (pen) poyVarM.b;
        int i2 = penVar.a | 1;
        penVar.a = i2;
        penVar.b = i;
        int i3 = ckvVar.e.a;
        int i4 = i2 | 2;
        penVar.a = i4;
        penVar.c = i3;
        int i5 = ckvVar.g;
        int i6 = i4 | 4;
        penVar.a = i6;
        penVar.d = i5;
        penVar.e = 1;
        int i7 = i6 | 8;
        penVar.a = i7;
        long j = ckvVar.f;
        penVar.a = i7 | 16;
        penVar.f = (int) j;
        pen penVar2 = (pen) poyVarM.j();
        fjs fjsVar = this.a;
        int iC = c(this.c.a(), true);
        ckvVar.b.getName();
        fjsVar.ar(iC, lwdVar, ckvVar.a, ((Float) cjuVarA.b.fA()).floatValue(), ((Boolean) ((lce) cjuVarA.e).d).booleanValue(), ckvVar.f / 1000, penVar2, this.d.c().j, ckvVar.d.d == hss.MARS_STORE);
    }
}
