package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.SizeF;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gsn extends ldl {
    private static final ouj a = ouj.h("com/google/android/apps/camera/one/zoom/api/MultiCropRegion");
    private final List b;
    private final float c;
    private final double d;
    private final int e;
    private final int f;
    private final int g;
    private final lwd h;
    private final Rect i;
    private boolean j;
    private gsm k;

    public gsn(lco lcoVar, lco lcoVar2, lvp lvpVar, ddf ddfVar, lvq lvqVar) {
        this(lcoVar, lcoVar2, lvpVar, lhs.a, ddfVar, lvqVar);
    }

    public gsn(lco lcoVar, lco lcoVar2, lvp lvpVar, lhs lhsVar, ddf ddfVar, lvq lvqVar) {
        super(lcoVar2);
        lvpVar.i();
        g(lvpVar, ddfVar);
        lvpVar.i();
        List listT = lvpVar.t();
        this.b = listT;
        this.c = ((Float) Collections.min(listT)).floatValue();
        SizeF sizeF = (SizeF) lvpVar.n(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        this.d = Math.hypot(sizeF.getWidth(), sizeF.getHeight());
        Rect rectH = lvpVar.h();
        this.e = rectH.width() / 2;
        this.f = rectH.height() / 2;
    }

    public static boolean g(lvp lvpVar, ddf ddfVar) {
        return lvpVar.L() && ddfVar.k(ddl.T);
    }

    public final synchronized gsm d() {
        return c(Float.valueOf(1.0f));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ldl
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final synchronized gsm c(Float f) {
        float fFloatValue;
        if (!Float.isNaN(f.floatValue()) && f.floatValue() > 0.0f) {
            if (!this.j) {
                float fFloatValue2 = f.floatValue();
                double d = this.d;
                boolean z = true;
                obr.aK(d > 0.0d, "Invalid sensor size: %s", Double.valueOf(d));
                double d2 = this.d;
                float f2 = this.c;
                double d3 = fFloatValue2;
                Double.isNaN(d3);
                double dAP = mip.aP(f2, d2 / d3);
                double d4 = this.d;
                obr.aK(d4 > 0.0d, "Diagonal size cannot be zero (%s)", Double.valueOf(d4));
                if (dAP <= 0.0d || dAP >= 6.283185307179586d) {
                    z = false;
                }
                obr.aK(z, "Invalid AoV: %s", Double.valueOf(dAP));
                double dTan = Math.tan(dAP / 2.0d);
                float f3 = (float) (d4 / (dTan + dTan));
                try {
                    List list = this.b;
                    double d5 = f3;
                    int size = list.size() - 1;
                    while (true) {
                        if (size < 0) {
                            StringBuilder sb = new StringBuilder(46);
                            sb.append("focal length needed = ");
                            sb.append(d5);
                            throw new IllegalStateException(sb.toString());
                        }
                        fFloatValue = ((Float) list.get(size)).floatValue();
                        double d6 = fFloatValue;
                        if (d6 < d5) {
                            break;
                        }
                        Double.isNaN(d5);
                        Double.isNaN(d6);
                        if (Math.abs(d5 - d6) < 9.999999747378752E-6d) {
                            break;
                        }
                        size--;
                    }
                } catch (IllegalStateException e) {
                    ((oug) ((oug) ((oug) a.b()).h(e)).G(2110)).F(f3, this.b);
                    fFloatValue = ((Float) this.b.get(0)).floatValue();
                }
                double dAQ = mip.aQ(dAP, fFloatValue) / this.d;
                int i = this.e;
                double d7 = i;
                Double.isNaN(d7);
                int i2 = (int) ((d7 * dAQ) + 0.5d);
                int i3 = this.f;
                double d8 = i3;
                Double.isNaN(d8);
                int i4 = (int) ((dAQ * d8) + 0.5d);
                int i5 = this.g + i3;
                this.k = new gsm(new Rect(i - i2, i5 - i4, i + i2, i5 + i4), this.i, fFloatValue);
            }
            return this.k;
        }
        ((oug) ((oug) a.c()).G((char) 2111)).r("Invalid zoom factor: %g", f);
        return this.k;
    }

    public final synchronized void f(lwd lwdVar) {
    }
}
