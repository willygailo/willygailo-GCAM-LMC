package defpackage;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class bam implements bad {
    private final bct a;

    public bam(bct bctVar) {
        this.a = bctVar;
    }

    @Override // defpackage.bad
    public final /* bridge */ /* synthetic */ bae a(Object obj) {
        return new ban((InputStream) obj, this.a);
    }

    @Override // defpackage.bad
    public final Class b() {
        return InputStream.class;
    }
}
