package defpackage;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;

/* JADX INFO: loaded from: classes.dex */
public final class esg implements lie {
    public final InterleavedImageU8 a;
    public final ShotMetadata b;
    public final hgk c;
    public final int d;

    public esg(InterleavedImageU8 interleavedImageU8, int i, ShotMetadata shotMetadata) {
        this.a = interleavedImageU8;
        this.d = i;
        this.b = shotMetadata;
        hgj hgjVarA = hgk.a();
        hgjVarA.a = a(shotMetadata.k());
        hgjVarA.b = a(shotMetadata.j());
        this.c = hgjVarA.a();
    }

    private static ojc a(String str) {
        return oje.d(str) ? oih.a : mde.c(str);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.a.e();
    }
}
