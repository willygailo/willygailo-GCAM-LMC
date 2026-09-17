package defpackage;

import android.preference.PreferenceManager;
import com.google.android.apps.camera.legacy.lightcycle.storage.LocalSessionStorage;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class fek extends Thread {
    final /* synthetic */ LocalSessionStorage a;
    final /* synthetic */ fyg b;

    public fek(LocalSessionStorage localSessionStorage, fyg fygVar) {
        this.a = localSessionStorage;
        this.b = fygVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (!new File(this.a.e).exists()) {
            ((oug) ((oug) fel.a.b()).G((char) 1668)).o("The storage directory does not exist.");
        }
        fyg fygVar = this.b;
        fyr fyrVar = fygVar.b;
        if (!fyrVar.G) {
            fdy fdyVar = new fdy(fygVar.a, fyrVar.u, fyrVar.C, fyrVar.S);
            fdyVar.c(new fyf(fygVar, fygVar.b.m.e, fdyVar));
            fygVar.b.c.b(fdyVar);
        } else {
            float fA = fcz.a(fygVar.a.e);
            if (fA > 0.0f) {
                PreferenceManager.getDefaultSharedPreferences(fygVar.b.s.s()).edit().putFloat("photoSphereCalibratedFieldOfView", fA).apply();
            }
        }
    }
}
