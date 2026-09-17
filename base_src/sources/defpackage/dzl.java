package defpackage;

import com.google.googlex.gcam.ShotMetadata;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class dzl implements ebw {
    final /* synthetic */ gog a;
    final /* synthetic */ dzr b;

    public dzl(dzr dzrVar, gog gogVar) {
        this.b = dzrVar;
        this.a = gogVar;
    }

    private final void c(pjj pjjVar, ShotMetadata shotMetadata, List list) {
        eco ecoVarC = ((ecm) this.b.d.b()).b(this.a);
        ecoVarC.b(pjjVar, shotMetadata, list);
        ecoVarC.close();
    }

    @Override // defpackage.ebw
    public final void a(edd eddVar, pjj pjjVar, ShotMetadata shotMetadata) {
        this.b.j.b("Got RAW image from primary shot.");
        c(pjjVar, shotMetadata, eddVar.d);
    }

    @Override // defpackage.ebw
    public final void b(ebr ebrVar) {
        this.b.j.e("Error getting RAW image from primary shot.", ebrVar);
        c(null, null, oom.l());
    }
}
