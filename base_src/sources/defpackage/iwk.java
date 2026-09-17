package defpackage;

import android.view.ViewPropertyAnimator;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.autotimer.ui.AutoTimerIndicatorView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class iwk extends iwj {
    final /* synthetic */ iwm a;

    public iwk(iwm iwmVar) {
        this.a = iwmVar;
    }

    @Override // defpackage.iwj
    public void b() {
    }

    @Override // defpackage.iwj, defpackage.ihs, defpackage.iht
    public final void f() {
        this.a.h.b(false);
        this.a.c.startAutoTimerCapturing();
        iwm iwmVar = this.a;
        iwmVar.j = iwmVar.b.r();
        this.a.b.l(false);
        this.a.b.v(false);
        this.a.d.K();
        this.a.e.d(false);
        this.a.f.l();
        jxn.c();
        bzg bzgVar = this.a.a;
        obr.aT(bzgVar.a.d == bzp.IDLE, "Cannot transition to CAPTURING from %s", bzgVar.a.d);
        bzgVar.d(bzp.CAPTURING);
        cae caeVar = bzgVar.c;
        AutoTimerIndicatorView autoTimerIndicatorView = caeVar.c;
        if (autoTimerIndicatorView != null) {
            ViewPropertyAnimator viewPropertyAnimator = autoTimerIndicatorView.f;
            if (viewPropertyAnimator != null) {
                obr.ao(viewPropertyAnimator);
                viewPropertyAnimator.cancel();
                autoTimerIndicatorView.f = null;
            }
            ViewPropertyAnimator listener = autoTimerIndicatorView.animate().setDuration(AutoTimerIndicatorView.a.toMillis()).alpha(1.0f).setListener(new cah(autoTimerIndicatorView));
            listener.start();
            autoTimerIndicatorView.f = listener;
            autoTimerIndicatorView.b(autoTimerIndicatorView.getLeft(), autoTimerIndicatorView.getTop(), autoTimerIndicatorView.getRight(), autoTimerIndicatorView.getBottom());
            autoTimerIndicatorView.addOnLayoutChangeListener(autoTimerIndicatorView.c);
            caeVar.d = true;
        }
        bzo bzoVar = bzgVar.b;
        bzoVar.f++;
        bzoVar.b.c();
        bzoVar.b.d();
        bzoVar.d.clear();
        bzoVar.c.clear();
        bzgVar.e.b(R.raw.video_start);
    }

    @Override // defpackage.iwj, defpackage.ihs, defpackage.iht
    public final void g() {
        bzg bzgVar = this.a.a;
        obr.aT(bzgVar.a.d == bzp.CAPTURING, "Cannot transition to IDLE from %s", bzgVar.a.d);
        bzgVar.d(bzp.IDLE);
        cae caeVar = bzgVar.c;
        AutoTimerIndicatorView autoTimerIndicatorView = caeVar.c;
        if (autoTimerIndicatorView != null) {
            ViewPropertyAnimator viewPropertyAnimator = autoTimerIndicatorView.f;
            if (viewPropertyAnimator != null) {
                obr.ao(viewPropertyAnimator);
                viewPropertyAnimator.cancel();
                autoTimerIndicatorView.f = null;
            }
            ViewPropertyAnimator listener = autoTimerIndicatorView.animate().setDuration(AutoTimerIndicatorView.a.toMillis()).alpha(0.0f).setListener(new cai(autoTimerIndicatorView));
            listener.start();
            autoTimerIndicatorView.f = listener;
            autoTimerIndicatorView.removeOnLayoutChangeListener(autoTimerIndicatorView.c);
            caeVar.d = false;
        }
        ojt ojtVar = bzgVar.b.b;
        if (ojtVar.a) {
            ojtVar.e();
        }
        if (bzgVar.b.f > 0) {
            bzn bznVar = bzgVar.d;
            poy poyVarM = pdm.h.m();
            String string = bznVar.b.a.toString();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pdm pdmVar = (pdm) poyVarM.b;
            string.getClass();
            int i = pdmVar.a | 1;
            pdmVar.a = i;
            pdmVar.b = string;
            bzo bzoVar = bznVar.b;
            int i2 = bzoVar.f;
            int i3 = i | 2;
            pdmVar.a = i3;
            pdmVar.c = i2;
            pdmVar.d = 0;
            pdmVar.a = i3 | 4;
            long jA = bzoVar.b.a(TimeUnit.MILLISECONDS);
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pdm pdmVar2 = (pdm) poyVarM.b;
            pdmVar2.a |= 8;
            pdmVar2.e = jA;
            int size = bznVar.b.d.size();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pdm pdmVar3 = (pdm) poyVarM.b;
            pdmVar3.a |= 16;
            pdmVar3.f = size;
            if (size > 1) {
                int i4 = size - 1;
                long jLongValue = (((Long) bznVar.b.d.get(i4)).longValue() - ((Long) bznVar.b.d.get(0)).longValue()) / ((long) i4);
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pdm pdmVar4 = (pdm) poyVarM.b;
                pdmVar4.a |= 32;
                pdmVar4.g = jLongValue;
            }
            bznVar.a.C((pdm) poyVarM.j());
        }
        bzgVar.e.b(R.raw.video_stop);
        this.a.c.stopAutoTimerCapturing();
        iwm iwmVar = this.a;
        iwmVar.b.l(iwmVar.j);
        iwm iwmVar2 = this.a;
        iwmVar2.b.v(iwmVar2.j);
        this.a.d.ab();
        this.a.e.d(true);
        this.a.f.j();
        jxn.d();
        if (((Boolean) ((lce) this.a.k.a).d).booleanValue() || (!this.a.h.f() && !this.a.i.k(ddl.br))) {
            this.a.h.g(false);
        }
        if (this.a.g.E() || !this.a.g.D(jrl.PHOTO)) {
            this.a.g.h();
        }
    }
}
