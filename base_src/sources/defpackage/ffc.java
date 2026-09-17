package defpackage;

import android.graphics.Point;
import com.google.android.libraries.lens.lenslite.api.LinkChipResult;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class ffc {
    private final fjs a;
    private final imy b;

    public ffc(imy imyVar, fjs fjsVar, byte[] bArr) {
        this.b = imyVar;
        this.a = fjsVar;
    }

    final void a(LinkChipResult linkChipResult, mhe mheVar, int i, String str) {
        if (i == 3) {
            imy imyVar = this.b;
            if (((Long) imyVar.a.fA()).longValue() == 0) {
                imyVar.a.fB(Long.valueOf(System.currentTimeMillis()));
                i = 3;
            } else {
                i = 3;
            }
        }
        poy poyVarM = pcn.e.m();
        int i2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30}[linkChipResult.getResultType()];
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pcn pcnVar = (pcn) poyVarM.b;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        pcnVar.b = i3;
        pcnVar.a |= 1;
        int i4 = new int[]{1, 2, 3, 4}[linkChipResult.getActionType()];
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        pcn pcnVar2 = (pcn) poyVarM.b;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        pcnVar2.c = i5;
        pcnVar2.a |= 2;
        if (linkChipResult.getCenterpoint() != null) {
            poy poyVarM2 = pca.d.m();
            Point centerpoint = linkChipResult.getCenterpoint();
            centerpoint.getClass();
            float f = centerpoint.x;
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            pca pcaVar = (pca) poyVarM2.b;
            pcaVar.a |= 1;
            pcaVar.b = f;
            Point centerpoint2 = linkChipResult.getCenterpoint();
            centerpoint2.getClass();
            float f2 = centerpoint2.y;
            if (poyVarM2.c) {
                poyVarM2.m();
                poyVarM2.c = false;
            }
            pca pcaVar2 = (pca) poyVarM2.b;
            pcaVar2.a |= 2;
            pcaVar2.c = f2;
            pca pcaVar3 = (pca) poyVarM2.j();
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pcn pcnVar3 = (pcn) poyVarM.b;
            pcaVar3.getClass();
            pcnVar3.d = pcaVar3;
            pcnVar3.a |= 4;
        }
        pcn pcnVar4 = (pcn) poyVarM.j();
        long jLongValue = ((Long) this.b.a.fA()).longValue();
        ojc ojcVarI = jLongValue == 0 ? oih.a : ojc.i(Long.valueOf(jLongValue));
        poy poyVarM3 = pcl.h.m();
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        pcl pclVar = (pcl) poyVarM3.b;
        pcnVar4.getClass();
        pclVar.b = pcnVar4;
        int i6 = pclVar.a | 1;
        pclVar.a = i6;
        pclVar.c = i - 1;
        pclVar.a = i6 | 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        pcl pclVar2 = (pcl) poyVarM3.b;
        pclVar2.a |= 16;
        pclVar2.f = jCurrentTimeMillis;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        mhd mhdVar = mheVar.b;
        if (mhdVar == null) {
            mhdVar = mhd.b;
        }
        long millis = timeUnit.toMillis(mhdVar.a);
        if (poyVarM3.c) {
            poyVarM3.m();
            poyVarM3.c = false;
        }
        pcl pclVar3 = (pcl) poyVarM3.b;
        pclVar3.a |= 32;
        pclVar3.g = millis;
        if (ojcVarI.g()) {
            long jLongValue2 = ((Long) ojcVarI.c()).longValue();
            if (poyVarM3.c) {
                poyVarM3.m();
                poyVarM3.c = false;
            }
            pcl pclVar4 = (pcl) poyVarM3.b;
            pclVar4.a |= 8;
            pclVar4.e = jLongValue2;
        }
        mhc mhcVar = mheVar.c;
        if (mhcVar == null) {
            mhcVar = mhc.d;
        }
        nvu nvuVar = mhcVar.b;
        if (nvuVar == null) {
            nvuVar = nvu.b;
        }
        if (nvuVar.a.size() > 0) {
            mhc mhcVar2 = mheVar.c;
            if (mhcVar2 == null) {
                mhcVar2 = mhc.d;
            }
            nvu nvuVar2 = mhcVar2.b;
            if (nvuVar2 == null) {
                nvuVar2 = nvu.b;
            }
            int iAb = ohh.ab(((nvs) nvuVar2.a.get(0)).a);
            int i7 = iAb != 0 ? iAb : 1;
            oxh.ab();
            int i8 = oxh.ab()[i7 - 1];
            if (poyVarM3.c) {
                poyVarM3.m();
                poyVarM3.c = false;
            }
            pcl pclVar5 = (pcl) poyVarM3.b;
            int i9 = i8 - 1;
            if (i8 == 0) {
                throw null;
            }
            pclVar5.d = i9;
            pclVar5.a |= 4;
        }
        fjs fjsVar = this.a;
        poy poyVarM4 = pco.f.m();
        if (poyVarM4.c) {
            poyVarM4.m();
            poyVarM4.c = false;
        }
        pco pcoVar = (pco) poyVarM4.b;
        str.getClass();
        pcoVar.a |= 8;
        pcoVar.e = str;
        pcl pclVar6 = (pcl) poyVarM3.j();
        if (poyVarM4.c) {
            poyVarM4.m();
            poyVarM4.c = false;
        }
        pco pcoVar2 = (pco) poyVarM4.b;
        pclVar6.getClass();
        pcoVar2.c = pclVar6;
        pcoVar2.a |= 2;
        fjsVar.t((pco) poyVarM4.j());
    }
}
