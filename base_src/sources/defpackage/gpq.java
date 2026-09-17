package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gpq implements lij {
    final /* synthetic */ hen a;

    public gpq(hen henVar) {
        this.a = henVar;
    }

    @Override // defpackage.lij
    public final /* bridge */ /* synthetic */ void fB(Object obj) {
        Integer num = (Integer) obj;
        hem hemVarA = this.a.a();
        try {
            this.a.k(num.intValue());
        } finally {
            hemVarA.a();
        }
    }
}
