package defpackage;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes2.dex */
public final class mci {
    private final ContentValues a;

    public mci() {
        this(new ContentValues());
    }

    public mci(ContentValues contentValues) {
        this.a = contentValues;
    }

    public final mcj a() {
        return new mcj(new ContentValues(this.a));
    }

    public final void b(String str, int i) {
        this.a.put(str, Integer.valueOf(i));
    }

    public final void c(String str, long j) {
        this.a.put(str, Long.valueOf(j));
    }

    public final void d(String str, String str2) {
        this.a.put(str, str2);
    }
}
