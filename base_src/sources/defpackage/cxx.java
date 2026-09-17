package defpackage;

import android.database.Cursor;

/* JADX INFO: loaded from: classes.dex */
public final class cxx extends cxt {
    public final aii a;
    public final aiy b;
    public final akf c = new akf();
    private final aia d;
    private final aia e;

    public cxx(aii aiiVar) {
        this.a = aiiVar;
        this.d = new cxu(aiiVar);
        this.e = new cxv(aiiVar);
        this.b = new cxw(aiiVar);
    }

    @Override // defpackage.cxt
    public final cxs a(cxy cxyVar) {
        cxs cxsVar;
        this.a.h();
        try {
            cxs cxsVar2 = new cxs(cxyVar);
            this.a.g();
            this.a.h();
            try {
                this.d.c(cxsVar2);
                this.a.j();
                this.a.i();
                ais aisVarA = ais.a("SELECT * FROM HardwareHelpDialogCounts WHERE reason = ?", 1);
                aisVarA.e(1, cxyVar.ordinal());
                this.a.g();
                Cursor cursorI = fy.i(this.a, aisVarA, false);
                try {
                    int iL = fy.l(cursorI, "reason");
                    int iL2 = fy.l(cursorI, "impressionsBeforeReboot");
                    int iL3 = fy.l(cursorI, "impressionsAfterReboot");
                    int iL4 = fy.l(cursorI, "rebootCount");
                    if (cursorI.moveToFirst()) {
                        cxsVar = new cxs(cxy.values()[cursorI.getInt(iL)]);
                        cxsVar.b = cursorI.getInt(iL2);
                        cxsVar.c = cursorI.getInt(iL3);
                        cxsVar.d = cursorI.getInt(iL4);
                    } else {
                        cxsVar = null;
                    }
                    cursorI.close();
                    aisVarA.j();
                    this.a.j();
                    this.a.i();
                    return cxsVar;
                } catch (Throwable th) {
                    cursorI.close();
                    aisVarA.j();
                    throw th;
                }
            } catch (Throwable th2) {
                this.a.i();
                throw th2;
            }
        } catch (Throwable th3) {
            this.a.i();
            throw th3;
        }
    }

    @Override // defpackage.cxt
    public final void b(cxs cxsVar) {
        this.a.g();
        this.a.h();
        try {
            this.e.a(cxsVar);
            this.a.j();
        } finally {
            this.a.i();
        }
    }
}
