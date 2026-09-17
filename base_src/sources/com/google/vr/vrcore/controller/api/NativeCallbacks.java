package com.google.vr.vrcore.controller.api;

import defpackage.pxn;
import defpackage.pxo;
import defpackage.pxp;
import defpackage.pxr;
import defpackage.pxs;
import defpackage.pxt;
import defpackage.pxv;
import defpackage.pxw;
import defpackage.pyb;
import defpackage.pyc;

/* JADX INFO: loaded from: classes.dex */
public final class NativeCallbacks implements ControllerServiceBridge.Callbacks {
    private final long a;
    private boolean b;

    public NativeCallbacks(long j) {
        this.a = j;
    }

    private native void handleAccelEvent(long j, int i, long j2, float f, float f2, float f3);

    private native void handleBatteryEvent(long j, int i, long j2, boolean z, int i2);

    private native void handleButtonEvent(long j, int i, long j2, int i2, boolean z);

    private native void handleControllerRecentered(long j, int i, long j2, float f, float f2, float f3, float f4);

    private native void handleGyroEvent(long j, int i, long j2, float f, float f2, float f3);

    private native void handleOrientationEvent(long j, int i, long j2, float f, float f2, float f3, float f4);

    private native void handlePositionEvent(long j, int i, long j2, float f, float f2, float f3);

    private native void handleServiceConnected(long j, int i);

    private native void handleServiceDisconnected(long j);

    private native void handleServiceFailed(long j);

    private native void handleServiceInitFailed(long j, int i);

    private native void handleServiceUnavailable(long j);

    private native void handleStateChanged(long j, int i, int i2);

    private native void handleTouchEvent(long j, int i, long j2, int i2, float f, float f2);

    private native void handleTrackingStatusEvent(long j, int i, long j2, int i2);

    private final void j(pxs pxsVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        while (true) {
            if (this.b) {
                i = 0;
                break;
            }
            int i7 = pxsVar.l;
            if (i6 >= i7) {
                i = 0;
                break;
            } else {
                if (i6 >= i7) {
                    throw new IndexOutOfBoundsException();
                }
                pxn pxnVar = pxsVar.m[i6];
                handleAccelEvent(this.a, pxnVar.e, pxnVar.d, pxnVar.a, pxnVar.b, pxnVar.c);
                i6++;
            }
        }
        while (true) {
            if (this.b) {
                i2 = 0;
                break;
            }
            int i8 = pxsVar.n;
            if (i >= i8) {
                i2 = 0;
                break;
            } else {
                if (i >= i8) {
                    throw new IndexOutOfBoundsException();
                }
                pxp pxpVar = pxsVar.o[i];
                handleButtonEvent(this.a, pxpVar.e, pxpVar.d, pxpVar.a, pxpVar.b);
                i++;
            }
        }
        while (true) {
            if (this.b) {
                i3 = 0;
                break;
            }
            int i9 = pxsVar.p;
            if (i2 >= i9) {
                i3 = 0;
                break;
            } else {
                if (i2 >= i9) {
                    throw new IndexOutOfBoundsException();
                }
                pxt pxtVar = pxsVar.q[i2];
                handleGyroEvent(this.a, pxtVar.e, pxtVar.d, pxtVar.a, pxtVar.b, pxtVar.c);
                i2++;
            }
        }
        while (!this.b && i3 < (i5 = pxsVar.r)) {
            if (i3 >= i5) {
                throw new IndexOutOfBoundsException();
            }
            pxv pxvVar = pxsVar.s[i3];
            handleOrientationEvent(this.a, pxvVar.e, pxvVar.d, pxvVar.a, pxvVar.b, pxvVar.c, pxvVar.f);
            i3++;
        }
        for (int i10 = 0; !this.b && i10 < (i4 = pxsVar.t); i10++) {
            if (i10 >= i4) {
                throw new IndexOutOfBoundsException();
            }
            pyb pybVar = pxsVar.u[i10];
            handleTouchEvent(this.a, pybVar.e, pybVar.d, pybVar.b, pybVar.c, pybVar.f);
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void a(pxs pxsVar) {
        if (!this.b) {
            j(pxsVar);
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void b(pxr pxrVar) {
        int i;
        if (this.b) {
            return;
        }
        j(pxrVar);
        int i2 = 0;
        for (int i3 = 0; !this.b && i3 < (i = pxrVar.c); i3++) {
            if (i3 >= i) {
                throw new IndexOutOfBoundsException();
            }
            pxw pxwVar = pxrVar.d[i3];
            handlePositionEvent(this.a, pxwVar.e, pxwVar.d, pxwVar.a, pxwVar.b, pxwVar.c);
        }
        while (!this.b) {
            int i4 = pxrVar.h;
            if (i2 >= i4) {
                if (!pxrVar.e) {
                    break;
                }
                pxo pxoVar = pxrVar.f;
                handleBatteryEvent(this.a, pxoVar.e, pxoVar.d, pxoVar.b, pxoVar.a);
                break;
            }
            if (i2 >= i4) {
                throw new IndexOutOfBoundsException();
            }
            pyc pycVar = pxrVar.i[i2];
            handleTrackingStatusEvent(this.a, pycVar.e, pycVar.d, pycVar.a);
            i2++;
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void c(pxv pxvVar) {
        if (!this.b) {
            handleControllerRecentered(this.a, pxvVar.e, pxvVar.d, pxvVar.a, pxvVar.b, pxvVar.c, pxvVar.f);
        }
    }

    public synchronized void close() {
        this.b = true;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void d(int i, int i2) {
        if (!this.b) {
            handleStateChanged(this.a, i, i2);
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void e() {
        if (!this.b) {
            handleServiceDisconnected(this.a);
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void f() {
        if (!this.b) {
            handleServiceFailed(this.a);
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void g(int i) {
        if (!this.b) {
            handleServiceInitFailed(this.a, i);
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void h() {
        if (!this.b) {
            handleServiceUnavailable(this.a);
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerServiceBridge.Callbacks
    public final synchronized void i() {
        if (!this.b) {
            handleServiceConnected(this.a, 1);
        }
    }
}
