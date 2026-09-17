package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class ajr {
    final Context a;
    public String b;
    public ajq c;
    public boolean d;

    public ajr(Context context) {
        this.a = context;
    }

    public final ajs a() {
        if (this.c == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        if (this.a == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        if (this.d && TextUtils.isEmpty(this.b)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new ajs(this.a, this.b, this.c, this.d);
    }
}
