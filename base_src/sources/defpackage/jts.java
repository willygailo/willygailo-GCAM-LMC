package defpackage;

import android.app.DownloadManager;
import android.database.Cursor;
import android.net.Uri;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class jts {
    public final jtt a;
    private final Executor b;

    public jts(jtt jttVar, Executor executor) {
        this.a = jttVar;
        this.b = executor;
    }

    public final pht a(final Uri uri) {
        return plk.Z(new Callable() { // from class: jtr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Cursor cursorQuery;
                jts jtsVar = this.a;
                Uri uri2 = uri;
                jtt jttVar = jtsVar.a;
                lar.b();
                Long lA = jttVar.a(uri2);
                jtv jtvVar = null;
                if (lA != null) {
                    DownloadManager.Query query = new DownloadManager.Query();
                    query.setFilterById(lA.longValue());
                    cursorQuery = jttVar.c.query(query);
                    if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                        cursorQuery = null;
                    }
                } else {
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                    long j = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("bytes_so_far"));
                    long j2 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("total_size"));
                    jtv jtvVar2 = new jtv();
                    if (j2 <= 0 || j < 0) {
                        jtvVar2.b = 0.0f;
                    } else {
                        jtvVar2.b = j / j2;
                    }
                    jtvVar2.a = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("status"));
                    jtvVar2.c = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("local_uri"));
                    cursorQuery.close();
                    jtvVar = jtvVar2;
                }
                return ojc.h(jtvVar);
            }
        }, this.b);
    }

    public final void b(Uri uri) {
        this.b.execute(new jtq(this, uri, 1));
    }

    public final void c(Uri uri) {
        this.b.execute(new jtq(this, uri, 0));
    }
}
