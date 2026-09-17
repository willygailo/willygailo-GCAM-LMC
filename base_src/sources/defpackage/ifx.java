package defpackage;

import android.content.Context;
import android.media.SoundPool;
import android.util.SparseArray;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ifx implements ifs, lie {
    public static final ouj a = ouj.h("com/google/android/apps/camera/soundplayer/SoundPlayerImpl");
    private final Context f;
    private final Executor g;
    private SoundPool h;
    private final lco i;
    private final qkg j;
    public final Collection e = ona.c(5);
    private final SoundPool.OnLoadCompleteListener k = new ifu(this);
    public final Object b = new Object();
    public final SparseArray c = new SparseArray();
    public boolean d = false;

    public ifx(Context context, lco lcoVar, qkg qkgVar, Executor executor) {
        this.f = context;
        this.i = lcoVar;
        this.j = qkgVar;
        this.g = executor;
    }

    @Override // defpackage.ifs
    public final pht a(int i) {
        synchronized (this.b) {
            if (this.d) {
                return plk.V(false);
            }
            ifw ifwVar = (ifw) this.c.get(i);
            if (ifwVar == null) {
                ifwVar = new ifw();
                ifwVar.a = i;
                this.c.put(i, ifwVar);
                ifwVar.b = f().load(this.f, i, 1);
            }
            return ifwVar.c;
        }
    }

    @Override // defpackage.ifs
    public final void b() {
        synchronized (this.b) {
            if (!this.d) {
                f().autoPause();
            }
        }
    }

    @Override // defpackage.ifs
    public final void c() {
        synchronized (this.b) {
            if (!this.d) {
                f().autoResume();
            }
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b) {
            if (this.d) {
                return;
            }
            this.d = true;
            if (this.h != null) {
                this.c.clear();
                SoundPool soundPool = this.h;
                obr.ao(soundPool);
                soundPool.autoPause();
                SoundPool soundPool2 = this.h;
                obr.ao(soundPool2);
                soundPool2.release();
                this.h = null;
            }
        }
    }

    @Override // defpackage.ifs
    public final void d() {
        synchronized (this.b) {
            if (!this.d) {
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    f().stop(((Integer) it.next()).intValue());
                }
            }
        }
    }

    @Override // defpackage.ifs
    public final void e(int i, float f) {
        int[] iArr = {-1};
        if (((Boolean) this.i.fA()).booleanValue()) {
            plk.af(a(i), new ifv(this, i, iArr, f), this.g);
        }
    }

    public final SoundPool f() {
        if (this.h == null && !this.d) {
            SoundPool soundPool = (SoundPool) this.j.get();
            this.h = soundPool;
            obr.ao(soundPool);
            soundPool.setOnLoadCompleteListener(this.k);
        }
        SoundPool soundPool2 = this.h;
        obr.ao(soundPool2);
        return soundPool2;
    }

    public final void g(int i) {
        synchronized (this.b) {
            if (this.d) {
                return;
            }
            ifw ifwVar = (ifw) this.c.get(i);
            if (ifwVar == null) {
                return;
            }
            this.c.remove(i);
            f().unload(ifwVar.b);
        }
    }
}
