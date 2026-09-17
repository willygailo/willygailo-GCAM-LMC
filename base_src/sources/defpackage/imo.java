package defpackage;

import android.os.PowerManager;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class imo {
    public static final ouj a = ouj.h("com/google/android/apps/camera/temperature/PowerManagerProxy");
    public final PowerManager b;
    public boolean c = false;
    public boolean d = false;
    public final Executor e;

    public imo(PowerManager powerManager, Executor executor) {
        this.b = powerManager;
        this.e = executor;
    }

    final synchronized void a(PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener) {
        this.c = true;
        this.e.execute(new imn(this, onThermalStatusChangedListener, 1));
    }
}
