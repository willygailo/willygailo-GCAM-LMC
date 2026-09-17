package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class jys {
    public long a;
    public long b;
    public boolean c;
    public final lis d;

    public jys(lis lisVar) {
        this.d = lisVar;
    }

    public final long a() {
        return this.c ? (this.b + System.currentTimeMillis()) - this.a : this.b;
    }

    public final void b() {
        if (this.c) {
            this.d.h("onSessionStart failed because session is already started!");
        } else {
            this.c = true;
            this.a = System.currentTimeMillis();
        }
    }
}
