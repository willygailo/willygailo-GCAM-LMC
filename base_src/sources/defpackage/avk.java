package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class avk implements Runnable {
    final /* synthetic */ byte[] a;
    final /* synthetic */ avl b;

    public avk(avl avlVar, byte[] bArr) {
        this.b = avlVar;
        this.a = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fde fdeVar = this.b.a;
        byte[] bArr = this.a;
        fdj fdjVar = fdeVar.a;
        if (fdjVar.r) {
            return;
        }
        fdjVar.b.c();
        fdj fdjVar2 = fdeVar.a;
        if (fdjVar2.s) {
            fdm fdmVar = fdjVar2.b;
            fdmVar.C = bArr;
            fdmVar.z = true;
            fck fckVar = fdjVar2.c;
            if (fckVar.c) {
                fckVar.b.i(bArr);
            }
        }
    }
}
