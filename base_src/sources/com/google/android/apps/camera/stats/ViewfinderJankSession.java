package com.google.android.apps.camera.stats;

import android.hardware.camera2.CaptureResult;
import android.os.SystemClock;
import com.google.android.apps.camera.stats.timing.TimingSession;
import defpackage.lzv;
import defpackage.mip;
import defpackage.pbo;
import defpackage.poy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ViewfinderJankSession implements TimingSession {
    public final Object a = new Object();
    public final List b = new ArrayList(30);
    public final List c = new ArrayList();
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    private pbo h;
    private Runnable i;

    public static final pbo c(lzv lzvVar, double d, double d2) {
        poy poyVarM = pbo.i.m();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pbo pboVar = (pbo) poyVarM.b;
        pboVar.a |= 1;
        pboVar.b = jElapsedRealtimeNanos;
        long jB = lzvVar.b();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pbo pboVar2 = (pbo) poyVarM.b;
        pboVar2.a |= 4;
        pboVar2.d = jB;
        Long l = (Long) lzvVar.d(CaptureResult.SENSOR_TIMESTAMP);
        Long l2 = (Long) lzvVar.d(CaptureResult.SENSOR_FRAME_DURATION);
        Long l3 = (Long) lzvVar.d(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            long jLongValue = l.longValue();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbo pboVar3 = (pbo) poyVarM.b;
            pboVar3.a |= 2;
            pboVar3.c = jLongValue;
        }
        if (l2 != null) {
            int iDY = mip.dY(l2.longValue());
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbo pboVar4 = (pbo) poyVarM.b;
            pboVar4.a |= 8;
            pboVar4.e = iDY;
        }
        if (l3 != null) {
            int iDY2 = mip.dY(l3.longValue());
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbo pboVar5 = (pbo) poyVarM.b;
            pboVar5.a |= 16;
            pboVar5.f = iDY2;
        }
        if (d > 0.0d) {
            int iDX = mip.dX(d);
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbo pboVar6 = (pbo) poyVarM.b;
            pboVar6.a |= 64;
            pboVar6.h = iDX;
        }
        if (d2 > 0.0d) {
            int iDX2 = mip.dX(d2);
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pbo pboVar7 = (pbo) poyVarM.b;
            pboVar7.a |= 32;
            pboVar7.g = iDX2;
        }
        return (pbo) poyVarM.j();
    }

    public final void a(pbo pboVar) {
        if (this.h == null) {
            this.h = pboVar;
        }
    }

    @Override // com.google.android.apps.camera.stats.timing.TimingSession
    public final void b(Runnable runnable) {
        this.i = runnable;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        Runnable runnable = this.i;
        if (runnable != null) {
            runnable.run();
        }
    }

    public int getDelay150PctCount() {
        return this.f;
    }

    public int getDelay500PctCount() {
        return this.g;
    }

    public int getDelay50PctCount() {
        return this.e;
    }
}
