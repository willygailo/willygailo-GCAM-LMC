package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class lqb implements lng {
    public final lqx a;
    private final lot b;
    private final ljf c;

    public lqb(lot lotVar, ljf ljfVar, lqx lqxVar) {
        this.b = lotVar;
        this.c = ljfVar;
        this.a = lqxVar;
    }

    @Override // defpackage.lng
    public final lmp a() {
        return this.a.a();
    }

    @Override // defpackage.lng
    public final pht b(lmq lmqVar) {
        return this.a.e(lmqVar, false);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e5 A[Catch: all -> 0x00d2, TryCatch #1 {all -> 0x00d2, blocks: (B:7:0x0046, B:8:0x0057, B:12:0x0065, B:13:0x006f, B:15:0x0075, B:16:0x008d, B:18:0x0093, B:19:0x00a6, B:20:0x00b5, B:37:0x00db, B:38:0x00df, B:40:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00ff, B:47:0x0103, B:49:0x0109, B:50:0x0113, B:51:0x0117, B:53:0x011d, B:55:0x0129, B:56:0x012d, B:58:0x0133, B:59:0x013d, B:61:0x0143, B:62:0x014d, B:63:0x0152), top: B:67:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f1 A[Catch: all -> 0x00d2, TryCatch #1 {all -> 0x00d2, blocks: (B:7:0x0046, B:8:0x0057, B:12:0x0065, B:13:0x006f, B:15:0x0075, B:16:0x008d, B:18:0x0093, B:19:0x00a6, B:20:0x00b5, B:37:0x00db, B:38:0x00df, B:40:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00ff, B:47:0x0103, B:49:0x0109, B:50:0x0113, B:51:0x0117, B:53:0x011d, B:55:0x0129, B:56:0x012d, B:58:0x0133, B:59:0x013d, B:61:0x0143, B:62:0x014d, B:63:0x0152), top: B:67:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0109 A[Catch: all -> 0x00d2, LOOP:4: B:47:0x0103->B:49:0x0109, LOOP_END, TryCatch #1 {all -> 0x00d2, blocks: (B:7:0x0046, B:8:0x0057, B:12:0x0065, B:13:0x006f, B:15:0x0075, B:16:0x008d, B:18:0x0093, B:19:0x00a6, B:20:0x00b5, B:37:0x00db, B:38:0x00df, B:40:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00ff, B:47:0x0103, B:49:0x0109, B:50:0x0113, B:51:0x0117, B:53:0x011d, B:55:0x0129, B:56:0x012d, B:58:0x0133, B:59:0x013d, B:61:0x0143, B:62:0x014d, B:63:0x0152), top: B:67:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x011d A[Catch: all -> 0x00d2, LOOP:5: B:51:0x0117->B:53:0x011d, LOOP_END, TryCatch #1 {all -> 0x00d2, blocks: (B:7:0x0046, B:8:0x0057, B:12:0x0065, B:13:0x006f, B:15:0x0075, B:16:0x008d, B:18:0x0093, B:19:0x00a6, B:20:0x00b5, B:37:0x00db, B:38:0x00df, B:40:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00ff, B:47:0x0103, B:49:0x0109, B:50:0x0113, B:51:0x0117, B:53:0x011d, B:55:0x0129, B:56:0x012d, B:58:0x0133, B:59:0x013d, B:61:0x0143, B:62:0x014d, B:63:0x0152), top: B:67:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0129 A[Catch: all -> 0x00d2, TryCatch #1 {all -> 0x00d2, blocks: (B:7:0x0046, B:8:0x0057, B:12:0x0065, B:13:0x006f, B:15:0x0075, B:16:0x008d, B:18:0x0093, B:19:0x00a6, B:20:0x00b5, B:37:0x00db, B:38:0x00df, B:40:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00ff, B:47:0x0103, B:49:0x0109, B:50:0x0113, B:51:0x0117, B:53:0x011d, B:55:0x0129, B:56:0x012d, B:58:0x0133, B:59:0x013d, B:61:0x0143, B:62:0x014d, B:63:0x0152), top: B:67:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0133 A[Catch: all -> 0x00d2, TryCatch #1 {all -> 0x00d2, blocks: (B:7:0x0046, B:8:0x0057, B:12:0x0065, B:13:0x006f, B:15:0x0075, B:16:0x008d, B:18:0x0093, B:19:0x00a6, B:20:0x00b5, B:37:0x00db, B:38:0x00df, B:40:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00ff, B:47:0x0103, B:49:0x0109, B:50:0x0113, B:51:0x0117, B:53:0x011d, B:55:0x0129, B:56:0x012d, B:58:0x0133, B:59:0x013d, B:61:0x0143, B:62:0x014d, B:63:0x0152), top: B:67:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0143 A[Catch: all -> 0x00d2, LOOP:7: B:59:0x013d->B:61:0x0143, LOOP_END, TryCatch #1 {all -> 0x00d2, blocks: (B:7:0x0046, B:8:0x0057, B:12:0x0065, B:13:0x006f, B:15:0x0075, B:16:0x008d, B:18:0x0093, B:19:0x00a6, B:20:0x00b5, B:37:0x00db, B:38:0x00df, B:40:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00ff, B:47:0x0103, B:49:0x0109, B:50:0x0113, B:51:0x0117, B:53:0x011d, B:55:0x0129, B:56:0x012d, B:58:0x0133, B:59:0x013d, B:61:0x0143, B:62:0x014d, B:63:0x0152), top: B:67:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00f7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00df A[SYNTHETIC] */
    @Override // defpackage.lng
    public final List c(List list) {
        List list2;
        Iterator it;
        Iterator it2;
        Iterator it3;
        Set set;
        Iterator it4;
        this.c.e("FrameServerSession#submit(burst)");
        ArrayList<pht> arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        this.c.e("allocate");
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            lpd lpdVar = (lpd) it5.next();
            obr.aF(lpdVar instanceof lpd);
            arrayList.add(this.b.b(ope.F(lpdVar.c)));
        }
        try {
            try {
                this.c.g("await");
                list2 = (List) plk.R(arrayList).get();
                try {
                    obr.aQ(list2.size() == list.size());
                    this.c.g("build_results");
                    for (int i = 0; i < list.size(); i++) {
                        Set<lqh> set2 = (Set) list2.get(i);
                        oon oonVarN = oor.n(set2.size());
                        for (lqh lqhVar : set2) {
                            lmr lmrVarK = lrm.k(lqhVar);
                            lmrVarK.getClass();
                            oonVarN.e(lqhVar.c, lmrVarK);
                        }
                        arrayList2.add(new lqa(oonVarN.c()));
                    }
                    this.c.g("submit");
                    this.a.h(list, list2);
                    this.c.f();
                    this.c.f();
                    return arrayList2;
                } catch (InterruptedException e) {
                    e = e;
                    for (pht phtVar : arrayList) {
                        if (phtVar.cancel(true) || phtVar.isDone()) {
                            set = (Set) mip.bY(phtVar);
                            if (set != null) {
                                it4 = set.iterator();
                                while (it4.hasNext()) {
                                    ((lqh) it4.next()).g();
                                }
                            }
                        }
                    }
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((lqa) it.next()).close();
                    }
                    if (list2 != null) {
                        it2 = list2.iterator();
                        while (it2.hasNext()) {
                            it3 = ((Set) it2.next()).iterator();
                            while (it3.hasNext()) {
                                ((lqh) it3.next()).g();
                            }
                        }
                    }
                    throw new llv(e);
                } catch (ExecutionException e2) {
                    e = e2;
                    while (r0.hasNext()) {
                        if (phtVar.cancel(true)) {
                        }
                        set = (Set) mip.bY(phtVar);
                        if (set != null) {
                            it4 = set.iterator();
                            while (it4.hasNext()) {
                                ((lqh) it4.next()).g();
                            }
                        }
                    }
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((lqa) it.next()).close();
                    }
                    if (list2 != null) {
                        it2 = list2.iterator();
                        while (it2.hasNext()) {
                            it3 = ((Set) it2.next()).iterator();
                            while (it3.hasNext()) {
                                ((lqh) it3.next()).g();
                            }
                        }
                    }
                    throw new llv(e);
                } catch (llv e3) {
                    e = e3;
                    while (r0.hasNext()) {
                        if (phtVar.cancel(true)) {
                        }
                        set = (Set) mip.bY(phtVar);
                        if (set != null) {
                            it4 = set.iterator();
                            while (it4.hasNext()) {
                                ((lqh) it4.next()).g();
                            }
                        }
                    }
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((lqa) it.next()).close();
                    }
                    if (list2 != null) {
                        it2 = list2.iterator();
                        while (it2.hasNext()) {
                            it3 = ((Set) it2.next()).iterator();
                            while (it3.hasNext()) {
                                ((lqh) it3.next()).g();
                            }
                        }
                    }
                    throw new llv(e);
                }
            } catch (Throwable th) {
                this.c.f();
                this.c.f();
                throw th;
            }
        } catch (InterruptedException | ExecutionException | llv e4) {
            e = e4;
            list2 = null;
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.lng
    public final lqa d(lpd lpdVar) {
        lqa lqaVar;
        Set set;
        this.c.e("FrameServerSession#submit(single)");
        this.c.e("allocate");
        obr.aF(true);
        pht phtVarB = this.b.b(lpdVar.c);
        Set set2 = null;
        try {
            try {
                this.c.g("await");
                Set<lqh> set3 = (Set) phtVarB.get();
                try {
                    oon oonVarN = oor.n(set3.size());
                    this.c.g("build_results");
                    for (lqh lqhVar : set3) {
                        lmr lmrVarK = lrm.k(lqhVar);
                        lmrVarK.getClass();
                        oonVarN.e(lqhVar.c, lmrVarK);
                    }
                    lqaVar = new lqa(oonVarN.c());
                    try {
                        this.c.g("submit");
                        this.a.j(lpdVar, set3);
                        this.c.f();
                        this.c.f();
                        return lqaVar;
                    } catch (InterruptedException | ExecutionException | llv e) {
                        e = e;
                        set2 = set3;
                        if ((!phtVarB.cancel(true) || phtVarB.isDone()) && (set = (Set) mip.bY(phtVarB)) != null) {
                            Iterator it = set.iterator();
                            while (it.hasNext()) {
                                ((lqh) it.next()).g();
                            }
                        }
                        if (lqaVar != null) {
                            lqaVar.close();
                        }
                        if (set2 != null) {
                            Iterator it2 = set2.iterator();
                            while (it2.hasNext()) {
                                ((lqh) it2.next()).g();
                            }
                        }
                        throw new llv(e);
                    }
                } catch (InterruptedException | ExecutionException | llv e2) {
                    e = e2;
                    lqaVar = null;
                    set2 = set3;
                }
            } catch (Throwable th) {
                this.c.f();
                this.c.f();
                throw th;
            }
        } catch (InterruptedException | ExecutionException | llv e3) {
            e = e3;
            lqaVar = null;
        }
    }

    @Override // defpackage.lng
    public final void e(lpd lpdVar) {
        this.a.i(lpdVar);
    }

    @Override // defpackage.lng
    public final pht f(lmq lmqVar) {
        return this.a.k(lmqVar);
    }

    @Override // defpackage.lng
    public final void g(lmq lmqVar) {
        this.a.m(lmqVar);
    }

    @Override // defpackage.lng
    public final lpc h() {
        return this.a.b();
    }

    @Override // defpackage.lng
    public final lpc i() {
        return this.a.b();
    }
}
