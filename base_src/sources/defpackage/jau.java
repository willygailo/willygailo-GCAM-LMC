package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jau implements Runnable {
    public final /* synthetic */ jay a;
    private final /* synthetic */ int b;

    public /* synthetic */ jau(jay jayVar, int i) {
        this.b = i;
        this.a = jayVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.b.setVisibility(0);
                break;
            default:
                jay jayVar = this.a;
                jayVar.b.setVisibility(8);
                jayVar.k();
                break;
        }
    }
}
