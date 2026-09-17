package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes.dex */
final class aka extends SQLiteOpenHelper {
    final ajy[] a;
    final ajq b;
    private boolean c;

    public aka(Context context, String str, ajy[] ajyVarArr, ajq ajqVar) {
        super(context, str, null, ajqVar.a, new ajz(ajyVarArr));
        this.b = ajqVar;
        this.a = ajyVarArr;
    }

    static ajy b(ajy[] ajyVarArr, SQLiteDatabase sQLiteDatabase) {
        ajy ajyVar = ajyVarArr[0];
        if (ajyVar != null && ajyVar.a == sQLiteDatabase) {
            return ajyVar;
        }
        ajy ajyVar2 = new ajy(sQLiteDatabase);
        ajyVarArr[0] = ajyVar2;
        return ajyVar2;
    }

    final ajy a(SQLiteDatabase sQLiteDatabase) {
        return b(this.a, sQLiteDatabase);
    }

    final synchronized ajy c() {
        this.c = false;
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        if (!this.c) {
            return a(writableDatabase);
        }
        close();
        return c();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.a[0] = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        ajq ajqVar = this.b;
        ajy ajyVarA = a(sQLiteDatabase);
        Cursor cursorB = ajyVarA.b("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cursorB.moveToFirst() && cursorB.getInt(0) == 0) {
                z = true;
            }
            cursorB.close();
            ajqVar.c.c(ajyVarA);
            if (!z) {
                air airVarB = ajqVar.c.b(ajyVarA);
                if (!airVarB.a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + airVarB.b);
                }
            }
            ajqVar.c(ajyVarA);
            ajqVar.c.a();
        } catch (Throwable th) {
            cursorB.close();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.c = true;
        this.b.b(a(sQLiteDatabase), i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.c) {
            return;
        }
        ajq ajqVar = this.b;
        ajy ajyVarA = a(sQLiteDatabase);
        Cursor cursorB = ajyVarA.b("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = cursorB.moveToFirst() && cursorB.getInt(0) != 0;
            cursorB.close();
            if (z) {
                Cursor cursorA = ajyVarA.a(new ajp("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    String string = cursorA.moveToFirst() ? cursorA.getString(0) : null;
                    cursorA.close();
                    if (!ajqVar.d.equals(string) && !ajqVar.e.equals(string)) {
                        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                    }
                } catch (Throwable th) {
                    cursorA.close();
                    throw th;
                }
            } else {
                air airVarB = ajqVar.c.b(ajyVarA);
                if (!airVarB.a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + airVarB.b);
                }
                ajqVar.c.f(ajyVarA);
                ajqVar.c(ajyVarA);
            }
            ajqVar.c.e(ajyVarA);
            ajqVar.b = null;
        } catch (Throwable th2) {
            cursorB.close();
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.c = true;
        this.b.b(a(sQLiteDatabase), i, i2);
    }
}
