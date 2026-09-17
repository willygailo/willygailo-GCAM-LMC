package defpackage;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public abstract class buf implements lie {
    private static final ouj b = ouj.h("com/google/android/apps/camera/app/interfaces/ModuleController");
    public boolean a;
    private boolean c;

    public ojc b() {
        return oih.a;
    }

    public String c() {
        return null;
    }

    public void d(awl awlVar) {
    }

    public void e(Configuration configuration) {
    }

    public ojc fQ() {
        return oih.a;
    }

    public void gc(int i) {
    }

    public void gd(boolean z) {
    }

    public void ge() {
    }

    protected abstract void gf();

    public final void gg() {
        lar.a();
        if (!this.a) {
            ((oug) ((oug) b.c()).G('e')).o("Module is already stopped; skipping pause.");
        } else if (!this.c) {
            ((oug) ((oug) b.c()).G('d')).o("Duplicate call to pauseModule; skipping pause.");
        } else {
            this.c = false;
            gf();
        }
    }

    protected abstract void k();

    public final void l() {
        lar.a();
        obr.aR(this.a, "Cannot resume a stopped module");
        if (this.c) {
            ((oug) ((oug) b.c()).G('f')).o("Duplicate call to resumeModule; skipping resume.");
        } else {
            this.c = true;
            k();
        }
    }

    protected abstract void m();

    public final void n() {
        lar.a();
        if (this.c) {
            ((oug) ((oug) b.c()).G('h')).o("Module is already resumed; skipping start.");
        } else if (this.a) {
            ((oug) ((oug) b.c()).G('g')).o("Duplicate call to startModule; skipping start.");
        } else {
            this.a = true;
            m();
        }
    }

    protected abstract void o();

    public final void p() {
        lar.a();
        if (this.c) {
            ((oug) ((oug) b.c()).G('j')).o("Attempting to stop a resumed module!");
            gg();
        }
        if (!this.a) {
            ((oug) ((oug) b.c()).G('i')).o("Duplicate call to stopModule; skipping stop.");
        } else {
            this.a = false;
            o();
        }
    }

    public boolean q() {
        return false;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return true;
    }
}
