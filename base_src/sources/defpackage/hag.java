package defpackage;

import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.FrameRequestVector;
import com.google.googlex.gcam.PostviewParams;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hag implements hea {
    private static final ouj a = ouj.h("com/google/android/apps/camera/pixelcamerakit/commands/PckSecondaryHdrPlusProcessor");
    private final ebe b;
    private final lvp c;
    private final ljf d;
    private final gzl e;
    private final gsf f;

    public hag(ebe ebeVar, lvp lvpVar, gsf gsfVar, ljf ljfVar, gzl gzlVar) {
        this.b = ebeVar;
        this.c = lvpVar;
        this.f = gsfVar;
        this.d = ljfVar;
        this.e = gzlVar;
    }

    private static void c(List list) {
        otj it = ((oom) list).iterator();
        while (it.hasNext()) {
            ((lmr) it.next()).close();
        }
    }

    @Override // defpackage.hea
    public final void a(List list, gox goxVar, gog gogVar, int i, lzv lzvVar, dzu dzuVar) {
        b(list, gogVar, i, lzvVar, dzuVar, null, oih.a, oih.a, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(List list, gog gogVar, int i, lzv lzvVar, dzu dzuVar, BurstSpec burstSpec, ojc ojcVar, ojc ojcVar2, int i2) {
        lng lngVar;
        edd eddVar;
        int i3 = ((orr) list).c;
        try {
            int iA = this.b.a(lzvVar);
            PostviewParams postviewParamsB = dzy.b(this.c, this.f);
            this.d.e("pckHdrZsl#startShot");
            try {
                try {
                    lngVar = null;
                    try {
                        edd eddVarF = this.b.f(iA, gogVar, postviewParamsB, ((dzt) dzuVar).g, lzvVar, i, true, i2, ojcVar);
                        this.d.f();
                        eddVar = eddVarF;
                    } catch (llv e) {
                        e = e;
                        ((oug) ((oug) ((oug) a.b()).h(e)).G(2227)).o("Unable to start PSL shot ");
                        this.d.f();
                        eddVar = lngVar;
                    }
                } catch (Throwable th) {
                    this.d.f();
                    throw th;
                }
            } catch (llv e2) {
                e = e2;
                lngVar = null;
            }
            if (eddVar == 0) {
                ((oug) ((oug) a.c()).G(2231)).o("Failed to initiate HDR+ shot capture.");
                throw new dlw("Invalid shot received from HdrPlusSession.");
            }
            if (burstSpec == null) {
                ((oug) ((oug) a.c()).G(2230)).o("Missing burst spec.");
                throw new dlw("Burst spec not provided.");
            }
            gzk gzkVarA = this.e.a(lngVar, gogVar);
            FrameRequestVector frameRequestVectorB = burstSpec.b();
            int iA2 = (int) frameRequestVectorB.a();
            this.b.t(eddVar, burstSpec);
            lzv lzvVar2 = lzvVar;
            int i4 = 0;
            int i5 = 0;
            while (i4 < ((orr) list).c) {
                int i6 = i4;
                int i7 = iA2;
                lzv lzvVarA = gzkVarA.a(eddVar, i5, iA2, (lmr) list.get(i4), ((long) i4) < frameRequestVectorB.a() ? frameRequestVectorB.b(i4).d() : 1, false, ojcVar2, lzvVar2);
                if (lzvVarA != null) {
                    i5++;
                    lzvVar2 = lzvVarA;
                }
                i4 = i6 + 1;
                iA2 = i7;
            }
            if (gzkVarA.b(eddVar, i5, iA2, lzvVar2, gogVar.b.k(), false)) {
                c(list);
                return;
            }
            int iA3 = eddVar.a();
            StringBuilder sb = new StringBuilder(59);
            sb.append("Error finishing the HDR+ payload, aborting shot ");
            sb.append(iA3);
            String string = sb.toString();
            ((oug) ((oug) a.b()).G(2229)).r("%s", string);
            this.b.o(eddVar);
            throw new dma(string);
        } catch (Throwable th2) {
            c(list);
            throw th2;
        }
    }
}
