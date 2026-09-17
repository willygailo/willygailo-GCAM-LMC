package defpackage;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes2.dex */
public final class jms implements jmo {
    private final int a;
    private final Object[] b;

    public jms(int i, Object... objArr) {
        this.a = i;
        this.b = objArr;
    }

    @Override // defpackage.jmo
    public final String a(Resources resources) {
        return resources.getString(this.a, this.b);
    }
}
