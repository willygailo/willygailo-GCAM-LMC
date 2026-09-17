package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import com.google.android.apps.camera.jni.federatedphoto.ModeSuggestionClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cea implements dbg, ias {
    public ModeSuggestionClient a;
    public cdj b;
    public cdi c;
    private final ddf d;
    private final ojc e;
    private final cbm f;

    public cea(ddf ddfVar, ojc ojcVar, cbm cbmVar) {
        this.d = ddfVar;
        this.e = ojcVar;
        this.f = cbmVar;
    }

    @Override // defpackage.iat
    public final void a() {
    }

    @Override // defpackage.iat
    public final void b(iay iayVar) {
    }

    @Override // defpackage.ias
    public final void c(lvp lvpVar) {
        cdi cdiVar = this.c;
        cdiVar.c = ojc.h(lvpVar.k());
        cdiVar.e = ojc.h(lvpVar.h());
        cdiVar.a.clear();
    }

    @Override // defpackage.dbg
    public final void g(long j, Map map) {
        float fFloatValue;
        ojc ojcVarI;
        jrl jrlVar;
        this.b.c(map);
        poy poyVarM = pix.i.m();
        ojc ojcVarB = this.b.b();
        if (ojcVarB.g()) {
            Iterable iterable = (Iterable) ojcVarB.c();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pix pixVar = (pix) poyVarM.b;
            ppj ppjVar = pixVar.b;
            if (!ppjVar.c()) {
                pixVar.b = ppd.v(ppjVar);
            }
            pnl.e(iterable, pixVar.b);
        }
        ojc ojcVarA = this.b.a();
        if (ojcVarA.g()) {
            Iterable iterable2 = (Iterable) ojcVarA.c();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pix pixVar2 = (pix) poyVarM.b;
            ppj ppjVar2 = pixVar2.c;
            if (!ppjVar2.c()) {
                pixVar2.c = ppd.v(ppjVar2);
            }
            pnl.e(iterable2, pixVar2.c);
        }
        if (this.c.c.g()) {
            fFloatValue = (this.c.c.c() == lwd.FRONT ? (Float) this.d.g(ddq.b).c() : (Float) this.d.g(ddq.c).c()).floatValue();
            int i = this.c.c.c() == lwd.FRONT ? 1 : 0;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pix pixVar3 = (pix) poyVarM.b;
            pixVar3.a |= 4;
            pixVar3.f = i;
        } else {
            fFloatValue = 4.9411428E7f;
        }
        poy poyVarM2 = piy.d.m();
        ArrayList arrayList = new ArrayList(this.c.a);
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        piy piyVar = (piy) poyVarM2.b;
        ppj ppjVar3 = piyVar.b;
        if (!ppjVar3.c()) {
            piyVar.b = ppd.v(ppjVar3);
        }
        pnl.e(arrayList, piyVar.b);
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        piy piyVar2 = (piy) poyVarM2.b;
        piyVar2.a |= 1;
        piyVar2.c = fFloatValue;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pix pixVar4 = (pix) poyVarM.b;
        piy piyVar3 = (piy) poyVarM2.j();
        piyVar3.getClass();
        pixVar4.e = piyVar3;
        pixVar4.a |= 2;
        cdi cdiVar = this.c;
        if (cdiVar.d.g() && cdiVar.e.g()) {
            Face[] faceArr = (Face[]) cdiVar.d.c();
            float fWidth = ((Rect) cdiVar.e.c()).width();
            float fHeight = ((Rect) cdiVar.e.c()).height();
            Arrays.sort(faceArr, cdg.a);
            int iMin = Math.min(faceArr.length, 10);
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < iMin; i2++) {
                Rect bounds = faceArr[i2].getBounds();
                arrayList2.add(new cdh(bounds.width() / fWidth, bounds.height() / fHeight, bounds.centerX() / fWidth, bounds.centerY() / fHeight));
            }
            ojcVarI = ojc.i(arrayList2);
        } else {
            ojcVarI = oih.a;
        }
        if (ojcVarI.g()) {
            for (cdh cdhVar : (List) ojcVarI.c()) {
                poy poyVarM3 = piz.d.m();
                float f = cdhVar.a;
                if (poyVarM3.c) {
                    poyVarM3.m();
                    poyVarM3.c = false;
                }
                piz pizVar = (piz) poyVarM3.b;
                int i3 = pizVar.a | 1;
                pizVar.a = i3;
                pizVar.b = f;
                float f2 = cdhVar.b;
                pizVar.a = i3 | 2;
                pizVar.c = f2;
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pix pixVar5 = (pix) poyVarM.b;
                piz pizVar2 = (piz) poyVarM3.j();
                pizVar2.getClass();
                ppm ppmVar = pixVar5.g;
                if (!ppmVar.c()) {
                    pixVar5.g = ppd.B(ppmVar);
                }
                pixVar5.g.add(pizVar2);
            }
        }
        if (!((dqx) ((ojj) this.e).a).e()) {
            poy poyVarM4 = pjb.b.m();
            List listB = dtn.b((dqx) ((ojj) this.e).a, 10);
            Collections.reverse(listB);
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                ftm ftmVarA = ftm.a((dqu) it.next());
                poy poyVarM5 = pja.e.m();
                float f3 = ftmVarA.c;
                if (poyVarM5.c) {
                    poyVarM5.m();
                    poyVarM5.c = false;
                }
                pja pjaVar = (pja) poyVarM5.b;
                int i4 = pjaVar.a | 1;
                pjaVar.a = i4;
                pjaVar.b = f3;
                float f4 = ftmVarA.b;
                int i5 = i4 | 2;
                pjaVar.a = i5;
                pjaVar.c = f4;
                int i6 = ftmVarA.a;
                pjaVar.a = i5 | 4;
                pjaVar.d = i6;
                if (poyVarM4.c) {
                    poyVarM4.m();
                    poyVarM4.c = false;
                }
                pjb pjbVar = (pjb) poyVarM4.b;
                pja pjaVar2 = (pja) poyVarM5.j();
                pjaVar2.getClass();
                ppm ppmVar2 = pjbVar.a;
                if (!ppmVar2.c()) {
                    pjbVar.a = ppd.B(ppmVar2);
                }
                pjbVar.a.add(pjaVar2);
            }
            pjb pjbVar2 = (pjb) poyVarM4.j();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pix pixVar6 = (pix) poyVarM.b;
            pjbVar2.getClass();
            pixVar6.d = pjbVar2;
            pixVar6.a |= 1;
        }
        pix pixVar7 = (pix) poyVarM.j();
        ModeSuggestionClient modeSuggestionClient = this.a;
        obr.aR(!modeSuggestionClient.c, "ModeSuggestionClient is closed");
        try {
            pixVar7 = (pix) ppd.s(pix.i, modeSuggestionClient.nativeProcess(modeSuggestionClient.b, pixVar7.g()), pos.b());
        } catch (ppp e) {
            ((oug) ((oug) ModeSuggestionClient.a.b()).G((char) 1268)).o("Proto serialization error.");
        }
        pjd pjdVar = pixVar7.h;
        if (pjdVar == null) {
            pjdVar = pjd.b;
        }
        pjc pjcVar = pjdVar.a;
        if (pjcVar == null) {
            pjcVar = pjc.c;
        }
        cbm cbmVar = this.f;
        int iF = plk.F(pjcVar.b);
        switch ((iF != 0 ? iF : 1) - 1) {
            case 1:
                jrlVar = jrl.LONG_EXPOSURE;
                break;
            case 2:
                jrlVar = jrl.IMAX;
                break;
            case 3:
                jrlVar = jrl.PORTRAIT;
                break;
            default:
                jrlVar = jrl.PHOTO;
                break;
        }
        cbmVar.fP(jrlVar, pjcVar.a);
    }

    @Override // defpackage.ias
    public final void i(lzv lzvVar) {
        cdi cdiVar = this.c;
        if (cdiVar.e.g()) {
            cdiVar.b = ojc.i(new hjz(lzvVar, 0, (Rect) cdiVar.e.c()));
            cdiVar.a.add(Float.valueOf(((hjz) cdiVar.b.c()).c * 1.0E-6f * ((hjz) cdiVar.b.c()).f * ((hjz) cdiVar.b.c()).e));
            cdiVar.d = ojc.h((Face[]) lzvVar.d(CaptureResult.STATISTICS_FACES));
        }
    }

    @Override // defpackage.iat
    public final void u() {
    }

    @Override // defpackage.iat
    public final void v() {
    }
}
