package defpackage;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.ShotMetadata;

/* JADX INFO: loaded from: classes.dex */
final class gci implements ebq {
    final /* synthetic */ gfi a;
    final /* synthetic */ long b;
    final /* synthetic */ lzv c;
    final /* synthetic */ lwk d;
    final /* synthetic */ gex e;
    final /* synthetic */ gcl f;

    public gci(gcl gclVar, gfi gfiVar, long j, lzv lzvVar, lwk lwkVar, gex gexVar) {
        this.f = gclVar;
        this.a = gfiVar;
        this.b = j;
        this.c = lzvVar;
        this.d = lwkVar;
        this.e = gexVar;
    }

    @Override // defpackage.ebq
    public final void a(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        mad madVarB = this.f.d.b(new gcm(this.a.a, Long.valueOf(this.b), plk.V(this.c), this.a.b), hardwareBuffer, shotMetadata);
        this.d.l();
        this.e.c(madVarB);
    }
}
