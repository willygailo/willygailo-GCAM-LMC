package defpackage;

import android.content.res.AssetFileDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class cyl {
    public static final oom a = oom.r("/m/0bt9lr", "/m/01yrx", "/m/068hy", "/m/02wbm", "/m/0dzct", "/m/0sgh53y", "/m/04h4w", "/m/06cnp", "/m/0brn2d", "/m/01bqvp", "/m/06_dn", "/m/01b2w5", "/m/0k4j", "/m/0jnvp", "/m/0b3yr", "/m/012mj", "/m/079cl", "/m/0g6b5", "/m/0c9ph5", "/m/02xwb", "/m/03bmqb", "/m/01g317", "/m/011l78", "/m/06ntj", "/m/025xryy", "/m/02h00q", "/m/02qdwbp", "/m/0j2kx", "/m/03qtwd", "/m/0204fg", "/m/0cgh4");
    public final ddf b;
    private final boolean c;
    private final boolean d;
    private final List e = new ArrayList();
    private final khx f;

    public cyl(ddf ddfVar, boolean z, boolean z2, khx khxVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = ddfVar;
        this.c = z;
        this.d = z2;
        this.f = khxVar;
    }

    private final boolean n() {
        return this.b.k(ddp.r) && this.b.k(ddp.q);
    }

    public final synchronized AssetFileDescriptor a(String str) {
        AssetFileDescriptor assetFileDescriptorOpenFd;
        assetFileDescriptorOpenFd = this.f.a.getAssets().openFd(str);
        this.e.add(assetFileDescriptorOpenFd);
        return assetFileDescriptorOpenFd;
    }

    public final nvp b() {
        ArrayList arrayList = new ArrayList();
        if (this.b.k(ddp.p)) {
            arrayList.add("CoarseClassifierTexto128V2_3");
            arrayList.add("BarcodeReader");
        }
        poy poyVarM = nvp.e.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        nvp nvpVar = (nvp) poyVarM.b;
        int i = nvpVar.a | 2;
        nvpVar.a = i;
        nvpVar.d = true;
        nvpVar.a = i | 1;
        nvpVar.b = "EarlyPipeline";
        poyVarM.v(arrayList);
        return (nvp) poyVarM.j();
    }

    public final oom c() {
        long micros = TimeUnit.SECONDS.toMicros(1L) / ((long) ((Integer) this.b.a(ddp.b).c()).intValue());
        poy poyVarM = nuz.e.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        nuz.b((nuz) poyVarM.b);
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        nuz nuzVar = (nuz) poyVarM.b;
        int i = nuzVar.a | 8;
        nuzVar.a = i;
        nuzVar.d = micros;
        nuzVar.a = i | 4;
        nuzVar.c = micros;
        long micros2 = TimeUnit.SECONDS.toMicros(15L);
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        nuz nuzVar2 = (nuz) poyVarM.b;
        nuzVar2.a |= 2;
        nuzVar2.b = micros2;
        nuz nuzVar3 = (nuz) poyVarM.j();
        poy poyVarM2 = nuz.e.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        nuz.b((nuz) poyVarM2.b);
        long micros3 = TimeUnit.MILLISECONDS.toMicros(1000L);
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        nuz nuzVar4 = (nuz) poyVarM2.b;
        nuzVar4.a |= 8;
        nuzVar4.d = micros3;
        long micros4 = TimeUnit.MILLISECONDS.toMicros(1000L);
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        nuz nuzVar5 = (nuz) poyVarM2.b;
        nuzVar5.a |= 4;
        nuzVar5.c = micros4;
        long micros5 = TimeUnit.SECONDS.toMicros(15L);
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        nuz nuzVar6 = (nuz) poyVarM2.b;
        nuzVar6.a |= 2;
        nuzVar6.b = micros5;
        nuz nuzVar7 = (nuz) poyVarM2.j();
        poy poyVarM3 = nuz.e.m();
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        nuz.b((nuz) poyVarM3.b);
        long micros6 = TimeUnit.MILLISECONDS.toMicros(1500L);
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        nuz nuzVar8 = (nuz) poyVarM3.b;
        nuzVar8.a |= 8;
        nuzVar8.d = micros6;
        long micros7 = TimeUnit.MILLISECONDS.toMicros(1500L);
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        nuz nuzVar9 = (nuz) poyVarM3.b;
        nuzVar9.a |= 4;
        nuzVar9.c = micros7;
        return oom.o(nuzVar3, nuzVar7, (nuz) poyVarM3.j());
    }

    public final synchronized void d() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((AssetFileDescriptor) it.next()).close();
        }
        this.e.clear();
    }

    public final boolean e() {
        if (n()) {
            return h() || f() || g();
        }
        return false;
    }

    public final boolean f() {
        return this.d && n() && this.b.k(ddp.w);
    }

    public final boolean g() {
        return this.b.k(ddp.x) && n();
    }

    public final boolean h() {
        return this.c && n() && this.b.k(ddp.v);
    }

    public final boolean i() {
        return this.b.k(ddp.p) || e();
    }

    public final boolean j() {
        return h() || g();
    }

    public final nvh k(poy poyVar) {
        poy poyVarM = nvh.g.m();
        ddf ddfVar = this.b;
        ddi ddiVar = ddp.a;
        ddfVar.d();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        nvh nvhVar = (nvh) poyVarM.b;
        nvhVar.a |= 2;
        nvhVar.e = false;
        nvl nvlVar = (nvl) poyVar.j();
        nvlVar.getClass();
        nvhVar.d = nvlVar;
        nvhVar.a |= 1;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        nvh nvhVar2 = (nvh) poyVarM.b;
        nvhVar2.b = 6;
        nvhVar2.c = true;
        return (nvh) poyVarM.j();
    }

    public final poy l() {
        poy poyVarM = nvl.j.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        nvl nvlVar = (nvl) poyVarM.b;
        nvlVar.a |= 512;
        nvlVar.g = true;
        ddf ddfVar = this.b;
        ddi ddiVar = ddp.a;
        ddfVar.d();
        return poyVarM;
    }

    public final void m(poy poyVar) {
        if (this.b.k(ddp.p)) {
            poy poyVarM = nvt.d.m();
            poyVarM.w(8);
            poyVarM.w(7);
            poyVarM.w(10);
            poyVarM.w(11);
            poyVarM.w(12);
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            nvt nvtVar = (nvt) poyVarM.b;
            nvtVar.c = 2;
            nvtVar.a |= 4;
            nvt nvtVar2 = (nvt) poyVarM.j();
            if (this.b.k(ddp.t)) {
                int iCeil = (int) Math.ceil(((Integer) this.b.a(ddp.b).c()).intValue() * ((Float) this.b.g(ddp.u).c()).floatValue());
                poy poyVarM2 = nuw.d.m();
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                nuw nuwVar = (nuw) poyVarM2.b;
                nuwVar.a |= 1;
                nuwVar.b = iCeil;
                ppm ppmVar = nuwVar.c;
                if (!ppmVar.c()) {
                    nuwVar.c = ppd.B(ppmVar);
                }
                nuwVar.c.add("barcode");
                nuw nuwVar2 = (nuw) poyVarM2.j();
                if (poyVar.c) {
                    poyVar.m();
                    poyVar.c = false;
                }
                nvl nvlVar = (nvl) poyVar.b;
                nvl nvlVar2 = nvl.j;
                nuwVar2.getClass();
                nvlVar.c = nuwVar2;
                nvlVar.a |= 1;
            }
            if (poyVar.c) {
                poyVar.m();
                poyVar.c = false;
            }
            nvl nvlVar3 = (nvl) poyVar.b;
            nvl nvlVar4 = nvl.j;
            nvtVar2.getClass();
            nvlVar3.d = nvtVar2;
            nvlVar3.a |= 2;
        }
    }
}
