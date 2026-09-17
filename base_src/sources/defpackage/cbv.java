package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class cbv implements kqg {
    public static final ouj a = ouj.h("com/google/android/apps/camera/brella/examplestore/lib/CamExampleIterator");
    public final AtomicReference c;
    private final ccn e;
    private final ExecutorService f;
    private final ccu g;
    public final Deque b = new ArrayDeque();
    public final AtomicInteger d = new AtomicInteger();

    public cbv(ccn ccnVar, ccu ccuVar, ccs ccsVar, ExecutorService executorService) {
        this.f = executorService;
        this.e = ccnVar;
        this.g = ccuVar;
        this.c = new AtomicReference(ccsVar);
    }

    @Override // defpackage.kqg
    public final void a(krd krdVar) {
        pht phtVarH;
        synchronized (this.b) {
            if (this.b.isEmpty()) {
                final ccn ccnVar = this.e;
                final ccu ccuVar = this.g;
                final ccs ccsVar = (ccs) this.c.get();
                int i = this.g.g;
                final int iMin = i > 0 ? Math.min(100, i - this.d.get()) : 100;
                boolean z = true;
                if (ccuVar.i && ccuVar.h.size() > 0) {
                    z = false;
                }
                obr.aG(z, "Cannot get both session and media records.Please select only one.");
                phtVarH = pgb.h(ccuVar.i ? plk.aa(new pgj() { // from class: cce
                    @Override // defpackage.pgj
                    public final pht a() {
                        ccn ccnVar2 = ccnVar;
                        ccu ccuVar2 = ccuVar;
                        ccs ccsVar2 = ccsVar;
                        int i2 = iMin;
                        SQLiteDatabase readableDatabase = ccnVar2.b.getReadableDatabase();
                        try {
                            final ccl cclVar = new ccl(ccuVar2, ccsVar2, i2);
                            final int i3 = 1;
                            oxh.g(new ouk() { // from class: ccc
                                @Override // defpackage.ouk
                                public final Object a() {
                                    switch (i3) {
                                        case 0:
                                            return Arrays.toString(cclVar.a());
                                        default:
                                            return cclVar.a;
                                    }
                                }
                            });
                            final int i4 = 0;
                            oxh.g(new ouk() { // from class: ccc
                                @Override // defpackage.ouk
                                public final Object a() {
                                    switch (i4) {
                                        case 0:
                                            return Arrays.toString(cclVar.a());
                                        default:
                                            return cclVar.a;
                                    }
                                }
                            });
                            Cursor cursorRawQuery = readableDatabase.rawQuery(cclVar.a, cclVar.a());
                            try {
                                ArrayList arrayList = new ArrayList();
                                while (cursorRawQuery.moveToNext()) {
                                    poy poyVarM = ccs.c.m();
                                    long j = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("session_id"));
                                    if (poyVarM.c) {
                                        poyVarM.m();
                                        poyVarM.c = false;
                                    }
                                    ccs ccsVar3 = (ccs) poyVarM.b;
                                    ccsVar3.a = 1;
                                    ccsVar3.b = Long.valueOf(j);
                                    arrayList.add(ojd.a((ccs) poyVarM.j(), cursorRawQuery.getBlob(cursorRawQuery.getColumnIndex("value"))));
                                }
                                arrayList.size();
                                pht phtVarV = plk.V(arrayList);
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                if (readableDatabase != null) {
                                    readableDatabase.close();
                                }
                                return phtVarV;
                            } catch (Throwable th) {
                                if (cursorRawQuery != null) {
                                    try {
                                        cursorRawQuery.close();
                                    } catch (Throwable th2) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            if (readableDatabase != null) {
                                try {
                                    readableDatabase.close();
                                } catch (Throwable th4) {
                                }
                            }
                            throw th3;
                        }
                    }
                }, ccnVar.e) : plk.aa(new pgj() { // from class: ccd
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
                    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable] */
                    @Override // defpackage.pgj
                    public final pht a() {
                        ccn ccnVar2 = ccnVar;
                        ccu ccuVar2 = ccuVar;
                        ccs ccsVar2 = ccsVar;
                        int i2 = iMin;
                        SQLiteDatabase readableDatabase = ccnVar2.b.getReadableDatabase();
                        try {
                            final cci cciVar = new cci(ccuVar2, ccsVar2, i2, ccnVar2.d);
                            final int i3 = 1;
                            oxh.g(new ouk() { // from class: ccb
                                @Override // defpackage.ouk
                                public final Object a() {
                                    switch (i3) {
                                        case 0:
                                            return Arrays.toString(cciVar.b());
                                        default:
                                            return cciVar.b;
                                    }
                                }
                            });
                            boolean z2 = false;
                            final Object[] objArr = 0 == true ? 1 : 0;
                            oxh.g(new ouk() { // from class: ccb
                                @Override // defpackage.ouk
                                public final Object a() {
                                    switch (objArr) {
                                        case 0:
                                            return Arrays.toString(cciVar.b());
                                        default:
                                            return cciVar.b;
                                    }
                                }
                            });
                            Cursor cursorRawQuery = readableDatabase.rawQuery(cciVar.b, cciVar.b());
                            try {
                                ArrayList arrayList = new ArrayList();
                                while (cursorRawQuery.moveToNext()) {
                                    poy poyVarM = ccs.c.m();
                                    int iD = aau.d(ccuVar2.d);
                                    if (iD != 0 && iD == 2) {
                                        long j = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("selection_key"));
                                        if (poyVarM.c) {
                                            poyVarM.m();
                                            poyVarM.c = z2;
                                        }
                                        ccs ccsVar3 = (ccs) poyVarM.b;
                                        ccsVar3.a = 2;
                                        ccsVar3.b = Long.valueOf(j);
                                    } else {
                                        long j2 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("media_id"));
                                        if (poyVarM.c) {
                                            poyVarM.m();
                                            poyVarM.c = z2;
                                        }
                                        ccs ccsVar4 = (ccs) poyVarM.b;
                                        ccsVar4.a = i3;
                                        ccsVar4.b = Long.valueOf(j2);
                                    }
                                    ccs ccsVar5 = (ccs) poyVarM.j();
                                    oor oorVarO = oor.o(cciVar.a);
                                    poy poyVarM2 = qys.b.m();
                                    oti otiVarListIterator = oorVarO.keySet().listIterator();
                                    while (otiVarListIterator.hasNext()) {
                                        String str = (String) otiVarListIterator.next();
                                        cbr cbrVar = (cbr) ccnVar2.f.get(str);
                                        if (cbrVar == null) {
                                            ((oug) ((oug) ccn.a.c()).G((char) 253)).r("No table with table name: %s", str);
                                        } else {
                                            byte[] blob = cursorRawQuery.getBlob(cursorRawQuery.getColumnIndex(String.format("%s_%s", oorVarO.get(str), "value")));
                                            if (blob != null) {
                                                ojc ojcVarA = cbrVar.a(blob);
                                                if (ojcVarA.g()) {
                                                    poyVarM2.o((qys) ojcVarA.c());
                                                }
                                            }
                                        }
                                    }
                                    poy poyVarM3 = qyp.b.m();
                                    if (poyVarM3.c) {
                                        poyVarM3.m();
                                        poyVarM3.c = false;
                                    }
                                    qyp qypVar = (qyp) poyVarM3.b;
                                    qys qysVar = (qys) poyVarM2.j();
                                    qysVar.getClass();
                                    qypVar.a = qysVar;
                                    poyVarM3.j();
                                    poy poyVarM4 = qyp.b.m();
                                    if (poyVarM4.c) {
                                        poyVarM4.m();
                                        z2 = false;
                                        poyVarM4.c = false;
                                    } else {
                                        z2 = false;
                                    }
                                    qyp qypVar2 = (qyp) poyVarM4.b;
                                    qys qysVar2 = (qys) poyVarM2.j();
                                    qysVar2.getClass();
                                    qypVar2.a = qysVar2;
                                    arrayList.add(ojd.a(ccsVar5, ((qyp) poyVarM4.j()).g()));
                                    i3 = 1;
                                }
                                arrayList.size();
                                pht phtVarV = plk.V(arrayList);
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                if (readableDatabase != null) {
                                    readableDatabase.close();
                                }
                                return phtVarV;
                            } catch (Throwable th) {
                                if (cursorRawQuery == null) {
                                    throw th;
                                }
                                try {
                                    cursorRawQuery.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            if (readableDatabase == null) {
                                throw th3;
                            }
                            try {
                                readableDatabase.close();
                                throw th3;
                            } catch (Throwable th4) {
                                throw th3;
                            }
                        }
                    }
                }, ccnVar.e), new oiu() { // from class: cbt
                    @Override // defpackage.oiu
                    public final Object a(Object obj) {
                        cbv cbvVar = this.a;
                        List list = (List) obj;
                        if (list == null || list.isEmpty()) {
                            return null;
                        }
                        cbvVar.c.set((ccs) ((ojd) ohh.t(list)).a);
                        cbvVar.d.addAndGet(list.size());
                        synchronized (cbvVar.b) {
                            cbvVar.b.addAll(list);
                        }
                        return null;
                    }
                }, this.f);
            } else {
                phtVarH = phq.a;
            }
        }
        plk.af(phtVarH, new cbu(this, krdVar), this.f);
    }

    @Override // defpackage.kqg
    public final void b() {
    }

    @Override // defpackage.kqg, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
