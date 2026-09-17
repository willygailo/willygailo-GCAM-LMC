package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nty implements nth {
    public final nrm a;
    public final noq b;
    public final ntg c;
    public final nre d;
    public final noc e;
    public final mdf f;
    public final nom g;
    public final nov h;
    public final ohh i;

    public nty(nrm nrmVar, noq noqVar, ntg ntgVar, nre nreVar, ohh ohhVar, nov novVar, noc nocVar, mdf mdfVar, nom nomVar, byte[] bArr, byte[] bArr2) {
        nrmVar.getClass();
        noqVar.getClass();
        ntgVar.getClass();
        nreVar.getClass();
        ohhVar.getClass();
        novVar.getClass();
        nocVar.getClass();
        mdfVar.getClass();
        nomVar.getClass();
        this.a = nrmVar;
        this.b = noqVar;
        this.c = ntgVar;
        this.d = nreVar;
        this.i = ohhVar;
        this.h = novVar;
        this.e = nocVar;
        this.f = mdfVar;
        this.g = nomVar;
    }

    @Override // defpackage.nth
    public final qbu a(nrl nrlVar, nqi nqiVar) {
        Object next;
        qbu qbuVarK;
        String strA;
        nrlVar.getClass();
        nqiVar.getClass();
        nqh nqhVar = nqiVar.a;
        Iterator it = nqiVar.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            npe npeVar = (npe) next;
            if (npeVar.b != nmt.NOT_FOR_UPLOAD && (npeVar.h.d != nmr.IN_AIRLOCK || !ntz.b.contains(npeVar.h.e) || (npeVar.h.e == nnr.UPLOADED_TO_F250 && npeVar.f == null))) {
                break;
            }
        }
        npe npeVar2 = (npe) next;
        if (nqhVar.c() == null) {
            strA = "Requested upload with no partition locator";
        } else if (nqhVar.r.d != nmr.IN_AIRLOCK) {
            strA = qno.a("Resource airlock state invalid ", nqhVar.r.d);
        } else {
            if (nqhVar.r.e == nnr.UPLOAD_IN_PROGRESS) {
                if (npeVar2 != null) {
                    strA = qno.a("Annotachment state invalid ", npeVar2.h);
                } else {
                    nrm nrmVar = this.a;
                    nqh nqhVar2 = nqiVar.a;
                    List list = nqiVar.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((npe) obj).b == nmt.ANNOTATION) {
                            arrayList.add(obj);
                        }
                    }
                    List list2 = nqiVar.b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (((npe) obj2).b == nmt.ATTACHMENT) {
                            arrayList2.add(obj2);
                        }
                    }
                    List list3 = nqiVar.b;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list3) {
                        if (((npe) obj3).b == nmt.NOT_FOR_UPLOAD) {
                            arrayList3.add(obj3);
                        }
                    }
                    List list4 = nqiVar.b;
                    ArrayList arrayList4 = new ArrayList(qmd.B(list4));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(Long.valueOf(((npe) it2.next()).i));
                    }
                    qbuVarK = qbu.k(new nuj(nrlVar, nqhVar2, arrayList, arrayList2, arrayList3, arrayList4, nrmVar));
                }
                return qbuVarK.i(new nts(this, 1)).i(new nts(this, 0)).i(new nts(this, 2)).l(noi.g).i(new ntt(this, nrlVar));
            }
            strA = qno.a("Resource upload state invalid ", nqhVar.r.e);
        }
        qbuVarK = this.b.d(nrlVar, nqiVar, noj.n).i(new nti(strA, this, nrlVar, nqhVar, npeVar2));
        return qbuVarK.i(new nts(this, 1)).i(new nts(this, 0)).i(new nts(this, 2)).l(noi.g).i(new ntt(this, nrlVar));
    }

    public final qbd b(nuj nujVar) {
        return this.b.d(nujVar.a, new nqi(nujVar.b, qmd.v(nujVar.c, nujVar.d)), noj.q).e();
    }
}
