package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class jth {
    private final lvq a;
    private final Set b;
    private final lvp c;
    private final boolean d;
    private lvs e;
    private lvs f;
    private lvs g;

    public jth(lvq lvqVar, lvp lvpVar, ddf ddfVar) {
        this.a = lvqVar;
        this.c = lvpVar;
        this.b = lvpVar.B();
        boolean zK = ddfVar.k(ddl.T);
        boolean z = false;
        if (zK && lvpVar.L()) {
            z = true;
        }
        this.d = z;
    }

    private final synchronized void h() {
        if (this.e == null || this.f == null) {
            HashMap map = new HashMap();
            float f = Float.MIN_VALUE;
            float f2 = Float.MAX_VALUE;
            for (lvs lvsVar : this.b) {
                float[] fArr = (float[]) this.a.a(lvsVar).l(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                if (fArr != null && (fArr.length) > 0) {
                    for (float f3 : fArr) {
                        map.put(lvsVar, Float.valueOf(f3));
                        if (f3 > f) {
                            this.e = lvsVar;
                            f = f3;
                        }
                        if (f3 < f2) {
                            this.f = lvsVar;
                            f2 = f3;
                        }
                    }
                }
            }
            if (map.size() == 3) {
                for (lvs lvsVar2 : map.keySet()) {
                    float fFloatValue = ((Float) map.get(lvsVar2)).floatValue();
                    if (fFloatValue > f2 && fFloatValue < f) {
                        this.g = lvsVar2;
                        break;
                    }
                }
            }
        }
    }

    public final lvp a(String str) {
        lvs lvsVar = null;
        if (str != null) {
            for (lvs lvsVar2 : this.b) {
                if (str.equals(lvsVar2.a)) {
                    lvsVar = lvsVar2;
                    break;
                }
            }
        }
        return lvsVar == null ? this.c : this.a.a(lvsVar);
    }

    public final synchronized lvp b() {
        h();
        lvs lvsVar = this.g;
        if (lvsVar == null) {
            return null;
        }
        return this.a.a(lvsVar);
    }

    public final synchronized lvp c() {
        h();
        if (this.e != null && this.b.size() != 1) {
            return this.a.a(this.e);
        }
        return this.c;
    }

    public final synchronized lvp d() {
        if (!this.d) {
            return e();
        }
        lvp lvpVarB = b();
        if (lvpVarB != null) {
            return lvpVarB;
        }
        return c();
    }

    public final synchronized lvp e() {
        h();
        if (this.f != null && this.b.size() != 1) {
            return this.a.a(this.f);
        }
        return this.c;
    }

    public final synchronized List f() {
        return oom.j(this.b);
    }

    public final synchronized boolean g(String str) {
        lvs lvsVar;
        h();
        return this.b.size() > 1 && (lvsVar = this.e) != null && str.equals(lvsVar.a);
    }
}
