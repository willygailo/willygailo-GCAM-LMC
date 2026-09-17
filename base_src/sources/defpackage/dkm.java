package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dkm {
    private static final ouj a = ouj.h("com/google/android/apps/camera/device/DeviceUtils");
    private final float b;

    public dkm(ddf ddfVar) {
        this.b = ((Float) ddfVar.g(ddl.bm).c()).floatValue();
    }

    public final float a(lvp lvpVar) {
        double dAR = mip.aR(lvpVar);
        List listT = lvpVar.t();
        float f = this.b;
        double dAR2 = mip.aR(lvpVar);
        double d = -100.0d;
        float fFloatValue = -1.0f;
        for (Float f2 : lvpVar.t()) {
            double dAP = mip.aP(f2.floatValue(), dAR2);
            double d2 = f;
            Double.isNaN(d2);
            double dAbs = Math.abs(dAP - d2);
            Double.isNaN(d2);
            if (dAbs < Math.abs(d - d2)) {
                fFloatValue = f2.floatValue();
                d = dAP;
            }
        }
        return (float) (dAR / mip.aQ(mip.aP(fFloatValue, dAR), ((Float) Collections.min(listT)).floatValue()));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[SYNTHETIC] */
    public final lvs b(lvq lvqVar, ddf ddfVar, lwd lwdVar) {
        String string;
        lvs lvsVar;
        Iterator it;
        if (lwdVar != null) {
            Integer num = (Integer) ddfVar.a(ddl.y).c();
            Integer num2 = (Integer) ddfVar.a(ddl.z).c();
            switch (lwdVar) {
                case FRONT:
                    string = num2.intValue() != -1 ? num2.toString() : null;
                    if (string != null) {
                        it = lvqVar.h(lwdVar).iterator();
                        do {
                            if (!it.hasNext()) {
                                ((oug) ((oug) a.c()).G((char) 820)).r("TestOnly Camera id %s is not supported", string);
                                lvsVar = null;
                            } else {
                                lvsVar = (lvs) it.next();
                            }
                        } while (!lvsVar.a.equals(string));
                    } else {
                        lvsVar = null;
                    }
                    break;
                case BACK:
                    string = num.intValue() != -1 ? num.toString() : null;
                    if (string != null) {
                        it = lvqVar.h(lwdVar).iterator();
                        do {
                            if (!it.hasNext()) {
                                ((oug) ((oug) a.c()).G((char) 820)).r("TestOnly Camera id %s is not supported", string);
                                lvsVar = null;
                            } else {
                                lvsVar = (lvs) it.next();
                            }
                        } while (!lvsVar.a.equals(string));
                    } else {
                        lvsVar = null;
                    }
                    break;
                case EXTERNAL:
                    ((oug) ((oug) a.c()).G((char) 821)).r("TestOnly camera facing %s is not supported", lwdVar);
                    lvsVar = null;
                    break;
                default:
                    string = null;
                    if (string != null) {
                        it = lvqVar.h(lwdVar).iterator();
                        do {
                            if (!it.hasNext()) {
                                ((oug) ((oug) a.c()).G((char) 820)).r("TestOnly Camera id %s is not supported", string);
                                lvsVar = null;
                            } else {
                                lvsVar = (lvs) it.next();
                            }
                        } while (!lvsVar.a.equals(string));
                    } else {
                        lvsVar = null;
                    }
                    break;
            }
        } else {
            lvsVar = null;
        }
        if (lvsVar != null) {
            ((oug) ((oug) a.c()).G((char) 819)).r("Set TestOnly camera id (%s)", lvsVar);
            return lvsVar;
        }
        ddi ddiVar = ddl.a;
        ddfVar.b();
        ddfVar.b();
        lks lksVar = new lks(new lkp(lvqVar), lvqVar);
        lksVar.b = new lkr(lksVar.b, new lko(lwdVar));
        lksVar.b = new lkr(lksVar.b, new lkn(lksVar));
        lksVar.b.b();
        lvp lvpVarA = lksVar.b.a();
        if (lvpVarA == null) {
            return null;
        }
        return ((lvo) lvpVarA).a;
    }
}
