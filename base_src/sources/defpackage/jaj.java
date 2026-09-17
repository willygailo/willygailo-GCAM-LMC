package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: loaded from: classes2.dex */
final class jaj implements SensorEventListener {
    final /* synthetic */ Vibrator a;
    final /* synthetic */ BottomBarController b;
    final /* synthetic */ jak c;

    public jaj(jak jakVar, Vibrator vibrator, BottomBarController bottomBarController) {
        this.c = jakVar;
        this.a = vibrator;
        this.b = bottomBarController;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.c.b.aw();
        if (this.a.hasVibrator()) {
            this.a.vibrate(jak.a, -1);
        }
        this.b.switchCamera();
    }
}
