package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class arg {
    public final aii a;
    public final aia b;

    public arg(aii aiiVar) {
        this.a = aiiVar;
        this.b = new arf(aiiVar);
    }

    public arg(aii aiiVar, byte[] bArr) {
        this.a = aiiVar;
        this.b = new aql(aiiVar);
    }

    public arg(aii aiiVar, byte[] bArr, byte[] bArr2) {
        this.a = aiiVar;
        this.b = new aqe(aiiVar);
    }

    public arg(aii aiiVar, char[] cArr) {
        this.a = aiiVar;
        this.b = new aqg(aiiVar);
    }

    public final List a(String str) {
        ais aisVarA = ais.a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            aisVarA.f(1);
        } else {
            aisVarA.g(1, str);
        }
        this.a.g();
        Cursor cursorI = fy.i(this.a, aisVarA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorI.getCount());
            while (cursorI.moveToNext()) {
                arrayList.add(cursorI.getString(0));
            }
            cursorI.close();
            aisVarA.j();
            return arrayList;
        } catch (Throwable th) {
            cursorI.close();
            aisVarA.j();
            throw th;
        }
    }

    public final Long b(String str) {
        ais aisVarA = ais.a("SELECT long_value FROM Preference where `key`=?", 1);
        aisVarA.g(1, str);
        this.a.g();
        Cursor cursorI = fy.i(this.a, aisVarA, false);
        try {
            Long lValueOf = null;
            if (cursorI.moveToFirst() && !cursorI.isNull(0)) {
                lValueOf = Long.valueOf(cursorI.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorI.close();
            aisVarA.j();
        }
    }

    public final void c(aqf aqfVar) {
        this.a.g();
        this.a.h();
        try {
            this.b.a(aqfVar);
            this.a.j();
        } finally {
            this.a.i();
        }
    }

    public final List d(String str) {
        ais aisVarA = ais.a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            aisVarA.f(1);
        } else {
            aisVarA.g(1, str);
        }
        this.a.g();
        Cursor cursorI = fy.i(this.a, aisVarA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorI.getCount());
            while (cursorI.moveToNext()) {
                arrayList.add(cursorI.getString(0));
            }
            cursorI.close();
            aisVarA.j();
            return arrayList;
        } catch (Throwable th) {
            cursorI.close();
            aisVarA.j();
            throw th;
        }
    }
}
