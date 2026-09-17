package defpackage;

import com.google.googlex.gcam.BurstSpec;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class eaw implements eav {
    private final Set a;
    private final ljf b;

    public eaw(Set set, ljf ljfVar) {
        set.size();
        this.a = set;
        this.b = ljfVar;
    }

    @Override // defpackage.eav
    public final void d(hsp hspVar) {
        for (eav eavVar : this.a) {
            ljf ljfVar = this.b;
            String strValueOf = String.valueOf(eavVar.getClass().getName());
            ljfVar.e(strValueOf.length() != 0 ? "abort#".concat(strValueOf) : new String("abort#"));
            eavVar.d(hspVar);
            this.b.f();
        }
    }

    @Override // defpackage.eav
    public final void e(edd eddVar, lmr lmrVar) {
        for (eav eavVar : this.a) {
            ljf ljfVar = this.b;
            String strValueOf = String.valueOf(eavVar.getClass().getName());
            ljfVar.e(strValueOf.length() != 0 ? "addPayload#".concat(strValueOf) : new String("addPayload#"));
            lmr lmrVarA = lmrVar.a();
            if (lmrVarA != null) {
                eavVar.e(eddVar, lmrVarA);
            }
            this.b.f();
        }
    }

    @Override // defpackage.eav
    public final void f(edd eddVar, BurstSpec burstSpec, lzv lzvVar) {
        for (eav eavVar : this.a) {
            ljf ljfVar = this.b;
            String strValueOf = String.valueOf(eavVar.getClass().getName());
            ljfVar.e(strValueOf.length() != 0 ? "begin#".concat(strValueOf) : new String("begin#"));
            eavVar.f(eddVar, burstSpec, lzvVar);
            this.b.f();
        }
    }

    @Override // defpackage.eav
    public final void g(hsp hspVar) {
        for (eav eavVar : this.a) {
            ljf ljfVar = this.b;
            String strValueOf = String.valueOf(eavVar.getClass().getName());
            ljfVar.e(strValueOf.length() != 0 ? "start#".concat(strValueOf) : new String("start#"));
            eavVar.g(hspVar);
            this.b.f();
        }
    }

    @Override // defpackage.eav
    public final void h(edd eddVar) {
        for (eav eavVar : this.a) {
            ljf ljfVar = this.b;
            String strValueOf = String.valueOf(eavVar.getClass().getName());
            ljfVar.e(strValueOf.length() != 0 ? "endPayload#".concat(strValueOf) : new String("endPayload#"));
            eavVar.h(eddVar);
            this.b.f();
        }
    }

    @Override // defpackage.eav
    public final void i(edd eddVar) {
        for (eav eavVar : this.a) {
            ljf ljfVar = this.b;
            String strValueOf = String.valueOf(eavVar.getClass().getName());
            ljfVar.e(strValueOf.length() != 0 ? "endZslPayload#".concat(strValueOf) : new String("endZslPayload#"));
            eavVar.i(eddVar);
            this.b.f();
        }
    }
}
