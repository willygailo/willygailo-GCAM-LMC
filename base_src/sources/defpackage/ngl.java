package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ngl implements ngm {
    public final /* synthetic */ Class a;
    private final /* synthetic */ int b;

    public /* synthetic */ ngl(Class cls, int i) {
        this.b = i;
        this.a = cls;
    }

    @Override // defpackage.ngm
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                return (Long) this.a.cast(obj);
            case 1:
                return (Boolean) this.a.cast(obj);
            default:
                return (String) this.a.cast(obj);
        }
    }
}
