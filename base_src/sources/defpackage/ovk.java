package defpackage;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class ovk extends ovi {
    public ovk(ovr ovrVar) {
        super(ovrVar);
    }

    public static ovk h(String str) {
        return new ovk(owp.d(str));
    }

    public static ovk i() {
        return new ovk(owp.d(owp.g().b(ovk.class)));
    }

    @Override // defpackage.oue
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final ovg a(Level level) {
        boolean zF = f(level);
        owp.n(d(), level, zF);
        return !zF ? b : new ovj(this, level);
    }
}
