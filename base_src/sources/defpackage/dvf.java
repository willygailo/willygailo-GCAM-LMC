package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class dvf implements juk {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ AtomicBoolean b;
    final /* synthetic */ long c;

    public dvf(AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, long j) {
        this.a = atomicBoolean;
        this.b = atomicBoolean2;
        this.c = j;
    }

    @Override // defpackage.juk
    public final boolean a(osg osgVar) {
        if (!this.a.get()) {
            return true;
        }
        oqv oqvVarL = osgVar.l();
        oqvVarL.getClass();
        oqv oqvVarG = osgVar.g();
        oqvVarG.getClass();
        return this.b.get() && ((Long) oqvVarL.b()).longValue() - ((Long) oqvVarG.b()).longValue() > this.c;
    }
}
