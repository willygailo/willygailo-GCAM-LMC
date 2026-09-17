package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class ari extends arj {
    final /* synthetic */ aof a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;

    public ari(aof aofVar, String str, boolean z) {
        this.a = aofVar;
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.arj
    public final void a() {
        WorkDatabase workDatabase = this.a.d;
        workDatabase.h();
        try {
            aqu aquVarS = workDatabase.s();
            String str = this.b;
            ais aisVarA = ais.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
            if (str == null) {
                aisVarA.f(1);
            } else {
                aisVarA.g(1, str);
            }
            ((are) aquVarS).a.g();
            Cursor cursorI = fy.i(((are) aquVarS).a, aisVarA, false);
            try {
                ArrayList arrayList = new ArrayList(cursorI.getCount());
                while (cursorI.moveToNext()) {
                    arrayList.add(cursorI.getString(0));
                }
                cursorI.close();
                aisVarA.j();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c(this.a, (String) it.next());
                }
                workDatabase.j();
                workDatabase.i();
                if (this.c) {
                    d(this.a);
                }
            } catch (Throwable th) {
                cursorI.close();
                aisVarA.j();
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase.i();
            throw th2;
        }
    }
}
