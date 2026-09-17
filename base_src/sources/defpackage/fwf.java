package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fwf implements Runnable {
    public final /* synthetic */ fwg a;
    public final /* synthetic */ lco b;
    private final /* synthetic */ int c;

    public /* synthetic */ fwf(fwg fwgVar, lco lcoVar, int i) {
        this.c = i;
        this.a = fwgVar;
        this.b = lcoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                final fwg fwgVar = this.a;
                lco lcoVar = this.b;
                if (!fwgVar.g) {
                    lcoVar.getClass();
                    fwgVar.d = lcoVar;
                    lie lieVar = fwgVar.f;
                    if (lieVar != null) {
                        lieVar.close();
                    }
                    final int i = 0;
                    fwgVar.f = lcoVar.a(new lij() { // from class: fwd
                        @Override // defpackage.lij
                        public final void fB(Object obj) {
                            switch (i) {
                                case 0:
                                    fwgVar.e();
                                    break;
                                default:
                                    fwgVar.e();
                                    break;
                            }
                        }
                    }, fwgVar.b);
                }
                break;
            default:
                final fwg fwgVar2 = this.a;
                lco lcoVar2 = this.b;
                if (!fwgVar2.g) {
                    lcoVar2.getClass();
                    fwgVar2.c = lcoVar2;
                    lie lieVar2 = fwgVar2.e;
                    if (lieVar2 != null) {
                        lieVar2.close();
                    }
                    final int i2 = 1;
                    fwgVar2.e = lcoVar2.a(new lij() { // from class: fwd
                        @Override // defpackage.lij
                        public final void fB(Object obj) {
                            switch (i2) {
                                case 0:
                                    fwgVar2.e();
                                    break;
                                default:
                                    fwgVar2.e();
                                    break;
                            }
                        }
                    }, fwgVar2.b);
                }
                break;
        }
    }
}
