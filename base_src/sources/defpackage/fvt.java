package defpackage;

import java.lang.ref.WeakReference;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes.dex */
public final class fvt implements fvv, fvy {
    private static final ouj a = ouj.h("com/google/android/apps/camera/modemanager/ModeManagerImpl");
    private static final EnumSet b = EnumSet.of(jrl.IMAX, jrl.LENS, jrl.LONG_EXPOSURE, jrl.PORTRAIT, jrl.REWIND, jrl.MOTION_BLUR, jrl.SLOW_MOTION, jrl.TIME_LAPSE, jrl.VIDEO);
    private WeakReference c = new WeakReference(null);

    @Override // defpackage.fvy
    public final void a(jfn jfnVar) {
        synchronized (this) {
            this.c = new WeakReference(jfnVar);
        }
    }

    @Override // defpackage.fvv
    public final boolean b(jrl jrlVar) {
        jfn jfnVar;
        obr.aG(b.contains(jrlVar), "switchToMode %s is not supported; see JavaDoc comments");
        synchronized (this) {
            jfnVar = (jfn) this.c.get();
        }
        if (jfnVar != null) {
            return jfnVar.t(jrlVar);
        }
        ((oug) ((oug) a.c()).G((char) 1969)).r("switchToMode has no ModeSwitchController, so NOT switching to %s", jrlVar);
        return false;
    }
}
