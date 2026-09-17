package defpackage;

import com.google.googlex.gcam.InterleavedImageU16;

/* JADX INFO: loaded from: classes.dex */
final class dzp implements ebu {
    final /* synthetic */ pih a;
    final /* synthetic */ dzr b;

    public dzp(dzr dzrVar, pih pihVar) {
        this.b = dzrVar;
        this.a = pihVar;
    }

    @Override // defpackage.ebu
    public final void a(InterleavedImageU16 interleavedImageU16) {
        this.b.i.e("MergedPdCallback");
        this.a.o(interleavedImageU16);
        this.b.i.f();
    }

    @Override // defpackage.ebu
    public final void b(ebr ebrVar) {
        this.a.a(new llv("Error merging PD data", ebrVar));
    }
}
