package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class diy implements diu {
    public final aii a;
    private final aia b;

    public diy(aii aiiVar) {
        this.a = aiiVar;
        this.b = new div(aiiVar);
        new diw(aiiVar);
        new dix(aiiVar);
    }

    @Override // defpackage.diu
    public final List a(long j) {
        ais aisVarA = ais.a("SELECT * FROM shot_log WHERE shot_id = ? ORDER BY sequence", 1);
        aisVarA.e(1, j);
        this.a.g();
        Cursor cursorI = fy.i(this.a, aisVarA, false);
        try {
            int iL = fy.l(cursorI, "sequence");
            int iL2 = fy.l(cursorI, "shot_id");
            int iL3 = fy.l(cursorI, "time_millis");
            int iL4 = fy.l(cursorI, "message");
            ArrayList arrayList = new ArrayList(cursorI.getCount());
            while (cursorI.moveToNext()) {
                diz dizVar = new diz();
                dizVar.a = cursorI.getInt(iL);
                dizVar.b = cursorI.getLong(iL2);
                dizVar.c = cursorI.getLong(iL3);
                if (cursorI.isNull(iL4)) {
                    dizVar.d = null;
                } else {
                    dizVar.d = cursorI.getString(iL4);
                }
                arrayList.add(dizVar);
            }
            return arrayList;
        } finally {
            cursorI.close();
            aisVarA.j();
        }
    }

    @Override // defpackage.diu
    public final void b(diz dizVar) {
        this.a.g();
        this.a.h();
        try {
            this.b.a(dizVar);
            this.a.j();
        } finally {
            this.a.i();
        }
    }
}
