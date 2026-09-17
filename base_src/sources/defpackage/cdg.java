package defpackage;

import android.hardware.camera2.params.Face;
import android.util.Range;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cdg implements Comparator {
    private final /* synthetic */ int u;
    public static final /* synthetic */ cdg t = new cdg(20);
    public static final /* synthetic */ cdg s = new cdg(19);
    public static final /* synthetic */ cdg r = new cdg(18);
    public static final /* synthetic */ cdg q = new cdg(17);
    public static final /* synthetic */ cdg p = new cdg(16);
    public static final /* synthetic */ cdg o = new cdg(15);
    public static final /* synthetic */ cdg n = new cdg(14);
    public static final /* synthetic */ cdg m = new cdg(12);
    public static final /* synthetic */ cdg l = new cdg(11);
    public static final /* synthetic */ cdg k = new cdg(10);
    public static final /* synthetic */ cdg j = new cdg(9);
    public static final /* synthetic */ cdg i = new cdg(8);
    public static final /* synthetic */ cdg h = new cdg(7);
    public static final /* synthetic */ cdg g = new cdg(6);
    public static final /* synthetic */ cdg f = new cdg(5);
    public static final /* synthetic */ cdg e = new cdg(4);
    public static final /* synthetic */ cdg d = new cdg(3);
    public static final /* synthetic */ cdg c = new cdg(2);
    public static final /* synthetic */ cdg b = new cdg(1);
    public static final /* synthetic */ cdg a = new cdg(0);

    public /* synthetic */ cdg(int i2) {
        this.u = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.u) {
            case 0:
                Face face = (Face) obj;
                Face face2 = (Face) obj2;
                return (face2.getBounds().width() * face2.getBounds().height()) - (face.getBounds().width() * face.getBounds().height());
            case 1:
                hjy hjyVar = (hjy) obj;
                hjy hjyVar2 = (hjy) obj2;
                return (hjyVar2.a.width() * hjyVar2.a.height()) - (hjyVar.a.width() * hjyVar.a.height());
            case 2:
                return ((djg) obj).a.compareTo(((djg) obj2).a);
            case 3:
                return ((djm) obj).a.compareTo(((djm) obj2).a);
            case 4:
                return ((drt) obj).a.b.a() - ((drt) obj2).a.b.a();
            case 5:
                elv elvVar = (elv) obj;
                elv elvVar2 = (elv) obj2;
                int iP = elvVar.p();
                int iP2 = elvVar2.p();
                if (iP == 0) {
                    throw null;
                }
                if (iP == iP2) {
                    return elvVar.e().compareTo(elvVar2.e());
                }
                int iS = enl.s(elvVar2.p());
                int iS2 = enl.s(elvVar.p());
                if (iS == iS2) {
                    return 0;
                }
                return iS < iS2 ? -1 : 1;
            case 6:
                lmw lmwVarB = ((lrr) obj).b();
                lmwVarB.getClass();
                long j2 = lmwVarB.b;
                lmw lmwVarB2 = ((lrr) obj2).b();
                lmwVarB2.getClass();
                return (j2 > lmwVarB2.b ? 1 : (j2 == lmwVarB2.b ? 0 : -1));
            case 7:
                return Float.compare(((gan) obj2).b(), ((gan) obj).b());
            case 8:
                return (((Long) ((gdh) obj).c().j()).longValue() > ((Long) ((gdh) obj2).c().j()).longValue() ? 1 : (((Long) ((gdh) obj).c().j()).longValue() == ((Long) ((gdh) obj2).c().j()).longValue() ? 0 : -1));
            case 9:
                return ((Float) obj).compareTo((Float) obj2);
            case 10:
                return Float.compare(((dwr) obj2).b, ((dwr) obj).b);
            case 11:
                return ((Float) ((ghx) obj).t().get(0)).compareTo((Float) ((ghx) obj2).t().get(0));
            case 12:
                ouj oujVar = hmy.b;
                return (((hnk) obj).c() > ((hnk) obj2).c() ? 1 : (((hnk) obj).c() == ((hnk) obj2).c() ? 0 : -1));
            case 13:
                Range range = (Range) obj;
                Range range2 = (Range) obj2;
                return ((Integer) range2.getUpper()).compareTo((Integer) range.getUpper()) == 0 ? ((Integer) range.getLower()).compareTo((Integer) range2.getLower()) : ((Integer) range2.getUpper()).compareTo((Integer) range.getUpper());
            case 14:
                return ((jwv) obj).c.compareTo(((jwv) obj2).c);
            case 15:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 16:
                int i2 = lmh.a;
                return ((lmg) obj2).a() - ((lmg) obj).a();
            case 17:
                return ((String) obj).compareTo((String) obj2);
            case 18:
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                if (iIntValue == iIntValue2) {
                    return 0;
                }
                return iIntValue >= iIntValue2 ? 1 : -1;
            case 19:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue == ((Boolean) obj2).booleanValue()) {
                    return 0;
                }
                return !zBooleanValue ? -1 : 1;
            default:
                mam mamVar = (mam) obj;
                mam mamVar2 = (mam) obj2;
                long j3 = mamVar.b;
                long j4 = mamVar2.b;
                int i3 = (j3 > j4 ? 1 : (j3 == j4 ? 0 : -1));
                if (j3 != j4) {
                    return i3;
                }
                int iCompareToIgnoreCase = mamVar.c.compareToIgnoreCase(mamVar2.c);
                if (iCompareToIgnoreCase != 0) {
                    return iCompareToIgnoreCase;
                }
                int iCompareToIgnoreCase2 = mamVar.e.i().d.compareToIgnoreCase(mamVar2.e.i().d);
                return iCompareToIgnoreCase2 != 0 ? iCompareToIgnoreCase2 : (mamVar.a > mamVar2.a ? 1 : (mamVar.a == mamVar2.a ? 0 : -1));
        }
    }
}
