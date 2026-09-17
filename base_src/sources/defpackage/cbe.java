package defpackage;

import com.Fix.Pref;

/* JADX INFO: loaded from: classes3.dex */
public final class cbe implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public cbe(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    public static cbe b(qkg qkgVar) {
        return new cbe(qkgVar, 1);
    }

    public static cbe c(qkg qkgVar) {
        return new cbe(qkgVar, 6);
    }

    public final Integer a() {
        switch (this.b) {
            case 0:
                ddf ddfVar = (ddf) this.a.get();
                return Integer.valueOf(ddfVar.a(ddl.t).g() ? ((Integer) ddfVar.a(ddl.t).c()).intValue() : 60);
            case 1:
                int iMenuValue = Pref.MenuValue("pref_focus_lock_time_key");
                if (iMenuValue <= 0 && true != ((gjo) this.a).get().E()) {
                    iMenuValue = 4;
                }
                return Integer.valueOf(iMenuValue);
            case 2:
                return Integer.valueOf(((Integer) ((ddf) this.a.get()).a(dda.b).c()).intValue());
            case 3:
                return Integer.valueOf(((ead) this.a.get()).e);
            case 4:
                return Integer.valueOf(((ead) this.a.get()).f);
            case 5:
                return Integer.valueOf(((ead) this.a.get()).c);
            default:
                return Integer.valueOf(true != ((ddf) this.a.get()).k(ddm.z) ? 1 : 2);
        }
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.b) {
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
        }
        return a();
    }
}
