package defpackage;

import android.content.res.Resources;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class esb extends iam {
    private static final int g = Math.round(6.0f);
    private static final int h = (int) Math.min(20.0f, 100.0f);
    public final fvv a;
    public final lda b;
    public final cbl c;
    public final huj d;
    public boolean e;
    public Float f;
    private final Resources j;
    private final ojz k;
    private final ljf l;
    private Float m;

    public esb(Resources resources, fvv fvvVar, lda ldaVar, ojz ojzVar, lco lcoVar, ScheduledExecutorService scheduledExecutorService, bqg bqgVar, ljf ljfVar, cbl cblVar, huj hujVar, ddf ddfVar) {
        super(scheduledExecutorService);
        this.j = resources;
        this.a = fvvVar;
        this.b = ldaVar;
        this.k = ojzVar;
        this.l = ljfVar;
        this.c = cblVar;
        this.d = hujVar;
        boolean z = true;
        if (hujVar.a("MblurSuggestionShown") == 0) {
            ovd ovdVar = ovl.a;
        } else {
            int iA = hujVar.a("MblurSuggestionSessionSkipped");
            ovd ovdVar2 = ovl.a;
            if (iA < ((Integer) ddfVar.a(ddt.a).c()).intValue() - 1) {
                hujVar.b("MblurSuggestionSessionSkipped");
                z = false;
            }
        }
        this.e = z;
        this.m = Float.valueOf(0.0f);
        this.f = Float.valueOf(1.0f);
        bqgVar.i().c(lcoVar.a(new lij() { // from class: ery
            @Override // defpackage.lij
            public final void fB(Object obj) {
                esb esbVar = this.a;
                Float f = (Float) obj;
                synchronized (esbVar) {
                    esbVar.f = f;
                }
            }
        }, scheduledExecutorService));
    }

    @Override // defpackage.iam
    protected final ial d() {
        iaw iawVarA = iax.a();
        iawVarA.b = this.j.getString(R.string.moblur_suggestion_text);
        iawVarA.c = this.j.getDrawable(R.drawable.quantum_gm_ic_motion_blur_white_24, null);
        final int i = 1;
        iawVarA.d = new Runnable(this) { // from class: erz
            public final /* synthetic */ esb a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.a.e = false;
                        ovd ovdVar = ovl.a;
                        break;
                    case 1:
                        esb esbVar = this.a;
                        if (!((Integer) esbVar.b.fA()).equals(Integer.valueOf(esn.ACTION.ordinal()))) {
                            esbVar.b.fB(Integer.valueOf(esn.ACTION.ordinal()));
                        }
                        esbVar.a.b(jrl.MOTION_BLUR);
                        break;
                    default:
                        esb esbVar2 = this.a;
                        ovd ovdVar2 = ovl.a;
                        esbVar2.c.f(jrl.MOTION_BLUR);
                        esbVar2.d.b("MblurSuggestionShown");
                        esbVar2.d.c("MblurSuggestionSessionSkipped", 0);
                        esbVar2.e = false;
                        break;
                }
            }
        };
        final int i2 = 0;
        iawVarA.g = new Runnable(this) { // from class: erz
            public final /* synthetic */ esb a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.a.e = false;
                        ovd ovdVar = ovl.a;
                        break;
                    case 1:
                        esb esbVar = this.a;
                        if (!((Integer) esbVar.b.fA()).equals(Integer.valueOf(esn.ACTION.ordinal()))) {
                            esbVar.b.fB(Integer.valueOf(esn.ACTION.ordinal()));
                        }
                        esbVar.a.b(jrl.MOTION_BLUR);
                        break;
                    default:
                        esb esbVar2 = this.a;
                        ovd ovdVar2 = ovl.a;
                        esbVar2.c.f(jrl.MOTION_BLUR);
                        esbVar2.d.b("MblurSuggestionShown");
                        esbVar2.d.c("MblurSuggestionSessionSkipped", 0);
                        esbVar2.e = false;
                        break;
                }
            }
        };
        final int i3 = 2;
        iawVarA.h = new Runnable(this) { // from class: erz
            public final /* synthetic */ esb a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.a.e = false;
                        ovd ovdVar = ovl.a;
                        break;
                    case 1:
                        esb esbVar = this.a;
                        if (!((Integer) esbVar.b.fA()).equals(Integer.valueOf(esn.ACTION.ordinal()))) {
                            esbVar.b.fB(Integer.valueOf(esn.ACTION.ordinal()));
                        }
                        esbVar.a.b(jrl.MOTION_BLUR);
                        break;
                    default:
                        esb esbVar2 = this.a;
                        ovd ovdVar2 = ovl.a;
                        esbVar2.c.f(jrl.MOTION_BLUR);
                        esbVar2.d.b("MblurSuggestionShown");
                        esbVar2.d.c("MblurSuggestionSessionSkipped", 0);
                        esbVar2.e = false;
                        break;
                }
            }
        };
        iawVarA.d(5000L);
        iax iaxVarA = iawVarA.a();
        iak iakVarA = ial.a();
        iakVarA.a = iaxVarA;
        iakVarA.b(g);
        iakVarA.c(25);
        return iakVarA.a();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    @Override // defpackage.iam
    protected final boolean e(lzv lzvVar) {
        Float f;
        float[] fArr;
        float f2;
        float f3;
        long jLongValue;
        ojc ojcVarB;
        if (!this.e) {
            return false;
        }
        synchronized (this) {
            f = this.f;
        }
        if (!f.equals(this.m)) {
            this.m = f;
        } else if (f.floatValue() <= 4.2f) {
            MeteringRectangle[] meteringRectangleArr = (MeteringRectangle[]) lzvVar.d(CaptureResult.CONTROL_AE_REGIONS);
            if (meteringRectangleArr != null) {
                for (MeteringRectangle meteringRectangle : meteringRectangleArr) {
                    if (meteringRectangle.getMeteringWeight() <= 0) {
                    }
                }
                if (kdb.b != null && (fArr = (float[]) lzvVar.d(kdb.b)) != null) {
                    float f4 = fArr[6];
                    f2 = fArr[8];
                    f3 = fArr[9];
                    if (f2 >= 0.0f && f4 >= -2.0f) {
                        Long l = (Long) lzvVar.d(CaptureResult.SENSOR_TIMESTAMP);
                        l.getClass();
                        jLongValue = l.longValue();
                        if (this.k.a() == null) {
                            ovd ovdVar = ovl.a;
                            ojcVarB = oih.a;
                        } else {
                            this.l.e("gyro");
                            esa esaVar = new esa();
                            ((lxa) this.k.a()).b(jLongValue - (((long) h) * 5000000), jLongValue, esaVar);
                            this.l.f();
                            ojcVarB = esaVar.b();
                        }
                        if (ojcVarB.g()) {
                            float f5 = ((f2 / 80.0f) * 100.0f) / (f3 / 1000.0f);
                            float fMax = Math.max(((Float) ojcVarB.c()).floatValue() - 0.025f, 0.0f) / 0.125f;
                            float f6 = ((1.0f - fMax) * 3.0f) + (fMax * 10.0f);
                            if (((Float) ojcVarB.c()).floatValue() >= 0.15f && f5 > f6) {
                                return true;
                            }
                        }
                    }
                }
            } else if (kdb.b != null) {
                float f7 = fArr[6];
                f2 = fArr[8];
                f3 = fArr[9];
                if (f2 >= 0.0f) {
                    Long l2 = (Long) lzvVar.d(CaptureResult.SENSOR_TIMESTAMP);
                    l2.getClass();
                    jLongValue = l2.longValue();
                    if (this.k.a() == null) {
                        ovd ovdVar2 = ovl.a;
                        ojcVarB = oih.a;
                    } else {
                        this.l.e("gyro");
                        esa esaVar2 = new esa();
                        ((lxa) this.k.a()).b(jLongValue - (((long) h) * 5000000), jLongValue, esaVar2);
                        this.l.f();
                        ojcVarB = esaVar2.b();
                    }
                    if (ojcVarB.g()) {
                        float f8 = ((f2 / 80.0f) * 100.0f) / (f3 / 1000.0f);
                        float fMax2 = Math.max(((Float) ojcVarB.c()).floatValue() - 0.025f, 0.0f) / 0.125f;
                        float f9 = ((1.0f - fMax2) * 3.0f) + (fMax2 * 10.0f);
                        if (((Float) ojcVarB.c()).floatValue() >= 0.15f) {
                        }
                    }
                }
            }
        }
        return false;
    }
}
