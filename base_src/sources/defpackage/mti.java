package defpackage;

import android.media.MediaFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class mti implements mth {
    public final pih b = pih.f();
    private final msx c;

    public mti(msx msxVar) {
        this.c = msxVar;
    }

    @Override // defpackage.mth
    public final void a(mrv mrvVar) {
        this.c.b(mrvVar.b, mrvVar.c);
        mrvVar.close();
    }

    @Override // defpackage.mth
    public final void b(MediaFormat mediaFormat) {
        this.b.o(mediaFormat);
    }
}
