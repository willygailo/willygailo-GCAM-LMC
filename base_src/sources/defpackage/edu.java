package defpackage;

import com.google.googlex.gcam.ShotMetadata;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class edu {
    public static final ouj a = ouj.h("com/google/android/apps/camera/hdrplus/burst/BurstUtils");
    public final jtx b;
    public final fix c;
    public final hoh e;
    public final efh f;
    public final ddf g;
    public final hnr h;
    public final ghx i;
    private final gjw j = new gjw(1);
    public final Executor d = new lax(mip.bM("BurstEnc"));

    public edu(jtx jtxVar, fix fixVar, ghx ghxVar, hnr hnrVar, hoh hohVar, efh efhVar, ddf ddfVar) {
        this.b = jtxVar;
        this.c = fixVar;
        this.i = ghxVar;
        this.h = hnrVar;
        this.f = efhVar;
        this.g = ddfVar;
        this.e = hohVar;
    }

    public final pht a(msq msqVar, hgk hgkVar, int i, int i2, boolean z, edt edtVar, hsa hsaVar, UUID uuid, ShotMetadata shotMetadata, ojc ojcVar) {
        pih pihVarF = pih.f();
        plk.af(this.j.a(new edp(this, msqVar, i2, z, shotMetadata, i, hsaVar, null)), new edr(this, i, edtVar, hgkVar, hsaVar, uuid, ojcVar, pihVarF), pgr.INSTANCE);
        return pihVarF;
    }
}
