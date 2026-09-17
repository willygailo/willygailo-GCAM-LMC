package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class ndo implements ndg {
    public final String a;
    public final String b;
    public final boolean c;
    private final ncx d;
    private final nda e;
    private final ndl f;

    public ndo(Context context, ojc ojcVar, ojc ojcVar2, ojc ojcVar3, ojc ojcVar4) {
        String packageName = context.getPackageName();
        ncx ncxVar = (ncx) ojcVar.e(ncx.b);
        nda ndaVar = (nda) ojcVar2.e(nda.b);
        ndl ndlVar = (ndl) ojcVar3.e(ndl.b);
        boolean zBooleanValue = ((Boolean) ojcVar4.e(false)).booleanValue();
        this.b = "CAMERA_ANDROID_PRIMES";
        this.d = ncxVar;
        this.e = ndaVar;
        this.f = ndlVar;
        this.c = zBooleanValue;
        String strValueOf = String.valueOf(packageName);
        this.a = strValueOf.length() != 0 ? "com.google.android.libraries.performance.primes#".concat(strValueOf) : new String("com.google.android.libraries.performance.primes#");
    }

    @Override // defpackage.ndg
    public final pht a() {
        final pht phtVarA = this.d.a();
        final pht phtVarA2 = this.e.a();
        final pht phtVarA3 = this.f.a();
        return plk.P(phtVarA, phtVarA2, phtVarA3).a(new Callable() { // from class: ndn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ndo ndoVar = this.a;
                pht phtVar = phtVarA;
                pht phtVar2 = phtVarA2;
                pht phtVar3 = phtVarA3;
                poy poyVarM = ndm.h.m();
                String str = ndoVar.b;
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                ndm ndmVar = (ndm) poyVarM.b;
                int i = ndmVar.a | 1;
                ndmVar.a = i;
                ndmVar.b = str;
                String str2 = ndoVar.a;
                str2.getClass();
                int i2 = i | 2;
                ndmVar.a = i2;
                ndmVar.c = str2;
                boolean z = ndoVar.c;
                ndmVar.a = i2 | 4;
                ndmVar.d = z;
                try {
                    ojc ojcVar = (ojc) plk.ad(phtVar);
                    if (ojcVar.g()) {
                        String str3 = (String) ojcVar.c();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        ndm ndmVar2 = (ndm) poyVarM.b;
                        ndmVar2.a |= 16;
                        ndmVar2.f = str3;
                    }
                } catch (Exception e) {
                }
                try {
                    List list = (List) plk.ad(phtVar2);
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    ndm ndmVar3 = (ndm) poyVarM.b;
                    ppk ppkVar = ndmVar3.g;
                    if (!ppkVar.c()) {
                        ndmVar3.g = ppd.x(ppkVar);
                    }
                    pnl.e(list, ndmVar3.g);
                } catch (Exception e2) {
                }
                try {
                    ojc ojcVar2 = (ojc) plk.ad(phtVar3);
                    if (ojcVar2.g()) {
                        String str4 = (String) ojcVar2.c();
                        if (poyVarM.c) {
                            poyVarM.m();
                            poyVarM.c = false;
                        }
                        ndm ndmVar4 = (ndm) poyVarM.b;
                        ndmVar4.a |= 8;
                        ndmVar4.e = str4;
                    }
                } catch (Exception e3) {
                }
                ppa ppaVar = (ppa) ndf.c.m();
                ppaVar.av(ndm.i, (ndm) poyVarM.j());
                return (ndf) ppaVar.j();
            }
        }, pgr.INSTANCE);
    }
}
