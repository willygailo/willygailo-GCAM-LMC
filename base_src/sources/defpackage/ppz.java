package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class ppz extends pqa {
    static ppm a(Object obj, long j) {
        return (ppm) prv.h(obj, j);
    }

    @Override // defpackage.pqa
    public final List b(Object obj, long j) {
        ppm ppmVarA = a(obj, j);
        if (ppmVarA.c()) {
            return ppmVarA;
        }
        int size = ppmVarA.size();
        ppm ppmVarE = ppmVarA.e(size == 0 ? 10 : size + size);
        prv.u(obj, j, ppmVarE);
        return ppmVarE;
    }

    @Override // defpackage.pqa
    public final void c(Object obj, long j) {
        a(obj, j).b();
    }

    @Override // defpackage.pqa
    public final void d(Object obj, Object obj2, long j) {
        ppm ppmVarA = a(obj, j);
        ppm ppmVarA2 = a(obj2, j);
        int size = ppmVarA.size();
        int size2 = ppmVarA2.size();
        if (size > 0 && size2 > 0) {
            if (!ppmVarA.c()) {
                ppmVarA = ppmVarA.e(size2 + size);
            }
            ppmVarA.addAll(ppmVarA2);
        }
        if (size > 0) {
            ppmVarA2 = ppmVarA;
        }
        prv.u(obj, j, ppmVarA2);
    }
}
