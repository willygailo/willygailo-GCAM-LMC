package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class mnr implements Runnable {
    final /* synthetic */ mlu a;
    final /* synthetic */ moa b;
    final /* synthetic */ mlu c;
    final /* synthetic */ moa d;

    public mnr(moa moaVar, mlu mluVar, moa moaVar2, mlu mluVar2) {
        this.d = moaVar;
        this.a = mluVar;
        this.b = moaVar2;
        this.c = mluVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.d.a;
        if (obj != null) {
            moa.j(obj, this.a, this.b);
            return;
        }
        mnc mncVar = this.d.b;
        mlu mluVar = this.c;
        moa moaVar = this.b;
        try {
            moaVar.k(mluVar.a(mncVar));
        } catch (mnc e) {
            moaVar.l(e);
        } catch (Throwable th) {
            moaVar.l(mnc.a(th));
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(this.a);
        String strValueOf3 = String.valueOf(this.c);
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 8 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
        sb.append(strValueOf);
        sb.append("then[");
        sb.append(strValueOf2);
        sb.append(", ");
        sb.append(strValueOf3);
        sb.append("]");
        return sb.toString();
    }
}
