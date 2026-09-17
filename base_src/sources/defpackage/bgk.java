package defpackage;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class bgk implements azv {
    private final azv a;
    private final Resources b;

    public bgk(Resources resources, azv azvVar) {
        aae.s(resources);
        this.b = resources;
        aae.s(azvVar);
        this.a = azvVar;
    }

    @Override // defpackage.azv
    public final bcl a(Object obj, int i, int i2, azt aztVar) {
        return bhq.f(this.b, this.a.a(obj, i, i2, aztVar));
    }

    @Override // defpackage.azv
    public final boolean b(Object obj, azt aztVar) {
        return this.a.b(obj, aztVar);
    }
}
