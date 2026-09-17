package defpackage;

import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU16;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.PixelRectVector;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.ShotMetadata;
import java.io.File;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class egd implements eco {
    public final hsa a;
    public long c;
    final /* synthetic */ ege f;
    private final goh h;
    private final ojc i;
    private final UUID j;
    private InterleavedImageU8 k;
    private pjj l;
    private ShotMetadata m;
    private pjj n;
    private ShotMetadata o;
    private PortraitRequest p;
    private ShotMetadata q;
    private pht r;
    private lap s;
    private final ega u;
    public final jtl b = new jtl();
    public final poy g = pdn.f.m();
    public boolean d = false;
    private boolean t = false;
    public int e = 1;

    public egd(ege egeVar, hsa hsaVar, goh gohVar, ojc ojcVar, UUID uuid, ojc ojcVar2) {
        this.f = egeVar;
        this.h = gohVar;
        this.a = hsaVar;
        this.i = ojcVar;
        this.j = uuid;
        gohVar.a(ecn.a, 0.0f);
        this.u = new ega(this, gohVar, ojcVar2);
    }

    @Override // defpackage.gmt
    public final void a(mad madVar, pht phtVar) {
    }

    @Override // defpackage.eco
    public final void b(pjj pjjVar, ShotMetadata shotMetadata, List list) {
        this.a.s();
        if (pjjVar == null || shotMetadata == null) {
            this.l = new pjj();
            this.m = new ShotMetadata();
        } else {
            this.l = pjjVar;
            this.m = shotMetadata;
        }
    }

    @Override // defpackage.eco
    public final void c(InterleavedImageU8 interleavedImageU8, PortraitRequest portraitRequest, ShotMetadata shotMetadata, pht phtVar, lap lapVar) {
        this.k = interleavedImageU8;
        this.p = portraitRequest;
        this.q = shotMetadata;
        this.r = phtVar;
        this.s = lapVar;
        efy efyVar = this.f.c;
        PortraitRequest portraitRequest2 = this.p;
        long jD = this.a.d();
        ojc ojcVarB = ((fsr) efyVar.b).b();
        if (efyVar.c.k(ddx.l) && ojcVarB.g()) {
            File file = new File((File) ojcVarB.c(), "portrait");
            if (!file.exists() && !file.mkdirs()) {
                ((oug) ((oug) efy.a.b()).G((char) 1129)).o("Could not create portrait mode debug data folder.");
            }
            GcamModuleJNI.PortraitRequest_portrait_raw_path_set(portraitRequest2.a, portraitRequest2, file.getAbsolutePath());
            GcamModuleJNI.PortraitRequest_shot_prefix_set(portraitRequest2.a, portraitRequest2, dzy.d(jD));
        }
        this.a.s();
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        pht phtVarU;
        PortraitRequest portraitRequest;
        int iPixelRectVector_size;
        if (this.f.e.k(ddx.x) && this.l == null) {
            ((oug) ((oug) ege.b.c()).G((char) 1144)).o("Attempting to close the session but no primary RAW image has been received.");
            return;
        }
        if (this.k == null) {
            ((oug) ((oug) ege.b.c()).G((char) 1143)).o("Attempting to close the session but no RGB image has been received.");
            return;
        }
        ege egeVar = this.f;
        if (egeVar.f && this.n == null) {
            ((oug) ((oug) ege.b.c()).G((char) 1142)).o("Attempting to close the session but no RAW image has been received.");
            return;
        }
        egeVar.g.remove(this.a.s());
        long andIncrement = this.f.d.getAndIncrement();
        InterleavedImageU16 interleavedImageU16D = ege.d(this.r);
        if (!this.i.g() || (portraitRequest = this.p) == null) {
            llv llvVar = new llv("Portrait controller not available or null PortraitRequest, no effect applied.");
            ((oug) ((oug) ((oug) ege.b.b()).h(llvVar)).G((char) 1140)).o("No effect applied.");
            phtVarU = plk.U(llvVar);
        } else {
            if (portraitRequest.a() == null) {
                iPixelRectVector_size = 0;
            } else {
                PixelRectVector pixelRectVectorA = this.p.a();
                iPixelRectVector_size = (int) GcamModuleJNI.PixelRectVector_size(pixelRectVectorA.a, pixelRectVectorA);
            }
            poy poyVar = this.g;
            if (poyVar.c) {
                poyVar.m();
                poyVar.c = false;
            }
            pdn pdnVar = (pdn) poyVar.b;
            pdn pdnVar2 = pdn.f;
            pdnVar.a |= 4;
            pdnVar.d = iPixelRectVector_size;
            phtVarU = ((hgi) this.i.c()).e(andIncrement, this.k, interleavedImageU16D, this.f.i, this.p, this.l, this.m, this.n, this.o, this.u);
        }
        plk.af(phtVarU, new egb(this, andIncrement), pgr.INSTANCE);
    }

    @Override // defpackage.eco
    public final void d(pjj pjjVar, ShotMetadata shotMetadata, List list) {
        this.a.s();
        if (pjjVar == null || shotMetadata == null) {
            this.n = new pjj();
            this.o = new ShotMetadata();
        } else {
            this.n = pjjVar;
            this.o = shotMetadata;
        }
    }

    public final void e(long j, ojc ojcVar) {
        if (this.t && this.b.a() == 0) {
            this.h.a(ecn.a, 1.0f);
            this.s.close();
            if (!this.d) {
                dmd dmdVar = new dmd("PostProcessingPortraitImageSaverImpl did not save any output images.");
                ((oug) ((oug) ((oug) ege.b.b()).h(dmdVar)).G(1145)).x("Error processing the image, cancelling the session %s for %d", this.a.s(), j);
                this.a.w(dmdVar);
                return;
            }
            ouj oujVar = ege.b;
            this.a.s();
            iij iijVarK = this.a.k();
            pdn pdnVar = (pdn) this.g.j();
            poy poyVar = (poy) pdnVar.G(5);
            poyVar.o(pdnVar);
            ((iik) iijVarK).x = poyVar;
            if (ojcVar.g()) {
                ((iik) this.a.k()).g = (ExifInterface) ojcVar.c();
            } else {
                ((iik) this.a.k()).g = dzy.a(this.k.b(), this.k.a(), this.q, this.a.m());
            }
            this.a.B();
        }
    }

    public final void g(long j, msq msqVar, hgk hgkVar, int i, edt edtVar, jtk jtkVar, ojc ojcVar) {
        PortraitRequest portraitRequest = this.p;
        plk.af(this.f.h.a(msqVar, hgkVar, i, (360 - GcamModuleJNI.ImageRotationToDegrees(GcamModuleJNI.PortraitRequest_image_rotation_get(portraitRequest.a, portraitRequest))) % 360, this.p.c(), edtVar, this.a, this.j, this.q, ojcVar), new egc(this, jtkVar, edtVar, j, msqVar, null), pgr.INSTANCE);
    }
}
