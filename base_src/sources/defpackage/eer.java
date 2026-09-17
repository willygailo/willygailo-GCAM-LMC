package defpackage;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.ShotMetadata;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class eer implements eco {
    public final goh a;
    public final gog b;
    public final dzu c;
    public final hsa d;
    final /* synthetic */ ees h;
    private final eew j;
    private final eey k;
    private pjj l;
    private ShotMetadata m;
    private List n;
    private pjj o;
    private ShotMetadata p;
    private List q;
    public final poy i = pbj.d.m();
    public final jtl e = new jtl();
    public long f = -1;
    public boolean g = false;
    private boolean r = false;

    public eer(ees eesVar, gog gogVar, dzu dzuVar, eew eewVar) {
        this.h = eesVar;
        this.b = gogVar;
        this.c = dzuVar;
        this.d = gogVar.b;
        goh gohVar = gogVar.d;
        this.a = gohVar;
        this.j = eewVar;
        gohVar.a(eez.l, 0.0f);
        this.k = new eeo(this);
    }

    @Override // defpackage.gmt
    public final void a(mad madVar, pht phtVar) {
    }

    @Override // defpackage.eco
    public final void b(pjj pjjVar, ShotMetadata shotMetadata, List list) {
        if (pjjVar == null || shotMetadata == null) {
            ouj oujVar = ees.a;
            ovd ovdVar = ovl.a;
            this.d.s();
            this.l = new pjj();
            this.m = new ShotMetadata();
            this.n = oom.l();
            return;
        }
        ouj oujVar2 = ees.a;
        ovd ovdVar2 = ovl.a;
        this.d.s();
        this.l = pjjVar;
        this.m = shotMetadata;
        this.n = list;
    }

    @Override // defpackage.eco
    public final void c(InterleavedImageU8 interleavedImageU8, PortraitRequest portraitRequest, ShotMetadata shotMetadata, pht phtVar, lap lapVar) {
        throw new UnsupportedOperationException("RGB image not requested.");
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        if (this.l == null) {
            ((oug) ((oug) ees.a.c().g(ovl.a, "FalconPostProcImgSaver")).G((char) 1115)).o("Attempting to close the session but no primary RAW image has been received.");
            return;
        }
        if (this.o == null) {
            ((oug) ((oug) ees.a.c().g(ovl.a, "FalconPostProcImgSaver")).G((char) 1114)).o("Attempting to close the session but no RAW image has been received.");
            return;
        }
        ouj oujVar = ees.a;
        ovd ovdVar = ovl.a;
        this.a.a(ebe.a, 1.0f);
        this.h.i.remove(this.d.s());
        long andIncrement = this.h.h.getAndIncrement();
        this.f = System.currentTimeMillis();
        plk.af(this.j.d(andIncrement, this.h.k, eev.a(this.l, this.m, this.n), eev.a(this.o, this.p, this.q), this.k, this.h.g), new eep(this, andIncrement), pgr.INSTANCE);
    }

    @Override // defpackage.eco
    public final void d(pjj pjjVar, ShotMetadata shotMetadata, List list) {
        if (pjjVar == null || shotMetadata == null) {
            ouj oujVar = ees.a;
            ovd ovdVar = ovl.a;
            this.d.s();
            this.o = new pjj();
            this.p = new ShotMetadata();
            this.q = oom.l();
            return;
        }
        ouj oujVar2 = ees.a;
        ovd ovdVar2 = ovl.a;
        this.d.s();
        this.o = pjjVar;
        this.p = shotMetadata;
        this.q = list;
    }

    public final void e(long j) {
        if (this.r && this.e.a() == 0) {
            this.a.a(eez.l, 1.0f);
            if (!this.g) {
                dmd dmdVar = new dmd("PostProcessingDeblurFusionImageSaverImpl did not save any output images.");
                ((oug) ((oug) ((oug) ees.a.b().g(ovl.a, "FalconPostProcImgSaver")).h(dmdVar)).G(1116)).x("Error processing the image, cancelling the session %s for %d", this.d.s(), j);
                this.d.w(dmdVar);
            } else {
                ouj oujVar = ees.a;
                ovd ovdVar = ovl.a;
                this.d.s();
                ((iik) this.d.k()).p = (pbj) this.i.j();
            }
        }
    }
}
