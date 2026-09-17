package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class lqg {
    public final lxv a;
    public final Set b = new HashSet();
    private final luk c;
    private final lqp d;
    private final ljf e;
    private final lis f;

    public lqg(luk lukVar, lxv lxvVar, lqp lqpVar, lis lisVar, ljf ljfVar) {
        this.c = lukVar;
        this.a = lxvVar;
        this.d = lqpVar;
        this.e = ljfVar;
        this.f = lisVar.a("FrameStreamMap");
    }

    private final ojz c(final long j, final int i, final ope opeVar) {
        return obr.au(new ojz() { // from class: lqf
            @Override // defpackage.ojz
            public final Object a() {
                lqg lqgVar = this.a;
                ope opeVar2 = opeVar;
                long j2 = j;
                int i2 = i;
                ArrayList arrayList = new ArrayList(opeVar2.size() + 1);
                oti otiVarListIterator = opeVar2.listIterator();
                while (otiVarListIterator.hasNext()) {
                    arrayList.add(((ltw) otiVarListIterator.next()).b.a.b());
                }
                if (j2 > 0) {
                    arrayList.add(lcv.j(lqgVar.a.b(), new lgj(j2, 2)));
                }
                if (i2 > 0) {
                    arrayList.add(lcv.g(Long.valueOf(i2)));
                }
                return lcv.j(lcv.f(arrayList), new lqe(i2, 0));
            }
        });
    }

    private final ope d(Set set) {
        if (set.isEmpty()) {
            return orx.a;
        }
        opc opcVarD = ope.D();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            lnq lnqVar = (lnq) it.next();
            if (this.d.a(lnqVar.a)) {
                lis lisVar = this.f;
                String strValueOf = String.valueOf(lnqVar.a);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 32);
                sb.append("Ignoring blacklisted parameter: ");
                sb.append(strValueOf);
                lisVar.f(sb.toString());
            } else {
                opcVarD.d(lnqVar);
            }
        }
        return opcVarD.f();
    }

    public final lqd a(lnx lnxVar, Set set) {
        int i;
        int iMin;
        String string;
        this.e.e("createFrameStream");
        long jA = this.a.a();
        lui luiVar = (lui) lnxVar;
        long jF = luiVar.f();
        boolean zI = luiVar.i();
        obr.ar(jF >= 0, "bytesPerImage() must be >= 0", new Object[0]);
        boolean z = lnxVar instanceof ltw;
        if (z) {
            i = ((ltw) lnxVar).e;
            obr.ar(i > 0, "Stream capacity must be > 0", new Object[0]);
        } else {
            i = Integer.MAX_VALUE;
        }
        if (jF == 0 && i == Integer.MAX_VALUE) {
            iMin = -1;
        } else {
            iMin = Math.min((jF <= 0 || zI) ? Integer.MAX_VALUE : (int) (jA / jF), i);
        }
        long jF2 = luiVar.i() ? 0L : luiVar.f();
        ope opeVarH = z ? ope.H((ltw) lnxVar) : orx.a;
        lqd lqdVar = new lqd(ope.H(lnxVar), opeVarH, lnxVar instanceof lty ? ope.H((lty) lnxVar) : orx.a, d(set), iMin, c(jF2, iMin, opeVarH));
        this.e.f();
        this.b.add(lqdVar);
        lis lisVar = this.f;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[4];
        objArr[0] = lqdVar;
        objArr[1] = lnxVar;
        double d = lqdVar.f;
        Double.isNaN(d);
        objArr[2] = Double.valueOf(d / 1048576.0d);
        if (iMin < 0 || iMin == Integer.MAX_VALUE) {
            string = "";
        } else {
            int i2 = lqdVar.e;
            StringBuilder sb = new StringBuilder(28);
            sb.append(" with ");
            sb.append(i2);
            sb.append(" frames max");
            string = sb.toString();
        }
        objArr[3] = string;
        lisVar.f(String.format(locale, "Created %-10s from [%s] %6.2f MiB/frame%s", objArr));
        return lqdVar;
    }

    public final lqd b(Set set, Set set2) {
        int iMin;
        String string;
        this.e.e("createFrameStream");
        ope opeVarF = ope.F(set);
        luk lukVar = this.c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            lnx lnxVar = (lnx) it.next();
            lnxVar.getClass();
            obr.aG(lukVar.a.contains(lnxVar), String.valueOf(lnxVar.toString()).concat(" is not available on this FrameServer."));
        }
        long jA = this.a.a();
        long jAW = mip.aW(opeVarF);
        Iterator<E> it2 = opeVarF.iterator();
        int iMin2 = Integer.MAX_VALUE;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            lnx lnxVar2 = (lnx) it2.next();
            if (lnxVar2 instanceof ltw) {
                int i = ((ltw) lnxVar2).e;
                obr.ar(i > 0, "Stream capacity must be > 0", new Object[0]);
                iMin2 = Math.min(iMin2, i);
            }
        }
        if (jAW > 0 || iMin2 != Integer.MAX_VALUE) {
            iMin = Math.min(jAW > 0 ? (int) (jA / jAW) : Integer.MAX_VALUE, iMin2);
        } else {
            iMin = -1;
        }
        long jAW2 = mip.aW(set);
        opc opcVarD = ope.D();
        Iterator it3 = set.iterator();
        while (it3.hasNext()) {
            lnx lnxVar3 = (lnx) it3.next();
            if (lnxVar3 instanceof ltw) {
                opcVarD.d((ltw) lnxVar3);
            }
        }
        ope opeVarF2 = opcVarD.f();
        ope opeVarD = d(set2);
        opc opcVarD2 = ope.D();
        Iterator it4 = set.iterator();
        while (it4.hasNext()) {
            lnx lnxVar4 = (lnx) it4.next();
            if (lnxVar4 instanceof lty) {
                opcVarD2.d((lty) lnxVar4);
            }
        }
        lqd lqdVar = new lqd(opeVarF, opeVarF2, opcVarD2.f(), opeVarD, iMin, c(jAW2, iMin, opeVarF2));
        this.e.f();
        this.b.add(lqdVar);
        lis lisVar = this.f;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[4];
        objArr[0] = lqdVar;
        objArr[1] = opeVarF;
        double d = lqdVar.f;
        Double.isNaN(d);
        objArr[2] = Double.valueOf(d / 1048576.0d);
        if (iMin < 0 || iMin == Integer.MAX_VALUE) {
            string = "";
        } else {
            int i2 = lqdVar.e;
            StringBuilder sb = new StringBuilder(28);
            sb.append(" with ");
            sb.append(i2);
            sb.append(" frames max");
            string = sb.toString();
        }
        objArr[3] = string;
        lisVar.f(String.format(locale, "Created %-10s from %s %.2f MiB/frame%s", objArr));
        return lqdVar;
    }
}
