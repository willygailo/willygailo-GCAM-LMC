package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lyr {
    public final nvb b = new nvb((byte[]) null);
    public lyv a = null;

    public lyr() {
        System.nanoTime();
    }

    public final void a(lyj lyjVar) {
        nvb nvbVar = this.b;
        String str = ((lyk) lyjVar).a;
        lyv lyvVar = (lyv) nvbVar.a.get(str);
        if (lyvVar == null) {
            lyvVar = new lyv(lyjVar);
            nvbVar.a.put(str, lyvVar);
        }
        this.a = lyvVar;
    }
}
