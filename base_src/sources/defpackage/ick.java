package defpackage;

import android.os.SystemClock;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ick {
    public final huf a;
    public final hug b;
    public boolean c;
    private final fjs e;
    private final lco f;
    private final Map g = new EnumMap(icj.class);
    public final poy d = pdy.j.m();

    public ick(fjs fjsVar, lda ldaVar, huf hufVar, hug hugVar) {
        this.e = fjsVar;
        this.f = ldaVar;
        this.a = hufVar;
        this.b = hugVar;
    }

    final void a() {
        b();
        d(icj.POPUP_SHARE_HANDLE);
        f(2);
    }

    final void b() {
        obr.aQ(!this.c);
        this.c = true;
        this.g.clear();
        poy poyVar = this.d;
        poyVar.b = (ppd) poyVar.b.G(4);
    }

    final void c() {
        int iV;
        obr.aQ(this.c);
        poy poyVar = this.d;
        boolean zBooleanValue = ((Boolean) this.a.c(htu.B)).booleanValue();
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        pdy pdyVar = (pdy) poyVar.b;
        pdy pdyVar2 = pdy.j;
        pdyVar.a |= 64;
        pdyVar.h = zBooleanValue;
        poy poyVar2 = this.d;
        boolean zBooleanValue2 = ((Boolean) this.a.c(htu.A)).booleanValue();
        if (poyVar2.c) {
            poyVar2.m();
            poyVar2.c = false;
        }
        pdy pdyVar3 = (pdy) poyVar2.b;
        pdyVar3.a |= 128;
        pdyVar3.i = zBooleanValue2;
        if (((pdy) this.d.b).g.isEmpty() || !((iV = oxh.V(((pdy) this.d.b).d)) == 0 || iV == 1)) {
            pdy pdyVar4 = (pdy) this.d.b;
            int i = pdyVar4.c;
            int i2 = pdyVar4.d;
        } else {
            int iW = oxh.W(((pdy) this.d.b).c);
            boolean z = iW == 0 || iW == 1;
            obr.aQ(!z);
            poy poyVar3 = this.d;
            if (poyVar3.c) {
                poyVar3.m();
                poyVar3.c = false;
            }
            pdy pdyVar5 = (pdy) poyVar3.b;
            pdyVar5.a |= 1;
            pdyVar5.b = true;
            pdy pdyVar6 = (pdy) this.d.b;
            String str = pdyVar6.g;
            int i3 = pdyVar6.c;
        }
        this.e.U(jri.f((jrl) this.f.fA()), null, null, (pdy) this.d.j(), null);
        this.c = false;
    }

    final void d(icj icjVar) {
        obr.aQ(this.c);
        obr.aQ(!this.g.containsKey(icjVar));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.g.put(icjVar, Long.valueOf(jElapsedRealtime));
        icj icjVar2 = icj.POPUP_SHARE_HANDLE;
        switch (icjVar.ordinal()) {
            case 1:
                Long l = (Long) this.g.get(icj.POPUP_SHARE_HANDLE);
                if (l != null) {
                    int iLongValue = (int) (jElapsedRealtime - l.longValue());
                    poy poyVar = this.d;
                    if (poyVar.c) {
                        poyVar.m();
                        poyVar.c = false;
                    }
                    pdy pdyVar = (pdy) poyVar.b;
                    pdy pdyVar2 = pdy.j;
                    pdyVar.a |= 8;
                    pdyVar.e = iLongValue;
                }
                break;
            case 2:
                Long l2 = (Long) this.g.get(icj.LAUNCH_SHARE_PANEL);
                l2.getClass();
                int iLongValue2 = (int) (jElapsedRealtime - l2.longValue());
                poy poyVar2 = this.d;
                if (poyVar2.c) {
                    poyVar2.m();
                    poyVar2.c = false;
                }
                pdy pdyVar3 = (pdy) poyVar2.b;
                pdy pdyVar4 = pdy.j;
                pdyVar3.a |= 16;
                pdyVar3.f = iLongValue2;
                break;
            default:
                icjVar.name();
                break;
        }
    }

    final void e(int i) {
        obr.aQ(this.c);
        poy poyVar = this.d;
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        pdy pdyVar = (pdy) poyVar.b;
        pdy pdyVar2 = pdy.j;
        pdyVar.c = i - 1;
        pdyVar.a |= 2;
    }

    final void f(int i) {
        obr.aQ(this.c);
        poy poyVar = this.d;
        if (poyVar.c) {
            poyVar.m();
            poyVar.c = false;
        }
        pdy pdyVar = (pdy) poyVar.b;
        pdy pdyVar2 = pdy.j;
        pdyVar.d = i - 1;
        pdyVar.a |= 4;
    }
}
