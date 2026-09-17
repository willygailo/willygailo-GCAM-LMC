package defpackage;

import com.google.googlex.gcam.FloatDeque;
import com.google.googlex.gcam.GcamModuleJNI;

/* JADX INFO: loaded from: classes.dex */
public final class bsy {
    public final FloatDeque a;

    public bsy() {
        this.a = new FloatDeque(GcamModuleJNI.new_FloatDeque__SWIG_0(), true);
    }

    public bsy(FloatDeque floatDeque) {
        this.a = floatDeque;
    }

    public final float a(int i) {
        FloatDeque floatDeque = this.a;
        return GcamModuleJNI.FloatDeque_getitem(floatDeque.a, floatDeque, i);
    }

    public final long b() {
        FloatDeque floatDeque = this.a;
        return GcamModuleJNI.FloatDeque_size(floatDeque.a, floatDeque);
    }

    public final void c(float f) {
        FloatDeque floatDeque = this.a;
        GcamModuleJNI.FloatDeque_push_back(floatDeque.a, floatDeque, f);
    }
}
