package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class mnq implements Runnable {
    final /* synthetic */ mlu a;
    final /* synthetic */ moa b;
    final /* synthetic */ moa c;

    public mnq(moa moaVar, mlu mluVar, moa moaVar2) {
        this.c = moaVar;
        this.a = mluVar;
        this.b = moaVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.c.a;
        if (obj != null) {
            moa.j(obj, this.a, this.b);
        } else {
            this.b.l(this.c.b);
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 6 + String.valueOf(strValueOf2).length());
        sb.append(strValueOf);
        sb.append("then[");
        sb.append(strValueOf2);
        sb.append("]");
        return sb.toString();
    }
}
