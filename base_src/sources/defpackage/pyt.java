package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pyt implements pys, pyn {
    public final Object a;

    private pyt(Object obj) {
        this.a = obj;
    }

    public static pys a(Object obj) {
        obj.getClass();
        return new pyt(obj);
    }

    @Override // defpackage.qkg
    public final Object get() {
        return this.a;
    }
}
