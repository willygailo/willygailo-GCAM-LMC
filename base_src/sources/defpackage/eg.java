package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class eg {
    public static Handler d() {
        return new Handler(Looper.getMainLooper());
    }

    public abstract void a(Typeface typeface);

    public final void b(int i) {
        d().post(new ef(this));
    }

    public final void c(Typeface typeface) {
        d().post(new ee(this, typeface));
    }

    public abstract void e();
}
