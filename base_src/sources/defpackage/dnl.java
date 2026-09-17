package defpackage;

import android.hardware.HardwareBuffer;

/* JADX INFO: loaded from: classes.dex */
final class dnl implements gjt {
    final /* synthetic */ dos a;
    final /* synthetic */ dnn b;

    public dnl(dnn dnnVar, dos dosVar) {
        this.b = dnnVar;
        this.a = dosVar;
    }

    @Override // defpackage.gjt
    public final pht a() {
        HardwareBuffer hardwareBufferF = this.a.a.f();
        if (hardwareBufferF != null) {
            try {
                ((oug) ((oug) dnn.a.c()).G(875)).o("Using CPU processing on an image having a HardwareBuffer?");
            } catch (Throwable th) {
                try {
                    hardwareBufferF.close();
                } catch (Throwable th2) {
                }
                throw th;
            }
        }
        if (hardwareBufferF != null) {
            hardwareBufferF.close();
        }
        dnn dnnVar = this.b;
        phu phuVarA = phu.a(new dnm(dnnVar.d, this.a, dnnVar.b));
        this.b.c.execute(phuVarA);
        return phuVarA;
    }

    @Override // defpackage.gjt
    public final pht b() {
        return plk.V(new dod(this.a.a));
    }
}
