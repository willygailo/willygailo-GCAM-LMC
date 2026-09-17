package defpackage;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
abstract class jtu {
    protected final DownloadManager c;
    protected final Context d;

    public jtu(DownloadManager downloadManager, Context context) {
        this.c = downloadManager;
        this.d = context;
    }

    protected abstract Long a(Uri uri);
}
