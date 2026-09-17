package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bkx extends bko {
    private static bkx t;

    public static bkx a() {
        if (t == null) {
            bkx bkxVar = (bkx) new bkx().A(bhb.b, new bgr());
            bkxVar.M();
            t = bkxVar;
        }
        return t;
    }

    public static bkx b(Class cls) {
        return (bkx) new bkx().m(cls);
    }

    public static bkx c(bbr bbrVar) {
        return (bkx) new bkx().n(bbrVar);
    }
}
