package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public final class cjk extends mip {
    private static final ouj b = ouj.h("com/google/android/apps/camera/camcorder/camera2/CamcorderGlobalFrameListener");
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
    private final cju c;
    private final bod d;
    private final ojc g;
    private final boolean h;
    private final dha i;
    private final ggo j;
    private final koq k;
    private mip l;

    public cjk(cka ckaVar, bod bodVar, ggo ggoVar, bta btaVar, koq koqVar, boolean z, dha dhaVar, ddf ddfVar, byte[] bArr) {
        this.c = ckaVar.a();
        this.d = bodVar;
        this.j = ggoVar;
        this.g = btaVar.a.c() ? ojc.i(btaVar) : oih.a;
        this.k = koqVar;
        this.h = z;
        this.i = dhaVar;
        ddi ddiVar = ddl.a;
        ddfVar.b();
        ddfVar.b();
        ddfVar.b();
        ddfVar.b();
    }

    private final boolean w() {
        cjr cjrVar = (cjr) ((lce) this.c.f).d;
        return cjrVar == cjr.CAPTURE_SESSION_ACTIVE || cjrVar == cjr.RECORDING_SESSION_ACTIVE;
    }

    @Override // defpackage.mip
    public final void b(lzv lzvVar) {
        if (w()) {
            this.d.b(lzvVar);
            if (lzvVar.d(CaptureResult.CONTROL_AF_MODE) != null) {
                this.l.b(lzvVar);
            }
            if (this.g.g()) {
                ((bta) this.g.c()).a(lzvVar);
            }
            Rect rect = (Rect) lzvVar.d(CaptureResult.SCALER_CROP_REGION);
            if (rect != null) {
                this.c.c.fB(rect);
            }
            Long l = (Long) lzvVar.d(CaptureResult.SENSOR_TIMESTAMP);
            Long l2 = (Long) lzvVar.d(CaptureResult.SENSOR_FRAME_DURATION);
            if (l != null && l2 != null) {
                this.i.b(l.longValue(), l2.longValue());
            }
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((mip) it.next()).b(lzvVar);
            }
        }
    }

    public final void f(ckd ckdVar) {
        ggz ggzVar = new ggz(new nle(ckdVar.c.b.f()), null, null);
        this.l = ckdVar.q ? new bob(this.j, ggzVar, this.k, this.h, null) : new bof(this.j, ggzVar, this.k, this.h, null);
    }

    @Override // defpackage.mip
    public final void fv(lnx lnxVar, long j) {
        if (w()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((mip) it.next()).fv(lnxVar, j);
            }
        }
    }

    @Override // defpackage.mip
    public final void fw(lux luxVar) {
        if (w()) {
            ((oug) ((oug) b.b()).G((char) 446)).r("onCaptureFailed %s", luxVar);
        }
    }

    public final lie g(final mip mipVar) {
        this.a.add(mipVar);
        final byte[] bArr = null;
        final byte[] bArr2 = null;
        final byte[] bArr3 = null;
        return new lie(mipVar, bArr, bArr2, bArr3) { // from class: cjj
            public final /* synthetic */ mip b;

            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                cjk cjkVar = this.a;
                cjkVar.a.remove(this.b);
            }
        };
    }
}
