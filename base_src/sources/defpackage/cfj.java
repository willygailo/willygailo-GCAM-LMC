package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class cfj implements chz {
    private final cib a;
    private final pyn b;
    private final pyn c;

    public cfj(pyn pynVar, pyn pynVar2, cib cibVar) {
        this.a = cibVar;
        this.b = pynVar;
        this.c = pynVar2;
    }

    private final chz c() {
        return this.a.a() == jrl.VIDEO_INTENT ? (chz) this.b.get() : (chz) this.c.get();
    }

    @Override // defpackage.chz
    public final void a() {
        c().a();
    }

    @Override // defpackage.chz
    public final void b(Bitmap bitmap) {
        c().b(bitmap);
    }
}
