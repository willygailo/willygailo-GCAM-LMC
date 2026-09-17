package defpackage;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;

/* JADX INFO: loaded from: classes.dex */
final class dzm implements ebx {
    final /* synthetic */ ecp a;
    final /* synthetic */ dzu b;
    final /* synthetic */ dzr c;

    public dzm(dzr dzrVar, ecp ecpVar, dzu dzuVar) {
        this.c = dzrVar;
        this.a = ecpVar;
        this.b = dzuVar;
    }

    @Override // defpackage.ebx
    public final void a(InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata) {
        this.c.i.e("RgbCallback");
        ecp ecpVar = this.a;
        ecpVar.a = interleavedImageU8;
        ecpVar.d = shotMetadata;
        this.c.b(this.b, ecpVar.a());
        this.c.i.f();
    }
}
