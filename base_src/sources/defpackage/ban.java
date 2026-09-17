package defpackage;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ban implements bae {
    public final bht a;

    public ban(InputStream inputStream, bct bctVar) {
        bht bhtVar = new bht(inputStream, bctVar);
        this.a = bhtVar;
        bhtVar.mark(5242880);
    }

    @Override // defpackage.bae
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.bae
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InputStream a() {
        this.a.reset();
        return this.a;
    }
}
