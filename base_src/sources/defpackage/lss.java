package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
final class lss extends lst {
    private final pih d;
    private lzx e;
    private boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public lss(lty ltyVar) {
        pih pihVarF = pih.f();
        super(ltyVar, pihVarF);
        this.f = false;
        this.d = pihVarF;
        this.e = null;
    }

    @Override // defpackage.lsu
    public final synchronized lzx a() {
        return this.e;
    }

    @Override // defpackage.lst
    public final void b(Surface surface) {
        synchronized (this) {
            if (this.f) {
                return;
            }
            this.f = true;
            if (this.d.isDone()) {
                return;
            }
            try {
                OutputConfiguration outputConfigurationA = lsw.a(this.b, surface);
                if (outputConfigurationA != null) {
                    synchronized (this) {
                        this.e = new lvl(outputConfigurationA);
                    }
                }
                this.d.o(surface);
            } catch (Throwable th) {
                this.d.a(th);
            }
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 15);
        sb.append("DelayedConfig<");
        sb.append(strValueOf);
        sb.append(">");
        return sb.toString();
    }
}
