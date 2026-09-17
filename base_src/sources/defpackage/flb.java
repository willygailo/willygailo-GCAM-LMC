package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class flb extends iam {
    private static final ouj j = ouj.h("com/google/android/apps/camera/longexposure/LongExposureSmartsProcessor");
    private static final float k = (float) Math.toRadians(20.0d);
    public final flj a;
    public final fvv b;
    public final SensorManager c;
    public final Sensor d;
    public final Sensor e;
    public final SensorEventListener f;
    public final cbl g;
    public boolean h;
    private lwd l;
    private final Resources m;
    private float n;
    private final huf o;
    private final ddf p;

    public flb(Resources resources, Context context, huf hufVar, fvv fvvVar, ddf ddfVar, ScheduledExecutorService scheduledExecutorService, cbl cblVar) {
        super(scheduledExecutorService);
        this.n = Float.POSITIVE_INFINITY;
        this.m = resources;
        this.a = new flj(new float[]{0.0f, 0.0f, 1.0f}, k);
        this.o = hufVar;
        this.b = fvvVar;
        this.p = ddfVar;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.c = sensorManager;
        this.d = sensorManager.getDefaultSensor(9);
        this.e = sensorManager.getDefaultSensor(4);
        this.f = new fla(this);
        this.g = cblVar;
    }

    private final boolean h() {
        lwd lwdVar = this.l;
        return lwdVar != null && lwdVar == lwd.FRONT;
    }

    @Override // defpackage.iam, defpackage.ias
    public final void c(lvp lvpVar) {
        super.c(lvpVar);
        lwd lwdVarK = lvpVar.k();
        obr.ao(lwdVarK);
        this.l = lwdVarK;
        float fB = ddq.b(this.p, lwdVarK);
        if (fB == Float.POSITIVE_INFINITY) {
            ((oug) ((oug) j.b()).G((char) 1743)).o("Unknown device type. Advice will not fire.");
        }
        this.n = fB;
    }

    @Override // defpackage.iam
    protected final ial d() {
        iaw iawVarA = iax.a();
        iawVarA.b = this.m.getString(R.string.longexposure_suggestion_text);
        iawVarA.c = this.m.getDrawable(R.drawable.ic_night_suggestion, null);
        iawVarA.d = new fkz(this, 1);
        iawVarA.g = new fkz(this, 0);
        iawVarA.h = new fkz(this, 2);
        iawVarA.d(2000L);
        iax iaxVarA = iawVarA.a();
        iak iakVarA = ial.a();
        iakVarA.a = iaxVarA;
        iakVarA.b(3);
        iakVarA.c(5);
        return iakVarA.a();
    }

    @Override // defpackage.iam
    protected final boolean e(lzv lzvVar) {
        if (this.h) {
            return false;
        }
        String str = (String) this.o.c(htu.i);
        if (h()) {
            str = (String) this.o.c(htu.j);
        }
        if (!str.equals("on")) {
            Long l = (Long) lzvVar.d(TotalCaptureResult.SENSOR_EXPOSURE_TIME);
            Integer num = (Integer) lzvVar.d(TotalCaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            Integer num2 = (Integer) lzvVar.d(TotalCaptureResult.SENSOR_SENSITIVITY);
            if (l != null && num != null && num2 != null) {
                flj fljVar = this.a;
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                boolean z = fljVar.e >= 5 && fljVar.f >= 5 && jElapsedRealtimeNanos - fljVar.c >= 1000000 && jElapsedRealtimeNanos - fljVar.d >= 1000000 && !h();
                obr.ao(l);
                long jLongValue = l.longValue();
                obr.ao(num);
                int iIntValue = num.intValue();
                obr.ao(num2);
                float fIntValue = jLongValue * 1.0E-6f * num2.intValue() * iIntValue;
                if (!z && fIntValue > this.n) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.iam
    protected final boolean f(lzv lzvVar) {
        return ((Long) lzvVar.d(TotalCaptureResult.SENSOR_EXPOSURE_TIME)) == null || ((Integer) lzvVar.d(TotalCaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) == null || ((Integer) lzvVar.d(TotalCaptureResult.SENSOR_SENSITIVITY)) == null;
    }

    @Override // defpackage.iam, defpackage.iat
    public final void u() {
        super.u();
        this.i.execute(new fkz(this, 4));
    }

    @Override // defpackage.iam, defpackage.iat
    public final void v() {
        this.i.execute(new fkz(this, 3));
    }
}
