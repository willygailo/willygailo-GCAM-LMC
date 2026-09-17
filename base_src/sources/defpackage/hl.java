package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes2.dex */
final class hl implements Runnable {
    final /* synthetic */ hm a;

    public hl(hm hmVar) {
        this.a = hmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hm hmVar = this.a;
        if (hmVar.e) {
            if (hmVar.c) {
                hmVar.c = false;
                hk hkVar = hmVar.a;
                long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                hkVar.e = jCurrentAnimationTimeMillis;
                hkVar.g = -1L;
                hkVar.f = jCurrentAnimationTimeMillis;
                hkVar.h = 0.5f;
            }
            hk hkVar2 = this.a.a;
            if ((hkVar2.g > 0 && AnimationUtils.currentAnimationTimeMillis() > hkVar2.g + ((long) hkVar2.i)) || !this.a.b()) {
                this.a.e = false;
                return;
            }
            hm hmVar2 = this.a;
            if (hmVar2.d) {
                hmVar2.d = false;
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                hmVar2.b.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
            if (hkVar2.f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
            float fA = hkVar2.a(jCurrentAnimationTimeMillis2);
            long j = hkVar2.f;
            hkVar2.f = jCurrentAnimationTimeMillis2;
            this.a.f.scrollListBy((int) ((jCurrentAnimationTimeMillis2 - j) * (((-4.0f) * fA * fA) + (fA * 4.0f)) * hkVar2.d));
            gl.A(this.a.b, this);
        }
    }
}
