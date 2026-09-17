package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
final class cco extends SQLiteOpenHelper {
    private static final ouj a = ouj.h("com/google/android/apps/camera/brella/examplestore/lib/VersionedSqliteOpenHelper");
    private final Context b;
    private final String c;
    private final oom d;
    private final int e;
    private boolean f;

    public cco(Context context, oom oomVar) {
        super(context, "example_store_ng", (SQLiteDatabase.CursorFactory) null, oomVar.size());
        this.b = context;
        this.c = "example_store_ng";
        this.d = oomVar;
        this.e = oomVar.size();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = super.getWritableDatabase();
        } catch (SQLiteException e) {
            ((oug) ((oug) ((oug) a.b()).h(e)).G((char) 255)).o("Error opening database, deleting the database and trying again");
            if (!SQLiteDatabase.deleteDatabase(this.b.getDatabasePath(this.c))) {
                ((oug) ((oug) ((oug) a.b()).h(e)).G(257)).r("Deletion of %s failed", this.c);
                throw e;
            }
            try {
                writableDatabase = super.getWritableDatabase();
            } catch (SQLiteException e2) {
                ((oug) ((oug) ((oug) a.b()).h(e2)).G((char) 256)).o("failed to get the database after recreating");
                throw e2;
            }
        }
        if (!this.f) {
            return writableDatabase;
        }
        String path = writableDatabase.getPath();
        writableDatabase.close();
        SQLiteDatabase.deleteDatabase(new File(path));
        this.f = false;
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e3) {
            ((oug) ((oug) ((oug) a.b()).h(e3)).G((char) 254)).o("Error getting database after downgrading");
            throw e3;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        onUpgrade(sQLiteDatabase, 0, this.e);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        obr.aF(i >= 0);
        obr.aF(i < i2);
        obr.aF(i2 == this.e);
        sQLiteDatabase.beginTransaction();
        while (i < i2) {
            try {
                sQLiteDatabase.execSQL((String) this.d.get(i));
                i++;
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
        }
        sQLiteDatabase.setTransactionSuccessful();
        sQLiteDatabase.endTransaction();
    }
}
