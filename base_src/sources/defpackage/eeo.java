package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class eeo implements eey {
    final /* synthetic */ eer a;

    public eeo(eer eerVar) {
        this.a = eerVar;
    }

    @Override // defpackage.eey
    public final void a(long j, int i, boolean z) {
        int i2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        eer eerVar = this.a;
        int i3 = (int) (jCurrentTimeMillis - eerVar.f);
        ouj oujVar = ees.a;
        ovd ovdVar = ovl.a;
        poy poyVar = eerVar.i;
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        pbj pbjVar = (pbj) poyVar.b;
        pbj pbjVar2 = pbj.d;
        pbjVar.a |= 1;
        pbjVar.b = i3;
        poy poyVar2 = this.a.i;
        switch (i) {
            case 0:
                i2 = 2;
                break;
            case 1:
                i2 = 3;
                break;
            case 2:
                i2 = 5;
                break;
            case 3:
                i2 = 6;
                break;
            case 4:
                i2 = 7;
                break;
            case 5:
                i2 = 8;
                break;
            case 6:
                i2 = 9;
                break;
            case 7:
                i2 = 10;
                break;
            case 8:
                i2 = 11;
                break;
            case 9:
                i2 = 12;
                break;
            case 10:
                i2 = 13;
                break;
            case 11:
                i2 = 14;
                break;
            default:
                i2 = 4;
                break;
        }
        if (poyVar2.c) {
            poyVar2.m();
            poyVar2.c = false;
        }
        pbj pbjVar3 = (pbj) poyVar2.b;
        pbjVar3.c = i2 - 1;
        pbjVar3.a |= 2;
        if (z) {
            try {
                eer eerVar2 = this.a;
                eerVar2.h.c.c(eerVar2.d.f().a, dxh.DEBLUR_FUSION);
                this.a.d.k().b();
            } catch (IOException e) {
                ((oug) ((oug) ((oug) ees.a.c().g(ovl.a, "FalconPostProcImgSaver")).h(e)).G(1102)).q("Couldn't apply special type for %s", j);
            }
        }
        this.a.r = true;
        this.a.e(j);
    }
}
