package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.DebugParams;
import com.google.googlex.gcam.ShotMetadata;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class hdu implements eav, ebn, ebo, eby {
    private static final ouj e = ouj.h("com/google/android/apps/camera/pixelcamerakit/payloadprocessor/DynamicDepthProcessor");
    protected final DynamicDepthUtils a;
    protected final hvj b;
    protected final dzv c;
    protected final ljf d;
    private final dkq f;
    private final hcg g;
    private final brg h;
    private final lig i;
    private final Executor j;
    private final HashMap k = new HashMap();
    private final nvb l;

    public hdu(dkq dkqVar, DynamicDepthUtils dynamicDepthUtils, hcg hcgVar, dzv dzvVar, brg brgVar, gsf gsfVar, hvj hvjVar, Executor executor, ljf ljfVar, nvb nvbVar, byte[] bArr, byte[] bArr2) {
        this.f = dkqVar;
        this.a = dynamicDepthUtils;
        this.g = hcgVar;
        this.c = dzvVar;
        this.h = brgVar;
        this.i = gsfVar.b;
        this.b = hvjVar;
        this.j = executor;
        this.d = ljfVar;
        this.l = nvbVar;
    }

    private final void l(hdv hdvVar, DynamicDepthResult dynamicDepthResult) {
        if (hdvVar.i && dynamicDepthResult != null) {
            dynamicDepthResult.close();
            dynamicDepthResult = null;
        }
        try {
            try {
                this.f.c(hdvVar.b.b.h(), ojc.h(dynamicDepthResult));
            } catch (NoSuchElementException e2) {
                ((oug) ((oug) ((oug) e.c()).h(e2)).G(2378)).o("Trying to set a result for an already aborted shot.");
            }
        } finally {
            hdvVar.d();
        }
    }

    @Override // defpackage.ebn
    public final void a(edd eddVar, int i, long j, lzv lzvVar) {
        eddVar.c.b.h();
        hdv hdvVar = (hdv) this.k.get(eddVar);
        if (hdvVar == null) {
            throw new IllegalStateException("Shot hasn't been started yet!");
        }
        hdvVar.d.o(Integer.valueOf(i));
    }

    @Override // defpackage.eby
    public final /* synthetic */ void b(iin iinVar, dzx dzxVar) {
    }

    @Override // defpackage.eby
    public final void c(edd eddVar, ebr ebrVar) {
        d(eddVar.c.b.h());
    }

    @Override // defpackage.eav
    public final void d(hsp hspVar) {
        edd eddVar;
        hdv hdvVar;
        ((oug) ((oug) e.c()).G((char) 2372)).r("Shot has been aborted %s", hspVar);
        Iterator it = this.k.keySet().iterator();
        do {
            if (!it.hasNext()) {
                eddVar = null;
                break;
            }
            eddVar = (edd) it.next();
        } while (!eddVar.c.b.h().equals(hspVar));
        if (eddVar == null || (hdvVar = (hdv) this.k.remove(eddVar)) == null) {
            return;
        }
        this.f.c(hdvVar.b.b.h(), oih.a);
        hdvVar.b();
    }

    @Override // defpackage.eav
    public final void e(edd eddVar, lmr lmrVar) {
        String strA;
        mad madVarD;
        hdv hdvVar = (hdv) this.k.get(eddVar);
        if (hdvVar == null) {
            lmrVar.close();
            return;
        }
        hdvVar.c(lmrVar);
        int i = hdvVar.j - 1;
        ojc ojcVarM = hdvVar.b.b.m();
        if (!ojcVarM.g() || (strA = ((DebugParams) ojcVarM.c()).a().a()) == null || (madVarD = this.g.a(lmrVar).d()) == null) {
            return;
        }
        File file = new File(strA, String.format(Locale.ROOT, "%s_%02d.pd", "payload_depth", Integer.valueOf(i)));
        ovd ovdVar = ovl.a;
        file.getName();
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    for (mac macVar : madVarD.g()) {
                        ByteBuffer buffer = macVar.getBuffer();
                        int iLimit = buffer.limit();
                        byte[] bArr = new byte[iLimit];
                        buffer.get(bArr);
                        int rowStride = madVarD.a() == 4099 ? macVar.getRowStride() : madVarD.c() * macVar.getPixelStride();
                        for (int rowStride2 = 0; rowStride2 < iLimit; rowStride2 += macVar.getRowStride()) {
                            fileOutputStream.write(bArr, rowStride2, rowStride);
                        }
                    }
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                    }
                    throw th;
                }
            } catch (IOException e2) {
                ((oug) ((oug) ((oug) DynamicDepthUtils.a.b().g(ovl.a, "CAM_DynDepthUtils")).h(e2)).G(831)).r("IOException while saving Depth debug image %s", file.getName());
            }
            madVarD.close();
        } catch (Throwable th3) {
            madVarD.close();
            throw th3;
        }
    }

    @Override // defpackage.eav
    public final void f(edd eddVar, BurstSpec burstSpec, lzv lzvVar) {
        obr.aQ(!this.k.containsKey(eddVar));
        this.k.put(eddVar, new hdv(eddVar.c, this.c.a(), burstSpec, lzvVar));
        this.f.b(eddVar.c.b.h());
    }

    @Override // defpackage.eav
    public final void g(hsp hspVar) {
        ede edeVarF = this.l.f(hspVar);
        edeVarF.c(this);
        edeVarF.a(new ebn() { // from class: hds
            @Override // defpackage.ebn
            public final void a(edd eddVar, int i, long j, lzv lzvVar) {
                this.a.a(eddVar, i, j, lzvVar);
            }
        });
        edeVarF.e(this);
    }

    @Override // defpackage.eav
    public final void h(final edd eddVar) {
        final hdv hdvVar = (hdv) this.k.get(eddVar);
        if (hdvVar == null) {
            throw new IllegalStateException("Shot hasn't been started yet!");
        }
        this.j.execute(new Runnable() { // from class: hdt
            @Override // java.lang.Runnable
            public final void run() {
                this.a.k(hdvVar, eddVar);
            }
        });
    }

    @Override // defpackage.eav
    public final /* synthetic */ void i(edd eddVar) {
    }

    protected DynamicDepthResult j(hcf hcfVar, hdv hdvVar) {
        ljf ljfVar;
        mad madVarG = hcfVar.g();
        mad madVarD = hcfVar.d();
        hdvVar.d();
        hdvVar.b.b.h();
        if (madVarG == null || madVarD == null) {
            if (madVarG != null) {
                madVarG.close();
            }
            if (madVarD == null) {
                return null;
            }
            madVarD.close();
            return null;
        }
        this.b.c();
        try {
            ShotMetadata shotMetadata = (ShotMetadata) hdvVar.e.get();
            this.d.e("ddepth#process");
            DynamicDepthResult dynamicDepthResult = new DynamicDepthResult(this.i, this.h.b().ordinal(), false, ((dzt) hdvVar.c).f, hcfVar.a.c());
            if (this.a.b(madVarD, madVarG, dynamicDepthResult, shotMetadata)) {
                this.d.f();
                madVarD.close();
                madVarG.close();
                return dynamicDepthResult;
            }
            dynamicDepthResult.close();
            ljfVar = this.d;
        } catch (Exception e2) {
            ljfVar = this.d;
        } catch (Throwable th) {
            this.d.f();
            madVarD.close();
            madVarG.close();
            throw th;
        }
        ljfVar.f();
        madVarD.close();
        madVarG.close();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [hdu] */
    /* JADX WARN: Type inference failed for: r6v0, types: [hdv] */
    /* JADX WARN: Type inference failed for: r6v1, types: [hdv] */
    /* JADX WARN: Type inference failed for: r6v5, types: [ljf] */
    final /* synthetic */ void k(hdv hdvVar, edd eddVar) {
        List listA = hdvVar.a();
        if (listA.isEmpty()) {
            hdvVar.b();
            return;
        }
        DynamicDepthResult dynamicDepthResultJ = null;
        try {
            try {
                this.d.e("depth");
                lmr lmrVar = (lmr) listA.get(((Integer) hdvVar.d.get()).intValue());
                if (lmrVar != null) {
                    dynamicDepthResultJ = j(this.g.a(lmrVar), hdvVar);
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                ((oug) ((oug) ((oug) e.b()).h(e2)).G(2373)).o("Error retrieving the base frame index.");
            } catch (CancellationException e3) {
                e = e3;
                hdvVar.b();
                ((oug) ((oug) ((oug) e.b()).h(e)).G(2374)).o("Error retrieving the base frame index.");
            } catch (ExecutionException e4) {
                e = e4;
                hdvVar.b();
                ((oug) ((oug) ((oug) e.b()).h(e)).G(2374)).o("Error retrieving the base frame index.");
            }
        } finally {
            l(hdvVar, dynamicDepthResultJ);
            this.k.remove(eddVar);
            this.d.f();
        }
    }

    @Override // defpackage.ebo
    public final void r(edd eddVar, Bitmap bitmap, ShotMetadata shotMetadata) {
        hsp hspVarH = eddVar.c.b.h();
        hdv hdvVar = (hdv) this.k.get(eddVar);
        if (hdvVar != null) {
            hdvVar.e.o(shotMetadata);
        } else {
            ((oug) ((oug) e.c()).G((char) 2377)).r("Couldn't find inflight shot, already processed? %s", hspVarH);
        }
    }

    @Override // defpackage.eby
    public final void s(edd eddVar) {
        d(eddVar.c.b.h());
    }
}
