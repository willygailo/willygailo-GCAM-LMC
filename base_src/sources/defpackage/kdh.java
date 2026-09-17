package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class kdh {
    public static final /* synthetic */ int a = 0;

    static {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        builder.build();
    }
}
