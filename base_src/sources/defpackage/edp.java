package defpackage;

import com.google.googlex.gcam.ShotMetadata;

/* JADX INFO: loaded from: classes.dex */
final class edp implements gjt {
    final /* synthetic */ int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ShotMetadata c;
    final /* synthetic */ int d;
    final /* synthetic */ hsa e;
    final /* synthetic */ edu f;
    final /* synthetic */ msq g;

    public edp(edu eduVar, msq msqVar, int i, boolean z, ShotMetadata shotMetadata, int i2, hsa hsaVar, byte[] bArr) {
        this.f = eduVar;
        this.g = msqVar;
        this.a = i;
        this.b = z;
        this.c = shotMetadata;
        this.d = i2;
        this.e = hsaVar;
    }

    @Override // defpackage.gjt
    public final pht a() {
        pih pihVarF = pih.f();
        edu eduVar = this.f;
        eduVar.d.execute(new eds(eduVar, this.g, pihVarF, this.a, this.b, this.c, this.d, this.e.m(), null));
        return pihVarF;
    }

    @Override // defpackage.gjt
    public final pht b() {
        return plk.U(new llv("RGB image couldn't be encoded into jpeg."));
    }
}
