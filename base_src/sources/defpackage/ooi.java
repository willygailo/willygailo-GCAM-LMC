package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ooi extends otj {
    private final oom a;

    public ooi(oom oomVar, int i) {
        super(oomVar.size(), i);
        this.a = oomVar;
    }

    @Override // defpackage.otj
    protected final Object a(int i) {
        return this.a.get(i);
    }
}
