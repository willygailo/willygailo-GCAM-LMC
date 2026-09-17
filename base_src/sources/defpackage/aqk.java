package defpackage;

import android.database.Cursor;

/* JADX INFO: loaded from: classes.dex */
public final class aqk {
    public final aii a;
    private final aia b;
    private final aiy c;

    public aqk(aii aiiVar) {
        this.a = aiiVar;
        this.b = new aqi(aiiVar);
        this.c = new aqj(aiiVar);
    }

    public final aqh a(String str) {
        ais aisVarA = ais.a("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            aisVarA.f(1);
        } else {
            aisVarA.g(1, str);
        }
        this.a.g();
        Cursor cursorI = fy.i(this.a, aisVarA, false);
        try {
            return cursorI.moveToFirst() ? new aqh(cursorI.getString(fy.l(cursorI, "work_spec_id")), cursorI.getInt(fy.l(cursorI, "system_id"))) : null;
        } finally {
            cursorI.close();
            aisVarA.j();
        }
    }

    public final void b(aqh aqhVar) {
        this.a.g();
        this.a.h();
        try {
            this.b.a(aqhVar);
            this.a.j();
        } finally {
            this.a.i();
        }
    }

    public final void c(String str) {
        this.a.g();
        ake akeVarE = this.c.e();
        if (str == null) {
            akeVarE.f(1);
        } else {
            akeVarE.g(1, str);
        }
        this.a.h();
        try {
            akeVarE.a();
            this.a.j();
        } finally {
            this.a.i();
            this.c.f(akeVarE);
        }
    }
}
