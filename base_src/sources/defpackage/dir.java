package defpackage;

import android.database.Cursor;

/* JADX INFO: loaded from: classes.dex */
public final class dir implements dil {
    public final aii a;
    public final aia b;
    public final aiy c;
    private final ahz d;
    private final aiy e;

    public dir(aii aiiVar) {
        this.a = aiiVar;
        this.b = new dim(aiiVar);
        new din(aiiVar);
        this.d = new dio(aiiVar);
        this.c = new dip(aiiVar);
        this.e = new diq(aiiVar);
    }

    @Override // defpackage.dil
    public final int a(long j, long j2) {
        this.a.g();
        ake akeVarE = this.e.e();
        akeVarE.e(1, j2);
        akeVarE.e(2, j);
        this.a.h();
        try {
            int iA = akeVarE.a();
            this.a.j();
            return iA;
        } finally {
            this.a.i();
            this.e.f(akeVarE);
        }
    }

    @Override // defpackage.dil
    public final dit b(long j) {
        dit ditVar;
        ais aisVarA = ais.a("SELECT * FROM shots WHERE shot_id = ?", 1);
        aisVarA.e(1, j);
        this.a.g();
        Cursor cursorI = fy.i(this.a, aisVarA, false);
        try {
            int iL = fy.l(cursorI, "shot_id");
            int iL2 = fy.l(cursorI, "title");
            int iL3 = fy.l(cursorI, "start_millis");
            int iL4 = fy.l(cursorI, "persisted_millis");
            int iL5 = fy.l(cursorI, "canceled_millis");
            int iL6 = fy.l(cursorI, "deleted_millis");
            int iL7 = fy.l(cursorI, "most_recent_event_millis");
            int iL8 = fy.l(cursorI, "capture_session_type");
            int iL9 = fy.l(cursorI, "capture_session_shot_id");
            int iL10 = fy.l(cursorI, "pid");
            int iL11 = fy.l(cursorI, "stuck");
            int iL12 = fy.l(cursorI, "failed");
            if (cursorI.moveToFirst()) {
                ditVar = new dit();
                ditVar.a = cursorI.getLong(iL);
                if (cursorI.isNull(iL2)) {
                    ditVar.b = null;
                } else {
                    ditVar.b = cursorI.getString(iL2);
                }
                ditVar.c = cursorI.getLong(iL3);
                ditVar.d = cursorI.getLong(iL4);
                ditVar.e = cursorI.getLong(iL5);
                ditVar.f = cursorI.getLong(iL6);
                ditVar.g = cursorI.getLong(iL7);
                if (cursorI.isNull(iL8)) {
                    ditVar.h = null;
                } else {
                    ditVar.h = cursorI.getString(iL8);
                }
                if (cursorI.isNull(iL9)) {
                    ditVar.i = null;
                } else {
                    ditVar.i = cursorI.getString(iL9);
                }
                ditVar.j = cursorI.getLong(iL10);
                ditVar.k = cursorI.getInt(iL11) != 0;
                ditVar.l = cursorI.getInt(iL12) != 0;
            } else {
                ditVar = null;
            }
            return ditVar;
        } finally {
            cursorI.close();
            aisVarA.j();
        }
    }

    @Override // defpackage.dil
    public final void c(dit ditVar) {
        this.a.g();
        this.a.h();
        try {
            this.d.a(ditVar);
            this.a.j();
        } finally {
            this.a.i();
        }
    }
}
