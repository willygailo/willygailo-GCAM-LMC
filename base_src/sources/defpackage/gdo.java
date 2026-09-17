package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class gdo implements gff {
    private final int a;
    private final boolean b;
    private final fus c;
    private final eam d;
    private final imf e;
    private final dqa f;
    private final AtomicReference g;
    private volatile int h;
    private volatile float i;
    private volatile int j;
    private volatile float k;
    private volatile boolean l;
    private final ddf m;
    private volatile int n;

    public gdo(dvp dvpVar, lvp lvpVar, ddf ddfVar, fus fusVar, eam eamVar, imf imfVar, dqa dqaVar) {
        final AtomicReference atomicReference = new AtomicReference();
        this.g = atomicReference;
        boolean z = true;
        this.n = 1;
        this.l = false;
        this.a = ((Integer) lvpVar.m(CameraCharacteristics.SENSOR_MAX_ANALOG_SENSITIVITY, 0)).intValue();
        if (!ddfVar.k(dds.w)) {
            ddi ddiVar = ddl.a;
            ddfVar.d();
            z = false;
        }
        this.b = z;
        this.c = fusVar;
        this.d = eamVar;
        this.e = imfVar;
        this.f = dqaVar;
        this.m = ddfVar;
        dvpVar.f(new dvq() { // from class: gdn
            @Override // defpackage.dvq
            public final void k(hjz hjzVar) {
                atomicReference.set(hjzVar);
            }
        }, pgr.INSTANCE);
    }

    private final boolean b(hjz hjzVar, int i) {
        return TimeUnit.NANOSECONDS.toMillis(hjzVar.c) < ((long) i) || hjzVar.e < this.a;
    }

    private static final boolean c(hjz hjzVar, float f) {
        int iWidth = hjzVar.s.width();
        Rect rect = hjzVar.n;
        return ((float) iWidth) / ((float) (rect != null ? rect.width() : iWidth)) < f;
    }

    @Override // defpackage.gff
    public final int a() {
        hjz hjzVar = (hjz) this.g.get();
        if (hjzVar == null) {
            if (!this.l) {
                this.l = true;
            }
            return this.n;
        }
        this.l = false;
        if (this.c.c()) {
            this.n = 3;
            return 3;
        }
        if (((Boolean) this.d.a().fA()).booleanValue() || ((Boolean) this.e.a().fA()).booleanValue() || ((Boolean) this.f.a().fA()).booleanValue()) {
            this.n = 1;
            return 1;
        }
        this.h = true != this.m.k(ddm.W) ? 33 : 66;
        this.i = 1.2f;
        if (this.b) {
            this.j = 66;
            this.k = 3.0f;
        } else {
            this.j = this.h;
            this.k = this.i;
        }
        if (c(hjzVar, this.i) && b(hjzVar, this.h)) {
            this.n = 3;
        } else if (c(hjzVar, this.k) && b(hjzVar, this.j)) {
            this.n = 2;
        } else {
            this.n = 1;
        }
        return this.n;
    }
}
