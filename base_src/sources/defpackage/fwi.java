package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fwi {
    private final fvz a;
    private final lis b;

    public fwi(fvz fvzVar, lir lirVar) {
        this.a = fvzVar;
        this.b = lirVar.a("CptModuleCfgBldr");
    }

    public final fvx a(lvs lvsVar, jrl jrlVar) {
        lwd lwdVar;
        lhs lhsVar;
        lig ligVar;
        jnl jnlVar;
        fvz fvzVar = this.a;
        fvzVar.a.e("OneConfig#create");
        fvzVar.a.e("OneConfig#oneCharacteristics");
        ghx ghxVarF = fvzVar.d.f(lvsVar);
        lwd lwdVarK = ghxVarF.k();
        fvzVar.a.g("OneConfig#pictureSize");
        lig ligVarA = fvzVar.b.a(lvsVar, lwdVarK);
        fvzVar.a.g("OneConfig#selectViewfinder");
        List listY = ghxVarF.y();
        lhs lhsVarH = lhs.h(ligVarA);
        int i = lhsVarH.d;
        int i2 = lhsVarH.e;
        jni jniVar = fvzVar.c;
        double d = i;
        double d2 = i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        lig ligVarB = jniVar.b(listY, d / d2, lwdVarK, jrlVar, lvsVar);
        jnl jnlVarA = jnl.a(lwdVarK, ligVarB, lhs.h(ligVarB));
        fvzVar.a.f();
        lhs lhsVarH2 = lhs.h(ligVarA);
        fvw fvwVar = new fvw();
        fvwVar.a = lvsVar;
        if (lwdVarK == null) {
            throw new NullPointerException("Null cameraFacing");
        }
        fvwVar.b = lwdVarK;
        fvwVar.c = lhsVarH2;
        fvwVar.d = ligVarA;
        fvwVar.e = jnlVarA;
        lvs lvsVar2 = fvwVar.a;
        if (lvsVar2 != null && (lwdVar = fvwVar.b) != null && (lhsVar = fvwVar.c) != null && (ligVar = fvwVar.d) != null && (jnlVar = fvwVar.e) != null) {
            fvx fvxVar = new fvx(lvsVar2, lwdVar, lhsVar, ligVar, jnlVar);
            fvzVar.a.f();
            lis lisVar = this.b;
            String strValueOf = String.valueOf(lvsVar);
            String strValueOf2 = String.valueOf(fvxVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 38 + String.valueOf(strValueOf2).length());
            sb.append("Selected configuration for camera (");
            sb.append(strValueOf);
            sb.append("): ");
            sb.append(strValueOf2);
            lisVar.f(sb.toString());
            return fvxVar;
        }
        StringBuilder sb2 = new StringBuilder();
        if (fvwVar.a == null) {
            sb2.append(" cameraId");
        }
        if (fvwVar.b == null) {
            sb2.append(" cameraFacing");
        }
        if (fvwVar.c == null) {
            sb2.append(" aspectRatio");
        }
        if (fvwVar.d == null) {
            sb2.append(" captureResolution");
        }
        if (fvwVar.e == null) {
            sb2.append(" viewfinderConfig");
        }
        String strValueOf3 = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf3).length() + 28);
        sb3.append("Missing required properties:");
        sb3.append(strValueOf3);
        throw new IllegalStateException(sb3.toString());
    }
}
