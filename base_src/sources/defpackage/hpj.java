package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class hpj {
    public final SensorManager a;
    public final Executor b;
    public final Sensor c;
    public boolean j;
    public final Object e = new Object();
    public final float[] f = new float[9];
    public final float[] g = new float[9];
    public final float[] h = new float[3];
    public final Set i = new HashSet();
    public final hpi d = new hpi(this);

    public hpj(SensorManager sensorManager, Executor executor) {
        this.a = sensorManager;
        this.b = executor;
        this.c = sensorManager.getDefaultSensor(11);
    }
}
