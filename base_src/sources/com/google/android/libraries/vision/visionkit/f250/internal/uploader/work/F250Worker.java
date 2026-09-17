package com.google.android.libraries.vision.visionkit.f250.internal.uploader.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.mdf;
import defpackage.noj;
import defpackage.noq;
import defpackage.nor;
import defpackage.not;
import defpackage.nou;
import defpackage.npe;
import defpackage.nqh;
import defpackage.nqi;
import defpackage.nrl;
import defpackage.nrm;
import defpackage.nsc;
import defpackage.nsd;
import defpackage.nse;
import defpackage.nsf;
import defpackage.nsg;
import defpackage.nsi;
import defpackage.nsj;
import defpackage.nsm;
import defpackage.nsr;
import defpackage.nth;
import defpackage.ohh;
import defpackage.qbu;
import defpackage.qkl;
import defpackage.qks;
import defpackage.qlh;
import defpackage.qlp;
import defpackage.qmd;
import defpackage.qnm;
import defpackage.qno;
import defpackage.qqf;
import defpackage.qtr;
import defpackage.qtz;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class F250Worker extends CoroutineWorker {
    public final mdf g;
    public final nou h;
    public final nth i;
    public final nrm j;
    private final noq k;
    private final nsr l;
    private final int m;
    private final qqf n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F250Worker(mdf mdfVar, nou nouVar, noq noqVar, nth nthVar, nrm nrmVar, nsr nsrVar, int i, qqf qqfVar, Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        mdfVar.getClass();
        nouVar.getClass();
        noqVar.getClass();
        nthVar.getClass();
        nrmVar.getClass();
        nsrVar.getClass();
        qqfVar.getClass();
        context.getClass();
        workerParameters.getClass();
        this.g = mdfVar;
        this.h = nouVar;
        this.k = noqVar;
        this.i = nthVar;
        this.j = nrmVar;
        this.l = nsrVar;
        this.m = i;
        this.n = qqfVar;
    }

    private final void n(nrl nrlVar, qkl qklVar, int i) {
        this.j.a(nrl.e(nrlVar, (Collection) qklVar.a, (Collection) qklVar.b, i, 8));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object b(qlh qlhVar) throws Throwable {
        nsc nscVar;
        if (qlhVar instanceof nsc) {
            nscVar = (nsc) qlhVar;
            int i = nscVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nscVar.c = i - Integer.MIN_VALUE;
            } else {
                nscVar = new nsc(this, qlhVar);
            }
        } else {
            nscVar = new nsc(this, qlhVar);
        }
        Object objK = nscVar.a;
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        switch (nscVar.c) {
            case 0:
                qmd.M(objK);
                qqf qqfVar = this.n;
                nsd nsdVar = new nsd(this, null);
                nscVar.c = 1;
                objK = qmd.k(qqfVar, nsdVar, nscVar);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(nrl nrlVar, qlh qlhVar) throws Throwable {
        nse nseVar;
        Object obj;
        Object obj2;
        if (qlhVar instanceof nse) {
            nseVar = (nse) qlhVar;
            int i = nseVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                nseVar.e = i - Integer.MIN_VALUE;
            } else {
                nseVar = new nse(this, qlhVar);
            }
        } else {
            nseVar = new nse(this, qlhVar);
        }
        Object objAe = nseVar.c;
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        switch (nseVar.e) {
            case 0:
                qmd.M(objAe);
                nou nouVar = this.h;
                nseVar.a = this;
                nseVar.b = nrlVar;
                nseVar.e = 1;
                objAe = ohh.ae(nouVar.b, nrlVar, new nor(nouVar, null), nseVar);
                if (objAe == qlpVar) {
                    return qlpVar;
                }
                obj = this;
                obj2 = nrlVar;
                break;
                break;
            case 1:
                Object obj3 = nseVar.b;
                obj = nseVar.a;
                qmd.M(objAe);
                obj2 = obj3;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) objAe;
        if (!list.isEmpty()) {
            nrm nrmVar = ((F250Worker) obj).j;
            ArrayList arrayList = new ArrayList(qmd.B(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((nqi) it.next()).a);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                qmd.A(arrayList2, ((nqi) it2.next()).b);
            }
            nrmVar.a(nrl.e((nrl) obj2, arrayList, arrayList2, 10, 8));
        }
        return qks.a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007d  */
    /* JADX WARN: Code duplicated, block: B:24:0x008f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x0100  */
    /* JADX WARN: Code duplicated, block: B:38:0x011f  */
    /* JADX WARN: Code duplicated, block: B:40:0x013a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x013b A[PHI: r1 r5 r7
      0x013b: PHI (r1v4 java.lang.Object) = (r1v16 java.lang.Object), (r1v6 java.lang.Object) binds: [B:35:0x00fe, B:39:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r5v8 ??) = (r5v14 ??), (r5v11 ??) binds: [B:35:0x00fe, B:39:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r7v4 java.lang.Object) = (r7v2 java.lang.Object), (r7v5 java.lang.Object) binds: [B:35:0x00fe, B:39:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x0141  */
    /* JADX WARN: Code duplicated, block: B:45:0x0160  */
    /* JADX WARN: Code duplicated, block: B:47:0x0170 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0093 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [noq] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object l(nrl nrlVar, qlh qlhVar) throws Throwable {
        nsf nsfVar;
        Object obj;
        Object obj2;
        ArrayList arrayList;
        ArrayList arrayList2;
        List list;
        List list2;
        Object obj3;
        Object obj4;
        nqh nqhVar;
        List list3;
        Iterator it;
        npe npeVar;
        nsr nsrVar;
        ?? r5;
        Object obj5;
        Object obj6;
        Object obj7;
        nrl nrlVar2 = nrlVar;
        if (qlhVar instanceof nsf) {
            nsfVar = (nsf) qlhVar;
            int i = nsfVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                nsfVar.f = i - Integer.MIN_VALUE;
            } else {
                nsfVar = new nsf(this, qlhVar);
            }
        } else {
            nsfVar = new nsf(this, qlhVar);
        }
        Object objAe = nsfVar.d;
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        switch (nsfVar.f) {
            case 0:
                qmd.M(objAe);
                nou nouVar = this.h;
                nsfVar.a = this;
                nsfVar.b = nrlVar2;
                nsfVar.f = 1;
                objAe = ohh.ae(nouVar.b, nrlVar2, new not(nouVar, null), nsfVar);
                if (objAe == qlpVar) {
                    return qlpVar;
                }
                obj = this;
                obj2 = nrlVar2;
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                for (Object obj8 : (List) objAe) {
                    nqi nqiVar = (nqi) obj8;
                    nqhVar = nqiVar.a;
                    list3 = nqiVar.b;
                    if (list3.isEmpty()) {
                        it = list3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                npeVar = (npe) it.next();
                                nsrVar = ((F250Worker) obj).l;
                                obj2.getClass();
                                npeVar.getClass();
                                switch (npeVar.h.e.ordinal()) {
                                    case 2:
                                    case 3:
                                    case 4:
                                        if (!nsrVar.b.a(npeVar).exists()) {
                                            nsrVar.a.a(((nrl) obj2).c(30, new FileNotFoundException(qno.a("Annotachment file does not exist: ", nsrVar.b.a(npeVar).getPath())), nqhVar, npeVar));
                                            arrayList2.add(obj8);
                                        }
                                        break;
                                        break;
                                }
                            }
                        }
                    }
                    arrayList.add(obj8);
                }
                qkl qklVar = new qkl(arrayList, arrayList2);
                list = (List) qklVar.a;
                list2 = (List) qklVar.b;
                obj5 = obj2;
                r5 = list;
                if (!list2.isEmpty()) {
                    qbu qbuVarE = ((F250Worker) obj).k.e((nrl) obj2, list2, noj.g, noj.h);
                    nsfVar.a = obj;
                    nsfVar.b = obj2;
                    nsfVar.c = list;
                    nsfVar.f = 2;
                    objAe = qno.H(qbuVarE, nsfVar);
                    if (objAe != qlpVar) {
                        return qlpVar;
                    }
                    obj3 = obj2;
                    obj4 = list;
                    qkl qklVar2 = (qkl) objAe;
                    qklVar2.getClass();
                    ((F250Worker) obj).n((nrl) obj3, qklVar2, 10);
                    Object obj9 = obj3;
                    r5 = obj4;
                    obj5 = obj9;
                    if (!r5.isEmpty()) {
                        qbu qbuVarE2 = ((F250Worker) obj).k.e((nrl) obj5, r5, noj.i, noj.j);
                        nsfVar.a = obj;
                        nsfVar.b = obj5;
                        nsfVar.c = null;
                        nsfVar.f = 3;
                        objAe = qno.H(qbuVarE2, nsfVar);
                        if (objAe == qlpVar) {
                            return qlpVar;
                        }
                        obj6 = obj;
                        obj7 = obj5;
                        qkl qklVar3 = (qkl) objAe;
                        qklVar3.getClass();
                        ((F250Worker) obj6).n((nrl) obj7, qklVar3, 11);
                    }
                } else if (!r5.isEmpty()) {
                    qbu qbuVarE3 = ((F250Worker) obj).k.e((nrl) obj5, r5, noj.i, noj.j);
                    nsfVar.a = obj;
                    nsfVar.b = obj5;
                    nsfVar.c = null;
                    nsfVar.f = 3;
                    objAe = qno.H(qbuVarE3, nsfVar);
                    if (objAe == qlpVar) {
                        return qlpVar;
                    }
                    obj6 = obj;
                    obj7 = obj5;
                    qkl qklVar4 = (qkl) objAe;
                    qklVar4.getClass();
                    ((F250Worker) obj6).n((nrl) obj7, qklVar4, 11);
                }
                return qks.a;
            case 1:
                Object obj10 = nsfVar.b;
                Object obj11 = nsfVar.a;
                qmd.M(objAe);
                obj = obj11;
                obj2 = obj10;
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                while (r2.hasNext()) {
                    nqi nqiVar2 = (nqi) obj8;
                    nqhVar = nqiVar2.a;
                    list3 = nqiVar2.b;
                    if (list3.isEmpty()) {
                        it = list3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                npeVar = (npe) it.next();
                                nsrVar = ((F250Worker) obj).l;
                                obj2.getClass();
                                npeVar.getClass();
                                switch (npeVar.h.e.ordinal()) {
                                    case 2:
                                    case 3:
                                    case 4:
                                        if (!nsrVar.b.a(npeVar).exists()) {
                                            nsrVar.a.a(((nrl) obj2).c(30, new FileNotFoundException(qno.a("Annotachment file does not exist: ", nsrVar.b.a(npeVar).getPath())), nqhVar, npeVar));
                                            arrayList2.add(obj8);
                                        }
                                        break;
                                        break;
                                }
                            }
                        }
                    }
                    arrayList.add(obj8);
                }
                qkl qklVar5 = new qkl(arrayList, arrayList2);
                list = (List) qklVar5.a;
                list2 = (List) qklVar5.b;
                obj5 = obj2;
                r5 = list;
                if (!list2.isEmpty()) {
                    qbu qbuVarE4 = ((F250Worker) obj).k.e((nrl) obj2, list2, noj.g, noj.h);
                    nsfVar.a = obj;
                    nsfVar.b = obj2;
                    nsfVar.c = list;
                    nsfVar.f = 2;
                    objAe = qno.H(qbuVarE4, nsfVar);
                    if (objAe != qlpVar) {
                        return qlpVar;
                    }
                    obj3 = obj2;
                    obj4 = list;
                    qkl qklVar6 = (qkl) objAe;
                    qklVar6.getClass();
                    ((F250Worker) obj).n((nrl) obj3, qklVar6, 10);
                    Object obj12 = obj3;
                    r5 = obj4;
                    obj5 = obj12;
                    if (!r5.isEmpty()) {
                        qbu qbuVarE5 = ((F250Worker) obj).k.e((nrl) obj5, r5, noj.i, noj.j);
                        nsfVar.a = obj;
                        nsfVar.b = obj5;
                        nsfVar.c = null;
                        nsfVar.f = 3;
                        objAe = qno.H(qbuVarE5, nsfVar);
                        if (objAe == qlpVar) {
                            return qlpVar;
                        }
                        obj6 = obj;
                        obj7 = obj5;
                        qkl qklVar7 = (qkl) objAe;
                        qklVar7.getClass();
                        ((F250Worker) obj6).n((nrl) obj7, qklVar7, 11);
                    }
                } else if (!r5.isEmpty()) {
                    qbu qbuVarE6 = ((F250Worker) obj).k.e((nrl) obj5, r5, noj.i, noj.j);
                    nsfVar.a = obj;
                    nsfVar.b = obj5;
                    nsfVar.c = null;
                    nsfVar.f = 3;
                    objAe = qno.H(qbuVarE6, nsfVar);
                    if (objAe == qlpVar) {
                        return qlpVar;
                    }
                    obj6 = obj;
                    obj7 = obj5;
                    qkl qklVar8 = (qkl) objAe;
                    qklVar8.getClass();
                    ((F250Worker) obj6).n((nrl) obj7, qklVar8, 11);
                }
                return qks.a;
            case 2:
                Object obj13 = nsfVar.c;
                Object obj14 = nsfVar.b;
                obj = nsfVar.a;
                qmd.M(objAe);
                obj4 = obj13;
                obj3 = obj14;
                qkl qklVar9 = (qkl) objAe;
                qklVar9.getClass();
                ((F250Worker) obj).n((nrl) obj3, qklVar9, 10);
                Object obj15 = obj3;
                r5 = obj4;
                obj5 = obj15;
                if (!r5.isEmpty()) {
                    qbu qbuVarE7 = ((F250Worker) obj).k.e((nrl) obj5, r5, noj.i, noj.j);
                    nsfVar.a = obj;
                    nsfVar.b = obj5;
                    nsfVar.c = null;
                    nsfVar.f = 3;
                    objAe = qno.H(qbuVarE7, nsfVar);
                    if (objAe == qlpVar) {
                        return qlpVar;
                    }
                    obj6 = obj;
                    obj7 = obj5;
                    qkl qklVar10 = (qkl) objAe;
                    qklVar10.getClass();
                    ((F250Worker) obj6).n((nrl) obj7, qklVar10, 11);
                }
                return qks.a;
            case 3:
                Object obj16 = nsfVar.b;
                obj6 = nsfVar.a;
                qmd.M(objAe);
                obj7 = obj16;
                qkl qklVar11 = (qkl) objAe;
                qklVar11.getClass();
                ((F250Worker) obj6).n((nrl) obj7, qklVar11, 11);
                return qks.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final Object m(nrl nrlVar, qlh qlhVar) {
        nsi nsiVar;
        Object obj;
        ?? r1;
        Object obj2;
        ?? r2;
        if (qlhVar instanceof nsi) {
            nsiVar = (nsi) qlhVar;
            int i = nsiVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                nsiVar.g = i - Integer.MIN_VALUE;
            } else {
                nsiVar = new nsi(this, qlhVar);
            }
        } else {
            nsiVar = new nsi(this, qlhVar);
        }
        Object obj3 = nsiVar.e;
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        switch (nsiVar.g) {
            case 0:
                qmd.M(obj3);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                qtr qtrVarA = qtz.a(new nsm(qnm.x(new nsj(this, nrlVar, null)), this, nrlVar, 1), qno.f(this.m - 1, 1));
                nsg nsgVar = new nsg(arrayList, arrayList2);
                nsiVar.a = this;
                nsiVar.b = nrlVar;
                nsiVar.c = arrayList;
                nsiVar.d = arrayList2;
                nsiVar.g = 1;
                if (qtrVarA.a(nsgVar, nsiVar) == qlpVar) {
                    return qlpVar;
                }
                obj = this;
                r1 = arrayList;
                r2 = arrayList2;
                obj2 = nrlVar;
                break;
                break;
            case 1:
                Object obj4 = nsiVar.d;
                Object obj5 = nsiVar.c;
                Object obj6 = nsiVar.b;
                obj = nsiVar.a;
                qmd.M(obj3);
                r2 = obj4;
                obj2 = obj6;
                r1 = obj5;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((F250Worker) obj).j.a(nrl.e((nrl) obj2, r1, r2, 3, 8));
        return qks.a;
    }
}
