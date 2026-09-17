package com.google.android.libraries.vision.visionkit.f250.internal.uploader.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.aml;
import defpackage.mdf;
import defpackage.nmo;
import defpackage.nnr;
import defpackage.nnw;
import defpackage.nnx;
import defpackage.nnz;
import defpackage.noj;
import defpackage.nom;
import defpackage.noq;
import defpackage.npe;
import defpackage.nqh;
import defpackage.nqi;
import defpackage.nrk;
import defpackage.nrl;
import defpackage.nrm;
import defpackage.nro;
import defpackage.nrp;
import defpackage.nrq;
import defpackage.nrs;
import defpackage.nst;
import defpackage.nsu;
import defpackage.nsv;
import defpackage.ohh;
import defpackage.qbu;
import defpackage.qkl;
import defpackage.qks;
import defpackage.qkx;
import defpackage.qlh;
import defpackage.qlp;
import defpackage.qmd;
import defpackage.qno;
import defpackage.qqf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class F250AutoWorker extends CoroutineWorker {
    public final mdf g;
    public final nrm h;
    private final nnz i;
    private final nsv j;
    private final nom k;
    private final nrk l;
    private final qqf m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F250AutoWorker(mdf mdfVar, nrm nrmVar, nnz nnzVar, nsv nsvVar, nom nomVar, nrk nrkVar, qqf qqfVar, Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        mdfVar.getClass();
        nrmVar.getClass();
        nnzVar.getClass();
        nsvVar.getClass();
        nomVar.getClass();
        nrkVar.getClass();
        qqfVar.getClass();
        context.getClass();
        workerParameters.getClass();
        this.g = mdfVar;
        this.h = nrmVar;
        this.i = nnzVar;
        this.j = nsvVar;
        this.k = nomVar;
        this.l = nrkVar;
        this.m = qqfVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object b(qlh qlhVar) throws Throwable {
        nrp nrpVar;
        if (qlhVar instanceof nrp) {
            nrpVar = (nrp) qlhVar;
            int i = nrpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nrpVar.c = i - Integer.MIN_VALUE;
            } else {
                nrpVar = new nrp(this, qlhVar);
            }
        } else {
            nrpVar = new nrp(this, qlhVar);
        }
        Object objK = nrpVar.a;
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        switch (nrpVar.c) {
            case 0:
                qmd.M(objK);
                qqf qqfVar = this.m;
                nrq nrqVar = new nrq(this, null);
                nrpVar.c = 1;
                objK = qmd.k(qqfVar, nrqVar, nrpVar);
                if (objK == qlpVar) {
                    return qlpVar;
                }
                break;
            case 1:
                qmd.M(objK);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objK.getClass();
        return objK;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(nrl nrlVar, qlh qlhVar) throws Throwable {
        nro nroVar;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        if (qlhVar instanceof nro) {
            nroVar = (nro) qlhVar;
            int i = nroVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                nroVar.e = i - Integer.MIN_VALUE;
            } else {
                nroVar = new nro(this, qlhVar);
            }
        } else {
            nroVar = new nro(this, qlhVar);
        }
        Object objAe = nroVar.c;
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        switch (nroVar.e) {
            case 0:
                qmd.M(objAe);
                nnz nnzVar = this.i;
                nroVar.a = this;
                nroVar.b = nrlVar;
                nroVar.e = 1;
                objAe = ohh.ae(nnzVar.c, nrlVar, new nnw(nnzVar, null), nroVar);
                if (objAe != qlpVar) {
                    obj = this;
                    obj2 = nrlVar;
                    qbu qbuVarA = ((F250AutoWorker) obj).k.a((nrl) obj2, (List) objAe);
                    nroVar.a = obj;
                    nroVar.b = obj2;
                    nroVar.e = 2;
                    objAe = qno.H(qbuVarA, nroVar);
                    if (objAe != qlpVar) {
                        obj3 = obj;
                        obj4 = obj2;
                        qkl qklVar = (qkl) objAe;
                        ((F250AutoWorker) obj3).h.a(nrl.e((nrl) obj4, (List) qklVar.a, (List) qklVar.b, 13, 8));
                        return qks.a;
                    }
                }
                return qlpVar;
            case 1:
                Object obj5 = nroVar.b;
                obj = nroVar.a;
                qmd.M(objAe);
                obj2 = obj5;
                qbu qbuVarA2 = ((F250AutoWorker) obj).k.a((nrl) obj2, (List) objAe);
                nroVar.a = obj;
                nroVar.b = obj2;
                nroVar.e = 2;
                objAe = qno.H(qbuVarA2, nroVar);
                if (objAe != qlpVar) {
                    obj3 = obj;
                    obj4 = obj2;
                    qkl qklVar2 = (qkl) objAe;
                    ((F250AutoWorker) obj3).h.a(nrl.e((nrl) obj4, (List) qklVar2.a, (List) qklVar2.b, 13, 8));
                    return qks.a;
                }
                return qlpVar;
            case 2:
                Object obj6 = nroVar.b;
                obj3 = nroVar.a;
                qmd.M(objAe);
                obj4 = obj6;
                qkl qklVar3 = (qkl) objAe;
                ((F250AutoWorker) obj3).h.a(nrl.e((nrl) obj4, (List) qklVar3.a, (List) qklVar3.b, 13, 8));
                return qks.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r8 != r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.nrl r7, defpackage.qlh r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.nrr
            if (r0 == 0) goto L13
            r0 = r8
            nrr r0 = (defpackage.nrr) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            nrr r0 = new nrr
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            qlp r1 = defpackage.qlp.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            switch(r2) {
                case 0: goto L3a;
                case 1: goto L32;
                case 2: goto L2a;
                default: goto L22;
            }
        L22:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2a:
            java.lang.Object r7 = r0.b
            java.lang.Object r0 = r0.a
            defpackage.qmd.M(r8)
            goto L8d
        L32:
            java.lang.Object r7 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.qmd.M(r8)
            goto L54
        L3a:
            defpackage.qmd.M(r8)
            nnz r8 = r6.i
            r0.a = r6
            r0.b = r7
            r0.e = r3
            nrm r2 = r8.c
            nny r4 = new nny
            r5 = 0
            r4.<init>(r8, r5)
            java.lang.Object r8 = defpackage.ohh.ae(r2, r7, r4, r0)
            if (r8 == r1) goto L9d
            r2 = r6
        L54:
            prl r8 = (defpackage.prl) r8
            if (r8 != 0) goto L59
            goto L8c
        L59:
            r4 = r2
            com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250AutoWorker r4 = (com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250AutoWorker) r4
            nrk r4 = r4.l
            r5 = r7
            nrl r5 = (defpackage.nrl) r5
            qbd r8 = r4.a(r5, r8)
            r0.a = r2
            r0.b = r7
            r4 = 2
            r0.e = r4
            qpo r4 = new qpo
            qlh r0 = defpackage.qmd.c(r0)
            r4.<init>(r0, r3)
            r4.r()
            qvx r0 = new qvx
            r0.<init>(r4)
            r8.e(r0)
            java.lang.Object r8 = r4.g()
            qlp r0 = defpackage.qlp.COROUTINE_SUSPENDED
            if (r8 == r0) goto L8a
            qks r8 = defpackage.qks.a
        L8a:
            if (r8 == r1) goto L9d
        L8c:
            r0 = r2
        L8d:
            com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250AutoWorker r0 = (com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250AutoWorker) r0
            nrm r8 = r0.h
            nrl r7 = (defpackage.nrl) r7
            nna r7 = defpackage.nrl.a(r7)
            r8.a(r7)
            qks r7 = defpackage.qks.a
            return r7
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250AutoWorker.l(nrl, qlh):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007c  */
    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x011a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0139 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object m(nrl nrlVar, qlh qlhVar) throws Throwable {
        nrs nrsVar;
        Object obj;
        Object obj2;
        nsv nsvVar;
        aml amlVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        qbu qbuVarI;
        Object obj3;
        nqh nqhVar;
        nrl nrlVar2;
        boolean zA;
        Iterator it;
        Object obj4;
        nrl nrlVar3 = nrlVar;
        if (qlhVar instanceof nrs) {
            nrsVar = (nrs) qlhVar;
            int i = nrsVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                nrsVar.e = i - Integer.MIN_VALUE;
            } else {
                nrsVar = new nrs(this, qlhVar);
            }
        } else {
            nrsVar = new nrs(this, qlhVar);
        }
        Object objAe = nrsVar.c;
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        npe npeVar = null;
        switch (nrsVar.e) {
            case 0:
                qmd.M(objAe);
                nnz nnzVar = this.i;
                nrsVar.a = this;
                nrsVar.b = nrlVar3;
                nrsVar.e = 1;
                objAe = ohh.ae(nnzVar.c, nrlVar3, new nnx(nnzVar, null), nrsVar);
                if (objAe == qlpVar) {
                    return qlpVar;
                }
                obj = this;
                obj2 = nrlVar3;
                List list = (List) objAe;
                nsvVar = ((F250AutoWorker) obj).j;
                amlVar = nmo.a;
                obj2.getClass();
                list.getClass();
                amlVar.getClass();
                arrayList = new ArrayList();
                for (Object obj5 : list) {
                    nqi nqiVar = (nqi) obj5;
                    nqhVar = nqiVar.a;
                    List list2 = nqiVar.b;
                    nrlVar2 = (nrl) obj2;
                    zA = nsvVar.b.a(nrlVar2, nqhVar, npeVar);
                    it = list2.iterator();
                    while (it.hasNext()) {
                        zA = !zA && nsvVar.b.a(nrlVar2, nqhVar, (npe) it.next());
                    }
                    if (zA) {
                        arrayList.add(obj5);
                        npeVar = null;
                    } else {
                        npeVar = null;
                    }
                }
                if (arrayList.isEmpty()) {
                    qbuVarI = qbu.k(qmd.K(qkx.a, qkx.a));
                } else {
                    noq noqVar = nsvVar.a;
                    arrayList2 = new ArrayList();
                    for (Object obj6 : arrayList) {
                        if (((nqi) obj6).a.r.e == nnr.UPLOAD_NOT_REQUESTED) {
                            arrayList2.add(obj6);
                        }
                    }
                    nrl nrlVar4 = (nrl) obj2;
                    qbuVarI = noqVar.e(nrlVar4, arrayList2, noj.k, new nst(nrlVar4)).i(new nsu(nsvVar, nrlVar4, amlVar));
                }
                nrsVar.a = obj;
                nrsVar.b = obj2;
                nrsVar.e = 2;
                objAe = qno.H(qbuVarI, nrsVar);
                if (objAe != qlpVar) {
                    return qlpVar;
                }
                obj3 = obj;
                obj4 = obj2;
                qkl qklVar = (qkl) objAe;
                ((F250AutoWorker) obj3).h.a(nrl.e((nrl) obj4, (List) qklVar.a, (List) qklVar.b, 12, 8));
                return qks.a;
            case 1:
                Object obj7 = nrsVar.b;
                obj = nrsVar.a;
                qmd.M(objAe);
                obj2 = obj7;
                List list3 = (List) objAe;
                nsvVar = ((F250AutoWorker) obj).j;
                amlVar = nmo.a;
                obj2.getClass();
                list3.getClass();
                amlVar.getClass();
                arrayList = new ArrayList();
                while (r2.hasNext()) {
                    nqi nqiVar2 = (nqi) obj5;
                    nqhVar = nqiVar2.a;
                    List list4 = nqiVar2.b;
                    nrlVar2 = (nrl) obj2;
                    zA = nsvVar.b.a(nrlVar2, nqhVar, npeVar);
                    it = list4.iterator();
                    while (it.hasNext()) {
                        if (zA) {
                        }
                    }
                    if (zA) {
                        arrayList.add(obj5);
                        npeVar = null;
                    } else {
                        npeVar = null;
                    }
                }
                if (arrayList.isEmpty()) {
                    qbuVarI = qbu.k(qmd.K(qkx.a, qkx.a));
                } else {
                    noq noqVar2 = nsvVar.a;
                    arrayList2 = new ArrayList();
                    while (r7.hasNext()) {
                        if (((nqi) obj6).a.r.e == nnr.UPLOAD_NOT_REQUESTED) {
                            arrayList2.add(obj6);
                        }
                    }
                    nrl nrlVar5 = (nrl) obj2;
                    qbuVarI = noqVar2.e(nrlVar5, arrayList2, noj.k, new nst(nrlVar5)).i(new nsu(nsvVar, nrlVar5, amlVar));
                }
                nrsVar.a = obj;
                nrsVar.b = obj2;
                nrsVar.e = 2;
                objAe = qno.H(qbuVarI, nrsVar);
                if (objAe != qlpVar) {
                    return qlpVar;
                }
                obj3 = obj;
                obj4 = obj2;
                qkl qklVar2 = (qkl) objAe;
                ((F250AutoWorker) obj3).h.a(nrl.e((nrl) obj4, (List) qklVar2.a, (List) qklVar2.b, 12, 8));
                return qks.a;
            case 2:
                Object obj8 = nrsVar.b;
                obj3 = nrsVar.a;
                qmd.M(objAe);
                obj4 = obj8;
                qkl qklVar3 = (qkl) objAe;
                ((F250AutoWorker) obj3).h.a(nrl.e((nrl) obj4, (List) qklVar3.a, (List) qklVar3.b, 12, 8));
                return qks.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
