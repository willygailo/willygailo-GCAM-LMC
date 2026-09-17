package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mpy {
    private final int a;
    private final mri b;
    private final mqk c;

    public mpy(int i, mri mriVar, mqk mqkVar) {
        boolean z = true;
        if (mqkVar != null && mqkVar.a.b != mriVar.a.b) {
            z = false;
        }
        obr.aF(z);
        this.a = i;
        this.b = mriVar;
        this.c = mqkVar;
    }

    public final mqb a(mrd mrdVar) {
        obr.aF(this.b.a.b == mrdVar.b);
        return new mqb(this.a, this.b, this.c, mrdVar, null);
    }
}
