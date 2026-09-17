package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ovu extends ovv {
    public static final ovu a = new ovu();

    private ovu() {
    }

    @Override // defpackage.ovv
    public final int b() {
        return 0;
    }

    @Override // defpackage.ovv
    public final ovd c(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }

    @Override // defpackage.ovv
    public final Object d(ovd ovdVar) {
        return null;
    }

    @Override // defpackage.ovv
    public final Object e(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }
}
