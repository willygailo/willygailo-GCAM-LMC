package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
final class bdi extends bcu {
    @Override // defpackage.bcu
    public final /* bridge */ /* synthetic */ bdf a() {
        return new bdh(this);
    }

    public final bdh d(int i, Bitmap.Config config) {
        bdh bdhVar = (bdh) b();
        bdhVar.a = i;
        bdhVar.b = config;
        return bdhVar;
    }
}
