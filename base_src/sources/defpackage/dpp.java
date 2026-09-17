package defpackage;

import android.hardware.HardwareBuffer;

/* JADX INFO: loaded from: classes.dex */
final class dpp implements gjt {
    final /* synthetic */ HardwareBuffer a;
    final /* synthetic */ long b;
    final /* synthetic */ dpt c;

    public dpp(dpt dptVar, HardwareBuffer hardwareBuffer, long j) {
        this.c = dptVar;
        this.a = hardwareBuffer;
        this.b = j;
    }

    @Override // defpackage.gjt
    public final pht a() {
        return this.c.a(this.a, this.b);
    }

    @Override // defpackage.gjt
    public final pht b() {
        return plk.V(new dpf(this.a, 1));
    }
}
