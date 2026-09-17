package defpackage;

import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
public final class jsc {
    public int a = 0;
    private final Window b;
    private final jti c;

    public jsc(Window window, jti jtiVar, byte[] bArr) {
        this.b = window;
        this.c = jtiVar;
    }

    public final void a() {
        obr.ap(this.a > 0);
        int i = this.a - 1;
        this.a = i;
        if (i == 0) {
            d(-1.0f);
        }
    }

    public final void b(int i) {
        float fMin = (Math.min(0.6693f / Math.max(0.667f, Math.min((i / this.c.a) / 2.73949f, 1.0f)), 1.0f) - 0.6693f) * 3.0238888f;
        d(((1.0f - fMin) * 0.48f) + (fMin * 0.65f));
        this.a++;
    }

    public final void c() {
        d(1.0f);
        this.a++;
    }

    public final void d(float f) {
        WindowManager.LayoutParams attributes = this.b.getAttributes();
        attributes.screenBrightness = f;
        this.b.setAttributes(attributes);
    }
}
