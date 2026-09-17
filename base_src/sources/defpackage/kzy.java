package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kzy {
    public static ContentResolver a = null;
    protected final String b;
    protected final Object c;

    protected kzy(String str, Object obj) {
        this.b = str;
        this.c = obj;
    }

    public static void b(Context context) {
        a = context.getContentResolver();
    }

    public static kzy c(String str) {
        return new kzw(str, false);
    }

    public abstract Object a();
}
