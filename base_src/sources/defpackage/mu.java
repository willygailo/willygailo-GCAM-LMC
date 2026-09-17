package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class mu {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static mu b;
    private qw c;

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        return qw.b(i, mode);
    }

    public static synchronized mu d() {
        if (b == null) {
            f();
        }
        return b;
    }

    public static synchronized void f() {
        if (b == null) {
            mu muVar = new mu();
            b = muVar;
            muVar.c = qw.e();
            b.c.g(new mt());
        }
    }

    final synchronized ColorStateList a(Context context, int i) {
        return this.c.a(context, i);
    }

    public final synchronized Drawable c(Context context, int i) {
        return this.c.c(context, i);
    }

    public final synchronized void e(Context context) {
        this.c.f(context);
    }

    final synchronized Drawable g(Context context, int i) {
        return this.c.d(context, i, true);
    }
}
