package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class pgh extends pgf {
    @Override // defpackage.pgf
    public final int a(pgi pgiVar) {
        int i;
        synchronized (pgiVar) {
            i = pgiVar.remaining - 1;
            pgiVar.remaining = i;
        }
        return i;
    }

    @Override // defpackage.pgf
    public final void b(pgi pgiVar, Set set) {
        synchronized (pgiVar) {
            if (pgiVar.seenExceptions == null) {
                pgiVar.seenExceptions = set;
            }
        }
    }
}
