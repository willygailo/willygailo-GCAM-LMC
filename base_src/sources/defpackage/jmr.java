package defpackage;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes2.dex */
public final class jmr implements jmo {
    private final int a;
    private final int b;
    private final Object[] c;

    public jmr(int i, int i2, Object... objArr) {
        this.a = i;
        this.b = i2;
        this.c = objArr;
    }

    @Override // defpackage.jmo
    public final String a(Resources resources) {
        return resources.getQuantityString(this.a, this.b, this.c);
    }
}
