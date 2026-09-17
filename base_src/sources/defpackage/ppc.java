package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ppc implements Comparable {
    public final int b;
    public final pry c;
    final pph a = null;
    final boolean d = false;

    public ppc(int i, pry pryVar) {
        this.b = i;
        this.c = pryVar;
    }

    public final prz a() {
        return this.c.s;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b - ((ppc) obj).b;
    }
}
