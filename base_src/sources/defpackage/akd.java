package defpackage;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: loaded from: classes.dex */
class akd implements ajv {
    private final SQLiteProgram a;

    public akd(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    @Override // defpackage.ajv
    public final void c(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.ajv
    public final void d(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // defpackage.ajv
    public final void e(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // defpackage.ajv
    public final void f(int i) {
        this.a.bindNull(i);
    }

    @Override // defpackage.ajv
    public final void g(int i, String str) {
        this.a.bindString(i, str);
    }
}
