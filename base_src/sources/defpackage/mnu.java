package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class mnu implements Runnable {
    private final Object a;
    private final moa b;
    private final mlu c;
    private final /* synthetic */ int d;

    public mnu(Object obj, mlu mluVar, moa moaVar, int i) {
        this.d = i;
        this.a = obj;
        this.b = moaVar;
        this.c = mluVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                moa.j(this.a, this.c, this.b);
                break;
            default:
                Object obj = this.a;
                mlu mluVar = this.c;
                moa moaVar = this.b;
                try {
                    moaVar.k(mluVar.a(obj));
                } catch (mnc e) {
                    moaVar.l(e);
                    return;
                } catch (Throwable th) {
                    moaVar.l(mnc.a(th));
                    return;
                }
                break;
        }
    }

    public final String toString() {
        switch (this.d) {
            case 0:
                break;
        }
        return this.c.toString();
    }
}
