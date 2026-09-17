package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hce extends ldl {
    private final int a;
    private final int b;
    private boolean c;

    public hce(lco lcoVar, int i) {
        super(lcoVar);
        obr.aF(true);
        this.a = 1;
        this.b = i;
        this.c = c((Integer) lcoVar.fA()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ldl
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Boolean c(Integer num) {
        if (num.intValue() < this.a) {
            this.c = false;
        } else if (num.intValue() >= this.b) {
            this.c = true;
        }
        return Boolean.valueOf(this.c);
    }
}
