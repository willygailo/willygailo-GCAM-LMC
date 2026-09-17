package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.content.Context;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.fob;
import defpackage.kgp;
import defpackage.kgs;
import defpackage.kgt;
import defpackage.khb;
import defpackage.khf;
import defpackage.kip;
import defpackage.kiw;
import defpackage.kix;
import defpackage.mdv;
import defpackage.mes;
import defpackage.mip;
import defpackage.ndf;
import defpackage.ndh;
import defpackage.ndm;
import defpackage.ndv;
import defpackage.obr;
import defpackage.oiv;
import defpackage.oje;
import defpackage.ojz;
import defpackage.pgb;
import defpackage.pgr;
import defpackage.phq;
import defpackage.pht;
import defpackage.pih;
import defpackage.poq;
import defpackage.ppa;
import defpackage.ppk;
import defpackage.pyk;
import defpackage.qaj;
import defpackage.qyk;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ClearcutMetricSnapshotTransmitter implements ndh {
    private static final ojz a = obr.au(fob.i);
    private volatile kgt b;
    private volatile kgt c;
    private final ojz d = obr.au(fob.h);

    @Override // defpackage.ndh
    public final pht a(Context context, ndf ndfVar) {
        kgt kgtVar;
        poq poqVar = ndm.i;
        ndfVar.j(poqVar);
        obr.aG(ndfVar.h.b.get(poqVar.d) != null, "ClearcutMetricSnapshotTransmitter received a snapshot without the expected extension.");
        qyk qykVar = ndfVar.b;
        if (qykVar == null) {
            qykVar = qyk.t;
        }
        qyk qykVarA = ndv.a(qykVar);
        if (qaj.a.a().a(context) && ((Boolean) this.d.a()).booleanValue()) {
            return phq.a;
        }
        poq poqVar2 = ndm.i;
        ndfVar.j(poqVar2);
        Object objK = ndfVar.h.k(poqVar2.d);
        if (objK == null) {
            objK = poqVar2.b;
        } else {
            poqVar2.d(objK);
        }
        ndm ndmVar = (ndm) objK;
        String str = ndmVar.b;
        if (ndmVar.d) {
            kgtVar = this.c;
            if (kgtVar == null) {
                synchronized (this) {
                    kgtVar = this.c;
                    if (kgtVar == null) {
                        kgt kgtVar2 = new kgt(context, str, kgs.f, khb.b(context), new khf(context));
                        this.c = kgtVar2;
                        kgtVar = kgtVar2;
                    }
                }
            }
        } else {
            kgtVar = this.b;
            if (kgtVar == null) {
                synchronized (this) {
                    kgtVar = this.b;
                    if (kgtVar == null) {
                        kgtVar = new kgt(context, str);
                        this.b = kgtVar;
                    }
                }
            }
        }
        kgp kgpVarA = kgtVar.a(qykVarA);
        if (qaj.a.a().b(context)) {
            kgpVarA.k = mes.a(context, (mdv) a.a());
        }
        String str2 = ndmVar.e;
        if (!oje.d(str2)) {
            if (kgpVarA.a.c()) {
                throw new IllegalStateException("setZwiebackCookieOverride forbidden on deidentified logger");
            }
            ppa ppaVar = kgpVarA.l;
            if (ppaVar.c) {
                ppaVar.m();
                ppaVar.c = false;
            }
            pyk pykVar = (pyk) ppaVar.b;
            pyk pykVar2 = pyk.j;
            str2.getClass();
            pykVar.a |= 16777216;
            pykVar.i = str2;
        }
        if (!ndmVar.d) {
            if ((ndmVar.a & 2) != 0) {
                String str3 = ndmVar.c;
                if (kgpVarA.a.c()) {
                    throw new IllegalArgumentException("addMendelPackage forbidden on deidentified logger");
                }
                if (kgpVarA.c == null) {
                    kgpVarA.c = new ArrayList();
                }
                kgpVarA.c.add(str3);
            }
            if ((ndmVar.a & 16) != 0) {
                String str4 = ndmVar.f;
                if (!kgpVarA.a.g.contains(kgs.ACCOUNT_NAME)) {
                    throw new IllegalStateException("setUploadAccountName forbidden on deidentified logger");
                }
                kgpVarA.f = str4;
            }
            ppk ppkVar = ndmVar.g;
            if (!ppkVar.isEmpty()) {
                Object[] array = ppkVar.toArray();
                int length = array.length;
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    Object obj = array[i];
                    obj.getClass();
                    iArr[i] = ((Number) obj).intValue();
                }
                if (kgpVarA.a.c()) {
                    throw new IllegalArgumentException("addExperimentIds forbidden on deidentified logger");
                }
                if (length != 0) {
                    if (kgpVarA.d == null) {
                        kgpVarA.d = new ArrayList();
                    }
                    for (int i2 = 0; i2 < length; i2++) {
                        kgpVarA.d.add(Integer.valueOf(iArr[i2]));
                    }
                }
            }
        }
        kip kipVarA = kgpVarA.a();
        final pih pihVarF = pih.f();
        kiw kiwVar = new kiw() { // from class: mfb
            @Override // defpackage.kiw
            public final void a(kiv kivVar) {
                pih pihVar = pihVarF;
                if (kivVar.a().g == 16) {
                    pihVar.cancel(false);
                    return;
                }
                if (kivVar.a().b()) {
                    pihVar.o(kivVar);
                } else if (kivVar.a().i != null) {
                    pihVar.a(new kit(kivVar.a()));
                } else {
                    pihVar.a(new kig(kivVar.a()));
                }
            }
        };
        synchronized (((BasePendingResult) kipVarA).d) {
            mip.dr(!((BasePendingResult) kipVarA).h, "Result has already been consumed.");
            kix kixVar = ((BasePendingResult) kipVarA).j;
            mip.dr(true, "Cannot set callbacks if then() has been called.");
            synchronized (((BasePendingResult) kipVarA).d) {
            }
            if (((BasePendingResult) kipVarA).k()) {
                ((BasePendingResult) kipVarA).e.a(kiwVar, ((BasePendingResult) kipVarA).g());
            } else {
                ((BasePendingResult) kipVarA).f = kiwVar;
            }
        }
        return pgb.h(pihVarF, new oiv(), pgr.INSTANCE);
    }
}
