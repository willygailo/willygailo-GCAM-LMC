package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class pj implements Runnable {
    final /* synthetic */ pk a;
    private final /* synthetic */ int b;

    public pj(pk pkVar, int i) {
        this.b = i;
        this.a = pkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                om omVar = this.a.e;
                if (omVar != null && gl.U(omVar) && this.a.e.getCount() > this.a.e.getChildCount()) {
                    int childCount = this.a.e.getChildCount();
                    pk pkVar = this.a;
                    if (childCount <= pkVar.k) {
                        pkVar.q.setInputMethodMode(2);
                        this.a.s();
                    }
                    break;
                }
                break;
            default:
                this.a.q();
                break;
        }
    }
}
