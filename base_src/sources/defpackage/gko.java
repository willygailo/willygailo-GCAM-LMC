package defpackage;

import android.graphics.Rect;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
final class gko implements gmt {
    public final hsa a;
    public final gfs b;
    public final hoh c;
    public lic d;
    final /* synthetic */ gkp e;
    private final glg f;
    private final List g = new ArrayList();

    public gko(gkp gkpVar, glg glgVar, hsa hsaVar, gfs gfsVar, hoh hohVar) {
        this.e = gkpVar;
        this.f = glgVar;
        this.a = hsaVar;
        this.b = gfsVar;
        this.c = hohVar;
    }

    private final List b(List list) {
        obr.aF(list.size() == this.g.size());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new gjs(new lwl((mad) list.get(i)), ((gjs) this.g.get(i)).k()));
        }
        return arrayList;
    }

    private final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((mad) it.next()).close();
        }
    }

    @Override // defpackage.gmt
    public final void a(mad madVar, pht phtVar) {
        this.d = lic.b(((Integer) this.e.c.a().fA()).intValue());
        this.g.add(new gjs(madVar, phtVar));
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        pht phtVarH;
        if (this.g.size() != 1) {
            lis lisVar = this.e.a;
            int size = this.g.size();
            StringBuilder sb = new StringBuilder(78);
            sb.append("Received ");
            sb.append(size);
            sb.append(" images, which is different than  1. Abort shot.");
            lisVar.h(sb.toString());
            c();
            return;
        }
        this.d.getClass();
        try {
            pht phtVarK = ((gjs) this.g.get(0)).k();
            phtVarK.getClass();
            this.a.k().d((lzv) phtVarK.get(1000L, TimeUnit.MILLISECONDS), false);
            ArrayList arrayList = new ArrayList();
            for (gjs gjsVar : this.g) {
                if (gjsVar.m()) {
                    arrayList.add(new lwk(gjsVar, 3));
                } else {
                    lis lisVar2 = this.e.a;
                    gjq gjqVar = gjr.b;
                    Object objL = gjsVar.l(gjqVar);
                    String.valueOf(String.valueOf(gjqVar)).length();
                    objL.getClass();
                    String strValueOf = String.valueOf(objL);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 27);
                    sb2.append("Ignoring and closing image ");
                    sb2.append(strValueOf);
                    lisVar2.h(sb2.toString());
                    gjsVar.close();
                }
            }
            List listB = b(arrayList);
            final List listB2 = b(arrayList);
            final List listB3 = b(arrayList);
            glg glgVar = this.f;
            lic licVar = this.d;
            licVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(((mad) it.next()).d()));
            }
            if (listB.size() == 1) {
                ((gjs) listB.get(0)).close();
                phtVarH = plk.V(0);
            } else {
                lap lapVar = new lap();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = listB.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new lwl((gjs) it2.next()));
                }
                bwe bweVar = new bwe();
                bweVar.addAll(arrayList3);
                lapVar.c(bweVar);
                hit hitVarB = hig.b();
                try {
                    pih pihVar = hitVarB.a;
                    for (int i = 0; i < listB.size(); i++) {
                        mad madVar = (mad) arrayList3.get(i);
                        pht phtVarK2 = ((gjs) listB.get(i)).k();
                        him himVarA = hin.a(madVar);
                        himVarA.c = licVar;
                        himVarA.d = phtVarK2;
                        hin hinVarA = himVarA.a();
                        hin hinVar = hitVarB.b;
                        if (hinVar == null || hinVar.a.d() < hinVarA.a.d()) {
                            hin hinVar2 = hitVarB.b;
                            if (hinVar2 != null) {
                                hinVar2.a.close();
                            }
                            hitVarB.b = hinVarA;
                        } else {
                            hinVarA.a.close();
                        }
                    }
                    hitVarB.close();
                    phtVarH = pgb.h(pihVar, new gld(listB), pgr.INSTANCE);
                    plk.af(phtVarH, new gle(lapVar), pgr.INSTANCE);
                } catch (Throwable th) {
                    try {
                        hitVarB.close();
                        throw th;
                    } catch (Throwable th2) {
                        throw th;
                    }
                }
            }
            pht phtVarH2 = pgb.h(phtVarH, new gli((glj) glgVar, arrayList2), pgr.INSTANCE);
            obr.aQ(this.d != null);
            pht phtVarH3 = pgb.h(phtVarH2, new oiu() { // from class: gkj
                @Override // defpackage.oiu
                public final Object a(Object obj) {
                    gko gkoVar = this.a;
                    List list = listB2;
                    Integer num = (Integer) obj;
                    obr.aX(num.intValue(), list.size());
                    mad madVar2 = null;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        if (i2 == num.intValue()) {
                            madVar2 = (mad) list.get(i2);
                        } else {
                            ((gjs) list.get(i2)).close();
                        }
                    }
                    madVar2.getClass();
                    gln glnVar = gkoVar.e.j;
                    hsa hsaVar = gkoVar.a;
                    lic licVar2 = gkoVar.d;
                    licVar2.getClass();
                    pih pihVarF = pih.f();
                    pih pihVarF2 = pih.f();
                    pht phtVarU = plk.U(new IllegalStateException("Thumbnail generation should not require metadata"));
                    gmv gmvVar = new gmv(madVar2);
                    Rect rect = new Rect(0, 0, madVar2.c(), madVar2.b());
                    him himVarA2 = hin.a(gmvVar);
                    himVarA2.c = licVar2;
                    himVarA2.d = phtVarU;
                    himVarA2.f = rect;
                    hin hinVarA2 = himVarA2.a();
                    phv phvVarK = plk.K();
                    ope opeVarJ = ope.J(hib.CLOSE_ON_ALL_TASKS_RELEASE, hib.CREATE_EARLY_FILMSTRIP_PREVIEW, hib.CONVERT_TO_RGB_PREVIEW);
                    glm glmVar = new glm();
                    glmVar.c = new glk(pihVarF, licVar2, pihVarF2);
                    try {
                        glnVar.a.e(hinVarA2, phvVarK, opeVarJ, hsaVar, glmVar.d);
                        return new glq(pihVarF, pihVarF2);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new IllegalStateException(e);
                    }
                }
            }, pgr.INSTANCE);
            this.d.getClass();
            plk.af(phtVarH3, new gkn(this, 4), pgr.INSTANCE);
            final htf htfVarA = htf.a(((Integer) this.e.g.fA()).intValue());
            pht phtVarI = pgb.i(pgb.h(phtVarH2, new oiu() { // from class: gkk
                @Override // defpackage.oiu
                public final Object a(Object obj) {
                    gko gkoVar = this.a;
                    List list = listB3;
                    htf htfVar = htfVarA;
                    Integer num = (Integer) obj;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        if (i2 != num.intValue()) {
                            ((gjs) list.get(i2)).close();
                        }
                    }
                    him himVarB = hin.b((gjs) list.get(num.intValue()));
                    lic licVar2 = gkoVar.d;
                    licVar2.getClass();
                    himVarB.c = licVar2;
                    himVarB.h = htfVar;
                    himVarB.a = gkoVar.b.d;
                    return himVarB.a();
                }
            }, pgr.INSTANCE), new ewp(3), pgr.INSTANCE);
            final int i2 = 1;
            final int i3 = 0;
            pht phtVarI2 = pgb.i(pgb.i(phtVarI, new pgk(this) { // from class: gkl
                public final /* synthetic */ gko a;

                {
                    this.a = this;
                }

                @Override // defpackage.pgk
                public final pht a(Object obj) {
                    pht phtVarA;
                    pht phtVar;
                    switch (i2) {
                        case 0:
                            gko gkoVar = this.a;
                            hin hinVar3 = (hin) obj;
                            synchronized (gkoVar.e.f) {
                                hinVar3.getClass();
                                gkp gkpVar = gkoVar.e;
                                gkpVar.i = 4;
                                phtVarA = gkpVar.b.a(hinVar3);
                                mad madVar2 = hinVar3.a;
                                madVar2.getClass();
                                phtVarA.d(new eqn(madVar2, 3), pgr.INSTANCE);
                                break;
                            }
                            return phtVarA;
                        default:
                            final gko gkoVar2 = this.a;
                            final hin hinVar4 = (hin) obj;
                            return (!dkr.b(hinVar4.g, hinVar4.f) || (phtVar = hinVar4.c) == null || hinVar4.i == null) ? plk.V(hinVar4) : pgb.h(pgb.i(pho.q(phtVar), new pgk() { // from class: gkm
                                @Override // defpackage.pgk
                                public final pht a(Object obj2) {
                                    gko gkoVar3 = gkoVar2;
                                    hin hinVar5 = hinVar4;
                                    hkn hknVarC = gkoVar3.e.h.c(hinVar5.a.d());
                                    return ((dot) gkoVar3.e.e.get()).a(new dos(hinVar5.a, hinVar5.i, (lzv) obj2, ojc.h(hknVarC)));
                                }
                            }, pgr.INSTANCE), new oiu() { // from class: gki
                                @Override // defpackage.oiu
                                public final Object a(Object obj2) {
                                    hin hinVar5 = hinVar4;
                                    dor dorVar = (dor) obj2;
                                    dorVar.b(hinVar5.d);
                                    if (dorVar.c()) {
                                        ExifInterface exifInterface = hinVar5.h;
                                    }
                                    return hin.c(dorVar.a(), hinVar5);
                                }
                            }, pgr.INSTANCE);
                    }
                }
            }, pgr.INSTANCE), new pgk(this) { // from class: gkl
                public final /* synthetic */ gko a;

                {
                    this.a = this;
                }

                @Override // defpackage.pgk
                public final pht a(Object obj) {
                    pht phtVarA;
                    pht phtVar;
                    switch (i3) {
                        case 0:
                            gko gkoVar = this.a;
                            hin hinVar3 = (hin) obj;
                            synchronized (gkoVar.e.f) {
                                hinVar3.getClass();
                                gkp gkpVar = gkoVar.e;
                                gkpVar.i = 4;
                                phtVarA = gkpVar.b.a(hinVar3);
                                mad madVar2 = hinVar3.a;
                                madVar2.getClass();
                                phtVarA.d(new eqn(madVar2, 3), pgr.INSTANCE);
                                break;
                            }
                            return phtVarA;
                        default:
                            final gko gkoVar2 = this.a;
                            final hin hinVar4 = (hin) obj;
                            return (!dkr.b(hinVar4.g, hinVar4.f) || (phtVar = hinVar4.c) == null || hinVar4.i == null) ? plk.V(hinVar4) : pgb.h(pgb.i(pho.q(phtVar), new pgk() { // from class: gkm
                                @Override // defpackage.pgk
                                public final pht a(Object obj2) {
                                    gko gkoVar3 = gkoVar2;
                                    hin hinVar5 = hinVar4;
                                    hkn hknVarC = gkoVar3.e.h.c(hinVar5.a.d());
                                    return ((dot) gkoVar3.e.e.get()).a(new dos(hinVar5.a, hinVar5.i, (lzv) obj2, ojc.h(hknVarC)));
                                }
                            }, pgr.INSTANCE), new oiu() { // from class: gki
                                @Override // defpackage.oiu
                                public final Object a(Object obj2) {
                                    hin hinVar5 = hinVar4;
                                    dor dorVar = (dor) obj2;
                                    dorVar.b(hinVar5.d);
                                    if (dorVar.c()) {
                                        ExifInterface exifInterface = hinVar5.h;
                                    }
                                    return hin.c(dorVar.a(), hinVar5);
                                }
                            }, pgr.INSTANCE);
                    }
                }
            }, pgr.INSTANCE);
            plk.af(phtVarI2, new gkn(this, 1), pgr.INSTANCE);
            plk.af(phtVarI2, new gkn(this, 0), pgr.INSTANCE);
        } catch (InterruptedException e) {
            this.e.a.i("Interrupted before image could be saved", e);
            c();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            this.e.a.i("Unable to save image.  Camera likely shutdown.", e2);
            c();
        } catch (TimeoutException e3) {
            this.e.a.i("Timeout retrieving image metadata, aborting the shot", e3);
            c();
        }
    }
}
