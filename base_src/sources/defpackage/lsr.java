package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
final class lsr extends lst {
    private final pih d;
    private final OutputConfiguration e;
    private final lzx f;
    private boolean g;

    /* JADX WARN: Illegal instructions before constructor call */
    public lsr(lty ltyVar, OutputConfiguration outputConfiguration) {
        pih pihVarF = pih.f();
        super(ltyVar, pihVarF);
        this.g = false;
        this.d = pihVarF;
        this.e = outputConfiguration;
        this.f = new lvl(outputConfiguration);
    }

    @Override // defpackage.lsu
    public final synchronized lzx a() {
        return this.f;
    }

    @Override // defpackage.lst
    public final void b(Surface surface) {
        synchronized (this) {
            if (this.g) {
                return;
            }
            this.g = true;
            if (this.d.isDone()) {
                return;
            }
            try {
                synchronized (this) {
                    try {
                        kde.c(this.e, surface);
                    } catch (Throwable th) {
                    }
                }
                this.d.o(surface);
            } catch (Throwable th2) {
                this.d.a(th2);
            }
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 16);
        sb.append("DeferredConfig<");
        sb.append(strValueOf);
        sb.append(">");
        return sb.toString();
    }
}
