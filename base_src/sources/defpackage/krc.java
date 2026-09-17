package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
final class krc extends SQLiteOpenHelper {
    private final Context a;
    private final String b;
    private final oom c;
    private final int d;
    private boolean e;

    /* JADX WARN: Illegal instructions before constructor call */
    public krc(Context context, oom oomVar) {
        orr orrVar = (orr) oomVar;
        super(context, "primes_example_store", (SQLiteDatabase.CursorFactory) null, orrVar.c);
        this.a = context;
        this.b = "primes_example_store";
        this.c = oomVar;
        this.d = orrVar.c;
    }

    private static SQLiteException a(SQLiteException sQLiteException) {
        return sQLiteException instanceof SQLiteCantOpenDatabaseException ? new krb(sQLiteException) : sQLiteException;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = super.getWritableDatabase();
        } catch (SQLiteException e) {
            Log.e("brella.SqliteOpenHelper", "Error opening database, deleting the database and trying again", e);
            if (!SQLiteDatabase.deleteDatabase(this.a.getDatabasePath(this.b))) {
                String str = this.b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 19);
                sb.append("Deletion of ");
                sb.append(str);
                sb.append(" failed");
                Log.e("brella.SqliteOpenHelper", sb.toString(), e);
                throw a(e);
            }
            try {
                writableDatabase = super.getWritableDatabase();
            } catch (SQLiteException e2) {
                Log.e("brella.SqliteOpenHelper", "failed to get the database after recreating", e2);
                throw a(e2);
            }
        }
        if (!this.e) {
            return writableDatabase;
        }
        String path = writableDatabase.getPath();
        writableDatabase.close();
        SQLiteDatabase.deleteDatabase(new File(path));
        this.e = false;
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e3) {
            Log.e("brella.SqliteOpenHelper", "Error getting database after downgrading", e3);
            throw a(e3);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        onUpgrade(sQLiteDatabase, 0, this.d);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.e = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        obr.aF(i >= 0);
        obr.aF(i < i2);
        obr.aF(i2 == this.d);
        sQLiteDatabase.beginTransaction();
        while (i < i2) {
            try {
                sQLiteDatabase.execSQL((String) this.c.get(i));
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
