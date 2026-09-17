package defpackage;

import com.google.googlex.gcam.ShotMetadata;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class hed implements ebw {
    final /* synthetic */ gog a;
    final /* synthetic */ hef b;

    public hed(hef hefVar, gog gogVar) {
        this.b = hefVar;
        this.a = gogVar;
    }

    private final void c(pjj pjjVar, ShotMetadata shotMetadata, List list) {
        eco ecoVarC = ((ecm) this.b.b.c()).b(this.a);
        ecoVarC.d(pjjVar, shotMetadata, list);
        ecoVarC.close();
    }

    @Override // defpackage.ebw
    public final void a(edd eddVar, pjj pjjVar, ShotMetadata shotMetadata) {
        eddVar.a();
        c(pjjVar, shotMetadata, eddVar.d);
    }

    @Override // defpackage.ebw
    public final void b(ebr ebrVar) {
        ((oug) ((oug) hef.a.c()).G((char) 2390)).r("Error getting RAW image from secondary shot: %s", ebrVar.getMessage());
        c(null, null, oom.l());
    }
}
