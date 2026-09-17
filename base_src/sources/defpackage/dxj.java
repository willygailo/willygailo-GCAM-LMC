package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
final class dxj implements oiu {
    final /* synthetic */ long a;

    public dxj(long j) {
        this.a = j;
    }

    @Override // defpackage.oiu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        Object objB = oih.a;
        sQLiteDatabase.getClass();
        Cursor cursorQuery = sQLiteDatabase.query("type_uri", dxl.a, "media_store_id = ?", new String[]{String.valueOf(this.a)}, null, null, null);
        try {
            if (cursorQuery.moveToFirst()) {
                objB = dxh.b(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("special_type_id")));
            }
        } catch (IllegalArgumentException e) {
        } catch (NullPointerException e2) {
        } finally {
            cursorQuery.close();
        }
        return objB;
    }
}
