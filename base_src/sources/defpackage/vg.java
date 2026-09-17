package defpackage;

import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class vg {
    private final Executor a;
    private final Executor b;
    private final Executor c;
    private final HandlerThread d;

    public vg() {
        this(null);
    }

    public /* synthetic */ vg(byte[] bArr) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg)) {
            return false;
        }
        vg vgVar = (vg) obj;
        Executor executor = vgVar.a;
        if (!qno.c(null, null)) {
            return false;
        }
        Executor executor2 = vgVar.b;
        if (!qno.c(null, null)) {
            return false;
        }
        Executor executor3 = vgVar.c;
        if (!qno.c(null, null)) {
            return false;
        }
        HandlerThread handlerThread = vgVar.d;
        return qno.c(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "ThreadConfig(defaultLightweightExecutor=" + ((Object) null) + ", defaultBackgroundExecutor=" + ((Object) null) + ", defaultCameraExecutor=" + ((Object) null) + ", defaultCameraHandler=" + ((Object) null) + ')';
    }
}
