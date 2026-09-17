package defpackage;

import android.os.PowerManager;
import android.os.Trace;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class imn implements Runnable {
    public final /* synthetic */ imo a;
    public final /* synthetic */ PowerManager.OnThermalStatusChangedListener b;
    private final /* synthetic */ int c;

    public /* synthetic */ imn(imo imoVar, PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener, int i) {
        this.c = i;
        this.a = imoVar;
        this.b = onThermalStatusChangedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                imo imoVar = this.a;
                PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener = this.b;
                synchronized (imoVar) {
                    if (imoVar.d) {
                        imoVar.b.removeThermalStatusListener(onThermalStatusChangedListener);
                        return;
                    }
                    ((oug) ((oug) imo.a.c()).G(3001)).o("removeThermalStatusListener called, but listener not yet registered.");
                    obr.aR(imoVar.c, "Listener is neither registered, nor waiting to be registered.");
                    imoVar.c = false;
                    return;
                }
            default:
                imo imoVar2 = this.a;
                PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener2 = this.b;
                synchronized (imoVar2) {
                    if (!imoVar2.c) {
                        ((oug) ((oug) imo.a.c()).G(3000)).o("removeThermalStatusListener already called. Not registering listener.");
                        return;
                    }
                    Trace.beginSection("AddThermalStatusListener");
                    imoVar2.b.addThermalStatusListener(imoVar2.e, onThermalStatusChangedListener2);
                    Trace.endSection();
                    imoVar2.d = true;
                    return;
                }
        }
    }
}
