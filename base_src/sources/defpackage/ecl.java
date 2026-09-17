package defpackage;

import com.google.googlex.gcam.Gcam;

/* JADX INFO: loaded from: classes.dex */
public final class ecl implements pys {
    private final qkg a;

    public ecl(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static ecl b(qkg qkgVar) {
        return new ecl(qkgVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ecj get() {
        return new ecj((Gcam) this.a.get());
    }
}
