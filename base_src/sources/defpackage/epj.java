package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.view.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class epj implements fik, fii, fig, fij, fgo, fgp {
    public static final ouj a = ouj.h("com/google/android/apps/camera/keycontrol/KeyController");
    public final fjs d;
    public int f;
    private final hvo g;
    private final olt h;
    private final lda i;
    private final lda j;
    private final lda k;
    private final lda l;
    private final lda m;
    private final lda n;
    private final ddf o;
    private final Executor p;
    private final afp q;
    private boolean r;
    public final Set b = obr.B();
    public final Set c = obr.B();
    public final Object e = new Object();
    private final BroadcastReceiver s = new eph(this);

    public epj(hvo hvoVar, Context context, olt oltVar, lda ldaVar, lda ldaVar2, lda ldaVar3, lda ldaVar4, lda ldaVar5, lda ldaVar6, ddf ddfVar, fjs fjsVar, Executor executor) {
        this.g = hvoVar;
        this.i = ldaVar;
        this.j = ldaVar2;
        this.k = ldaVar3;
        this.l = ldaVar4;
        this.m = ldaVar5;
        this.n = ldaVar6;
        this.o = ddfVar;
        this.h = oltVar;
        this.d = fjsVar;
        this.p = executor;
        this.q = afp.a(context);
    }

    private final boolean j(int i, boolean z) {
        epd epdVar = epd.SHUTTER;
        hvn hvnVar = hvn.SHUTTER;
        boolean z2 = false;
        switch ((hvn) this.g.fA()) {
            case SHUTTER:
                synchronized (this.e) {
                    Iterator it = this.b.iterator();
                    while (it.hasNext()) {
                        ((epi) it.next()).d(z);
                        z2 = true;
                    }
                    break;
                }
                return z2;
            case ZOOM:
                if (i != 25) {
                    synchronized (this.e) {
                        Iterator it2 = this.b.iterator();
                        while (it2.hasNext()) {
                            ((epi) it2.next()).e(z);
                        }
                        break;
                    }
                } else {
                    synchronized (this.e) {
                        Iterator it3 = this.b.iterator();
                        while (it3.hasNext()) {
                            ((epi) it3.next()).f(z);
                        }
                        break;
                    }
                }
                return true;
            case VOLUME:
                return false;
            case OFF:
                return true;
            default:
                return false;
        }
    }

    public final void a(epi epiVar) {
        this.p.execute(new epg(this, epiVar, 1));
    }

    public final void b(epi epiVar) {
        this.p.execute(new epg(this, epiVar, 0));
    }

    @Override // defpackage.fij
    public final void e() {
        this.q.c(this.s);
    }

    @Override // defpackage.fgo
    public final boolean f(int i, KeyEvent keyEvent) {
        if (i == 22) {
            h(true);
            return true;
        }
        ddf ddfVar = this.o;
        ddi ddiVar = ddl.a;
        ddfVar.b();
        if (this.f == 3) {
            return false;
        }
        if (keyEvent.getRepeatCount() == 0) {
            this.r = false;
        }
        if (this.f == 2 || this.r) {
            return true;
        }
        if (i == 24 || i == 25 || i == 27) {
            return j(i, true);
        }
        return false;
    }

    @Override // defpackage.fig
    public final void fV() {
        this.h.k((Integer) this.i.fA(), epd.SHUTTER);
        this.h.k((Integer) this.j.fA(), epd.ZOOM_IN);
        this.h.k((Integer) this.k.fA(), epd.ZOOM_OUT);
        this.h.k((Integer) this.l.fA(), epd.SWITCH_CAMERA);
        this.h.k((Integer) this.m.fA(), epd.NEXT_MODE);
        this.h.k((Integer) this.n.fA(), epd.PREV_MODE);
    }

    @Override // defpackage.fii
    public final void fW() {
        this.q.b(this.s, new IntentFilter("com.google.android.apps.camera.remotecontrol.remotekey"));
    }

    public final void g(int i) {
        this.f = i;
        this.r = (i == 2) | this.r;
    }

    public final void h(boolean z) {
        synchronized (this.e) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((epi) it.next()).a(z);
            }
        }
    }

    @Override // defpackage.fgp
    public final boolean i(int i) {
        if (i == 22) {
            h(false);
            return true;
        }
        ddf ddfVar = this.o;
        ddi ddiVar = ddl.a;
        ddfVar.b();
        int i2 = this.f;
        if (i2 == 3) {
            return false;
        }
        if (i2 == 2 || this.r) {
            return true;
        }
        if (i == 24 || i == 25 || i == 27) {
            return j(i, false);
        }
        return false;
    }
}
