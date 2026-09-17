package defpackage;

import android.content.Context;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import com.google.android.apps.lightcycle.panorama.NewTarget;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class fdv {
    public static final float a = f(22.0f);
    public static final float b = f(12.0f);
    public final Context c;
    public fct e;
    public fct f;
    public fei g;
    public feh h;
    public float m;
    public float n;
    public fdt x;
    public final Map d = DesugarCollections.synchronizedMap(new TreeMap());
    public final float[] i = {0.0f, 0.0f, -1.0f, 1.0f};
    public final float[] j = new float[4];
    public final float[] k = new float[16];
    public float[] l = null;
    public float o = 0.0f;
    public boolean p = false;
    public feg q = null;
    public final fdu r = new fdu();
    public boolean s = true;
    public boolean t = true;
    public float u = 0.1f;
    public long v = 0;
    public final float[] w = new float[16];

    public fdv(Context context) {
        this.c = context;
    }

    public static void c(float[] fArr) {
        fArr[0] = fArr[0] / fArr[3];
        fArr[1] = fArr[1] / fArr[3];
        fArr[2] = fArr[2] / fArr[3];
        fArr[3] = 1.0f;
    }

    private static float f(float f) {
        return f * 0.017453292f;
    }

    private static void g(float[] fArr, float[] fArr2) {
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        fArr2[3] = 0.0f;
        fArr2[4] = fArr[3];
        fArr2[5] = fArr[4];
        fArr2[6] = fArr[5];
        fArr2[7] = 0.0f;
        fArr2[8] = fArr[6];
        fArr2[9] = fArr[7];
        fArr2[10] = fArr[8];
        fArr2[11] = 0.0f;
        fArr2[12] = 0.0f;
        fArr2[13] = 0.0f;
        fArr2[14] = 0.0f;
        fArr2[15] = 1.0f;
    }

    public final void a() {
        NewTarget[] newTargetArrGetTargets;
        synchronized (fcz.a) {
            if (!fcz.b.booleanValue()) {
                throw new IllegalStateException("State is not ready.");
            }
            newTargetArrGetTargets = LightCycleNative.GetTargets();
        }
        float[] fArr = new float[16];
        this.d.clear();
        if (newTargetArrGetTargets == null) {
            return;
        }
        for (NewTarget newTarget : newTargetArrGetTargets) {
            g(newTarget.orientation, fArr);
            this.d.put(Integer.valueOf(newTarget.key), (float[]) fArr.clone());
        }
    }

    public final void b(float[] fArr) {
        NewTarget[] newTargetArrInitTargets;
        d();
        synchronized (fcz.a) {
            if (!fcz.b.booleanValue()) {
                throw new IllegalStateException("State is not ready.");
            }
            newTargetArrInitTargets = LightCycleNative.InitTargets(fArr);
        }
        if (newTargetArrInitTargets != null) {
            int length = newTargetArrInitTargets.length;
            for (int i = 0; i < length; i++) {
                float[] fArr2 = new float[16];
                g(newTargetArrInitTargets[i].orientation, fArr2);
                this.d.put(Integer.valueOf(newTargetArrInitTargets[i].key), fArr2);
            }
        }
        this.s = true;
        this.t = true;
        this.u = 0.1f;
        this.v = 0L;
    }

    public final void d() {
        this.d.clear();
        fcz.k();
    }

    public final void e(int i) {
        boolean z = true;
        if (i != 3 && i != 4) {
            z = false;
        }
        this.p = z;
    }
}
