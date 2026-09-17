package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class jr {
    static {
        new ThreadLocal();
        new WeakHashMap(0);
    }

    public static ColorStateList a(Context context, int i) {
        return context.getColorStateList(i);
    }

    public static Drawable b(Context context, int i) {
        return qw.e().c(context, i);
    }
}
