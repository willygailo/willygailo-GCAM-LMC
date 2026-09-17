package defpackage;

import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvImage;

/* JADX INFO: loaded from: classes.dex */
final class gcj implements ebz {
    final /* synthetic */ gfi a;
    final /* synthetic */ long b;
    final /* synthetic */ lzv c;
    final /* synthetic */ mad d;
    final /* synthetic */ lwk e;
    final /* synthetic */ gex f;
    final /* synthetic */ gcl g;

    public gcj(gcl gclVar, gfi gfiVar, long j, lzv lzvVar, mad madVar, lwk lwkVar, gex gexVar) {
        this.g = gclVar;
        this.a = gfiVar;
        this.b = j;
        this.c = lzvVar;
        this.d = madVar;
        this.e = lwkVar;
        this.f = gexVar;
    }

    @Override // defpackage.ebz
    public final void a(YuvImage yuvImage, ShotMetadata shotMetadata) {
        mad madVarA = this.g.d.a(new gcm(this.a.a, Long.valueOf(this.b), plk.V(this.c), this.a.b), yuvImage, this.d, shotMetadata);
        this.e.l();
        this.f.c(madVarA);
    }
}
