package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class mvi implements mve {
    private static final ouj a = ouj.h("com/google/android/libraries/performance/primes/federatedlearning/FederatedLearningExampleStoreImpl");
    private final Context b;
    private final Executor c;

    public mvi(Context context, Executor executor) {
        this.b = context;
        this.c = executor;
    }

    static /* synthetic */ qyp h(poc pocVar, poc pocVar2) {
        poy poyVarM = qyp.b.m();
        poy poyVarM2 = qys.b.m();
        poy poyVarM3 = qyq.c.m();
        poy poyVarM4 = qyo.b.m();
        poyVarM4.ao(pocVar2);
        qyo qyoVar = (qyo) poyVarM4.j();
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        qyq qyqVar = (qyq) poyVarM3.b;
        qyoVar.getClass();
        qyqVar.b = qyoVar;
        qyqVar.a = 1;
        poyVarM2.ap("token", (qyq) poyVarM3.j());
        poy poyVarM5 = qyq.c.m();
        poy poyVarM6 = qyo.b.m();
        poyVarM6.ao(pocVar);
        qyo qyoVar2 = (qyo) poyVarM6.j();
        if (poyVarM5.c) {
            poyVarM5.m();
            poyVarM5.c = false;
        }
        qyq qyqVar2 = (qyq) poyVarM5.b;
        qyoVar2.getClass();
        qyqVar2.b = qyoVar2;
        qyqVar2.a = 1;
        poyVarM2.ap("application_package", (qyq) poyVarM5.j());
        qys qysVar = (qys) poyVarM2.j();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        qyp qypVar = (qyp) poyVarM.b;
        qysVar.getClass();
        qypVar.a = qysVar;
        return (qyp) poyVarM.j();
    }

    private final void i(final String str, final kuu kuuVar) {
        final int iIntValue = piv.a(str).intValue();
        plk.Z(new Callable() { // from class: mvh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.f(str, str, iIntValue, kuuVar);
            }
        }, this.c);
    }

    @Override // defpackage.mve
    public void a(final String str, List list) {
        final poc pocVarV = poc.v(this.b.getPackageName());
        kqw kqwVarA = mvk.a(this.b);
        final List listAm = obr.am(obr.am(list, new oiu() { // from class: mvg
            @Override // defpackage.oiu
            public final Object a(Object obj) {
                return mvi.h(pocVarV, (poc) obj);
            }
        }), imd.f);
        kqw.a(str);
        if (!kqp.b(kqwVarA.a, kqwVarA.d)) {
            throw new kqv();
        }
        plk.af(kqwVarA.b.a(new oiu() { // from class: kqu
            @Override // defpackage.oiu
            public final Object a(Object obj) {
                String str2 = str;
                kqz kqzVar = (kqz) obj;
                for (poc pocVar : listAm) {
                    ContentValues contentValues = new ContentValues();
                    mdf mdfVar = kqzVar.b;
                    contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
                    contentValues.put("collection_name", str2);
                    contentValues.put("selection_key", Integer.valueOf(kqzVar.c.nextInt(2147483646) + 1));
                    contentValues.put("value", pocVar.B());
                    kqzVar.a.insertWithOnConflict("collections", null, contentValues, 5);
                    String strValueOf = String.valueOf(str2);
                    if (strValueOf.length() != 0) {
                        "Added example to collection ".concat(strValueOf);
                    } else {
                        new String("Added example to collection ");
                    }
                    int i = kra.e;
                }
                long jQueryNumEntries = DatabaseUtils.queryNumEntries(kqzVar.a, "collections") - 10000;
                if (jQueryNumEntries > 0) {
                    SQLiteDatabase sQLiteDatabase = kqzVar.a;
                    StringBuilder sb = new StringBuilder(77);
                    sb.append("id IN (SELECT id FROM collections ORDER BY id ASC LIMIT ");
                    sb.append(jQueryNumEntries);
                    sb.append(")");
                    sQLiteDatabase.delete("collections", sb.toString(), new String[0]);
                    int i2 = kra.e;
                }
                return null;
            }
        }), new cdd(3), this.c);
    }

    @Override // defpackage.mve
    public void b(String str) {
        i(str, mvf.a);
    }

    @Override // defpackage.mve
    public void c(String str) {
        i(str, mvf.c);
    }

    public /* synthetic */ kvk f(String str, String str2, int i, kuu kuuVar) {
        Context context = this.b;
        Executor executor = this.c;
        kqj kqjVarA = kqk.a();
        kqjVarA.b(str);
        kqjVarA.d(str2);
        kqjVarA.c(i);
        return ksc.c(context, executor, kqjVarA.a()).a(this.c, kuuVar);
    }
}
