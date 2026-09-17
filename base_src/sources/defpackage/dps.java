package defpackage;

import android.hardware.HardwareBuffer;

/* JADX INFO: loaded from: classes.dex */
final class dps {
    public final long a;
    public final pih b = pih.f();
    public final pih c;
    public final Object d;
    public final HardwareBuffer e;
    final /* synthetic */ dpt f;

    public dps(dpt dptVar, int i, int i2, int i3, int i4, long j, long j2) {
        this.f = dptVar;
        pih pihVarF = pih.f();
        this.c = pihVarF;
        this.d = new Object();
        this.e = HardwareBuffer.create(i, i2, i3, i4, j);
        this.a = j2;
        pihVarF.o(true);
    }
}
