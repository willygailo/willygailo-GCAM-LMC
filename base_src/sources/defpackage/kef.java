package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class kef extends kdu implements Closeable {
    public static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id");
    public static final String c = String.format("SELECT MAX(%s) FROM %s WHERE 1;", "hit_time", "hits2");
    public final kfm d;
    public final kfm e;
    private final kee f;

    public kef(kdx kdxVar) {
        super(kdxVar);
        this.d = new kfm();
        this.e = new kfm();
        this.f = new kee(this, kdxVar.a);
    }

    final Map C(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                String strValueOf = String.valueOf(str);
                str = strValueOf.length() != 0 ? "?".concat(strValueOf) : new String("?");
            }
            return knz.a(new URI(str));
        } catch (URISyntaxException e) {
            o("Error parsing hit parameters", e);
            return new HashMap(0);
        }
    }

    public final void D(long j) {
        kdo.a();
        z();
        ArrayList arrayList = new ArrayList(1);
        Long lValueOf = Long.valueOf(j);
        arrayList.add(lValueOf);
        r("Deleting hit, id", lValueOf);
        E(arrayList);
    }

    public final void E(List list) {
        mip.dk(list);
        kdo.a();
        z();
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder("hit_id");
        sb.append(" in (");
        for (int i = 0; i < list.size(); i++) {
            Long l = (Long) list.get(i);
            if (l == null || l.longValue() == 0) {
                throw new SQLiteException("Invalid hit id");
            }
            if (i > 0) {
                sb.append(",");
            }
            sb.append(l);
        }
        sb.append(")");
        String string = sb.toString();
        try {
            SQLiteDatabase sQLiteDatabaseB = b();
            r("Deleting dispatched hits. count", Integer.valueOf(list.size()));
            int iDelete = sQLiteDatabaseB.delete("hits2", string, null);
            if (iDelete != list.size()) {
                super.w(5, "Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(iDelete), string);
            }
        } catch (SQLiteException e) {
            o("Error deleting hits", e);
            throw e;
        }
    }

    public final void F() {
        z();
        b().endTransaction();
    }

    public final void G() {
        z();
        b().setTransactionSuccessful();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    final boolean H() throws Throwable {
        kdo.a();
        z();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = b().rawQuery("SELECT COUNT(*) FROM hits2", null);
            try {
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j == 0;
            } catch (SQLiteException e) {
                e = e;
                try {
                    p("Database error", "SELECT COUNT(*) FROM hits2", e);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.kdu
    protected final void a() {
    }

    final SQLiteDatabase b() {
        try {
            return this.f.getWritableDatabase();
        } catch (SQLiteException e) {
            u("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    public final List c(long j) {
        int i = 0;
        mip.dl(j >= 0);
        kdo.a();
        z();
        Cursor cursor = null;
        try {
            int i2 = 2;
            int i3 = 3;
            int i4 = 4;
            Cursor cursorQuery = b().query("hits2", new String[]{"hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id"}, null, null, null, null, String.format("%s ASC", "hit_id"), Long.toString(j));
            try {
                ArrayList arrayList = new ArrayList();
                if (cursorQuery.moveToFirst()) {
                    while (true) {
                        long j2 = cursorQuery.getLong(i);
                        long j3 = cursorQuery.getLong(1);
                        String string = cursorQuery.getString(i2);
                        String string2 = cursorQuery.getString(i3);
                        int i5 = cursorQuery.getInt(i4);
                        Map mapC = C(string);
                        boolean z = TextUtils.isEmpty(string2) || !string2.startsWith("http:");
                        arrayList.add(new kex(this, mapC, j3, z, j2, i5));
                        if (!cursorQuery.moveToNext()) {
                            break;
                        }
                        i3 = 3;
                        i4 = 4;
                        i2 = 2;
                        i = 0;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayList;
            } catch (SQLiteException e) {
                e = e;
                cursor = cursorQuery;
                try {
                    o("Error loading hits from the database", e);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f.close();
        } catch (SQLiteException e) {
            o("Sql error closing database", e);
        } catch (IllegalStateException e2) {
            o("Error closing database", e2);
        }
    }
}
