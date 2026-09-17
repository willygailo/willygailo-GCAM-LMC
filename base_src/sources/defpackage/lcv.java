package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class lcv {
    public static final lie a = new jmf(3);

    public static lco a(Collection collection) {
        return new lcn(collection);
    }

    @SafeVarargs
    public static lco b(lco... lcoVarArr) {
        ArrayList arrayList = new ArrayList();
        for (lco lcoVar : lcoVarArr) {
            arrayList.add(lcoVar);
        }
        return a(arrayList);
    }

    public static lco c(Collection collection) {
        return j(a(collection), imd.h);
    }

    @SafeVarargs
    public static lco d(lco... lcoVarArr) {
        return c(Arrays.asList(lcoVarArr));
    }

    public static lco e(lco lcoVar, final Comparable comparable) {
        return j(lcoVar, new oiu() { // from class: lcq
            @Override // defpackage.oiu
            public final Object a(Object obj) {
                return Boolean.valueOf(((Comparable) obj).compareTo(comparable) >= 0);
            }
        });
    }

    public static lco f(Collection collection) {
        obr.aF(!collection.isEmpty());
        return j(a(collection), imd.i);
    }

    public static lco g(Object obj) {
        return new lct(obj);
    }

    public static lco h(Collection collection) {
        obr.aF(!collection.isEmpty());
        return j(a(collection), imd.g);
    }

    @SafeVarargs
    public static lco i(lco... lcoVarArr) {
        return h(Arrays.asList(lcoVarArr));
    }

    public static lco j(lco lcoVar, oiu oiuVar) {
        return lci.c(new lcr(lcoVar, oiuVar, lcoVar));
    }

    public static lie k(lco lcoVar, final Runnable runnable, Executor executor) {
        lcoVar.getClass();
        runnable.getClass();
        executor.getClass();
        return lcoVar.a(new lij() { // from class: lcp
            @Override // defpackage.lij
            public final void fB(Object obj) {
                runnable.run();
            }
        }, executor);
    }

    public static lie l(lco lcoVar, lij lijVar) {
        return lcoVar.a(lijVar, plk.K());
    }
}
