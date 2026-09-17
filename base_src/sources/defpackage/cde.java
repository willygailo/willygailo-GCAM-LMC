package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import j$.util.StringJoiner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class cde implements cdf {
    public static final ouj a = ouj.h("com/google/android/apps/camera/brella/examplestorecontroller/BrellaExampleStoreControllerImpl");
    public final ccn b;
    private final Executor c;
    private final ExecutorService d;

    public cde(Executor executor, ExecutorService executorService, ccn ccnVar) {
        this.c = executor;
        this.d = executorService;
        this.b = ccnVar;
    }

    @Override // defpackage.cdf
    public final cbv a(ccu ccuVar, ccs ccsVar) {
        return new cbv(this.b, ccuVar, ccsVar, this.d);
    }

    @Override // defpackage.cdf
    public final pht b(final String str, final long j) {
        return this.b.a(new oiu() { // from class: cdb
            @Override // defpackage.oiu
            public final Object a(Object obj) {
                String str2 = str;
                long j2 = j;
                ccm ccmVar = (ccm) obj;
                obr.aR(str2 != null, "sourceId should be a String.");
                ContentValues contentValues = new ContentValues();
                contentValues.put("session_id", Long.valueOf(j2));
                contentValues.put("time", Long.valueOf(ccmVar.b.a()));
                contentValues.put("selection_key", Integer.valueOf(ccmVar.c.nextInt(2147483646) + 1));
                contentValues.put("source_id", str2);
                long jInsertWithOnConflict = ccmVar.a.insertWithOnConflict("media_record", null, contentValues, 5);
                ccmVar.a("media_record", "media_id");
                return Long.valueOf(jInsertWithOnConflict);
            }
        });
    }

    @Override // defpackage.cdf
    public final pht c() {
        return this.b.a(bxe.g);
    }

    @Override // defpackage.cdf
    public final pht d(final long j, final String str, final Map map, final byte[] bArr) {
        return this.b.a(new oiu() { // from class: cdc
            @Override // defpackage.oiu
            public final Object a(Object obj) {
                String str2 = str;
                long j2 = j;
                Map map2 = map;
                byte[] bArr2 = bArr;
                ccm ccmVar = (ccm) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("media_id", Long.valueOf(j2));
                contentValues.put("time", Long.valueOf(ccmVar.b.a()));
                contentValues.put("value", bArr2);
                for (String str3 : ((oor) map2).keySet()) {
                    if (map2.get(str3) != null) {
                        contentValues.put(str3, (Integer) map2.get(str3));
                    }
                }
                ccmVar.a.insertWithOnConflict(str2, null, contentValues, 5);
                ccmVar.a(str2, "media_id");
                return null;
            }
        });
    }

    @Override // defpackage.cdf
    public final pht e(final ope opeVar) {
        return this.b.a(new oiu() { // from class: cda
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.oiu
            public final Object a(Object obj) {
                cde cdeVar = this.a;
                ope opeVar2 = opeVar;
                ccm ccmVar = (ccm) obj;
                otj it = cdeVar.b.h.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!opeVar2.isEmpty()) {
                        StringJoiner stringJoiner = new StringJoiner(",", "(", ")");
                        String[] strArr = new String[opeVar2.size()];
                        oti otiVarListIterator = opeVar2.listIterator();
                        int i = 0;
                        while (otiVarListIterator.hasNext()) {
                            Long l = (Long) otiVarListIterator.next();
                            stringJoiner.add("?");
                            strArr[i] = String.valueOf(l);
                            i++;
                        }
                        ccmVar.a.delete(str, String.format("%s IN %s", "media_id", stringJoiner), strArr);
                    }
                }
                return null;
            }
        });
    }

    @Override // defpackage.cdf
    public final pht f(final long j) {
        return this.b.a(new oiu() { // from class: ccz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.oiu
            public final Object a(Object obj) {
                cde cdeVar = this.a;
                long j2 = j;
                ccm ccmVar = (ccm) obj;
                otj it = cdeVar.b.h.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    long jA = ccmVar.b.a() - j2;
                    StringBuilder sb = new StringBuilder(48);
                    sb.append("time IS NOT NULL AND time < ");
                    sb.append(jA);
                    ccmVar.a.delete(str, sb.toString(), new String[0]);
                    SimpleDateFormat.getDateTimeInstance().format(new Date(jA));
                }
                return null;
            }
        });
    }

    @Override // defpackage.cdf
    public final pht g() {
        ccn ccnVar = this.b;
        return plk.aa(new ccg(ccnVar, 1), ccnVar.e);
    }

    @Override // defpackage.cdf
    public final pht h(final List list) {
        final ccn ccnVar = this.b;
        return plk.aa(new pgj() { // from class: cca
            @Override // defpackage.pgj
            public final pht a() {
                ccn ccnVar2 = ccnVar;
                List list2 = list;
                SQLiteDatabase readableDatabase = ccnVar2.b.getReadableDatabase();
                try {
                    String[] strArr = new String[list2.size()];
                    String[] strArr2 = {"media_id"};
                    StringJoiner stringJoiner = new StringJoiner(",", "(", ")");
                    for (int i = 0; i < list2.size(); i++) {
                        stringJoiner.add("?");
                        strArr[i] = (String) list2.get(i);
                    }
                    Cursor cursorQuery = readableDatabase.query(true, "media_record", strArr2, String.format("%s IN %s", "source_id", stringJoiner), strArr, null, null, null, null);
                    try {
                        cursorQuery.getCount();
                        opc opcVarD = ope.D();
                        while (cursorQuery.moveToNext()) {
                            opcVarD.d(Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndex("media_id"))));
                        }
                        pht phtVarV = plk.V(opcVarD.f());
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (readableDatabase != null) {
                            readableDatabase.close();
                        }
                        return phtVarV;
                    } catch (Throwable th) {
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
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
        }, ccnVar.e);
    }

    @Override // defpackage.cdf
    public final pht i(final long j, final byte[] bArr) {
        return this.b.a(new oiu() { // from class: ccx
            @Override // defpackage.oiu
            public final Object a(Object obj) {
                long j2 = j;
                byte[] bArr2 = bArr;
                ccm ccmVar = (ccm) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("time", Long.valueOf(ccmVar.b.a()));
                contentValues.put("value", bArr2);
                SQLiteDatabase sQLiteDatabase = ccmVar.a;
                StringBuilder sb = new StringBuilder(33);
                sb.append("session_id = ");
                sb.append(j2);
                sQLiteDatabase.updateWithOnConflict("session", contentValues, sb.toString(), new String[0], 5);
                ccmVar.a("session", "session_id");
                return null;
            }
        });
    }

    @Override // defpackage.cdf
    public final void j() {
        plk.af(this.b.a(new oiu() { // from class: ccy
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.oiu
            public final Object a(Object obj) {
                ccm ccmVar = (ccm) obj;
                otj it = this.a.b.h.iterator();
                while (it.hasNext()) {
                    ccmVar.a.delete((String) it.next(), null, new String[0]);
                }
                return null;
            }
        }), new cdd(0), this.c);
    }

    @Override // defpackage.cdf
    public final pht k() {
        ccn ccnVar = this.b;
        return plk.aa(new ccg(ccnVar, 0), ccnVar.e);
    }
}
