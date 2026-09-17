package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nql {
    /* JADX WARN: Code duplicated, block: B:19:0x0073  */
    /* JADX WARN: Code duplicated, block: B:23:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x00dc A[PHI: r12
      0x00dc: PHI (r12v15 java.lang.Object) = (r12v14 java.lang.Object), (r12v1 java.lang.Object) binds: [B:22:0x00d9, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00de  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object b(nql nqlVar, qlh qlhVar) {
        nqj nqjVar;
        Object obj;
        nqu nquVar;
        Object obj2;
        if (qlhVar instanceof nqj) {
            nqjVar = (nqj) qlhVar;
            int i = nqjVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqjVar.d = i - Integer.MIN_VALUE;
            } else {
                nqjVar = new nqj(nqlVar, qlhVar);
            }
        } else {
            nqjVar = new nqj(nqlVar, qlhVar);
        }
        Object objC = nqjVar.b;
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        switch (nqjVar.d) {
            case 0:
                qmd.M(objC);
                nqjVar.a = nqlVar;
                nqjVar.d = 1;
                nqu nquVar2 = (nqu) nqlVar;
                objC = adg.c(nquVar2.a, new nqm(nquVar2, qmd.H(new nnr[]{nnr.UPLOAD_PENDING, nnr.UPLOAD_IN_PROGRESS, nnr.UPLOAD_PAUSED}), nnr.UPLOAD_FAILED_PERMANENTLY, nmr.IN_AIRLOCK), nqjVar);
                obj = nqlVar;
                if (objC == qlpVar) {
                    return qlpVar;
                }
                if (((Number) objC).intValue() > 0) {
                    return qkx.a;
                }
                nqjVar.a = obj;
                nqjVar.d = 2;
                nquVar = (nqu) obj;
                if (adg.c(nquVar.a, new nqn(nquVar, qmd.H(new nmt[]{nmt.ANNOTATION, nmt.ATTACHMENT}), qmd.H(new nnr[]{nnr.UPLOAD_PENDING, nnr.UPLOAD_IN_PROGRESS, nnr.UPLOAD_PAUSED}), nnr.UPLOAD_FAILED_PERMANENTLY), nqjVar) == qlpVar) {
                    obj2 = obj;
                    return qlpVar;
                }
                obj2 = obj;
                nqjVar.a = null;
                nqjVar.d = 3;
                nnr nnrVar = nnr.UPLOAD_FAILED_PERMANENTLY;
                nmr nmrVar = nmr.IN_AIRLOCK;
                ais aisVarA = ais.a("\n      SELECT * FROM ResourceEntity\n      WHERE\n        status_uploadState = ?\n        AND (\n          status_airlockFileState IS NOT ?\n          OR namespaceId IS NULL\n          OR partitionId IS NULL\n        )\n    ", 2);
                aisVarA.e(1, npy.r(nnrVar));
                aisVarA.e(2, npy.a(nmrVar));
                nqu nquVar3 = (nqu) obj2;
                objC = adg.b(nquVar3.a, akf.b(), new nqr(nquVar3, aisVarA), nqjVar);
                if (objC == qlpVar) {
                    return qlpVar;
                }
                return objC;
            case 1:
                Object obj3 = nqjVar.a;
                qmd.M(objC);
                obj = obj3;
                if (((Number) objC).intValue() > 0) {
                    return qkx.a;
                }
                nqjVar.a = obj;
                nqjVar.d = 2;
                nquVar = (nqu) obj;
                if (adg.c(nquVar.a, new nqn(nquVar, qmd.H(new nmt[]{nmt.ANNOTATION, nmt.ATTACHMENT}), qmd.H(new nnr[]{nnr.UPLOAD_PENDING, nnr.UPLOAD_IN_PROGRESS, nnr.UPLOAD_PAUSED}), nnr.UPLOAD_FAILED_PERMANENTLY), nqjVar) == qlpVar) {
                    obj2 = obj;
                    return qlpVar;
                }
                obj2 = obj;
                nqjVar.a = null;
                nqjVar.d = 3;
                nnr nnrVar2 = nnr.UPLOAD_FAILED_PERMANENTLY;
                nmr nmrVar2 = nmr.IN_AIRLOCK;
                ais aisVarA2 = ais.a("\n      SELECT * FROM ResourceEntity\n      WHERE\n        status_uploadState = ?\n        AND (\n          status_airlockFileState IS NOT ?\n          OR namespaceId IS NULL\n          OR partitionId IS NULL\n        )\n    ", 2);
                aisVarA2.e(1, npy.r(nnrVar2));
                aisVarA2.e(2, npy.a(nmrVar2));
                nqu nquVar4 = (nqu) obj2;
                objC = adg.b(nquVar4.a, akf.b(), new nqr(nquVar4, aisVarA2), nqjVar);
                if (objC == qlpVar) {
                    return qlpVar;
                }
                return objC;
            case 2:
                Object obj4 = nqjVar.a;
                qmd.M(objC);
                obj2 = obj4;
                obj2 = obj;
                nqjVar.a = null;
                nqjVar.d = 3;
                nnr nnrVar3 = nnr.UPLOAD_FAILED_PERMANENTLY;
                nmr nmrVar3 = nmr.IN_AIRLOCK;
                ais aisVarA3 = ais.a("\n      SELECT * FROM ResourceEntity\n      WHERE\n        status_uploadState = ?\n        AND (\n          status_airlockFileState IS NOT ?\n          OR namespaceId IS NULL\n          OR partitionId IS NULL\n        )\n    ", 2);
                aisVarA3.e(1, npy.r(nnrVar3));
                aisVarA3.e(2, npy.a(nmrVar3));
                nqu nquVar5 = (nqu) obj2;
                objC = adg.b(nquVar5.a, akf.b(), new nqr(nquVar5, aisVarA3), nqjVar);
                if (objC == qlpVar) {
                    return qlpVar;
                }
                return objC;
            case 3:
                qmd.M(objC);
                return objC;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object e(nql nqlVar, qlh qlhVar) {
        nqk nqkVar;
        nqi nqiVar;
        nqh nqhVar;
        long j;
        nqi nqiVar2;
        Object obj;
        if (qlhVar instanceof nqk) {
            nqkVar = (nqk) qlhVar;
            int i = nqkVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqkVar.e = i - Integer.MIN_VALUE;
            } else {
                nqkVar = new nqk(nqlVar, qlhVar);
            }
        } else {
            nqkVar = new nqk(nqlVar, qlhVar);
        }
        Object objB = nqkVar.c;
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        switch (nqkVar.e) {
            case 0:
                qmd.M(objB);
                nqkVar.a = nqlVar;
                nqkVar.e = 1;
                Set setH = qmd.H(new nnr[]{nnr.UPLOAD_PENDING, nnr.UPLOAD_PAUSED});
                nmr nmrVar = nmr.IN_AIRLOCK;
                StringBuilder sbE = fz.e();
                sbE.append("\n      SELECT * FROM ResourceEntity\n      WHERE\n        status_uploadState IN (");
                int size = setH.size();
                fz.f(sbE, size);
                sbE.append(")\n        AND status_airlockFileState IS ?\n        AND namespaceId IS NOT NULL\n        AND partitionId IS NOT NULL\n      ORDER BY status_uploadToF250RequestedEpochTimestamp ASC\n      LIMIT 1\n    ");
                int i2 = size + 1;
                ais aisVarA = ais.a(sbE.toString(), i2);
                Iterator it = setH.iterator();
                int i3 = 1;
                while (it.hasNext()) {
                    aisVarA.e(i3, npy.r((nnr) it.next()));
                    i3++;
                }
                aisVarA.e(i2, npy.a(nmrVar));
                nqu nquVar = (nqu) nqlVar;
                objB = adg.b(nquVar.a, akf.b(), new nqt(nquVar, aisVarA), nqkVar);
                if (objB != qlpVar) {
                    nqiVar = (nqi) objB;
                    if (nqiVar == null) {
                        return null;
                    }
                    nqhVar = nqiVar.a;
                    j = nqhVar.s;
                    nqkVar.a = nqiVar;
                    nqkVar.b = nqhVar;
                    nqkVar.e = 2;
                    if (nqlVar.c(j, nnr.UPLOAD_IN_PROGRESS, nqkVar) != qlpVar) {
                        nqiVar2 = nqiVar;
                        obj = nqhVar;
                        nqh nqhVar2 = (nqh) obj;
                        return new nqi(nqh.d(nqhVar2, null, null, npk.a(nqhVar2.r, null, null, null, nnr.UPLOAD_IN_PROGRESS, 0.0d, 47), 786431), nqiVar2.b);
                    }
                }
                return qlpVar;
            case 1:
                nqlVar = (nql) nqkVar.a;
                qmd.M(objB);
                nqiVar = (nqi) objB;
                if (nqiVar == null) {
                    return null;
                }
                nqhVar = nqiVar.a;
                j = nqhVar.s;
                nqkVar.a = nqiVar;
                nqkVar.b = nqhVar;
                nqkVar.e = 2;
                if (nqlVar.c(j, nnr.UPLOAD_IN_PROGRESS, nqkVar) != qlpVar) {
                    nqiVar2 = nqiVar;
                    obj = nqhVar;
                    nqh nqhVar3 = (nqh) obj;
                    return new nqi(nqh.d(nqhVar3, null, null, npk.a(nqhVar3.r, null, null, null, nnr.UPLOAD_IN_PROGRESS, 0.0d, 47), 786431), nqiVar2.b);
                }
                return qlpVar;
            case 2:
                obj = nqkVar.b;
                nqiVar2 = (nqi) nqkVar.a;
                qmd.M(objB);
                nqh nqhVar4 = (nqh) obj;
                return new nqi(nqh.d(nqhVar4, null, null, npk.a(nqhVar4.r, null, null, null, nnr.UPLOAD_IN_PROGRESS, 0.0d, 47), 786431), nqiVar2.b);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public Object a(qlh qlhVar) {
        throw null;
    }

    public abstract Object c(long j, nnr nnrVar, qlh qlhVar);

    public Object d(qlh qlhVar) {
        throw null;
    }

    public abstract Object f(nnr nnrVar, qlh qlhVar);
}
