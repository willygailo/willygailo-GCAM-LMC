package defpackage;

import android.media.MediaFormat;

/* JADX INFO: loaded from: classes.dex */
public final class fsz implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public fsz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public static fsz b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new fsz(qkgVar, qkgVar2, qkgVar3);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final MediaFormat get() {
        ddf ddfVar = (ddf) this.a.get();
        ((ftf) this.b).get();
        lig ligVar = (lig) this.c.get();
        boolean zK = ddfVar.k(ddl.N);
        ddi ddiVar = ddr.a;
        ddfVar.d();
        MediaFormat mediaFormatG = fvq.g(ligVar, 12000000, 0.23333333f, zK, ddfVar.k(ddr.t));
        qmd.ae(mediaFormatG);
        return mediaFormatG;
    }
}
