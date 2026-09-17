package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ars implements Runnable {
    final /* synthetic */ aof a;
    final /* synthetic */ String b;
    public final asl c = asl.h();

    public ars() {
    }

    public ars(aof aofVar, String str) {
        this.a = aofVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            aqu aquVarS = this.a.d.s();
            String str = this.b;
            ais aisVarA = ais.a("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
            aisVarA.g(1, str);
            ((are) aquVarS).a.g();
            ((are) aquVarS).a.h();
            try {
                Cursor cursorI = fy.i(((are) aquVarS).a, aisVarA, true);
                try {
                    int iL = fy.l(cursorI, "id");
                    int iL2 = fy.l(cursorI, "state");
                    int iL3 = fy.l(cursorI, "output");
                    int iL4 = fy.l(cursorI, "run_attempt_count");
                    wy wyVar = new wy();
                    wy wyVar2 = new wy();
                    while (cursorI.moveToNext()) {
                        if (!cursorI.isNull(iL)) {
                            String string = cursorI.getString(iL);
                            if (((ArrayList) wyVar.get(string)) == null) {
                                wyVar.put(string, new ArrayList());
                            }
                        }
                        if (!cursorI.isNull(iL)) {
                            String string2 = cursorI.getString(iL);
                            if (((ArrayList) wyVar2.get(string2)) == null) {
                                wyVar2.put(string2, new ArrayList());
                            }
                        }
                    }
                    cursorI.moveToPosition(-1);
                    ((are) aquVarS).m(wyVar);
                    ((are) aquVarS).l(wyVar2);
                    ArrayList<aqs> arrayList = new ArrayList(cursorI.getCount());
                    while (cursorI.moveToNext()) {
                        ArrayList arrayList2 = !cursorI.isNull(iL) ? (ArrayList) wyVar.get(cursorI.getString(iL)) : null;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = cursorI.isNull(iL) ? null : (ArrayList) wyVar2.get(cursorI.getString(iL));
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        aqs aqsVar = new aqs();
                        aqsVar.a = cursorI.getString(iL);
                        aqsVar.f = gh.n(cursorI.getInt(iL2));
                        aqsVar.b = amq.a(cursorI.getBlob(iL3));
                        aqsVar.c = cursorI.getInt(iL4);
                        aqsVar.d = arrayList2;
                        aqsVar.e = arrayList3;
                        arrayList.add(aqsVar);
                    }
                    ((are) aquVarS).a.j();
                    cursorI.close();
                    aisVarA.j();
                    ((are) aquVarS).a.i();
                    int i = aqt.s;
                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                    for (aqs aqsVar2 : arrayList) {
                        List list = aqsVar2.e;
                        arrayList4.add(new anc(UUID.fromString(aqsVar2.a), aqsVar2.f, aqsVar2.b, aqsVar2.d, (list == null || list.isEmpty()) ? amq.a : (amq) aqsVar2.e.get(0), aqsVar2.c));
                    }
                    this.c.e(arrayList4);
                } catch (Throwable th) {
                    cursorI.close();
                    aisVarA.j();
                    throw th;
                }
            } catch (Throwable th2) {
                ((are) aquVarS).a.i();
                throw th2;
            }
        } catch (Throwable th3) {
            this.c.f(th3);
        }
    }
}
