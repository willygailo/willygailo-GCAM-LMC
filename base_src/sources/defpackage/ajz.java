package defpackage;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ajz implements DatabaseErrorHandler {
    final /* synthetic */ ajy[] a;

    public ajz(ajy[] ajyVarArr) {
        this.a = ajyVarArr;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        String strC;
        ajy ajyVarB = aka.b(this.a, sQLiteDatabase);
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + ajyVarB.c());
        if (ajyVarB.j()) {
            List<Pair<String, String>> attachedDbs = null;
            try {
                try {
                    attachedDbs = ajyVarB.a.getAttachedDbs();
                } catch (SQLiteException e) {
                }
                try {
                    ajyVarB.close();
                } catch (IOException e2) {
                }
                if (attachedDbs != null) {
                    while (zHasNext) {
                        ajq.a((String) attachedDbs.iterator().next().second);
                    }
                    return;
                }
                strC = ajyVarB.c();
            } finally {
                if (attachedDbs != null) {
                    Iterator<Pair<String, String>> it = attachedDbs.iterator();
                    while (it.hasNext()) {
                        ajq.a((String) it.next().second);
                    }
                } else {
                    ajq.a(ajyVarB.c());
                }
            }
        } else {
            strC = ajyVarB.c();
        }
        ajq.a(strC);
    }
}
