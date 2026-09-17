package defpackage;

import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public final class fee extends HandlerThread {
    Handler a;
    final /* synthetic */ feg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fee(feg fegVar) {
        super("sensor thread");
        this.b = fegVar;
        this.a = null;
    }

    @Override // android.os.HandlerThread
    protected final void onLooperPrepared() {
        this.a = mip.bV(getLooper());
        feg fegVar = this.b;
        SensorManager sensorManager = fegVar.b;
        sensorManager.registerListener(fegVar.p, sensorManager.getDefaultSensor(1), 1, this.a);
        feg fegVar2 = this.b;
        SensorManager sensorManager2 = fegVar2.b;
        sensorManager2.registerListener(fegVar2.p, sensorManager2.getDefaultSensor(4), 1, this.a);
        feg fegVar3 = this.b;
        SensorManager sensorManager3 = fegVar3.b;
        sensorManager3.registerListener(fegVar3.p, sensorManager3.getDefaultSensor(2), 3, this.a);
    }
}
