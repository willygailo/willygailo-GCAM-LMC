package defpackage;

import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
final class mup implements muo {
    private static final ouj a = ouj.h("com/google/android/libraries/performance/primes/PrimesApiImpl");
    private final muz b;
    private final qkg c;
    private final qkg d;
    private final qkg e;

    public mup(muz muzVar, qkg qkgVar, qkg qkgVar2, qkg qkgVar3, ojc ojcVar, oxk oxkVar, byte[] bArr, byte[] bArr2) {
        this.b = muzVar;
        this.c = qkgVar;
        this.d = qkgVar2;
        this.e = qkgVar3;
        if (!myw.i() && !oxkVar.i()) {
            String str = oxkVar.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 150);
            sb.append("Primes init triggered from background in package: ");
            sb.append(str);
            sb.append(". If this is an existing error, please file a bug on the Primes team to whitelist your package name.");
            throw new IllegalStateException(sb.toString());
        }
        if (((Boolean) ojcVar.e(Boolean.FALSE)).booleanValue()) {
            return;
        }
        try {
            WeakHashMap weakHashMap = ogq.a;
            Iterator it = ((pyw) qkgVar).get().iterator();
            while (it.hasNext()) {
                ((mxo) it.next()).t();
            }
        } catch (RuntimeException e) {
            ((oug) ((oug) ((oug) a.c()).h(e)).G((char) 3591)).o("Primes failed to initialize");
            this.b.a();
        }
    }

    @Override // defpackage.muo
    public final void a() {
        ((mye) this.d.get()).d();
    }

    @Override // defpackage.muo
    public final void b() {
        ((mzv) this.e.get()).a();
    }
}
