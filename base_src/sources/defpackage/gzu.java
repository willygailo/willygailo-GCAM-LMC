package defpackage;

import android.hardware.camera2.CaptureRequest;
import com.google.googlex.gcam.FrameRequest;
import com.google.googlex.gcam.FrameRequestVector;
import com.google.googlex.gcam.GcamModuleJNI;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gzu {
    public static final /* synthetic */ int a = 0;
    private static final Byte b;
    private static final Byte c;
    private final ddf d;
    private final pkr e;
    private final boolean f;

    static {
        Byte b2 = (byte) 0;
        b = b2;
        c = Byte.valueOf(kdc.r != null ? (byte) 3 : b2.byteValue());
    }

    public gzu(ddf ddfVar, pkr pkrVar, lvp lvpVar) {
        this.d = ddfVar;
        this.e = pkrVar;
        this.f = lvpVar.k() == lwd.FRONT;
    }

    final int a() {
        if (this.d.k(ddm.X)) {
            return 1;
        }
        return (!this.d.k(ddl.an) || this.f) ? 0 : 2;
    }

    public final List b(lpc lpcVar, FrameRequestVector frameRequestVector, lzv lzvVar, int i) {
        obr.aQ(frameRequestVector.a() >= ((long) i));
        obr.aQ(frameRequestVector.a() > 0);
        FrameRequest frameRequestB = frameRequestVector.b(0);
        float fC = frameRequestB.c();
        float fA = frameRequestB.a();
        float fB = frameRequestB.b();
        gzs gzsVar = new gzs(lpcVar);
        this.e.u(frameRequestB, lzvVar, gzsVar);
        lpc lpcVarA = lpc.a(lpcVar);
        ArrayList arrayList = new ArrayList(i);
        arrayList.add(new hcc(lpcVarA.b(), frameRequestVector.b(0)));
        int i2 = 1;
        while (i2 < i) {
            FrameRequest frameRequestB2 = frameRequestVector.b(i2);
            float fC2 = frameRequestB2.c();
            float fA2 = frameRequestB2.a();
            float fB2 = frameRequestB2.b();
            if (fC2 != fC || fA2 != fA || fB2 != fB) {
                this.e.u(frameRequestB2, lzvVar, gzsVar);
                fC = fC2;
                fA = fA2;
                fB = fB2;
            }
            arrayList.add(new hcc(lpc.a(lpcVar).b(), new FrameRequest(GcamModuleJNI.new_FrameRequest__SWIG_1(frameRequestB2.a, frameRequestB2), true)));
            i2++;
            gzsVar = gzsVar;
        }
        return arrayList;
    }

    public final void c(lpc lpcVar, goe goeVar, lqd lqdVar, int i, int i2, boolean z) {
        lpcVar.f(lqdVar);
        goeVar.e(i + i2);
        lpcVar.g(new gzt(goeVar));
        lpcVar.d(CaptureRequest.CONTROL_CAPTURE_INTENT, 0);
        if (kcy.a != null) {
            lpcVar.d(kcy.a, Integer.valueOf(a()));
        }
        if (!z) {
            enl.x(this.d, lpcVar);
        }
        if (kdb.p != null) {
            lpcVar.d(kdb.p, 0);
        }
        if (!z || kdc.r == null) {
            return;
        }
        lpcVar.d(kdc.r, c);
    }
}
