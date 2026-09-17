package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes2.dex */
final class os implements Runnable {
    final /* synthetic */ ot a;
    private final /* synthetic */ int b;

    public os(ot otVar, int i) {
        this.b = i;
        this.a = otVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ot otVar = this.a;
                otVar.d();
                View view = otVar.c;
                if (view.isEnabled() && !view.isLongClickable() && otVar.b()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    otVar.d = true;
                    break;
                }
                break;
            default:
                ViewParent parent = this.a.c.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
        }
    }
}
