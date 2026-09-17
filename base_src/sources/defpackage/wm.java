package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class wm extends qnp implements qmj {
    final /* synthetic */ qmj a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm(qmj qmjVar, int i) {
        super(0);
        this.b = i;
        this.a = qmjVar;
    }

    @Override // defpackage.qmj
    public final /* synthetic */ Object invoke() {
        switch (this.b) {
            case 0:
                break;
        }
        return this.a.invoke();
    }
}
