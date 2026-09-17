package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class glz implements AutoCloseable {
    public final Set a;
    public final glw c;
    public final List b = new ArrayList();
    private final List d = new ArrayList();

    public glz(Set set, glw glwVar) {
        this.a = set;
        this.c = glwVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        plk.af(mip.bX(plk.R(this.b), plk.R(this.d), new gly(this)), new glx(this), pgr.INSTANCE);
    }
}
