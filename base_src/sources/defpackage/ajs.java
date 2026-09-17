package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ajs {
    public final Context a;
    public final String b;
    public final ajq c;
    public final boolean d;

    public ajs(Context context, String str, ajq ajqVar, boolean z) {
        this.a = context;
        this.b = str;
        this.c = ajqVar;
        this.d = z;
    }

    public static ajr a(Context context) {
        return new ajr(context);
    }
}
