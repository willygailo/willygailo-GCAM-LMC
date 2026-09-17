package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class noi implements qco {
    private final /* synthetic */ int i;
    public static final noi h = new noi(7);
    public static final noi g = new noi(6);
    public static final noi f = new noi(5);
    public static final noi e = new noi(4);
    public static final noi d = new noi(3);
    public static final noi c = new noi(2);
    public static final noi b = new noi(1);
    public static final noi a = new noi(0);

    public noi(int i) {
        this.i = i;
    }

    @Override // defpackage.qco
    public final /* synthetic */ Object a(Object obj) {
        int i;
        npe npeVar;
        int i2 = 0;
        switch (this.i) {
            case 0:
                qkl qklVar = (qkl) obj;
                qklVar.getClass();
                List list = (List) qklVar.a;
                List list2 = (List) qklVar.b;
                list.getClass();
                if (list.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                return new nqi((nqh) list.get(0), list2);
            case 1:
                ojc ojcVar = (ojc) obj;
                ojcVar.getClass();
                Object objF = ojcVar.f();
                if (objF != null) {
                    return objF;
                }
                throw new NullPointerException("From Future");
            case 2:
                List list3 = (List) obj;
                list3.getClass();
                return (npe) list3.get(0);
            case 3:
                qbh qbhVar = (qbh) obj;
                qbhVar.getClass();
                return qbhVar;
            case 4:
                nmn nmnVar = (nmn) obj;
                nmnVar.getClass();
                return nmnVar.a;
            case 5:
                qbh qbhVar2 = (qbh) obj;
                qbhVar2.getClass();
                return qbhVar2;
            case 6:
                nuj nujVar = (nuj) obj;
                nujVar.getClass();
                List list4 = nujVar.f;
                ArrayList arrayList = new ArrayList();
                Iterator it = list4.iterator();
                int i3 = 0;
                int i4 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Number) it.next()).longValue();
                    npe npeVar2 = (npe) qmd.u(nujVar.c, i2);
                    if (npeVar2 != null && jLongValue == npeVar2.i) {
                        i = i2 + 1;
                        npeVar = (npe) nujVar.c.get(i2);
                    } else {
                        npe npeVar3 = (npe) qmd.u(nujVar.d, i3);
                        if (npeVar3 != null && jLongValue == npeVar3.i) {
                            i = i2;
                            npeVar = (npe) nujVar.d.get(i3);
                            i3++;
                        } else {
                            npe npeVar4 = (npe) qmd.u(nujVar.e, i4);
                            if (npeVar4 != null && jLongValue == npeVar4.i) {
                                i = i2;
                                npeVar = (npe) nujVar.e.get(i4);
                                i4++;
                            } else {
                                nujVar.c(32, new IllegalStateException(qno.a("Missing annotachment for ", Long.valueOf(jLongValue))));
                                i = i2;
                                npeVar = null;
                            }
                        }
                    }
                    if (npeVar != null) {
                        arrayList.add(npeVar);
                    }
                    i2 = i;
                }
                nujVar.a(nujVar.c, i2, "annotations");
                nujVar.a(nujVar.d, i3, "attachments");
                return new nqi(nujVar.b, arrayList);
            default:
                qbh qbhVar3 = (qbh) obj;
                qbhVar3.getClass();
                return qbhVar3;
        }
    }
}
