package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ixd implements iib {
    public final /* synthetic */ epj a;
    private final /* synthetic */ int b;

    public /* synthetic */ ixd(epj epjVar, int i) {
        this.b = i;
        this.a = epjVar;
    }

    @Override // defpackage.iib
    public final lie a() {
        switch (this.b) {
            case 0:
                final epj epjVar = this.a;
                final int i = epjVar.f;
                epjVar.g(3);
                return new lie() { // from class: epf
                    @Override // defpackage.lie, java.lang.AutoCloseable
                    public final void close() {
                        epjVar.g(i);
                    }
                };
            default:
                final epj epjVar2 = this.a;
                epjVar2.g(1);
                return new lie() { // from class: epe
                    @Override // defpackage.lie, java.lang.AutoCloseable
                    public final void close() {
                        epjVar2.g(3);
                    }
                };
        }
    }
}
