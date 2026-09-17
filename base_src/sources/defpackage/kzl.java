package defpackage;

/* JADX INFO: loaded from: classes2.dex */
class kzl extends kyj {
    private kjj a;

    public kzl(kjj kjjVar) {
        this.a = kjjVar;
    }

    public final void f(Object obj) {
        kjj kjjVar = this.a;
        if (kjjVar != null) {
            kjjVar.c(obj);
            this.a = null;
        }
    }
}
