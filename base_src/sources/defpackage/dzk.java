package defpackage;

import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvImage;

/* JADX INFO: loaded from: classes.dex */
final class dzk implements ebz {
    final /* synthetic */ ecp a;
    final /* synthetic */ dzu b;
    final /* synthetic */ dzr c;

    public dzk(dzr dzrVar, ecp ecpVar, dzu dzuVar) {
        this.c = dzrVar;
        this.a = ecpVar;
        this.b = dzuVar;
    }

    @Override // defpackage.ebz
    public final void a(YuvImage yuvImage, ShotMetadata shotMetadata) {
        this.c.i.e("YuvCallback");
        Long l = this.a.e;
        if (l == null) {
            throw new IllegalStateException("Property \"timestampNs\" has not been set");
        }
        edo edoVar = new edo(yuvImage, l.longValue());
        ecp ecpVar = this.a;
        ecpVar.b = edoVar;
        ecpVar.d = shotMetadata;
        this.c.b(this.b, ecpVar.a());
        this.c.i.f();
    }
}
