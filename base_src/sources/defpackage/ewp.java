package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ewp implements pgk {
    private final /* synthetic */ int i;
    public static final /* synthetic */ ewp h = new ewp(8);
    public static final /* synthetic */ ewp g = new ewp(7);
    public static final /* synthetic */ ewp f = new ewp(6);
    public static final /* synthetic */ ewp e = new ewp(5);
    public static final /* synthetic */ ewp d = new ewp(4);
    public static final /* synthetic */ ewp c = new ewp(2);
    public static final /* synthetic */ ewp b = new ewp(1);
    public static final /* synthetic */ ewp a = new ewp(0);

    public /* synthetic */ ewp(int i) {
        this.i = i;
    }

    @Override // defpackage.pgk
    public final pht a(Object obj) {
        switch (this.i) {
            case 0:
                return ((gfu) obj).h().g;
            case 1:
                return plk.U((Throwable) obj);
            case 2:
                fiw fiwVar = (fiw) obj;
                return fiwVar != null ? fiwVar.a() : plk.V(null);
            case 3:
                hin hinVar = (hin) obj;
                bug bugVar = hinVar.l;
                mad madVar = hinVar.a;
                return plk.V(hinVar);
            case 4:
                throw new IllegalStateException("Error updating preview surfaceview", (Throwable) obj);
            case 5:
                List<lmw> list = (List) obj;
                if (list == null || list.isEmpty()) {
                    return plk.U(new IllegalStateException("Null or empty frame results for keys."));
                }
                lmw lmwVar = (lmw) list.get(0);
                for (lmw lmwVar2 : list) {
                    if (lmwVar2.c > -1) {
                        lmwVar = lmwVar2;
                    }
                }
                return plk.V(lmwVar);
            case 6:
                List list2 = (List) obj;
                if (list2 == null) {
                    return plk.U(new IllegalStateException());
                }
                lmw lmwVar3 = (lmw) list2.get(0);
                lmw lmwVar4 = (lmw) list2.get(1);
                return lmwVar3.c > lmwVar4.c ? plk.V(lmwVar3) : plk.V(lmwVar4);
            case 7:
                kig kigVar = (kig) obj;
                throw new Cnew(kigVar.a(), kigVar.getMessage(), kigVar);
            default:
                return plk.V("");
        }
    }
}
