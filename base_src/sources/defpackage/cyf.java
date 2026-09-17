package defpackage;

import android.database.sqlite.SQLiteException;

/* JADX INFO: loaded from: classes.dex */
final class cyf implements Runnable {
    private final lis a;
    private final Boolean b = false;
    private final Runnable c;

    public cyf(lis lisVar, Runnable runnable) {
        this.a = lisVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.c.run();
        } catch (SQLiteException e) {
            this.a.e(mip.bp("SQLite error while recording fatal error", new Object[0]), e);
            if (this.b.booleanValue()) {
                throw new okf(e);
            }
        }
    }
}
