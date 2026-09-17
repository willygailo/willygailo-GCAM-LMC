package defpackage;

import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250AutoWorker;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class nrv implements qco {
    final /* synthetic */ prl a;
    final /* synthetic */ nsb b;
    final /* synthetic */ nrl c;

    public nrv(prl prlVar, nsb nsbVar, nrl nrlVar) {
        this.a = prlVar;
        this.b = nsbVar;
        this.c = nrlVar;
    }

    @Override // defpackage.qco
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        int i;
        prl prlVarB;
        Object objPrevious;
        long jO;
        List list = (List) obj;
        list.getClass();
        prl prlVar = this.a;
        prl prlVarAg = ohh.ag(this.b.c);
        psf.c(prlVarAg);
        psf.c(prlVar);
        long jQ = oxh.Q(prlVar.a, prlVarAg.a);
        int i2 = prlVar.b;
        int i3 = prlVarAg.b;
        long j = ((long) i2) - ((long) i3);
        int i4 = (int) j;
        if (j != i4) {
            StringBuilder sb = new StringBuilder(51);
            sb.append("overflow: checkedSubtract(");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            sb.append(")");
            throw new ArithmeticException(sb.toString());
        }
        pop popVarB = psd.b(jQ, i4);
        popVarB.getClass();
        nsb nsbVar = this.b;
        and andVar = (and) nsbVar.a.get();
        prl prlVar2 = this.a;
        ListIterator listIterator = list.listIterator(list.size());
        do {
            i = 1;
            prlVarB = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((anc) objPrevious).b != 1);
        anc ancVar = (anc) objPrevious;
        if (ancVar != null) {
            Set<String> set = ancVar.a;
            ArrayList arrayList = new ArrayList();
            for (String str : set) {
                str.getClass();
                Long lI = qno.i(str);
                if (lI != null) {
                    arrayList.add(lI);
                }
            }
            Long l = (Long) qmd.t(arrayList);
            if (l != null) {
                prlVarB = psf.b(l.longValue());
            }
        }
        if (prlVarB == null) {
            prlVarB = psf.b;
        }
        if (ancVar == null) {
            i = 4;
        } else {
            prlVarB.getClass();
            psf.c(prlVar2);
            psf.c(prlVarB);
            long j2 = prlVar2.a;
            long j3 = prlVarB.a;
            int i5 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
            if (j2 == j3) {
                int i6 = prlVar2.b;
                int i7 = prlVarB.b;
                i5 = i6 == i7 ? 0 : i6 < i7 ? -1 : 1;
            }
            if (i5 >= 0) {
                i = 2;
            }
        }
        ane aneVar = new ane(F250AutoWorker.class);
        long jA = Long.MIN_VALUE;
        if (qno.c(popVarB, psd.b)) {
            jO = Long.MAX_VALUE;
        } else if (qno.c(popVarB, psd.a)) {
            jO = Long.MIN_VALUE;
        } else {
            psd.c(popVarB);
            jO = oxh.O(oxh.P(popVarB.a, 1000L), ((long) popVarB.b) / 1000000);
        }
        aneVar.b.f = TimeUnit.MILLISECONDS.toMillis(jO);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= aneVar.b.f) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
        prl prlVar3 = this.a;
        if (qno.c(prlVar3, psf.b)) {
            jA = Long.MAX_VALUE;
        } else if (!qno.c(prlVar3, psf.a)) {
            jA = psf.a(prlVar3);
        }
        aneVar.b(String.valueOf(jA));
        ana anaVarC = andVar.c("F250_AUTO_WORKER_TAG", i, aneVar.a());
        anaVarC.getClass();
        return nsbVar.c(anaVarC, this.c, 6);
    }
}
