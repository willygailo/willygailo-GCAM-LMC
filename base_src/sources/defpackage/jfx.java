package defpackage;

import android.util.AndroidRuntimeException;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;

/* JADX INFO: loaded from: classes2.dex */
public final class jfx extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    public long b;
    public final /* synthetic */ ModeSwitcher c;
    public jrl a = jrl.UNINITIALIZED;
    private acv d = new acv(new hle(0.0f), null);

    public jfx(ModeSwitcher modeSwitcher) {
        this.c = modeSwitcher;
    }

    public final void a(boolean z) {
        ouj oujVar = ModeSwitcher.a;
        jfy jfyVar = this.c.b;
        if (jfyVar != null) {
            jgk jgkVar = (jgk) jfyVar;
            if (jgkVar.d.k == jrl.MORE_MODES) {
                jgkVar.e.setEnabled(!z);
            } else {
                jgkVar.f.H(!z);
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a = this.c.k;
        this.b = motionEvent.getEventTime();
        a(true);
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        final int i;
        float f3;
        ouj oujVar = ModeSwitcher.a;
        acv acvVar = this.d;
        if (!acvVar.c().a()) {
            throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        }
        if (acvVar.m) {
            acvVar.i();
        }
        float scrollX = this.c.getScrollX();
        float fA = -f;
        long eventTime = motionEvent2.getEventTime();
        this.c.j.c();
        this.c.j.b();
        this.c.j.a();
        if (Math.abs(fA) > 15000.0f) {
            i = 4;
            f3 = 0.1f;
        } else {
            obr.aK(true, "absMaxVelocity %s must be non-negative", Float.valueOf(1300.0f));
            fA = ModeSwitcher.a(fA, -1300.0f, 1300.0f);
            i = 5;
            f3 = 15.0f;
        }
        if (eventTime - this.b >= 500) {
            i = 6;
        }
        float width = this.c.c.getWidth();
        float width2 = this.c.getWidth();
        float f4 = width - width2;
        if (f4 < 0.0f) {
            ((oug) ((oug) ModeSwitcher.a.c()).G(3327)).I(width, width2);
            f4 = 0.0f;
        }
        acv acvVar2 = new acv(new hle(ModeSwitcher.a(scrollX, 0.0f, f4)), null);
        acvVar2.o = 0.0f;
        acvVar2.n = f4;
        acvVar2.q.a = f3 * (-4.2f);
        acvVar2.h = fA;
        jfw jfwVar = new jfw(this);
        if (acvVar2.m) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!acvVar2.p.contains(jfwVar)) {
            acvVar2.p.add(jfwVar);
        }
        acvVar2.g(new acr() { // from class: jfv
            @Override // defpackage.acr
            public final void a() {
                jfx jfxVar = this.a;
                int i2 = i;
                jrl jrlVarB = jfxVar.c.b();
                if (jfxVar.c.h != null && jfxVar.a != jrl.UNINITIALIZED) {
                    jfxVar.c.h.aa(i2, jfxVar.a.toString(), jrlVarB.toString());
                }
                jfxVar.a = jrl.UNINITIALIZED;
                jfxVar.b = 0L;
                jfxVar.c.h(jrlVarB);
                jfxVar.a(false);
            }
        });
        this.d = acvVar2;
        acvVar2.e();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ouj oujVar = ModeSwitcher.a;
        jrl jrlVarB = this.c.b();
        ModeSwitcher modeSwitcher = this.c;
        if (modeSwitcher.k == jrlVarB) {
            return false;
        }
        modeSwitcher.k = jrlVarB;
        jty.e(modeSwitcher);
        modeSwitcher.c.d(jrlVarB);
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ouj oujVar = ModeSwitcher.a;
        ModeSwitcher modeSwitcher = this.c;
        if (!modeSwitcher.f || modeSwitcher.d.onTouchEvent(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        }
        jrl jrlVarB = this.c.b();
        this.c.getScrollX();
        this.c.getScrollY();
        if (this.c.h != null && this.a != jrl.UNINITIALIZED) {
            this.c.h.aa(6, this.a.toString(), jrlVarB.toString());
        }
        this.c.h(jrlVarB);
        this.a = jrl.UNINITIALIZED;
        this.b = 0L;
        a(false);
        return true;
    }
}
