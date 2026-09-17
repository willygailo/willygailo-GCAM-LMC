package defpackage;

import android.app.DownloadManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class jtt extends jtu {
    public final SharedPreferences a;
    public final Object b;

    public jtt(DownloadManager downloadManager, Context context, SharedPreferences sharedPreferences) {
        super(downloadManager, context);
        this.b = new Object();
        this.a = sharedPreferences;
    }

    @Override // defpackage.jtu
    protected final Long a(Uri uri) {
        synchronized (this.b) {
            String string = uri.toString();
            if (!this.a.contains(string)) {
                return null;
            }
            return Long.valueOf(this.a.getLong(string, 0L));
        }
    }
}
