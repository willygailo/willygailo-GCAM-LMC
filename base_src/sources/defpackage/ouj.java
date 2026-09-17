package defpackage;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class ouj extends oue {
    public static final oui b = new oui();

    public ouj(ovr ovrVar) {
        super(ovrVar);
    }

    @Deprecated
    public static ouj h(String str) {
        oxh.y(!str.isEmpty(), "injected class name is empty");
        return new ouj(owp.d(str.replace('/', '.')));
    }

    @Override // defpackage.oue
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final oug a(Level level) {
        boolean zF = f(level);
        owp.n(d(), level, zF);
        return !zF ? b : new ouh(this, level);
    }
}
