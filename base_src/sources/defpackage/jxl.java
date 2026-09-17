package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
final class jxl extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ jxn a;

    public jxl(jxn jxnVar) {
        this.a = jxnVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.a.f.b();
        jxn jxnVar = this.a;
        jxd jxdVar = (jxd) ((orq) jxnVar.g).c.get(((lce) jxnVar.h).d);
        if (jxdVar != null) {
            if (this.a.j.k(ddl.bn)) {
                if (jxdVar == jxd.SWITCH_CAMERA && !jxn.b) {
                    return true;
                }
                jqv jqvVar = this.a.u;
                switch (jxdVar) {
                    case ZOOM:
                        kbi kbiVar = (kbi) jqvVar.a;
                        if (kbiVar.T.g()) {
                            ((iaz) kbiVar.T.c()).b();
                        } else {
                            if (!kbiVar.c.k(ddl.V)) {
                                kbiVar.h();
                            }
                            kbiVar.z.d();
                        }
                        return false;
                    case SWITCH_CAMERA:
                        jqvVar.b.switchCamera();
                        return false;
                    case NONE:
                        return false;
                    default:
                        String strValueOf = String.valueOf(jxdVar);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 33);
                        sb.append("Invalid double tap action option ");
                        sb.append(strValueOf);
                        throw new IllegalStateException(sb.toString());
                }
            }
            ddf ddfVar = this.a.j;
            ddg ddgVar = dds.a;
            ddfVar.f();
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        jqs jqsVar = this.a.t;
        if (Math.abs(f) > Math.abs(f2)) {
            jqsVar.a.c(f);
            return false;
        }
        jqsVar.a.c(f2);
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        jxn jxnVar = this.a;
        jxnVar.l = true;
        jxnVar.f.b();
        jxn jxnVar2 = this.a;
        jxnVar2.e.c(jxnVar2.a(motionEvent));
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.a.e.g();
        jxn jxnVar = this.a;
        int i = jxnVar.q;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                if (jxnVar.o > 0) {
                    return false;
                }
                float f3 = jxnVar.m + f;
                jxnVar.m = f3;
                jxnVar.n += f2;
                if (jxn.e(f3)) {
                    jxn jxnVar2 = this.a;
                    jxnVar2.r.a(jxnVar2.m);
                    this.a.q = 2;
                    return true;
                }
                if (!jxn.e(this.a.n)) {
                    return false;
                }
                jxn jxnVar3 = this.a;
                jxnVar3.s.a(jxnVar3.n);
                this.a.q = 3;
                return true;
            case 1:
                jxnVar.r.a(f);
                return true;
            case 2:
                jxnVar.s.a(f2);
                return true;
            default:
                throw new IllegalStateException("Unknown scrolling state");
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        jxn jxnVar = this.a;
        jxnVar.f.a(jxnVar.a(motionEvent));
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        jxn jxnVar = this.a;
        jxnVar.f.e(jxnVar.a(motionEvent));
        return false;
    }
}
