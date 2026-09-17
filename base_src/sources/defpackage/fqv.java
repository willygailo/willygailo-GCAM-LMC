package defpackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class fqv implements fpp {
    /* JADX WARN: Type inference failed for: r6v1, types: [mtc, mtd] */
    @Override // defpackage.fpp
    public final mlk a(final FileOutputStream fileOutputStream, int i, pht phtVar, Executor executor) {
        pht phtVarH = pgb.h(phtVar, eto.e, pgr.INSTANCE);
        try {
            ?? H = mwp.h(executor);
            H.c(fileOutputStream.getFD());
            H.b(i);
            ((mtb) H).b = pgb.h(phtVarH, imd.m, ((mtb) H).a);
            ((mtb) H).c = pgb.h(phtVarH, imd.n, ((mtb) H).a);
            ((mtb) H).d = false;
            mll mllVar = new mll(H.a());
            final pih pihVarF = pih.f();
            final pht phtVarB = mllVar.b();
            phtVarB.d(new Runnable() { // from class: fqt
                @Override // java.lang.Runnable
                public final void run() {
                    FileOutputStream fileOutputStream2 = fileOutputStream;
                    pih pihVar = pihVarF;
                    pht phtVar2 = phtVarB;
                    try {
                        try {
                            fileOutputStream2.close();
                            pihVar.e(phtVar2);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } catch (Throwable th) {
                        pihVar.e(phtVar2);
                        throw th;
                    }
                }
            }, pgr.INSTANCE);
            return new fqu(mllVar, pihVarF);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
