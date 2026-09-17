package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sb {
    public static final fc a = new fd(20);
    public int b;
    public px c;
    public px d;

    private sb() {
    }

    public static sb a() {
        sb sbVar = (sb) a.a();
        return sbVar == null ? new sb() : sbVar;
    }

    public static void b(sb sbVar) {
        sbVar.b = 0;
        sbVar.c = null;
        sbVar.d = null;
        a.b(sbVar);
    }
}
