package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class otv extends otu {
    public otv(oiu oiuVar) {
        super(oiuVar);
    }

    @Override // defpackage.otx
    public final int a() {
        return 129;
    }

    @Override // defpackage.otu
    public final int c(int i) {
        if ((i & (-128)) == 0) {
            return i;
        }
        return 128;
    }
}
