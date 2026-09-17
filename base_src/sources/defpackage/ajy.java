package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class ajy implements Closeable {
    private static final String[] b = new String[0];
    public final SQLiteDatabase a;

    public ajy(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    public final Cursor a(ajw ajwVar) {
        return this.a.rawQueryWithFactory(new ajx(ajwVar), ajwVar.b(), b, null);
    }

    public final Cursor b(String str) {
        return a(new ajp(str));
    }

    public final String c() {
        return this.a.getPath();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final void d() {
        this.a.beginTransaction();
    }

    public final void e() {
        this.a.beginTransactionNonExclusive();
    }

    public final void f() {
        this.a.endTransaction();
    }

    public final void g(String str) {
        this.a.execSQL(str);
    }

    public final void h() {
        this.a.setTransactionSuccessful();
    }

    public final boolean i() {
        return this.a.inTransaction();
    }

    public final boolean j() {
        return this.a.isOpen();
    }

    public final boolean k() {
        return this.a.isWriteAheadLoggingEnabled();
    }

    public final ake l(String str) {
        return new ake(this.a.compileStatement(str));
    }

    public final void m(Object[] objArr) {
        this.a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }
}
