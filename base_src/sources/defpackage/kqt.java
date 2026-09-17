package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class kqt implements kqg {
    public final AtomicReference b;
    private final String d;
    private final kra e;
    private final ExecutorService f;
    private final plr g;
    public final Deque a = new ArrayDeque();
    public final AtomicInteger c = new AtomicInteger();

    public kqt(kra kraVar, String str, plr plrVar, plq plqVar, ExecutorService executorService) {
        this.f = executorService;
        this.e = kraVar;
        this.d = str;
        this.g = plrVar;
        this.b = new AtomicReference(plqVar);
    }

    @Override // defpackage.kqg
    public final void a(krd krdVar) {
        pht phtVarH;
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                final kra kraVar = this.e;
                final String str = this.d;
                final plr plrVar = this.g;
                final plq plqVar = (plq) this.b.get();
                int i = this.g.g;
                final int iMin = i > 0 ? Math.min(100, i - this.c.get()) : 100;
                phtVarH = pgb.h(plk.aa(new pgj() { // from class: kqy
                    @Override // defpackage.pgj
                    public final pht a() {
                        long jLongValue;
                        long millis;
                        long millis2;
                        String str2;
                        kra kraVar2 = kraVar;
                        String str3 = str;
                        plr plrVar2 = plrVar;
                        plq plqVar2 = plqVar;
                        int i2 = iMin;
                        SQLiteDatabase readableDatabase = kraVar2.a.getReadableDatabase();
                        try {
                            String strValueOf = String.valueOf(str3);
                            if (strValueOf.length() != 0) {
                                "Querying collection ".concat(strValueOf);
                            } else {
                                new String("Querying collection ");
                            }
                            ArrayList arrayList = new ArrayList();
                            StringBuilder sb = new StringBuilder();
                            sb.append("collection_name = ?");
                            arrayList.add(str3);
                            int iD = plk.D(plrVar2.d);
                            if (iD == 0) {
                                iD = 1;
                            }
                            String str4 = iD != 2 ? "id" : "selection_key";
                            int iD2 = plk.D(plrVar2.d);
                            if (iD2 != 0 && iD2 == 2) {
                                jLongValue = plqVar2.a == 2 ? ((Long) plqVar2.b).longValue() : 0L;
                            } else {
                                jLongValue = plqVar2.a == 1 ? ((Long) plqVar2.b).longValue() : 0L;
                            }
                            sb.append(" AND ");
                            sb.append(str4);
                            int iD3 = plk.D(plrVar2.d);
                            if (iD3 != 0 && iD3 == 4 && jLongValue > 0) {
                                sb.append(" < ?");
                            } else {
                                sb.append(" > ?");
                            }
                            arrayList.add(Long.toString(jLongValue));
                            if (plrVar2.a > 0) {
                                sb.append(" AND ((selection_key % ?) BETWEEN CAST(? as INTEGER) AND CAST(? as INTEGER))");
                                arrayList.add(String.valueOf(plrVar2.a));
                                arrayList.add(String.valueOf(plrVar2.b));
                                arrayList.add(String.valueOf(plrVar2.c));
                            }
                            prl prlVar = plrVar2.e;
                            if (prlVar == null) {
                                prlVar = prl.c;
                            }
                            String str5 = "id";
                            long j = prlVar.a;
                            prl prlVar2 = plrVar2.f;
                            if (prlVar2 == null) {
                                prlVar2 = prl.c;
                            }
                            long j2 = prlVar2.a;
                            if (j == 0) {
                                millis = 0;
                            } else {
                                long millis3 = TimeUnit.SECONDS.toMillis(j);
                                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                                prl prlVar3 = plrVar2.e;
                                if (prlVar3 == null) {
                                    prlVar3 = prl.c;
                                }
                                millis = millis3 + timeUnit.toMillis(prlVar3.b);
                            }
                            if (j2 == 0) {
                                millis2 = Long.MAX_VALUE;
                            } else {
                                long millis4 = TimeUnit.SECONDS.toMillis(j2);
                                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                                prl prlVar4 = plrVar2.f;
                                if (prlVar4 == null) {
                                    prlVar4 = prl.c;
                                }
                                millis2 = millis4 + timeUnit2.toMillis(prlVar4.b);
                            }
                            sb.append(" AND (time BETWEEN CAST(? as INTEGER) AND CAST(? as INTEGER))");
                            arrayList.add(String.valueOf(millis));
                            arrayList.add(String.valueOf(millis2));
                            sb.append(" ORDER BY ");
                            sb.append(str4);
                            sb.append(" ");
                            int iD4 = plk.D(plrVar2.d);
                            if (iD4 == 0) {
                                iD4 = 1;
                            }
                            sb.append(iD4 != 4 ? "ASC" : "DESC");
                            sb.append(" LIMIT ?");
                            arrayList.add(String.valueOf(i2));
                            String str6 = String.format("%s WHERE %s", "SELECT id, time, selection_key, value FROM collections", sb);
                            String strValueOf2 = String.valueOf(str6);
                            if (strValueOf2.length() != 0) {
                                "query: ".concat(strValueOf2);
                            } else {
                                new String("query: ");
                            }
                            String strValueOf3 = String.valueOf(Arrays.toString(mip.cg(arrayList)));
                            if (strValueOf3.length() != 0) {
                                "queryParams: ".concat(strValueOf3);
                            } else {
                                new String("queryParams: ");
                            }
                            Cursor cursorRawQuery = readableDatabase.rawQuery(str6, mip.cg(arrayList));
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                while (cursorRawQuery.moveToNext()) {
                                    poy poyVarM = plq.c.m();
                                    int iD5 = plk.D(plrVar2.d);
                                    if (iD5 != 0 && iD5 == 2) {
                                        long j3 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("selection_key"));
                                        if (poyVarM.c) {
                                            poyVarM.m();
                                            poyVarM.c = false;
                                        }
                                        plq plqVar3 = (plq) poyVarM.b;
                                        plqVar3.a = 2;
                                        plqVar3.b = Long.valueOf(j3);
                                        str2 = str5;
                                    } else {
                                        str2 = str5;
                                        long j4 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex(str2));
                                        if (poyVarM.c) {
                                            poyVarM.m();
                                            poyVarM.c = false;
                                        }
                                        plq plqVar4 = (plq) poyVarM.b;
                                        plqVar4.a = 1;
                                        plqVar4.b = Long.valueOf(j4);
                                    }
                                    arrayList2.add(ojd.a((plq) poyVarM.j(), cursorRawQuery.getBlob(cursorRawQuery.getColumnIndex("value"))));
                                    str5 = str2;
                                }
                                arrayList2.size();
                                pht phtVarV = plk.V(arrayList2);
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
                }, kraVar.d), new oiu() { // from class: kqr
                    @Override // defpackage.oiu
                    public final Object a(Object obj) {
                        kqt kqtVar = this.a;
                        List list = (List) obj;
                        if (list == null || list.isEmpty()) {
                            return null;
                        }
                        kqtVar.b.set((plq) ((ojd) list.get(list.size() - 1)).a);
                        kqtVar.c.addAndGet(list.size());
                        synchronized (kqtVar.a) {
                            kqtVar.a.addAll(list);
                        }
                        return null;
                    }
                }, this.f);
            } else {
                phtVarH = plk.V(null);
            }
        }
        plk.af(phtVarH, new kqs(this, krdVar), this.f);
    }

    @Override // defpackage.kqg
    public final void b() {
    }

    @Override // defpackage.kqg, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
