package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bcz implements bcs {
    private final /* synthetic */ int a;

    public bcz(int i) {
        this.a = i;
    }

    @Override // defpackage.bcs
    public final /* synthetic */ int a(Object obj) {
        switch (this.a) {
            case 0:
                return ((int[]) obj).length;
            default:
                return ((byte[]) obj).length;
        }
    }

    @Override // defpackage.bcs
    public final int b() {
        switch (this.a) {
            case 0:
                return 4;
            default:
                return 1;
        }
    }

    @Override // defpackage.bcs
    public final /* synthetic */ Object c(int i) {
        switch (this.a) {
            case 0:
                return new int[i];
            default:
                return new byte[i];
        }
    }
}
