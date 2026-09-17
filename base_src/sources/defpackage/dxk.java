package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
final class dxk implements oiu {
    final /* synthetic */ ContentValues a;

    public dxk(ContentValues contentValues) {
        this.a = contentValues;
    }

    @Override // defpackage.oiu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        sQLiteDatabase.getClass();
        sQLiteDatabase.replace("type_uri", null, this.a);
        return null;
    }
}
