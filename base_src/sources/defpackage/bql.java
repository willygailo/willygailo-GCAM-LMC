package defpackage;

import android.graphics.ColorFilter;
import com.google.android.apps.camera.ui.modeswitcher.MoreModesGrid;
import j$.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bql implements Predicate {
    private final /* synthetic */ int s;
    public static final /* synthetic */ bql r = new bql(17);
    public static final /* synthetic */ bql q = new bql(16);
    public static final /* synthetic */ bql p = new bql(15);
    public static final /* synthetic */ bql o = new bql(14);
    public static final /* synthetic */ bql n = new bql(13);
    public static final /* synthetic */ bql m = new bql(12);
    public static final /* synthetic */ bql l = new bql(11);
    public static final /* synthetic */ bql k = new bql(10);
    public static final /* synthetic */ bql j = new bql(9);
    public static final /* synthetic */ bql i = new bql(8);
    public static final /* synthetic */ bql h = new bql(7);
    public static final /* synthetic */ bql g = new bql(6);
    public static final /* synthetic */ bql f = new bql(5);
    public static final /* synthetic */ bql e = new bql(4);
    public static final /* synthetic */ bql d = new bql(3);
    public static final /* synthetic */ bql c = new bql(2);
    public static final /* synthetic */ bql b = new bql(1);
    public static final /* synthetic */ bql a = new bql(0);

    private /* synthetic */ bql(int i2) {
        this.s = i2;
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.s) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
        }
        return Predicate.CC.$default$and(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.s) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
        }
        return Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.s) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
        }
        return Predicate.CC.$default$or(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.s) {
            case 0:
                return lju.d(lju.b((lvu) obj));
            case 1:
                return !lju.d((lju) obj);
            case 2:
                return ((ojc) obj).g();
            case 3:
                return ((cvn) obj).b;
            case 4:
                return true;
            case 5:
                ijp ijpVar = (ijp) obj;
                for (ijo ijoVar : ijo.values()) {
                    if (ijpVar.l(ijoVar)) {
                        return true;
                    }
                }
                return false;
            case 6:
                return ((dwr) obj).c.g();
            case 7:
                return ((Boolean) obj).booleanValue();
            case 8:
                return ((hsc) obj).b;
            case 9:
                return ((ifm) obj).b;
            case 10:
                return ((Boolean) obj).booleanValue();
            case 11:
                return ((Boolean) obj).booleanValue();
            case 12:
                return ((String) obj).isEmpty();
            case 13:
                ouj oujVar = iec.a;
                return !idn.c.contains((String) obj);
            case 14:
                return iec.b.matcher((String) obj).matches();
            case 15:
                return ((ojc) obj).g();
            case 16:
                return ((Boolean) obj).booleanValue();
            default:
                ColorFilter colorFilter = MoreModesGrid.a;
                return ((jgp) obj).a.equals(jrl.LENS);
        }
    }
}
