package defpackage;

import android.content.res.Resources;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.ui.elapsedtimeui.ElapsedTimerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cgx implements lgb {
    private final cry A;
    private final BottomBarController B;
    private final jfn C;
    private final jhj D;
    private final jhh E;
    private final coh F;
    private final jlb G;
    public final ivj a;
    public final String b;
    public final crs c;
    public final jas d;
    public final kas e;
    public final gtg f;
    public final ckn g;
    public final cvo h;
    public final cfj i;
    public final lzi j;
    public final ojc k;
    public final cqq l;
    public final cka m;
    public final cif n;
    public final lco o;
    public final lco p;
    public final lar q;
    public final ddf r;
    public final iud s;
    public btv t;
    public jrl u;
    public crx v;
    public ckd w;
    public final nvb x;
    private final Resources y;
    private final ElapsedTimerView z;

    public cgx(ivj ivjVar, jnr jnrVar, Resources resources, cry cryVar, crs crsVar, BottomBarController bottomBarController, jas jasVar, kas kasVar, jfn jfnVar, jhj jhjVar, jhh jhhVar, coh cohVar, gtg gtgVar, ckn cknVar, cvo cvoVar, cfj cfjVar, lzi lziVar, jlb jlbVar, ojc ojcVar, cqq cqqVar, nvb nvbVar, cka ckaVar, cif cifVar, lar larVar, ddf ddfVar, iud iudVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.y = resources;
        this.a = ivjVar;
        this.A = cryVar;
        this.c = crsVar;
        this.B = bottomBarController;
        this.d = jasVar;
        this.e = kasVar;
        this.C = jfnVar;
        this.D = jhjVar;
        this.E = jhhVar;
        this.f = gtgVar;
        this.F = cohVar;
        this.g = cknVar;
        this.h = cvoVar;
        this.i = cfjVar;
        this.j = lziVar;
        this.G = jlbVar;
        this.k = ojcVar;
        this.l = cqqVar;
        this.x = nvbVar;
        this.m = ckaVar;
        this.n = cifVar;
        this.q = larVar;
        this.r = ddfVar;
        this.s = iudVar;
        this.z = (ElapsedTimerView) jnrVar.c.c(R.id.elapsed_timer_view);
        this.b = resources.getString(R.string.video_accessibility_peek);
        this.o = lcv.d(lcv.j(ckaVar.a().q, bxe.i), ckaVar.a().o);
        this.p = lcv.d(lcv.j(ckaVar.a().q, bxe.j), ckaVar.a().p);
    }

    public static List b(List list) {
        ojc ojcVarI;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ldz ldzVar = (ldz) it.next();
            ldz ldzVar2 = ldz.FPS_AUTO;
            switch (ldzVar) {
                case FPS_AUTO:
                    ojcVarI = ojc.i(htg.FPS_AUTO);
                    break;
                case FPS_24:
                case FPS_60C_24E:
                    ojcVarI = ojc.i(htg.FPS_24);
                    break;
                case FPS_30:
                case FPS_60C_30E:
                    ojcVarI = ojc.i(htg.FPS_30);
                    break;
                case FPS_60:
                    ojcVarI = ojc.i(htg.FPS_60);
                    break;
                default:
                    ojcVarI = oih.a;
                    break;
            }
            if (ojcVarI.g()) {
                arrayList.add((htg) ojcVarI.c());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final void c(btv btvVar, jrl jrlVar) {
        this.t = btvVar;
        this.u = jrlVar;
        this.v = this.A.a(jrlVar);
        this.F.a = this.u;
        this.g.d = btvVar;
    }

    public final void d(boolean z) {
        ckn cknVar = this.g;
        if (z) {
            cknVar.c.execute(new ckm(cknVar, 4));
        } else {
            cknVar.c.execute(new ckm(cknVar, 5));
        }
    }

    public final void e() {
        this.E.c();
    }

    public final void f() {
        mip.bS().execute(new cgt(this, 0));
    }

    @Override // defpackage.lgb
    public final void fE(lga lgaVar) {
        jhi jhiVar;
        jhj jhjVar = this.D;
        lga lgaVar2 = lga.VIDEO_BUFFER_DELAY;
        switch (lgaVar) {
            case VIDEO_BUFFER_DELAY:
                jhiVar = jhi.VIDEO_MISSING_DURING_RECORDING;
                break;
            case AUDIO_BUFFER_DELAY:
            case AUDIO_TRACK_FAIL_TO_START:
                jhiVar = jhi.AUDIO_MISSING_DURING_RECORDING;
                break;
            case VIDEO_TRACK_FAIL_TO_START:
            case FILE_LOST:
                jhiVar = jhi.NO_VIDEO_AFTER_RECORDING;
                break;
            case METADATA_DELAY:
            case MUXER_STOP_ERROR:
            case MEDIA_CODEC_ERROR_AUDIO:
            case MEDIA_CODEC_ERROR_VIDEO:
            case OTHER:
                jhiVar = jhi.PARTIAL_VIDEO_MISSING_AFTER_RECORDING;
                break;
            case AUDIO_RECORD_ERROR:
                jhiVar = jhi.MIC_BROKEN;
                break;
            default:
                jhiVar = jhi.PARTIAL_VIDEO_MISSING_AFTER_RECORDING;
                break;
        }
        jhjVar.a(jhiVar);
    }

    public final void g() {
        mip.bS().execute(new cgt(this, 2));
    }

    public final void h() {
        if (this.F.b().g()) {
            this.h.g((lwd) this.F.b().c());
        }
    }

    public final void i() {
        this.e.y(oih.a, false);
        ckn cknVar = this.g;
        cknVar.c.execute(new ckm(cknVar, 1));
        ((bvk) this.t).r();
        if (this.z.getVisibility() != 8) {
            this.z.setVisibility(8);
        }
        this.e.o();
    }

    public final void j(final boolean z) {
        mip.bS().execute(new Runnable() { // from class: cgv
            @Override // java.lang.Runnable
            public final void run() {
                cgx cgxVar = this.a;
                boolean z2 = z;
                cgxVar.v.b();
                if (cgxVar.k.g() && cgxVar.l.a().equals(cqj.DEFAULT) && cgxVar.n(cgxVar.u)) {
                    cgxVar.e.f(true);
                }
                cgxVar.m(z2);
            }
        });
    }

    public final void k(boolean z) {
        this.G.H(z);
    }

    public final void l(boolean z) {
        this.B.setSnapshotButtonClickEnabled(z);
    }

    public final void m(boolean z) {
        if (this.F.o()) {
            this.C.l(true);
        }
        this.a.e(false);
        this.d.a(z);
        this.s.d(false);
        if (this.k.g() && n(this.u)) {
            if (this.l.a().equals(cqj.DEFAULT)) {
                ((ctm) this.k.c()).h(z);
            }
            ((ctm) this.k.c()).f(true);
        }
    }

    public final boolean n(jrl jrlVar) {
        if (this.k.g()) {
            return jrlVar.equals(jrl.VIDEO) || jrlVar.equals(jrl.SLOW_MOTION) || jrlVar.equals(jrl.TIME_LAPSE);
        }
        return false;
    }

    public final int o() {
        return this.v.j();
    }
}
