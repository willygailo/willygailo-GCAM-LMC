package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.apps.camera.bottombar.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lxg implements lxb {
    public final List a = new ArrayList(6000);
    public final lii b;
    public int c;
    private final SensorManager d;
    private final Set e;
    private final SensorEventListener f;
    private final Sensor g;

    public lxg(SensorManager sensorManager) {
        this.d = sensorManager;
        this.g = sensorManager.getDefaultSensor(4);
        int i = 0;
        for (int i2 = 6000; i < i2; i2 = 6000) {
            this.a.add(new lxc(R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 1, 4, 0L, -1L, 0.0f, 0.0f, 0.0f));
            i++;
        }
        this.c = 0;
        this.f = new lxf(this);
        this.e = new HashSet();
        this.b = new lii(lxd.a, 6000);
    }

    private final synchronized void c() {
        this.d.unregisterListener(this.f);
    }

    private final synchronized void d() {
        this.d.registerListener(this.f, this.g, 0);
    }

    @Override // defpackage.lxb
    public final synchronized lxa a(String str) {
        lxe lxeVar;
        if (this.e.isEmpty()) {
            d();
        }
        lxeVar = new lxe(this, str);
        this.e.add(lxeVar);
        return lxeVar;
    }

    public final synchronized void b(lxa lxaVar) {
        if (this.e.remove(lxaVar) && this.e.isEmpty()) {
            c();
        }
    }
}
