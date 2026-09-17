package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pqg {
    public final pqf a;

    private pqg(pry pryVar, Object obj, pry pryVar2, Object obj2) {
        this.a = new pqf(pryVar, obj, pryVar2, obj2);
    }

    public static int a(pqf pqfVar, Object obj, Object obj2) {
        return pou.a(pqfVar.a, 1, obj) + pou.a(pqfVar.c, 2, obj2);
    }

    public static pqg b(pry pryVar, Object obj, pry pryVar2, Object obj2) {
        return new pqg(pryVar, obj, pryVar2, obj2);
    }

    static void c(pom pomVar, pqf pqfVar, Object obj, Object obj2) {
        pou.g(pomVar, pqfVar.a, 1, obj);
        pou.g(pomVar, pqfVar.c, 2, obj2);
    }
}
