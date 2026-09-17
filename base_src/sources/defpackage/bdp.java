package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class bdp implements bdk {
    private final File b;
    private ayu d;
    private final bdn c = new bdn();
    private final bdw a = new bdw();

    @Deprecated
    public bdp(File file) {
        this.b = file;
    }

    private final synchronized ayu c() {
        if (this.d == null) {
            this.d = ayu.g(this.b, 262144000L);
        }
        return this.d;
    }

    @Override // defpackage.bdk
    public final File a(azp azpVar) {
        try {
            ayt aytVarA = c().a(this.a.a(azpVar));
            if (aytVarA != null) {
                return aytVarA.a();
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // defpackage.bdk
    public final void b(azp azpVar, bbf bbfVar) {
        bdm bdmVar;
        bdn bdnVar;
        String strA = this.a.a(azpVar);
        bdn bdnVar2 = this.c;
        synchronized (bdnVar2) {
            bdmVar = (bdm) bdnVar2.a.get(strA);
            if (bdmVar == null) {
                bio bioVar = bdnVar2.b;
                synchronized (bioVar.a) {
                    bdmVar = (bdm) bioVar.a.poll();
                }
                if (bdmVar == null) {
                    bdmVar = new bdm();
                }
                bdnVar2.a.put(strA, bdmVar);
            }
            bdmVar.b++;
        }
        bdmVar.a.lock();
        try {
            try {
                ayu ayuVarC = c();
                if (ayuVarC.a(strA) == null) {
                    ayr ayrVarF = ayuVarC.f(strA);
                    if (ayrVarF == null) {
                        throw new IllegalStateException(strA.length() != 0 ? "Had two simultaneous puts for: ".concat(strA) : new String("Had two simultaneous puts for: "));
                    }
                    try {
                        if (bbfVar.a.a(bbfVar.b, ayrVarF.d(), bbfVar.c)) {
                            ayrVarF.c();
                        }
                        ayrVarF.b();
                        bdnVar = this.c;
                    } catch (Throwable th) {
                        ayrVarF.b();
                        throw th;
                    }
                } else {
                    bdnVar = this.c;
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            bdnVar.a(strA);
        } catch (Throwable th2) {
            this.c.a(strA);
            throw th2;
        }
    }
}
